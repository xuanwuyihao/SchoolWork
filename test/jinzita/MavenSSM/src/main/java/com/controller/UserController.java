package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.User;
import com.service.UserService;

@Controller
@RequestMapping("users")
public class UserController {
	List<User> list;
	
	@Autowired
	private UserService userService;
	
	@GetMapping(value= {"/","list.html"})
	public String paypage(Model model) {
		list=userService.findAll();
		model.addAttribute("list", list);
		return "userList";
	}
	
	@RequestMapping("lists")
	public String lists(Model model) {
		list=userService.findAll();
		model.addAttribute("list", list);
		return "userList";
	}
	
	@RequestMapping("toadds")
	public String toadds() {
		return "useradd";
	}
	
	@RequestMapping("adds")
	public String adds(User user) {
		try {
			userService.add(user);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return "redirect:/users/lists";
		
	}
	
	@RequestMapping("toupdates/{id}")
	public String updates(@PathVariable Integer id,Model model) {
		User user=userService.getById(id);
		model.addAttribute("user", user);
		return "userEdit";
	}
	
	@RequestMapping("updates")
	public String updates(User user) {
		try {
			userService.update(user);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return "redirect:/users/list";
	}
	

}
