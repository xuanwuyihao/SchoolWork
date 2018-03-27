package com.p2p.controller.back;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.p2p.commons.DateUtil;
import com.p2p.commons.MD5Util;
import com.p2p.pojo.Jurisdiction;
import com.p2p.pojo.Manager;
import com.p2p.pojo.Page;
import com.p2p.pojo.Role;

import com.p2p.pojo.SysLog;

import com.p2p.service.JurisdictionService;

import com.p2p.service.ManagerService;

import com.p2p.service.SysLogService;

import com.p2p.service.RoleJurService;


@Controller
@RequestMapping("manager")
public class ManagerController {
	@Resource(name = "managerServiceImpl")
	private ManagerService managerService;
	
	@Resource(name = "sysLogServiceImpl")
	private SysLogService sysLogService;

	@Resource(name = "jurisdictionServiceImpl")
	private JurisdictionService jurisdictionService;
	
	@Resource(name = "roleJurServiceImpl")
	private RoleJurService roleJurService;
	
	@RequestMapping("login")
	public String loginback(@RequestParam("username") String username, @RequestParam("password") String password,
			HttpServletRequest request) throws UnknownHostException {
		
		SysLog sysLog = new SysLog();
		sysLog.setUsername(username);
		InetAddress localhost = InetAddress.getLocalHost();
		sysLog.setIpaddress(localhost.getHostAddress());
		
		Manager manager = new Manager();
		manager.setUsername(username);
		
		Subject currentUser = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken(username, password);

		
		
//		System.out.println("=======username="+username+"==password=="+token.getPassword().toString());
//		System.out.println("========"+currentUser.isPermitted(username));
		// token.setRememberMe(true);
		// System.out.println("为了验证登录用户而封装的token为" +
		// ReflectionToStringBuilder.toString(token, ToStringStyle.MULTI_LINE_STYLE));
		// 获取当前的Subject
		
		try {
			// 在调用了login方法后,SecurityManager会收到AuthenticationToken,并将其发送给已配置的Realm执行必须的认证检查
			// 每个Realm都能在必要时对提交的AuthenticationTokens作出反应
			// 所以这一步在调用login(token)方法时,它会走到MyRealm.doGetAuthenticationInfo()方法中,具体验证方式详见此方法
			System.out.println("对用户[" + username + "]进行登录验证..验证开始");
			currentUser.login(token);
			System.out.println("对用户[" + username + "]进行登录验证..验证通过");
		} catch (UnknownAccountException uae) {
			System.out.println("对用户[" + username + "]进行登录验证..验证未通过,该账户不存在");
			request.setAttribute("message_login", "该账户不存在或已被管理员禁用!");
			
			sysLog.setLogintime(new Date().toLocaleString());
			sysLog.setStatus("登陆失败");
			sysLogService.save(sysLog);
			
			return "back/login";
		} catch (IncorrectCredentialsException ice) {
			System.out.println("对用户[" + username + "]进行登录验证..验证未通过,密码错误");
			request.setAttribute("message_login", "密码不正确!");
			sysLog.setLogintime(new Date().toLocaleString());
			sysLog.setStatus("登陆失败");
			sysLogService.save(sysLog);
			return "back/login";
		} catch (LockedAccountException lae) {
			System.out.println("对用户[" + username + "]进行登录验证..验证未通过,账户已锁定");
			request.setAttribute("message_login", "账户已锁定!");
		} catch (ExcessiveAttemptsException eae) {
			System.out.println("对用户[" + username + "]进行登录验证..验证未通过,错误次数过多");
			request.setAttribute("message_login", "用户名或密码错误次数过多!");
		} catch (AuthenticationException ae) {
			// 通过处理Shiro的运行时AuthenticationException就可以控制用户登录失败或密码错误时的情景
			System.out.println("对用户[" + username + "]进行登录验证..验证未通过,堆栈轨迹如下");
			ae.printStackTrace();
			request.setAttribute("message_login", "账号或密码不正确!");
			sysLog.setLogintime(new Date().toLocaleString());
			sysLog.setStatus("登陆失败");
			sysLogService.save(sysLog);
			return "back/login";
		}
		// 验证是否登录成功
		if (currentUser.isAuthenticated()) {
			System.out.println("用户[" + username + "]登录认证通过..账号密码正确");
			//获取管理员对象
			Manager man = new Manager();
			//向数据库插入管理员的登录信息
			DateUtil dateUtil = new DateUtil();
			Date lastTime = dateUtil.convert(new Date().toLocaleString());
			man.setUsername(username);
			man.setLasttime(lastTime);
			String ip = request.getHeader("x-forwarded-for");
		         if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
		             ip = request.getHeader("Proxy-Client-IP");
		         }
		         if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
		             ip = request.getHeader("WL-Proxy-Client-IP");
		         }
		         if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
		             ip = request.getRemoteAddr();
		         }
		         if (ip.equals("0:0:0:0:0:0:0:1")) {
		            ip = "本地";
		         }
		         man.setLastip(ip);
		         
