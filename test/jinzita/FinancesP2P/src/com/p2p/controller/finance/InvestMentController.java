package com.p2p.controller.finance;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.p2p.pojo.ExamineApply;
import com.p2p.pojo.Gathering;
import com.p2p.pojo.LendBeckonmoney;
import com.p2p.pojo.Still;
import com.p2p.service.GatheringService;
import com.p2p.service.LendBeckonmoneyService;
import com.p2p.service.StillService;
import com.p2p.service.UserInfoService;

@Controller
@RequestMapping("/finance/investment")
public class InvestMentController {
	@Resource(name = "gatheringServiceImpl")
	private GatheringService gatheringService;
	
	@Resource(name = "userInfoServiceImpl")
	private UserInfoService userInfoService;
	
	@Resource(name = "lendBeckonmoneyServiceImpl")
	private LendBeckonmoneyService lendBeckonmoneyService;
	
	@Resource(name="stillServiceImpl")
	private StillService stillService;
	
	@RequestMapping("getUserName/{id}")
	public String getUserName(@PathVariable Integer id,Model model){
		List<Gathering> list=gatheringService.getUserName(id);
		List<Gathering> list2=gatheringService.getUserId(id);
		List<Gathering> list3=gatheringService.getStage(id);
		
		List<Gathering> sum=gatheringService.selNameSum(id);
		if(list.size()>0 && list2.size()>0) {
			model.addAttribute("userlist",list);
			model.addAttribute("userlist2",list2);
			model.addAttribute("userlist3",list3);
			model.addAttribute("sum",sum);
			
			return "front/user/investment";
		}else if(list.size()==0 || list2.size()==0){
			if(list.size()>0) {
				model.addAttribute("userlist",list);
				model.addAttribute("userlist3",list3);
				model.addAttribute("sum",sum);
				
				return "front/user/investment3";
			}else if(list2.size()>0) {
				model.addAttribute("userlist2",list2);
				model.addAttribute("userlist3",list3);
				model.addAttribute("sum",sum);
				
				return "front/user/investment4";
			}
		}
		return "front/user/investment2";
	}
	
	@RequestMapping("selUserName")
	public String selUserName(@RequestParam("phone") String phone,Model model){
		System.out.println("userphone="+phone);
		List<ExamineApply> ea=userInfoService.sele();
		
		int zy=ea.size()/8;
		if(ea.size()%8!=0) {
			zy=ea.size()/8+1;
		}
		model.addAttribute("ea",ea.size());
		model.addAttribute("list",ea);
		model.addAttribute("zy",zy);
		model.addAttribute("dq",1);
		
		List<LendBeckonmoney> list=lendBeckonmoneyService.selUserId(phone);
		List<LendBeckonmoney> list2=lendBeckonmoneyService.getUserId(phone);
		List<Still> list3=stillService.getStill(phone);
		
		Float tsum=lendBeckonmoneyService.selUserIdMoney(phone);
		Float msum=lendBeckonmoneyService.getUserIdMoney(phone);
		
		List<Still> sum=stillService.selSumMoney(phone);
		
		if(list.size()>0 && list2.size()>0) {
			model.addAttribute("userlist",list);
			model.addAttribute("userlist2",list2);
			model.addAttribute("userlist3",list3);
			model.addAttribute("tsum",tsum);
			model.addAttribute("msum",msum);
			model.addAttribute("sum",sum);
			
			return "front/user/borrow";
		}else if(list.size()==0 || list2.size()==0){
			if(list.size()>0) {
				model.addAttribute("userlist",list);
				model.addAttribute("userlist3",list3);
				model.addAttribute("tsum",tsum);
				model.addAttribute("msum",msum);
				model.addAttribute("sum",sum);
				
				return "front/user/borrow3";
			}else if(list2.size()>0) {
				model.addAttribute("userlist2",list2);
				model.addAttribute("userlist3",list3);
				model.addAttribute("tsum",tsum);
				model.addAttribute("msum",msum);
				model.addAttribute("sum",sum);
				
				return "front/user/borrow4";
			}
		}
		return "front/user/borrow2";
	}
}
