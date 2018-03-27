package com.ht.controller;

import java.util.List;

import javax.annotation.Resource;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ht.model.User;
import com.ht.service.AssetsService;
import com.ht.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Resource(name="userServiceImpl")
	private UserService userService;
	


	
	@RequestMapping("/list")
	public String list(Model model){
		List<User> userList = userService.list();
		model.addAttribute("userList", userList);
		System.out.println("大小:"+userList.size());
		return "user/userList";
	}
	
	@RequestMapping("/save")
	public String save() {
		
		return "user/userSave";
	}
	
	@RequestMapping("/add")
	public String add(User u) {
		
		userService.insert(u);
		
		return "redirect:/user/list";
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable("id") Integer id) {
		
		userService.delete(id);
		
		return "redirect:/user/list";
	}
	
	@RequestMapping("/openUsers/{id}")
	public String openUsers(@PathVariable("id") Integer id,Model model) {
		
		User u=userService.getById(id);
		model.addAttribute("user",u);
		return "user/openUser";
	}
	
	@RequestMapping("/update")
	public String update(User u) {
		
		userService.update(u);
		
		return "redirect:/user/list";
	}
	
	@RequestMapping("/dl")
    public String dl() {
		System.out.println("67777");
		return "login";
	}
	

	@RequestMapping("/login")
	public String shiroLogin(@RequestParam("name") String username,@RequestParam("password") String password){
		
		
		Subject subject = SecurityUtils.getSubject();
		
		UsernamePasswordToken token = new UsernamePasswordToken(username, password);
		
		try{
			subject.login(token);
		}catch(AuthenticationException e){
			System.out.println("登陆失败: " + e.getMessage());
			return "login";
		}
		
		return "redirect:/user/list";
	}
	
	
	

   
	
	

}
