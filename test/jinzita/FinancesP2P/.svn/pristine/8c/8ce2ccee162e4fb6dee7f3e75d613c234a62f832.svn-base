package com.p2p.controller.back;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.p2p.pojo.CompanyMoney;
import com.p2p.pojo.LendApply;
import com.p2p.pojo.LendBeckonmoney;
import com.p2p.pojo.UserInfo;
import com.p2p.service.CompanyMoneyService;
import com.p2p.service.InvestService;
import com.p2p.service.LendApplyService;
import com.p2p.service.LendBeckonmoneyService;
import com.p2p.service.UserInfoService;
import com.p2p.service.UserService;


@Controller
@RequestMapping("/reportForm")
public class ReportFormController {

	
	@Resource(name = "userInfoServiceImpl")
	private UserInfoService userInfoService;
	
	@Resource(name = "lendApplyServiceImpl")
	private LendApplyService lendApplyService;
	
	@Resource(name = "lendBeckonmoneyServiceImpl")
	private LendBeckonmoneyService lendBeckonmoneyService;
	
	@Resource(name = "companyMoneyServiceImpl")
	private CompanyMoneyService companyMoneyService;
	
	@Resource(name = "userServiceImpl")
	private UserService userService;
	
	@Resource(name = "investServiceImpl")
	private InvestService investService;
	
	@RequestMapping("reportForm-bao")
	public String getlist(Model model){
		
		
		List<UserInfo> list=userInfoService.list();
		String sub="";
		Map<Integer, String> map=new HashMap<>();
		List<String> list2=new ArrayList<>();
		Set<String> li=new HashSet<>();
		int v=0;
		for(int i=0;i<list.size();i++){
			UserInfo userInfo=list.get(i);
			String str=userInfo.getNativeplace();
			if(str!=null){
				int str2=str.indexOf("省")+1;
				int str3=str.indexOf("市")+1;
				String str4=str.substring(str2, str3);
				
				if(!sub.equals(str4)){
					map.put(v, str4);
					list2.add(str4);
					li.add(str4);
					v++;
					sub=str4;
				}
			}
			
		}
		List<Integer> list3=new ArrayList<Integer>();
		List<String> list4=new ArrayList<String>();
		for (String str : li) {  
			UserInfo userInfo=new UserInfo();
			userInfo.setNativeplace(str);
			int tt=userInfoService.getCount(userInfo);
			list3.add(tt);
			list4.add('"'+str+'"');
		}
		
		//折线
		
		List<LendApply> BrokenLine=lendApplyService.list2();
		int x6=0,x7=0,x8=0,x9=0,x10=0,x11=0,x12=0;
		int t6=0,t7=0,t8=0,t9=0,t10=0,t11=0,t12=0;
		List<Integer> Tlist=new ArrayList<>();
		List<Integer> Xlist=new ArrayList<>();
		for(LendApply Line:BrokenLine){

			if(Line.getApplytime()!=null){
				int time=Line.getApplytime().getMonth()+1;
					if(Line.getTupe().equals("信用标")){
						if(time==6){
							x6++;
						}else if(time==7){
							x7++;
						}else if(time==8){
							x8++;
						}else if(time==9){
							x9++;
						}else if(time==10){
							x10++;
						}else if(time==11){
							x11++;
						}else if(time==12){
							x12++;
						}
					}else if(Line.getTupe().equals("抵押标")){
						if(time==6){
							t6++;
						}else if(time==7){
							t7++;
						}else if(time==8){
							t8++;
						}else if(time==9){
							t9++;
						}else if(time==10){
							t10++;
						}else if(time==11){
							t11++;
						}else if(time==12){
							t12++;
						}
					}
					
			}
			
		}
		Tlist.add(t6);
		Tlist.add(t7);
		Tlist.add(t8);
		Tlist.add(t9);
		Tlist.add(t10);
		Tlist.add(t11);
		Tlist.add(t12);
		
		
		Xlist.add(x6);
		Xlist.add(x7);
		Xlist.add(x8);
		Xlist.add(x9);
		Xlist.add(x10);
		Xlist.add(x11);
		Xlist.add(x12);
		
		//圆柱
		
		List<LendBeckonmoney> Ylist=lendBeckonmoneyService.list2();
		Set<Integer> Ulist=new HashSet<>();
		List<Integer> Ulist2=new ArrayList<>();
		int uu=0;
		int mont=0;
		for(LendBeckonmoney len:Ylist){
			System.out.println("Ulist====="+len.getRaisetime());
			if(len.getReleasetime()!=null&&len.getStatus().equals("满标")){
				
				if(len.getLendmoney()!=null&&len.getStatus().equals("满标")){
					mont++;
				}
				int time=len.getReleasetime().getMonth()+1;
				if(uu!=time){
					uu=time;
					Ulist.add(time);
				}
			}
			
		}
		System.out.println("Ulist====="+Ulist);
		for(int i=1;i<13;i++){
			if(Ulist.contains(i)){
				LendBeckonmoney lend=new LendBeckonmoney();
				lend.setId(i);	

				if(mont!=0){
					int Amount=lendBeckonmoneyService.getAmount(lend);
					Ulist2.add(Amount);
				}
			}else{				
				Ulist2.add(0);
			}
			
		}
		
		
		//2饼图
		List<String> Blist=new ArrayList<>() ;
		Blist.add("用户借款利息");
		Blist.add("标的融资管理");
		Blist.add("用户提现管理费");
		List<CompanyMoney> llw=companyMoneyService.list();
		List<Integer> Blist2=new ArrayList<>() ;
		int sum=0;
		for (int i = 0; i < Blist.size(); i++) {
			CompanyMoney companyMoney=new CompanyMoney();
			companyMoney.setType(Blist.get(i));
			if(llw.size()!=0){
			int con=companyMoneyService.getMoney(companyMoney);
				sum=sum+con;
				Blist2.add(con);	
			}
			
		}
		int lend=lendBeckonmoneyService.getSum();//所有借款用户
		int userco=userService.pcount();//所有用户
		int inve=investService.getCount();//所有投资用户
		List<Integer> Elist=new ArrayList<>();
		Elist.add(userco);
		Elist.add(lend);
		Elist.add(inve);
		Elist.add(sum);
		
		model.addAttribute("list4",list4);
		model.addAttribute("list3",list3);
		model.addAttribute("Xlist",Xlist);
		model.addAttribute("Tlist",Tlist);
		model.addAttribute("Ulist2",Ulist2);
		model.addAttribute("Blist",Blist);
		model.addAttribute("Blist2",Blist2);
		model.addAttribute("Elist",Elist);
		return "back/welcome";
	}
	

