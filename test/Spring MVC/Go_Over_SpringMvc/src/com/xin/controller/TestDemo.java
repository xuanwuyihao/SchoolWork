package com.xin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="test")
public class TestDemo {
	@RequestMapping(value="first")
	public String first(){
		System.out.println("你好！");
		return "first";
	}
	
	//用modelandview传数据到前台
	@RequestMapping("two")
	public ModelAndView two(){
		String message="小黑鬼";
		return new ModelAndView("two","message",message);
	}

	
}
