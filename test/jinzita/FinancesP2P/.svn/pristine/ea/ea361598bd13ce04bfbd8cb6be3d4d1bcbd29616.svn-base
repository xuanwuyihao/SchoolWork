package com.p2p.controller.back;


import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mysql.fabric.xmlrpc.base.Data;
import com.p2p.commons.DateUtil;
import com.p2p.commons.MD5Util;
import com.p2p.commons.PhoneVerification;

import com.p2p.pojo.Invest;
import com.p2p.pojo.LendBeckonmoney;

import com.p2p.pojo.ExamineApply;
import com.p2p.pojo.ExanmineInfo;

import com.p2p.pojo.Page;
import com.p2p.pojo.User;
import com.p2p.pojo.UserBankcard;
import com.p2p.pojo.UserInfo;
import com.p2p.pojo.UserMoney;

import com.p2p.service.InvestService;
import com.p2p.service.LendBeckonmoneyService;
import com.p2p.service.UserBankcardService;

import com.p2p.pojo.UserRecommend;

import com.p2p.service.UserInfoService;
import com.p2p.service.UserMoneyService;
import com.p2p.service.UserRecommendService;
import com.p2p.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	// 默认运算精度,<span style="color:#ff0000;">保留有效数字6位</span>  
    private static final int DEF_DIV_SCALE =6;  
    //RoundingMode.HALF_UP 舍入模式，四舍五入 向上  
	private static MathContext mc = new MathContext(DEF_DIV_SCALE,RoundingMode.HALF_UP); 

	@Resource(name = "userInfoServiceImpl")
	private UserInfoService userInfoService;

	@Resource(name = "userMoneyServiceImpl")
	private UserMoneyService userMoneyService;

	@Resource(name = "userServiceImpl")
	private UserService userService;

	@Resource(name = "lendBeckonmoneyServiceImpl")
	private LendBeckonmoneyService lendBeckonmoneyService;
	
	@Resource(name = "userBankcardServiceImpl")
	private UserBankcardService userbankcardService;
	
	@Resource(name = "investServiceImpl")
	private InvestService investService;

	
	@Resource(name = "userRecommendServiceImpl")
	private UserRecommendService userRecommendService;


	/**
	 * 
	 * @param LiJing
	 * @param request
	 * @return
	 */
	// 打开注册界面
	@RequestMapping("openRegister")
	public String register(String referrerno,Model model) {

		model.addAttribute("referrerno", referrerno);
		
		return "front/register";
	}
	
	
	

	// 用户注册
	@RequestMapping("userRegister")
	public String UserRegister(User user,String referralCode, HttpServletRequest request,Model model) {
		
		User user1 =  userService.getByPhoneName(user);
		if(user1!=null) {
			
			model.addAttribute("message", "error");
			
			return "front/register";
		}
		
		user.setFace("img/defaultFace.jpg");
		user.setRegistertime(new Date());
		Md5Hash md5Hash = new Md5Hash(user.getPassword(), user.getPhone(), 10);
		user.setPassword(md5Hash.toString());
		user.setReferrerno(user.getPhone());
		userService.save(user);

		user = userService.selPhone(user.getPhone());
		UserInfo userInfo = new UserInfo();
		userInfo.setUserId(user.getId());
		userInfo.setOyh1("0");
		userInfoService.save(userInfo);

		BigDecimal mon=new BigDecimal("0.00"); 
		
		UserMoney userMoney = new UserMoney();
	
		userMoney.setUsername(user.getPhone());

		userMoney.setAllmoney(mon);
		userMoney.setNeedmoney(mon);
		userMoney.setGainmoney(mon);
		userMoney.setStillmoney(mon);
		userMoney.setGathermoney(mon);
		userMoney.setInvestmoney(mon);
		userMoney.setLendmoney(mon);
		userMoney.setAwordmoney(mon);
		userMoney.setFrozenmoney(mon);

		userMoney.setAllmoney(mon);
		userMoney.setNeedmoney(mon);
		userMoney.setGainmoney(mon);
		userMoney.setStillmoney(mon);
		userMoney.setGathermoney(mon);
		userMoney.setInvestmoney(mon);
		userMoney.setLendmoney(mon);
		userMoney.setAwordmoney(mon);
		userMoney.setFrozenmoney(mon);

		userMoneyService.save(userMoney);
		
		if(referralCode!=null&&referralCode!="") {
			User u = new User();
			u.setPhone(referralCode);
			User referee = userService.getByPhoneName(u);
			
			if(referee!=null) {
				
				UserRecommend userRecommend = new UserRecommend();
				userRecommend.setReferrerno(referralCode);
				userRecommend.setReferrername(referralCode);
				userRecommend.setByreferrerno(user.getPhone());
				userRecommend.setByreferrername(user.getPhone());
				userRecommend.setAwardtime(new Date());
				
				userRecommendService.save(userRecommend);
			}
			
		}
		
		return "redirect:/user/openLogin";
	}

	// 打开登录界面
	@RequestMapping("openLogin")
	public String openLogin(Model model,String bid) {
		System.out.println("bid:"+bid);
		model.addAttribute("bid",bid);
		return "/front/login";
	}

	// 用户登录
	@RequestMapping("userLogin")
	@ResponseBody
	public String shiroLogin(Model model,@RequestParam("phone") String phone, @RequestParam("password") String password, @RequestParam("bid") String bid)throws Exception {

	

		System.out.println("111111");
		
		
		User user = userService.selPhone(phone);
		
		if(user==null) {
			return "userError";
		}
		
		SimpleHash simpleHash = new SimpleHash("MD5", password, phone,10);
		
		if(!simpleHash.toString().equals(user.getPassword())) {
			
			return "passwordError";
		}
		
		InetAddress localhost = InetAddress.getLocalHost();
		System.out.println("ip:" + localhost.getHostAddress());
		user.setLastip(localhost.getHostAddress());
		user.setLastlogintime(new Date());

		userService.update(user);
		System.out.println("user,session"+user.toString());
		Subject subject = SecurityUtils.getSubject();
		Session session = subject.getSession();
		session.setAttribute("user",user);


		//投标登陆
		System.out.println("bid："+bid);
		
		if(!bid.equals("")) {//判断
			
        UserInfo userInfo = userInfoService.getByUserId(user.getId());		
		UserMoney userMoney = userMoneyService.getByName(user.getPhone());	
		UserBankcard userBankcard = userbankcardService.getByUserinfoId(userInfo.getId().toString());
		
		session.setAttribute("userInfo", userInfo);
		session.setAttribute("userMoney", userMoney);
		session.setAttribute("userBankcard", userBankcard);
		
		
		return bid;//投标显示
		
			
		}
		
		return "success";
        
	}
	
	@RequestMapping("editProfile")
	public @ResponseBody Object editProfile(String email,String oldPwd,String newPwd) {
		System.out.println(email+" - "+oldPwd+" - "+newPwd);
		Subject subject = SecurityUtils.getSubject();
		Session session = subject.getSession();
		User user = (User) session.getAttribute("user");
		
		if(email!=null&&!email.equals("")) {			
			
			user.setEmail(email);
			
			userService.update(user);
			
			session.setAttribute("user", user);
			
			return "success";
		}
		
		oldPwd = MD5Util.md5Encrypt(user.getPhone(), oldPwd);
		
		if(!oldPwd.equals(user.getPassword())) {
			return "pwdError";
		}
		
		newPwd = MD5Util.md5Encrypt(user.getPhone(), newPwd);
		user.setPassword(newPwd);
		
		userService.update(user);
		
		session.setAttribute("user", user);
		
		session.removeAttribute("user");
		
		return "success";
	}

	// 短信验证
	@RequestMapping("proving")
	public @ResponseBody String proving(String phone) {
		PhoneVerification verification = new PhoneVerification();
		String code = verification.Verification(phone, "SMS_111120006");

		return code;
	}

	private int Total = 0;// 总数
	private int number = 7;// 条数
	private int pages = 0;// 页数
	private int CurrentPage = 0;// 当前页
	private int checks = 0;//// 查询前后条数

	@RequestMapping("user-list")
	public String ulist(Model model) {
		List<User> list = userService.list2();
		Total = userService.count();
		pages = (Total + number - 1) / number;// 页数

		List ll = new ArrayList<>();
		ll.add(Total);
		ll.add(pages);

		model.addAttribute("list", list);
		model.addAttribute("ll", ll);
		return "back/user-list";
	}

	// 分页
	@RequestMapping("text")
	public String paging(Model model, User user) {
		CurrentPage = user.getId();// 当前页
		int c = (CurrentPage - 1) * number;// 查询前后条数
		Page page1 = new Page();
		page1.setFist(c);
		page1.setTow(number);
		page1.setTitle(user.getRealname());
		page1.setPeople(user.getPhone());

		List<User> list = new ArrayList<>();
		if (user.getRealname() == "" && user.getPhone() == "") {

			list = userService.selectpaging(page1);
		} else {
			list = userService.selectpeople(page1);
		}

		List<User> lli = userService.selectlike(page1);
		if (user.getRealname() == "" && user.getPhone() == "") {
			Total = userService.count();
		} else {
			Total = lli.size();
		}
		pages = (Total + number - 1) / number;// 页数
		String title1 = user.getRealname();
		String people = user.getPhone();

		List ll = new ArrayList<>();
		ll.add(Total);
		ll.add(pages);
		ll.add(title1);
		ll.add(people);

		model.addAttribute("ll", ll);
		model.addAttribute("list", list);
		model.addAttribute("list2", CurrentPage);

		return "back/user-list";

	}

	// 模糊查询
	@RequestMapping("notice-fy")
	public String fent(Model model, User user, HttpServletRequest request) {

		if (user.getRealname() != "" || user.getPhone() != "") {
			Page page = new Page();
			page.setFist(checks);
			page.setTow(number);
			page.setTitle(user.getRealname());
			page.setPeople(user.getPhone());

			List<User> list = userService.selectpeople(page);
			List<User> list2 = userService.selectlike(page);// 总条数
			Total = list2.size();
			pages = (Total + number - 1) / number;// 页数
			String title1 = user.getRealname();
			String people1 = user.getPhone();

			List ll = new ArrayList<>();
			ll.add(Total);
			ll.add(pages);
			ll.add(title1);
			ll.add(people1);
			model.addAttribute("ll", ll);

			model.addAttribute("list", list);
			return "back/user-list";
		}

		return "redirect:/user/user-list";
	}

	
	 public BigDecimal getBigDecimalByDouble(Double d,Integer i) {//把一个Double类型转换成BigDecimal类型i位小数并四舍五入
			
			BigDecimal b1=new BigDecimal(d);
			
			BigDecimal b2 =b1.setScale(i,BigDecimal.ROUND_HALF_UP);
			
			return b2;
		
		}

	
	// 借款额度申请
	@RequestMapping("exanmineApply")
	public String userInfo(ExanmineInfo exanmineInfo) {
		System.out.println(exanmineInfo.toString());
		DateUtil dateUtil = new DateUtil();
		//添加用户信息
		UserInfo userInfo = new UserInfo();
		userInfo.setUserId(exanmineInfo.getUserId());
		userInfo.setRealname(exanmineInfo.getRealname());
		userInfo.setIdcard(exanmineInfo.getIdcard());
		userInfo.setNativeplace(exanmineInfo.getNativeplace());
		userInfo.setSex(exanmineInfo.getSex());
		userInfo.setMarriage(exanmineInfo.getMarriage());
		userInfo.setChildren(exanmineInfo.getChildren());
		userInfo.setEducation(exanmineInfo.getEducation());
		userInfo.setWhethercar(exanmineInfo.getWhethercar());
		userInfo.setWhetherhouse(exanmineInfo.getWhetherhouse());
		userInfo.setOyh1("0");
		userInfoService.update(userInfo);
		//添加用户申请额度信息
		ExamineApply examineApply = new ExamineApply();
		examineApply.setUsername(exanmineInfo.getUsername());
		examineApply.setApplylimit(exanmineInfo.getApplylimit());
		examineApply.setApplytime(dateUtil.convert(new Date().toLocaleString()));
		examineApply.setStatus("未审核");
		userInfoService.insertExamineApply(examineApply);
		return "redirect:/front/user/PersonalCenter";
	}
	
	// 用户详情信息的添加
	@RequestMapping("saveUserInfo")
	public String saveUserInfo(UserInfo userInfo) {
		userInfo.setOyh1("0");
		System.out.println(userInfo.toString());
		userInfoService.update(userInfo);
		
		Subject subject = SecurityUtils.getSubject();
		Session session = subject.getSession();
		userInfo = (UserInfo) session.getAttribute("userInfo");
		userInfo = userInfoService.getById(userInfo.getId());
		session.setAttribute("userInfo", userInfo);
		System.out.println("userInfo.realname:"+userInfo.getRealname());
		return "redirect:/front/user/PersonalCenter";
	}
	
	
	// 借款额度申请列表
	@RequestMapping("feedback-list")
	public String exanmineList(Model model) {
		List<ExamineApply> examineList = userInfoService.examineList();
		Integer count = userInfoService.countData();
		model.addAttribute("exanmineList", examineList);
		model.addAttribute("count", count);
		return "back/feedback-list";
	}
	
	//查找申请额度数据
	@RequestMapping("/feedback-edit/{id}")
	public String tofeedbackedit(@PathVariable Integer id, Model model) {
		//添加用户信息
		ExamineApply examine = userInfoService.examineById(id);
		model.addAttribute("exanmine", examine);
		return "back/feedback-edit";
	}
	
	//审核额度
	@RequestMapping("examineEdit")
	public @ResponseBody String feedbackedit(ExamineApply examineApply) {
		DateUtil dateUtil = new DateUtil();
		examineApply.setExaminetime(dateUtil.convert(new Date().toLocaleString()));
		examineApply.setStatus("已审核");
		System.out.println(examineApply.toString());
		userInfoService.updateExamine(examineApply);
		return "success";
	}
	
	//删除审核额度信息
	@RequestMapping("exanmine-remove")
	public @ResponseBody String exanmineRemove(Integer id) {
		userInfoService.removeExamine(id);
		return "success";
	}
	
	//批量删除审核额度信息
	@RequestMapping("exanmine-removeMany")
	public @ResponseBody String exanmineRemoveMany(Integer[] des) {
		for (Integer integer : des) {
			userInfoService.removeExamine(integer);
		}
		return "success";
	}


	@RequestMapping("logout")
	public String logoutback() {
		Subject subject = SecurityUtils.getSubject();
		subject.logout();
		return "front/login";
	}
	
	@RequestMapping("isSession")
	public @ResponseBody Object isSession() {
		Subject subject = SecurityUtils.getSubject();
		Session session = subject.getSession();
		User user = (User) session.getAttribute("user");
		if(user==null) {
			return "error";
		}
		
		return "success";
	}
	
	@RequestMapping("isExistence")
	public @ResponseBody Object isExistence(String phone) {
		System.out.println("phone"+phone);
		User user = userService.getid(phone);

		if(user==null || user.getId()==0) {
			return "error";
		}
		
		return"success";
	}
	
	@RequestMapping("backPwd")
	public @ResponseBody Object backPwd(String phone,String newPwd) {
		
		User user = new User();
		user.setPhone(phone);
		user = userService.getByPhoneName(user);
		
		SimpleHash simpleHash = new SimpleHash("MD5", newPwd, phone,10);
		
		user.setPassword(simpleHash.toString());
		
		userService.update(user);
		
		return "success";
	}
	
}