	@RequestMapping("reportForm-bao2")
	public String getlist2(Model model){
		
		
		List<UserInfo> list=userInfoService.list();
		String sub="";
		Map<Integer, String> map=new HashMap<>();
		List<String> list2=new ArrayList<>();
		Set<String> li=new HashSet<>();
		int v=0;
		for(int i=0;i<list.size();i++){
			UserInfo userInfo=list.get(i);
			String str=userInfo.getNativeplace();
			if(str!=null){
				int str2=str.indexOf("省")+1;
				int str3=str.indexOf("市")+1;
				String str4=str.substring(str2, str3);
				
				if(!sub.equals(str4)){
					map.put(v, str4);
					list2.add(str4);
					li.add(str4);
					v++;
					sub=str4;
				}
			}
			
		}
		List<Integer> list3=new ArrayList<Integer>();
		List<String> list4=new ArrayList<String>();
		for (String str : li) {  
			UserInfo userInfo=new UserInfo();
			userInfo.setNativeplace(str);
			int tt=userInfoService.getCount(userInfo);
			list3.add(tt);
			list4.add('"'+str+'"');
		}
		
		//折线
		
		List<LendApply> BrokenLine=lendApplyService.list2();
		int x6=0,x7=0,x8=0,x9=0,x10=0,x11=0,x12=0;
		int t6=0,t7=0,t8=0,t9=0,t10=0,t11=0,t12=0;
		List<Integer> Tlist=new ArrayList<>();
		List<Integer> Xlist=new ArrayList<>();
		for(LendApply Line:BrokenLine){

			if(Line.getApplytime()!=null){
				int time=Line.getApplytime().getMonth()+1;
					if(Line.getTupe().equals("信用标")){
						if(time==6){
							x6++;
						}else if(time==7){
							x7++;
						}else if(time==8){
							x8++;
						}else if(time==9){
							x9++;
						}else if(time==10){
							x10++;
						}else if(time==11){
							x11++;
						}else if(time==12){
							x12++;
						}
					}else if(Line.getTupe().equals("抵押标")){
						if(time==6){
							t6++;
						}else if(time==7){
							t7++;
						}else if(time==8){
							t8++;
						}else if(time==9){
							t9++;
						}else if(time==10){
							t10++;
						}else if(time==11){
							t11++;
						}else if(time==12){
							t12++;
						}
					}
					
			}
			
		}
		Tlist.add(t6);
		Tlist.add(t7);
		Tlist.add(t8);
		Tlist.add(t9);
		Tlist.add(t10);
		Tlist.add(t11);
		Tlist.add(t12);
		
		
		Xlist.add(x6);
		Xlist.add(x7);
		Xlist.add(x8);
		Xlist.add(x9);
		Xlist.add(x10);
		Xlist.add(x11);
		Xlist.add(x12);
		
		//圆柱
		
		List<LendBeckonmoney> Ylist=lendBeckonmoneyService.list2();
		Set<Integer> Ulist=new HashSet<>();
		List<Integer> Ulist2=new ArrayList<>();
		int uu=0;
		int mont=0;
		for(LendBeckonmoney len:Ylist){
			System.out.println("Ulist====="+len.getRaisetime());
			if(len.getReleasetime()!=null&&len.getStatus().equals("满标")){
				
				if(len.getLendmoney()!=null&&len.getStatus().equals("满标")){
					mont++;
				}
				int time=len.getReleasetime().getMonth()+1;
				if(uu!=time){
					uu=time;
					Ulist.add(time);
				}
			}
			
		}
		System.out.println("Ulist====="+Ulist);
		for(int i=1;i<13;i++){
			if(Ulist.contains(i)){
				LendBeckonmoney lend=new LendBeckonmoney();
				lend.setId(i);	

				if(mont!=0){
					int Amount=lendBeckonmoneyService.getAmount(lend);
					Ulist2.add(Amount);
				}
			}else{				
				Ulist2.add(0);
			}
			
		}
		
		
		//2饼图
		List<String> Blist=new ArrayList<>() ;
		Blist.add("用户借款利息");
		Blist.add("标的融资管理");
		Blist.add("用户提现管理费");
		List<CompanyMoney> llw=companyMoneyService.list();
		List<Integer> Blist2=new ArrayList<>() ;
		int sum=0;
		for (int i = 0; i < Blist.size(); i++) {
			CompanyMoney companyMoney=new CompanyMoney();
			companyMoney.setType(Blist.get(i));
			if(llw.size()!=0){
			int con=companyMoneyService.getMoney(companyMoney);
				sum=sum+con;
				Blist2.add(con);	
			}
			
		}
		int lend=lendBeckonmoneyService.getSum();//所有借款用户
		int userco=userService.pcount();//所有用户
		int inve=investService.getCount();//所有投资用户
		List<Integer> Elist=new ArrayList<>();
		Elist.add(userco);
		Elist.add(lend);
		Elist.add(inve);
		Elist.add(sum);
		
		model.addAttribute("list4",list4);
		model.addAttribute("list3",list3);
		model.addAttribute("Xlist",Xlist);
		model.addAttribute("Tlist",Tlist);
		model.addAttribute("Ulist2",Ulist2);
		model.addAttribute("Blist",Blist);
		model.addAttribute("Blist2",Blist2);
		model.addAttribute("Elist",Elist);
		return "back/welcome";
	
	}
	
	
}