//		        =(Model) new ManagerController();
		        
		       
//		         System.out.println("====="+currentUser.isPermitted("page"));
		         System.out.println("ip地址为："+ip+"---------登录时间为："+lastTime);
		         managerService.insertLog(man);
		         sysLog.setLogintime(new Date().toLocaleString());
				sysLog.setStatus("登陆成功");
				sysLogService.save(sysLog);
				return "back/index";
		} else {
			token.clear();
			return "back/login";
		}

	}

	@RequestMapping("logout")
	public String logoutback() {
		Subject subject = SecurityUtils.getSubject();
		subject.logout();
		return "back/login";
	}

	@RequestMapping("/admin-role")
	public String adminrole(Model model) {
		List<Role> roles = managerService.roleList();
		Integer count = roles.size();
		model.addAttribute("roles", roles);
		model.addAttribute("count", count);
		return "back/admin-role";
	}

	@RequestMapping("/role-edit/{id}")
	public String roleedit(@PathVariable Integer id, Model model) {
		List<Jurisdiction> jurExt = managerService.roleJur(id);
		
		
		
		model.addAttribute("roleId", id);
		model.addAttribute("jurExt", jurExt);
		return "back/role-edit";
	}

	@RequestMapping("/updateJur")
	@ResponseBody
	public String updateJur(HttpServletRequest request, @RequestParam("roleId") Integer roleId,
			@RequestParam("tollerlist[]") List<Integer> tollerlist) {
		System.out.println("进来了 , 角色 ID 为："+roleId);
		managerService.updateAll(roleId);
		
		if(tollerlist.get(0)==0) {
			System.out.println("没有权限");
	    }else {
		for (Integer integer : tollerlist) {			
			System.out.println("选中的有：" + integer);
			managerService.updateNeed(roleId, integer);
		    }	
	     }
	
		return "success";
	}
	
	
	@RequestMapping("/deleteRole")
	@ResponseBody
	public String deleteRole(@RequestParam("r_id") Integer r_id) {
		
		managerService.deleteRole(r_id);
		managerService.deleteRolejurByRid(r_id);
		return "success";
	}
	
	@RequestMapping("/role-add")
	public String roleadd() {
		return "back/role-add";
	}
	
	
	@RequestMapping("/addRole")
	@ResponseBody
	public String addRole(HttpServletRequest request, @RequestParam("name") String name,@RequestParam("alias") String alias,@RequestParam("desc") String desc,
			@RequestParam("tollerlist[]") List<Integer> tollerlist) {
		System.out.println("进来了");
	
		System.out.println("name:"+name);
		System.out.println("alias:"+alias);
		System.out.println("desc:"+desc);
		
		Role r=new Role();
		r.setRolename(name);
		r.setAlias(alias);
		r.setDescription(desc);
		managerService.addRole(r);	
		
		Integer maxId=managerService.getRoleMaxId();
		System.out.println("Role最大id:"+maxId);
//		managerService.addRolejurAllnoByRid(maxId,id);
		
		List<Jurisdiction> li=jurisdictionService.list();
		if(tollerlist.get(0)==0) {
				System.out.println("没有权限");
		}else {
//			for (Integer integer : tollerlist) {			
//				System.out.println("选中的有：" + integer);
//				if(li.contains(integer))
//				managerService.addRolejurAllnoByRid(maxId,integer);
//				managerService.updateNeed(maxId, integer);
//			  }	
			for(Jurisdiction integer : li){
				
				if(tollerlist.contains(integer.getId())){
//					System.out.println("选中的有：" + integer.getId());
					managerService.addRolejurAllnoByRid(maxId,integer.getId());
					managerService.updateNeed(maxId, integer.getId());
				}else{
//					System.out.println("没有选中的有：" + integer.getId());
					if(integer.getId()<=7){
						managerService.addRolejurAllnoByRid(maxId,integer.getId());
						managerService.updateNeed(maxId, integer.getId());
					}else{
						roleJurService.addRoleJurFlast(maxId, integer.getId());
					}
					
				}
			}
		}

		return "success";
	}
	
	
	@RequestMapping("/admin-list")
	public String adminlist(Model model) {
		List<Manager> manager = managerService.list();
		//每页行数
		Integer pageSize = 6;
		//数据总行数
		Integer count = manager.size();
		Page pa = new Page();
		pa.setFist(0);
		pa.setTow(pageSize);
		List<Manager> managers = managerService.pagingSelect(pa);
		//总页数
		Integer pages = (count + pageSize - 1) / pageSize;
		System.out.println("总页数："+pages);
		model.addAttribute("managers", managers);
		model.addAttribute("count", count);
		model.addAttribute("pageSize", pageSize);
		model.addAttribute("pages", pages);
		model.addAttribute("current", 1);
		return "back/admin-list";
	}
	
	
	@RequestMapping("/admin-add")
	public String adminadd(Model model) {
		List<Role> roles = managerService.roleList();
		model.addAttribute("roles", roles);
		return "back/admin-add";
	}

	
	@RequestMapping("/admin-edit/{id}")
	public String adminedit(@PathVariable Integer id, Model model) {
		Manager manager = managerService.getById(id);
		List<Role> roles = managerService.roleList();		
		model.addAttribute("manager", manager);
		model.addAttribute("roles", roles);
		return "back/admin-edit";
	}
	
	@RequestMapping("admin-save")
	@ResponseBody
	public String adminsave(Manager manager) {
		System.out.println(manager.toString());
		String password = MD5Util.md5Encrypt(manager.getUsername(), manager.getPassword());
		manager.setPassword(password);
		managerService.save(manager);
		return "success";
	}
	
	@RequestMapping("admin-update")
	@ResponseBody
	public String adminupdate(Manager manager) {
		System.out.println(manager.toString());
		managerService.update(manager);
		return "success";
	}
	
	@RequestMapping("admin-remove")
	@ResponseBody
	public String adminremove(Integer id) {
		managerService.remove(id);
		return "success";
	}
	
	
	@RequestMapping("admin-delAll")
	@ResponseBody
	public String admindelAll(@RequestParam("des")Integer[] des) {
		System.out.println("进来了");
		for (Integer id : des) {
			System.out.println(id);
			managerService.remove(id);
		}
		return "success";
	}
	
	
	@RequestMapping("admin-vagueSelect")
	public String vagueSelect(Model model,Page page,String pd) {
		System.out.println(page.toString());
		if(pd.equals("1")) {
			page.setFist(0);
			page.setTow(6);
		}else {
			Integer curr = (page.getFist()-1)*page.getTow();
			page.setFist(curr);
		}
		
		List<Manager> ma = managerService.vagueSelect(page);
		List<Manager> managers = managerService.vagueSelectLimit(page);
		Integer count = ma.size();
		//总页数
		Integer pages =  (count + page.getTow() - 1) / page.getTow();
		model.addAttribute("managers", managers);
		model.addAttribute("count", count);
		model.addAttribute("pageSize", page.getTow());
		model.addAttribute("pages", pages);
		model.addAttribute("current", page.getFist());
		model.addAttribute("vague", 1);
		model.addAttribute("title", page.getTitle());
		model.addAttribute("people", page.getPeople());
		return "back/admin-list";
	}
	
	@RequestMapping("admin-paging")
	public String adminpaging(Model model, String currentPage, String page) {
		System.out.println("当前页为："+currentPage+"每页行数为："+page);
		if(currentPage != null && page != null) {
			Integer rows = Integer.parseInt(page);
			Integer current = (Integer.parseInt(currentPage)-1)*rows;
			Page pa = new Page();
			pa.setFist(current);
			pa.setTow(rows);
			List<Manager> managers = managerService.pagingSelect(pa);
			//每页行数
			Integer pageSize = 6;
			List<Manager> manager = managerService.list();
			//数据总行数
			Integer count = manager.size();
			//总页数
			Integer pages = (count + pageSize - 1) / pageSize;
			System.out.println("总页数："+pages);
			model.addAttribute("managers", managers);
			model.addAttribute("count", count);
			model.addAttribute("pageSize", pageSize);
			model.addAttribute("pages", pages);
			model.addAttribute("pd", 1);
			model.addAttribute("current", currentPage);
			return "back/admin-list";
		}
		
		return "redirect:/manager/admin-list";
	}
	
	@RequestMapping("modifyPassword")
	public @ResponseBody String modifyPassword(Model model,String pwdNow,String pwdFuture) {
		System.out.println(pwdNow+" - "+pwdFuture);
		Subject subject = SecurityUtils.getSubject();
		Session session = subject.getSession();
		
		Manager manager = (Manager) session.getAttribute("manager");
		
		manager = managerService.getById(manager.getId());
		
		pwdNow = MD5Util.md5Encrypt(manager.getUsername(), pwdNow);
		if(!pwdNow.equals(manager.getPassword())) {
			return "error";
		}
		
		pwdFuture = MD5Util.md5Encrypt(manager.getUsername(), pwdFuture);
		
		manager.setPassword(pwdFuture);
		managerService.update(manager);
		
		subject.logout();
		
		return "success";
	}
}
