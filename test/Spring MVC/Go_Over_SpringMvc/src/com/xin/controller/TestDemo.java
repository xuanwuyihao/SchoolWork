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
		System.out.println("��ã�");
		return "first";
	}
	
	//��modelandview�����ݵ�ǰ̨
	@RequestMapping("two")
	public ModelAndView two(){
		String message="С�ڹ�";
		return new ModelAndView("two","message",message);
	}

	
}
