package com.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
		@ResponseBody
		public Object serlects() {
			list=userService.findAll();
			Map<String, Object> map=new HashMap<>();
			map.put("lists", list);
			map.put("total", list.size());
			return map;
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
		public String updates(User user) {
			try {
				userService.update(user);
			}catch (Exception e) {
				e.printStackTrace();
			}
			return "success";
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
