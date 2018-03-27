package com.p2p.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



//退出
@Controller
@RequestMapping("/shiro")
public class Secede {
	
	
	@RequestMapping("logout")
	public String shiroTest(){
			
		return "login";
	}
	
	
	

}
