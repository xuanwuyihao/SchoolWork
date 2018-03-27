package com.p2p.controller.back;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.p2p.pojo.Letter;
import com.p2p.pojo.User;
import com.p2p.pojo.UserBankcard;
import com.p2p.pojo.UserInfo;
import com.p2p.service.UserBankcardService;
import com.p2p.service.UserInfoService;
import com.p2p.service.UserService;

@Controller
@RequestMapping("bankCard")
public class BackBankCardController {
	
	@Resource(name="userBankcardServiceImpl")
	UserBankcardService userBankcardService;
	
	@Resource(name="userServiceImpl")
	UserService userService;
	
	@Resource(name="userInfoServiceImpl")
	UserInfoService userInfoService;
	
	@RequestMapping("list")
	public String list(Model model,String time1,String time2,String phone,String realName,String numbers) {
System.out.println(numbers+" - "+time1+" - "+time2+" - "+phone+" - "+realName);
		
		Map<String, Object> map = new HashMap<String, Object>();
		
     	
		map.put("time1",time1);
		map.put("time2",time2);
		
		int line = 8;// 行个数
		int number = 1;// 当前页
		int lineall = 0;// 总行数
		int numberall = 0;// 总页数
		
        if(numbers!=null&&!numbers.equals("")) {
        	number=Integer.parseInt(numbers);
        	System.out.println(" ----- "+number);
        }
        
        // 获取总行数
        lineall=userBankcardService.maxCount(map);
        System.out.println("lineall："+lineall);
        //总页数
        numberall=(lineall+line-1)/line;
        
        
		System.out.println();
        
        if(number>numberall) {
        	number=numberall;
        }
        if(number<1) {
        	number=1;
        }
        // 开始位置
     	int x = (number - 1) * line;
     	
     	User user = new User(); 
     	user.setPhone(phone);
     	user.setRealname(realName);
     	
     	
     	if(user!=null) {
     		try {
     		user = userService.getByPhoneName(user);
     		}catch(Exception e){
     			
     		}
         	
         	if(user==null) {
         		return "back/bankCard_list";
         	}
     	}
     	
     
     	if(user.getId()!=null && user.getId()!=0) {
     		UserInfo userinfoidc = userInfoService.getByUserId(user.getId());
     		map.put("userinfoid",userinfoidc.getId());
     	}
     	
     
		map.put("line",line);
		map.put("number",x);
		
		
		
		List<UserBankcard> bankCardList = userBankcardService.bankCard_List(map);
		System.out.println("bankCardList："+bankCardList.size());
		for (UserBankcard userBankcard : bankCardList) {
			System.out.println("userBankcard.getUserinfoid()："+userBankcard.getUserinfoid());
			UserInfo userinfo = userInfoService.getById(userBankcard.getUserinfoid());
			userBankcard.setOyh2(userinfo.getRealname());
			userBankcard.setOyh3(userinfo.getIdcard());
			System.out.println("userinfo.getUserId()："+userinfo.getUserId());
			User users = userService.getById(userinfo.getUserId());
			
			userBankcard.setOyh1(users.getPhone());
		}
		
        model.addAttribute("bankCardList", bankCardList);
        model.addAttribute("numberall", numberall);
        model.addAttribute("number",number);
        model.addAttribute("phone", phone);
        model.addAttribute("realName", realName);
        model.addAttribute("time1", time1);
        model.addAttribute("time2", time2);
		
		System.out.println("number："+number);
		return "back/bankCard_list";
	}
	
	@RequestMapping("selById")
	public String selById(Integer id,Model model) {
		UserBankcard userBankcard = userBankcardService.getById(id);
		UserInfo userinfo = userInfoService.getById(userBankcard.getUserinfoid());
		userBankcard.setOyh2(userinfo.getRealname());
		userBankcard.setOyh3(userinfo.getIdcard());
		System.out.println("userinfo.getUserId()："+userinfo.getUserId());
		User users = userService.getById(userinfo.getUserId());
		
		userBankcard.setOyh1(users.getPhone());
		
		
		model.addAttribute("userBankcard", userBankcard);
		
		return "back/bankCard_edit";
	}
	
	@RequestMapping("test")
	public String test() {
		UserInfo userinfo = userInfoService.getById(19);
		System.out.println("userinfo："+userinfo.getUserId());
		return "";
	}
	
}
