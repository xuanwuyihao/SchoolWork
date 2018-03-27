package com.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.User;
import com.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {
		List<User> list;
		
		@Autowired
		private UserService userService;
		
		@RequestMapping("selets")
		public Object serlects(Model model) {
			System.out.println("iiiiii");
			list=userService.findAll();
			model.addAttribute("lists",list);
			model.addAttribute("i",1);
			
			return "UserList";
		}
		
		@RequestMapping("adds")
		@ResponseBody
		public String adds(User user) {
			try {
				userService.add(user);
			}catch (Exception e) {
				e.printStackTrace();
			}
			return "success";
		}
		
		@RequestMapping("updates")
		@ResponseBody
		public String updates(User user,Model model) {
			try {
				userService.update(user);
			}catch (Exception e) {
				e.printStackTrace();
			}
			
			model.addAttribute("i",2);
			return "UserList";
		}
		
		@RequestMapping("deletes")
		@ResponseBody
		public String deletes(String id) {
			try {
				userService.delete(Integer.valueOf(id));
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			return "success";
		}
}
