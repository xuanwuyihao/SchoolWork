package com.p2p.controller.back;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.p2p.pojo.Page;
import com.p2p.pojo.Still;
import com.p2p.pojo.UserMoney;
import com.p2p.service.StillService;

@Controller
@RequestMapping("/still")
public class StillControll {

	@Resource(name="stillServiceImpl")
	private StillService stillService;
	
	
	
	private int Total=0;//总数
	private int number=7;//条数
	private int pages=0;//页数
	private int CurrentPage=0;//当前页
	private int checks=0;////查询前后条数
	
	@RequestMapping("still-list")
	public String list(Model model){
		
		List<Still> list=stillService.list2();
		
	    Total=stillService.count();
			pages=(Total+number-1)/number;//页数
//			List<UserMoney>list2= stillService.selectSum();
			
			
			List ll=new ArrayList<>();
			ll.add(Total);
			ll.add(pages);
		
		model.addAttribute("list", list);
		model.addAttribute("ll",ll);
//		model.addAttribute("sum",list2);
		
//		model.addAttribute("list", list);
		return "back/still";
	}
	
	@RequestMapping("userMoney-fy")
	public String  paging(Model model,UserMoney userMoney){
		CurrentPage=userMoney.getId();//当前页
		int c=(CurrentPage-1)*number;//查询前后条数
		Page page1=new Page();
		page1.setFist(c);
		page1.setTow(number);
		page1.setTitle(userMoney.getUsername());
		

		List<Still> list=new ArrayList<>();
		List<Still>list2= new ArrayList<>();
		if(userMoney.getUsername()==""){
			
			 list=stillService.selectpaging(page1);
//			 list2=stillService.selectSum();
		}else {
			list=stillService.selectpeople(page1);
//			list2=stillService.selectSumMH(page1);
		}

		List<Still> lli=stillService.selectlike(page1);
		if(userMoney.getUsername()==""){
			Total=stillService.count();			
		}else{
			Total=lli.size();	
			}
		pages=(Total+number-1)/number;//页数
		String title1=userMoney.getUsername();
		
					
		List ll=new ArrayList<>();
		ll.add(Total);
		ll.add(pages);
		ll.add(title1);
		
		
		model.addAttribute("sum",list2);
		model.addAttribute("ll",ll);
		model.addAttribute("list",list);
		model.addAttribute("list2",CurrentPage);
		
		return "back/still";
		
	}
	
}
