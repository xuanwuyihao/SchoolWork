package com.ht.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/upload")
public class UploadControlle {
	
	@RequestMapping("/openUpload")
	public String openUpload(){
		return "upload/upload";
	}

}
