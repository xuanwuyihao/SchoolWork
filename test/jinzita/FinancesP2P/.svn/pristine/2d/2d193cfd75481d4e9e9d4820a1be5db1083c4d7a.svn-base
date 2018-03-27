package com.p2p.controller.back;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.p2p.pojo.LendBeckonmoney;
import com.p2p.service.LendBeckonmoneyService;
import com.p2p.pojo.Letter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.p2p.pojo.PlatformCharging;

import com.p2p.pojo.SysLog;
import com.p2p.service.PlatformChargingService;
import com.p2p.service.SysLogService;



@Controller
@RequestMapping("/back")
public class ToViewController {

	@Resource(name = "platformChargingServiceImpl")
	PlatformChargingService platformChargingService;
	
	@Resource(name = "sysLogServiceImpl")
	SysLogService sysLogService;

	// 后台首页
	@RequestMapping("/index")
	public String index() {
		return "back/index";
	}

	// 后台登录
	@RequestMapping("/login")
	public String login() {
		return "back/login";
	}

	// 媒体报道
	@RequestMapping("/member-list")
	public String memberlist() {
		return "back/member-list";
	}
	@RequestMapping("/member-add")
	public String memberaddt() {
		return "back/member-add";
	}
	@RequestMapping("/member-edit")
	public String memberedit() {
		return "back/member-edit";
	}

	// 轮播图列表
	@RequestMapping("/banner-list")
	public String bannerlist() {
		return "back/banner-list";
	}
	@RequestMapping("/banner-add")
	public String banneradd() {
		return "back/banner-add";
	}
	
	//奖励发放
	@RequestMapping("/investAword")
	public String investAword() {
		return "back/investAword";
	}

	// 统计图表
	@RequestMapping("/welcome")
	public String welcome() {
		return "back/welcome";
	}

	// 后台-首页管理-修改密码
	@RequestMapping("/member-password")
	public String questionlist() {
		return "back/member-password";
	}

	// 统计报表
	@RequestMapping("/echart")
	public String echart() {
		return "back/echart";
	}


	// 系统设置
	@RequestMapping("/sys-set")
	public String sysset() {
		return "back/sys-set";
	}

	// 数字字典
	@RequestMapping("/sys-data")
	public String sysdata() {
		return "back/sys-data";
	}

	// 屏蔽词
	@RequestMapping("/sys-shield")
	public String sysshield() {
		return "back/sys-shield";
	}

	// 系统日志
	@RequestMapping("/openSys-log")
	public String openSyslog() {

		return "back/sys-log";
	}

	// 系统日志
	@RequestMapping("/sys-log")
	public @ResponseBody void syslog(HttpServletResponse response) throws JsonProcessingException {
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json; charset=utf-8");
		Map<String, Object> map = new HashMap<>();
		Integer count = sysLogService.maxCount();
		List<SysLog> sysLogList = sysLogService.list();
		
		
		map.put("code", 0);
		map.put("msg", "");
		map.put("count", count);
		map.put("data", sysLogList);

		ObjectMapper mapper = new ObjectMapper();
		String jsonfromList = mapper.writeValueAsString(sysLogList);
		System.out.println(jsonfromList);
		try {
			PrintWriter out = response.getWriter();
			 out.print(jsonfromList);
             out.flush();
             out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@RequestMapping("sysLog_del")
	public @ResponseBody Object sysLog_del(String[] id){
		
		System.out.println("Id："+id);
		
		
			for (String integer : id) {
				sysLogService.remove(Integer.parseInt(integer));
			}
		
		
		return "success";
	}

	// 友情链接
	@RequestMapping("/sys-link")
	public String syslink() {
		return "back/sys-link";
	}

	// 第三方登录
	@RequestMapping("/sys-qq")
	public String sysqq() {
		return "back/sys-qq";
	}


	// 站内信
	@RequestMapping("letter-add")
	public String letterAdd() {
		return "back/leter-add";
	}

	// 平台收费管理
	@RequestMapping("platformCharging")

	


	public String platformCharging(Model model,String numbers){
		

		int line = 1;// 行个数
		int number = 1;// 当前页
		int lineall = 0;// 总行数
		/*int numberall = 0;// 总页数
*/		if (numbers != null && !numbers.equals("")) {
			number = Integer.parseInt(numbers);
		}
		// 获取总行数
		lineall = platformChargingService.maxCount();
		line = lineall;
		System.out.println();

		/*// 总页数
		numberall = (lineall + line - 1) / line;
		if (number > numberall) {
			number = numberall;
		}*/
		if (number < 1) {
			number = 1;
		}

/*
        //总页数
        numberall=(lineall+line-1)/line;
        if(number>numberall) {
        	number=numberall;
        }*/
        if(number<1) {
        	number=1;
        }
        // 开始位置
     	int x = (number - 1) * line;
     	

		List<PlatformCharging> platformChargingList = platformChargingService.list();

		model.addAttribute("platformChargingList", platformChargingList);
		/*model.addAttribute("numberall", numberall);*/
		model.addAttribute("number", number);

		return "back/platformCharging";
	}

	// 修改密码
	@RequestMapping("modifyPassword")
	public String modifyPassword() {

		return "back/ModifyPassword";
	}

	@RequestMapping("error")
	public String error() {

		return "back/error";
	}
	
	
}
