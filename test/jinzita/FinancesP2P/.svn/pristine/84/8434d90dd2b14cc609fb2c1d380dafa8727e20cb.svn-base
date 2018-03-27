package com.p2p.controller.front;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import java.util.HashMap;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bank.pojo.Froze;
import com.bank.pojo.Pay;
import com.bank.pojo.Users;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.p2p.commons.DEBXInteresUtil;
import com.p2p.pojo.Gathering;
import com.p2p.pojo.Invest;

import com.fasterxml.jackson.core.JsonProcessingException;

import com.p2p.pojo.LendBeckonmoney;
import com.p2p.service.InvestService;
import com.p2p.pojo.LogMoney;

import com.p2p.service.LogMoneyService;


import com.p2p.service.LendBeckonmoneyService;

import com.p2p.pojo.Letter;
import com.p2p.service.LetterService;

import com.p2p.pojo.Notice;
import com.p2p.pojo.Page;
import com.p2p.pojo.User;
import com.p2p.pojo.UserBankcard;
import com.p2p.pojo.UserInfo;
import com.p2p.pojo.UserMoney;
import com.p2p.pojo.UserRecommend;
import com.p2p.pojo.Photo;
import com.p2p.pojo.Still;
import com.p2p.service.NoticeService;
import com.p2p.service.UserBankcardService;
import com.p2p.service.UserInfoService;
import com.p2p.service.UserMoneyService;

import com.p2p.service.UserRecommendService;

import com.p2p.service.UserService;

import com.p2p.service.PhotoService;
@Component("quartz")
@Controller
@RequestMapping("/front")
public class ToFrontController {

	// 默认运算精度,<span style="color:#ff0000;">保留有效数字6位</span>  
    private static final int DEF_DIV_SCALE =20;  
    //RoundingMode.HALF_UP 舍入模式，四舍五入 向上  
	private static MathContext mc = new MathContext(DEF_DIV_SCALE,RoundingMode.HALF_UP); 
	
	@Resource(name = "userInfoServiceImpl")
	private UserInfoService userInfoService;

	@Resource(name = "userMoneyServiceImpl")
	private UserMoneyService userMoneyService;

	@Resource(name = "userBankcardServiceImpl")
	private UserBankcardService userbankcardService;

	@Resource(name = "lendBeckonmoneyServiceImpl")
	private LendBeckonmoneyService lendBeckonmoneyService;

	@Resource(name = "userServiceImpl")
	private UserService userService;

	@Resource(name = "letterServiceImpl")
	private LetterService letterService;

	@Resource(name = "noticeServliceImpl")
	private NoticeService noticeService;

	@Resource(name = "photoServiceImpl")
	private PhotoService photoService;

	@Resource(name="logMoneyServiceImpl")
	private LogMoneyService logMoneyService;
	
	@Resource(name = "investServiceImpl")
	private InvestService investService;

	@Resource(name = "userRecommendServiceImpl")
	private UserRecommendService userRecommendService;


	
	DEBXInteresUtil Debx=new DEBXInteresUtil();
	
	@RequestMapping("/index")
	public String index(Model model) {

		//首页公告显示
		List<Notice> list=noticeService.list1();
		model.addAttribute("list", list);
		
		//查询投资人数
		int inve=investService.getCount();
		model.addAttribute("inve", inve);
		
		// 查询最大利率
		Float rate=lendBeckonmoneyService.selmax();
		model.addAttribute("rate", rate);

		//查注册用户人数
		Integer zcCount=userService.count();
		model.addAttribute("zcCount",zcCount);
		
		//累计投资金额
		List<Invest> inList=investService.list();
		BigDecimal countMoney=new BigDecimal("0.00");
		for(Invest inv:inList) {
			
			Double js_Money=(countMoney.add(inv.getInvestmoney(),mc)).doubleValue();//借款金额
			countMoney=getBigDecimalByDouble(js_Money,2);
		}
		model.addAttribute("countMoney",countMoney);
		

		//首页标的信息显示
		
		List<LendBeckonmoney> xylist=lendBeckonmoneyService.xylist();
		
		for(LendBeckonmoney beckonmoney:xylist) {//百分比
			
			//总
			BigDecimal a1=beckonmoney.getLendmoney();
			//未投
			BigDecimal b1=beckonmoney.getHave_cast();
			//已投
			Double c1=(a1.subtract(b1, mc)).doubleValue();
			BigDecimal c2=getBigDecimalByDouble(c1,2);
			
	        //比例
			Double bf=c2.divide(a1, mc).doubleValue();
			BigDecimal bf1=getBigDecimalByDouble(bf,4);
			//百分
			BigDecimal bfb=new BigDecimal("100");
			Double bf2=(bf1.multiply(bfb,mc)).doubleValue();
			BigDecimal bf3=getBigDecimalByDouble(bf2,2);
			String bf4=bf3+"%";	
			beckonmoney.setStay1(bf4);
			
		}		
		

		model.addAttribute("xylist", xylist);
		
		
		List<LendBeckonmoney> dylist=lendBeckonmoneyService.dylist();
		
        for(LendBeckonmoney beckonmoney:dylist) {//百分比
			
			//总
			BigDecimal a1=beckonmoney.getLendmoney();
			//未投
			BigDecimal b1=beckonmoney.getHave_cast();
			//已投
			Double c1=(a1.subtract(b1, mc)).doubleValue();
			BigDecimal c2=getBigDecimalByDouble(c1,2);
			System.out.println("已投："+c2);
	        //比例
			Double bf=c2.divide(a1, mc).doubleValue();
			BigDecimal bf1=getBigDecimalByDouble(bf,4);
			//百分
			BigDecimal bfb=new BigDecimal("100");
			Double bf2=(bf1.multiply(bfb,mc)).doubleValue();
			BigDecimal bf3=getBigDecimalByDouble(bf2,2);
			String bf4=bf3+"%";	
			beckonmoney.setStay1(bf4);
			
		}				
		model.addAttribute("dylist", dylist);


		//首页轮播图显示
		List<Photo> photos = photoService.lookPhoto();
		model.addAttribute("photos", photos);
		

		return "front/index";
	}

	@RequestMapping("user/Account")
	public String Account() {
		return "front/user/Account";
	}

	/**
	 * 跳转到计算器页面
	 * 
	 * @return
	 */
	@RequestMapping("calculator")
	public String jsq() {

		return "front/calculator";
	}

	
	//投资 分页和标题、条件 模糊查询

	@RequestMapping("/touzi")
	public String touzi(Model model,LendBeckonmoney len,Page page) {
		
		String lendTime = len.getLendtime().toString();
		String reate = len.getRate().toString();
		String type = len.getType().toString();
		
		
		int CurrentRoWnumber=5;//当前行数
		int CurrentPage=page.getCont();//当前页
		int c=(CurrentPage-1)*CurrentRoWnumber;//查询前后条数
		
		
		Page page1=new Page();
		page1.setFist(c);
		page1.setTow(CurrentRoWnumber);
		page1.setTitle(len.getTitle());//把标题放入bin中
		
		String deadlinestart = "";//开始期限
		String deadlineend = "";//结束期限
		String ratestart = "";//初始利率
		String rateend = "";//最大利率
		String borrowWay = "";//标的类型
		
		if("".equals(lendTime)||"0".equals(lendTime)) {
			deadlinestart = "";
			deadlineend = "";
		}else if("1".equals(lendTime)) {
			deadlinestart = "1";
			deadlineend = "3";
		}else if("2".equals(lendTime)) {
			deadlinestart = "3";
			deadlineend = "6";
		}else if("3".equals(lendTime)) {
			deadlinestart = "6";
			deadlineend = "9";
		}else if("4".equals(lendTime)) {
			deadlinestart = "9";
			deadlineend = "";
		}
		
//========================================================================
		
		if("".equals(reate)||"0".equals(reate)) {
			ratestart = "";
			rateend = "";
		}else if("1".equals(reate)) {
			ratestart = "0";
			rateend = "10";
		}else if("2".equals(reate)) {
			ratestart = "10";
			rateend = "15";
		}else if("3".equals(reate)) {
			ratestart = "15";
			rateend = "25";
		}
//========================================================================	
		
		if("".equals(type)||"0".equals(type)) {
			borrowWay = "";
		}else if("1".equals(type)) {
			borrowWay = "信用标";
			System.out.println(borrowWay);
		}else if("2".equals(type)) {
			borrowWay = "抵押标";
		}

		page1.setSix(borrowWay);
		page1.setPeople(deadlinestart);
		page1.setHtree(deadlineend);
		page1.setFour(ratestart);
		page1.setFive(rateend);
		
		//每页行数
		Integer pagesize = Page.PAGESIZE; //默认5条
		System.out.println("pagesize:"+pagesize);
		
		//总行数
		Integer cont=0;
		if(len.getTitle()==""||len.getTitle()==null) {
			  cont = lendBeckonmoneyService.count();
			  System.out.println("没有标题的cont:"+cont);
		}else if(len.getTitle()!=null) {
			
			List<LendBeckonmoney> list = lendBeckonmoneyService.credit(page1);
			  cont = list.size();
			  System.out.println("有标题的cont:"+cont);
		}
		
		if(lendTime!=""||reate!=""||type!=""||len.getTitle()==null) {
			
			List<LendBeckonmoney> list = lendBeckonmoneyService.pledge(page1);
			  cont = list.size();
			  System.out.println("有条件的cont:"+cont);
		}
		
		Integer rowsCount =  cont;
		System.out.println("rowsCount:"+rowsCount);
		//总页数
		Integer pages = (rowsCount + pagesize - 1) / pagesize;//
		System.out.println("pages:"+pages);
		
		//当前页
		System.out.println("当前页："+page.getCont());
	

		if(len.getTitle()!=null&&len.getTitle()!=""&&lendTime!=""&&reate!=""&&type!="") {
			List<LendBeckonmoney> list1 = lendBeckonmoneyService.headline(page1);//获取模糊查询标题方法
			System.out.println("--模糊查询list--:"+list1);
			
			for(LendBeckonmoney beckonmoney:list1) {//百分比
				
				//总
				BigDecimal a1=beckonmoney.getLendmoney();
				//未投
				BigDecimal b1=beckonmoney.getHave_cast();
				//已投
				Double c1=(a1.subtract(b1, mc)).doubleValue();
				BigDecimal c2=getBigDecimalByDouble(c1,2);
				
		        //比例
				Double bf=c2.divide(a1, mc).doubleValue();
				BigDecimal bf1=getBigDecimalByDouble(bf,4);
				//百分
				BigDecimal bfb=new BigDecimal("100");
				Double bf2=(bf1.multiply(bfb,mc)).doubleValue();
				BigDecimal bf3=getBigDecimalByDouble(bf2,2);
				String bf4=bf3+"%";	
				beckonmoney.setStay1(bf4);
				
			}		
			
		
			model.addAttribute("list", list1);
			
		}else if(len.getTitle()==null&&lendTime==""&&reate==""&&type=="") {	
		List<LendBeckonmoney> pagin = lendBeckonmoneyService.pagingSelect(page1);//获取分页方法
		System.out.println("--分页list--:"+pagin);
		
		for(LendBeckonmoney beckonmoney:pagin) {//百分比
			
			//总
			BigDecimal a1=beckonmoney.getLendmoney();
			//未投
			BigDecimal b1=beckonmoney.getHave_cast();
			//已投
			Double c1=(a1.subtract(b1, mc)).doubleValue();
			BigDecimal c2=getBigDecimalByDouble(c1,2);
			
	        //比例
			Double bf=c2.divide(a1, mc).doubleValue();
			BigDecimal bf1=getBigDecimalByDouble(bf,4);
			//百分
			BigDecimal bfb=new BigDecimal("100");
			Double bf2=(bf1.multiply(bfb,mc)).doubleValue();
			BigDecimal bf3=getBigDecimalByDouble(bf2,2);
			String bf4=bf3+"%";	
			beckonmoney.setStay1(bf4);
			
		}		
				
		model.addAttribute("list", pagin);
		
		}else if(lendTime!=""&&reate!=""&&type!=""){
			List<LendBeckonmoney> listen = lendBeckonmoneyService.selectPage(page1);
			System.out.println("--条件查询list--:"+listen);
			
			for(LendBeckonmoney beckonmoney:listen) {//百分比
				
				//总
				BigDecimal a1=beckonmoney.getLendmoney();
				//未投
				BigDecimal b1=beckonmoney.getHave_cast();
				//已投
				Double c1=(a1.subtract(b1, mc)).doubleValue();
				BigDecimal c2=getBigDecimalByDouble(c1,2);
				
		        //比例
				Double bf=c2.divide(a1, mc).doubleValue();
				BigDecimal bf1=getBigDecimalByDouble(bf,4);
				//百分
				BigDecimal bfb=new BigDecimal("100");
				Double bf2=(bf1.multiply(bfb,mc)).doubleValue();
				BigDecimal bf3=getBigDecimalByDouble(bf2,2);
				String bf4=bf3+"%";	
				beckonmoney.setStay1(bf4);
				
			}		
			
			
			model.addAttribute("list", listen);
		}
	
		model.addAttribute("rowsCount", rowsCount);//分页参数
		model.addAttribute("pages",pages);//分页参数
		model.addAttribute("nowpage", page1.getNowpage());//分页参数
		model.addAttribute("pagesize", page1.getPagesize());//分页参数
		
		model.addAttribute("list2",CurrentPage);//当前页
		
		model.addAttribute("lendTime", lendTime);//期限
		model.addAttribute("reate", reate);//利率
		model.addAttribute("type", type);//标类型
		
		model.addAttribute("title",len.getTitle());//标题
		
		
		
		
		
		
		return "front/touzi";
	}

	
	
	//标的信息详情
	@RequestMapping("/biaodixinxi/{id}")
	public String biaodixinxi(@PathVariable Integer id,Model model) {
		System.out.println(id);
		LendBeckonmoney beckonmoney=lendBeckonmoneyService.getById(id);		

		model.addAttribute("beckonmoney", beckonmoney);
		
		//总
		BigDecimal a1=beckonmoney.getLendmoney();
		//未投
		BigDecimal b1=beckonmoney.getHave_cast();
		//已投
		Double c1=(a1.subtract(b1, mc)).doubleValue();
		BigDecimal c2=getBigDecimalByDouble(c1,2);
		System.out.println("已投："+c2);
        //比例
		Double bf=c2.divide(a1, mc).doubleValue();
		BigDecimal bf1=getBigDecimalByDouble(bf,4);
		//百分
		BigDecimal bfb=new BigDecimal("100");
		Double bf2=(bf1.multiply(bfb,mc)).doubleValue();
		BigDecimal bf3=getBigDecimalByDouble(bf2,2);
		String bf4=bf3+"%";		
		//算百分比
		model.addAttribute("bf",bf4);
		//份数
		Double fs=b1.divide(bfb, mc).doubleValue();
		BigDecimal fs1=getBigDecimalByDouble(fs,0);
		model.addAttribute("fs",fs1);
		
		//加入人数
		Integer PayCount=investService.getInvestCountBybid(id+"");
		model.addAttribute("PayCount",PayCount);
		
		
		//页数
		Integer page=PayCount/5;
		if(PayCount%5!=0) {
			
			page=page+1;
		}
		
		//投资人		
		List<Invest> FyInList=investService.getInvestBybid(id+"");
        for(Invest in:FyInList) {
			
			User u=userService.getById(in.getUserid());
			in.setOyh1(u.getPhone());
			
		}
        
       
        model.addAttribute("zys",page);//页数
        model.addAttribute("InList",FyInList);//bean
        		
		return "front/biaodixinxi";
	}

	/*//投资人分页
	@RequestMapping("/FyInvest")
	public List<Invest> FyInvest(String bid,String curr,Model model) {
		
		
		//加入人数
		Integer PayCount=investService.getInvestCountBybid(bid);
		model.addAttribute("PayCount",PayCount);
		
		
		//页数
		Integer page=PayCount/5;
		if(PayCount%5!=0) {
			
			page=page+1;
		}
		
		Integer curr1=Integer.parseInt(curr);
		Integer dy=(curr1-1)*5;//第一个
			
		//投资人分页
		//第一次
		Fy f=new Fy();
		f.setDq(dy);
		f.setMygs(5);
		f.setTitle(bid);
		List<Invest> FyInList=investService.getFyInvestBybid(f);
        for(Invest in:FyInList) {
			
			User u=userService.getById(in.getUserid());
			in.setOyh1(u.getPhone());
			
		}
        
        model.addAttribute("curr",curr);//当前页
        model.addAttribute("zys",page);//页数
        model.addAttribute("InList",FyInList);//bean
        		
        System.out.println("大小:"+FyInList.size());
        
		return FyInList;
	}*/

	
	
	//判断金额
	@RequestMapping("/moneyTF")
	public @ResponseBody String updatep1(String money,String bphone,String bid,String title,String rate)throws Exception {
		
		//投资金额
		BigDecimal tzMoney = new BigDecimal(money);
		
        Session session = SecurityUtils.getSubject().getSession();	
		User user =  (User) session.getAttribute("user");
		
		UserMoney userMoney = userMoneyService.getByName(user.getPhone());		
		BigDecimal haveMoney=userMoney.getNeedmoney();//可用
		
		int res =haveMoney.compareTo(tzMoney);
		
		if(res>=0) {//前台钱够
			
			//封装投资信息
			Pay p=new Pay();
			p.setStay1(user.getPhone());//投资人
			p.setStay2(bphone);//借款人
			p.setStay3(bid);//标id
			p.setTransamt(tzMoney);//金额
			p.setDetails("安全保障计划+第三方担保机构");//说明
			p.setOrdstatus(title);//标题
			p.setTranstype(rate);//标利率
			
		
			session.setAttribute("pay",p);
		
			System.out.println("pay:"+p.getStay1()+" "+p.getStay2()+" "+p.getStay3()+" "+p.getTransamt()+p.getOrdstatus());
		    
			
			
			//判断用户易支付资金
			//bean			
			ObjectMapper m = new ObjectMapper();  
			String sendStr = m.writeValueAsString(p);  
			
			
			BufferedReader reader = null;
			String msg="";
			try {  
		        String strMessage = "";  
		        StringBuffer buffer = new StringBuffer();  
		        // 接报文的地址  
		        URL uploadServlet = new URL(  
		               "http://localhost:8080/PaymentP2P/pay/pdMoney");  
		        HttpURLConnection servletConnection = (HttpURLConnection) uploadServlet  
		               .openConnection();  
		        // 设置连接参数  
		        servletConnection.setRequestMethod("POST");  
		        servletConnection.setDoOutput(true);  
		        servletConnection.setDoInput(true);  
		        servletConnection.setAllowUserInteraction(true);  
		        // 开启流，写入XML数据  
		        OutputStream output = servletConnection.getOutputStream();  
		        System.out.println("发送的报文：");  
		        System.out.println(sendStr);  
		        output.write(sendStr.getBytes());  
		        output.flush();  
		        output.close();  
		        
		        
		        // 获取返回的数据  
		        InputStream inputStream = servletConnection.getInputStream();  
		        reader = new BufferedReader(new InputStreamReader(inputStream));  
		        while ((strMessage = reader.readLine()) != null) {  
		           buffer.append(strMessage);  
		        }  
		        msg = buffer.toString();
		        System.out.println("接收钱是否足够:" + msg);
		        
		    
		        
		    } catch (java.net.ConnectException e) {  
		        throw new Exception();  
		    } finally {  
		        if (reader != null) {  
		           reader.close();  
		        }  
		    }  
			
			
		    if(msg.equals("true")) {//钱够
		    	
		    	return "true";
		    }
			
					
		}
	
		session.removeAttribute("pay");
		
		return "false";
	}
	
	//判断支付密码
	//发送
	@RequestMapping("/pdmm")
	@ResponseBody
	public String list(String pwd,Model model) throws Exception {

			
		    Session session = SecurityUtils.getSubject().getSession();	
		    User user =  (User) session.getAttribute("user");
		
		    //确认的bean
			Users u = new Users();			
			u.setPwd(pwd);
			u.setUserphone(user.getPhone());
			
			ObjectMapper m = new ObjectMapper();  
			String sendStr = m.writeValueAsString(u);  
			
			

			BufferedReader reader = null;
			String msg;
			try {  
		        String strMessage = "";  
		        StringBuffer buffer = new StringBuffer();  
		        // 接报文的地址  
		        URL uploadServlet = new URL(  
		               "http://localhost:8080/PaymentP2P/pay/PaymentPasswordTorF");  
		        HttpURLConnection servletConnection = (HttpURLConnection) uploadServlet  
		               .openConnection();  
		        // 设置连接参数  
		        servletConnection.setRequestMethod("POST");  
		        servletConnection.setDoOutput(true);  
		        servletConnection.setDoInput(true);  
		        servletConnection.setAllowUserInteraction(true);  
		        // 开启流，写入XML数据  
		        OutputStream output = servletConnection.getOutputStream();  
		        System.out.println("发送的报文：");  
		        System.out.println(sendStr);  
		        output.write(sendStr.getBytes());  
		        output.flush();  
		        output.close();  
		        
		        
		        // 获取返回的数据  
		        InputStream inputStream = servletConnection.getInputStream();  
		        reader = new BufferedReader(new InputStreamReader(inputStream));  
		        while ((strMessage = reader.readLine()) != null) {  
		           buffer.append(strMessage);  
		        }  
		        msg = buffer.toString();
		        System.out.println("接收返回值密码是否正确:" + msg);
		        
		    
		        
		    } catch (java.net.ConnectException e) {  
		        throw new Exception();  
		    } finally {  
		        if (reader != null) {  
		           reader.close();  
		        }  
		    } 
			
			
			if(msg.equals("true")) {
				
				return "true";
			}
			
			
			return "false";
		}

	
	//投资支付(平台和汇付)(所有条件无误后)
	@RequestMapping("/payMoney")
	public String payMoney(Model model) throws Exception {

		Session session = SecurityUtils.getSubject().getSession();	
		Pay p = (Pay)session.getAttribute("pay");	
		
		
		//bean			
		ObjectMapper m = new ObjectMapper();  
		String sendStr = m.writeValueAsString(p);  
		
		
		BufferedReader reader = null;
		String msg="";
		try {  
	        String strMessage = "";  
	        StringBuffer buffer = new StringBuffer();  
	        //接报文的地址  
	        URL uploadServlet = new URL(  
	               "http://localhost:8080/PaymentP2P/pay/investment");  
	        HttpURLConnection servletConnection = (HttpURLConnection) uploadServlet  
	               .openConnection();  
	        //设置连接参数
	        servletConnection.setRequestMethod("POST");  
	        servletConnection.setDoOutput(true);  
	        servletConnection.setDoInput(true);  
	        servletConnection.setAllowUserInteraction(true);  
	        //开启流，写入XML数据
	        OutputStream output = servletConnection.getOutputStream();  
	        System.out.println("发送的报文：");  
	        System.out.println(sendStr);  
	        output.write(sendStr.getBytes());  
	        output.flush();  
	        output.close();  
	        
	        
	        // 获取返回的数据  
	        InputStream inputStream = servletConnection.getInputStream();  
	        reader = new BufferedReader(new InputStreamReader(inputStream));  
	        while ((strMessage = reader.readLine()) != null) {  
	           buffer.append(strMessage);  
	        }  
	        msg = buffer.toString();
	        System.out.println("消息:" + msg);
	        
	        
	        
	    } catch (java.net.ConnectException e) {  
	        throw new Exception();  
	    } finally {  
	        if (reader != null) {  
	           reader.close();  
	        }  
	    }  
		
		
	
		
		
		Date date=new Date();
		BigDecimal PayMoney=p.getTransamt();//投资金额	
		
		//平台用户资金表
		UserMoney um1=userMoneyService.getByName(p.getStay1());	 	
		BigDecimal userMoney=um1.getNeedmoney();//可用金额
		BigDecimal frozeMoney=um1.getFrozenmoney();//冻结金额
			       	        	
    	Double userMoney1=(userMoney.subtract(PayMoney,mc)).doubleValue();//可用资产减去投资金额
    	Double frozeMoney1=(frozeMoney.add(PayMoney,mc)).doubleValue();//冻结资产加上投资金额			          
         			           
        BigDecimal userMoney2=getBigDecimalByDouble(userMoney1,2);
        BigDecimal frozeMoney2=getBigDecimalByDouble(frozeMoney1,2);
        
        UserMoney um2=new UserMoney();
        um2.setUsername(p.getStay1());
        um2.setNeedmoney(userMoney2);
		um2.setFrozenmoney(frozeMoney2);		
		userMoneyService.updateMoneyByPay(um2);
		
		
		//冻结流水表		
		LogMoney logMoney=new LogMoney();
		logMoney.setUsername(p.getStay1());
		logMoney.setTime(date);
		logMoney.setType("冻结");
		logMoney.setDealmoney(PayMoney);
		logMoney.setStates("冻结成功");
		logMoneyService.save(logMoney);
		
		//投资表
		BigDecimal mon=new BigDecimal("0.00");
		System.out.println("ra:"+p.getTranstype());
		BigDecimal ra=new BigDecimal(p.getTranstype());//利率
		User us1= userService.selPhone(p.getStay1());//投资人
		User us2= userService.selPhone(p.getStay2());//借款人
					
		Invest invest=new Invest();
		invest.setUserid(us1.getId());
		invest.setLendid(us2.getId());
		invest.setInvestmoney(PayMoney);
		invest.setInvesttime(date);
		invest.setMonthrate(mon);
		invest.setYearrate(ra);
		invest.setTranstype("易支付");
		invest.setDetails(p.getDetails());
		invest.setOrdstatus("等待支付");
		invest.setL_id(p.getStay3());
	    investService.save(invest);
	        
	    //标表(修改剩余可投)
	    LendBeckonmoney lbk=lendBeckonmoneyService.getById(Integer.parseInt(p.getStay3()));
	    BigDecimal castMoney=lbk.getHave_cast();
	    System.out.println("剩余可投:"+castMoney);
	    
	    Double castMoney1=(castMoney.subtract(PayMoney,mc)).doubleValue();//剩余可投减去投资金额
	    System.out.println("castMoney1："+castMoney1);
	    BigDecimal castMoney2=getBigDecimalByDouble(castMoney1,2);
	    lbk.setHave_cast(castMoney2);
	    lendBeckonmoneyService.upateMoney(lbk);
	       
	    //判断是否满标
	    int tf=mon.compareTo(castMoney2);//返回值0表示相等，-1表示小于，1表示大于 
	    
	    if(tf>=0) {//满额
	    	
	    	
	    	Date date1=new Date();
	    	
	    	lbk.setStatus("满标");
	    	lendBeckonmoneyService.upateStatus(lbk);//修改标的状态
	    	
	    	//借款金额
	    	BigDecimal jk_Money=lbk.getLendmoney();
	    	
	    	
	    	//公司收益
    		Double gs_Sy=Debx.DEBXTotleInteres(jk_Money+"","8",lbk.getLendtime()+"");
    		
    		BigDecimal gs_addMoneytt=getBigDecimalByDouble(gs_Sy,2);//本息 		
    		Double gs_addMoneytt1=(gs_addMoneytt.subtract(jk_Money,mc)).doubleValue();//本息-本   		
    		BigDecimal gs_addMoney=getBigDecimalByDouble(gs_addMoneytt1,2);//公司纯利息
    		 		
    		System.out.println("收益:"+gs_addMoney);
    		UserMoney gs_Money = userMoneyService.getByName("10000001");//公司资产
	    	System.out.println("公司:"+gs_Money.getUsername());
    		BigDecimal gs_allMoney=gs_Money.getAllmoney();//所有资产
	    	BigDecimal gs_needMoney=gs_Money.getNeedmoney();//可用金额
	    	
	    	Double gs_allMoney1=(gs_allMoney.add(gs_addMoney,mc)).doubleValue();
	    	Double gs_needMoney1=(gs_needMoney.add(gs_addMoney,mc)).doubleValue();
	    	
	    	BigDecimal gs_allMoney2=getBigDecimalByDouble(gs_allMoney1,2);
    		BigDecimal gs_needMoney2=getBigDecimalByDouble(gs_needMoney1,2);
    		
    		gs_Money.setAllmoney(gs_allMoney2);
    		gs_Money.setNeedmoney(gs_needMoney2);  		
    		userMoneyService.updateMoneyByM(gs_Money);
    		
    		
    		//公司汇付资金添加(10000001)
    	    Pay gsPay=new Pay();	    
    	    gsPay.setCustid("10000001");//电话
    		gsPay.setTransamt(gs_addMoney);//公司纯利息
    				    
    		//bean	
    		m = new ObjectMapper();  
    		sendStr = m.writeValueAsString(gsPay);  
    					
    		reader = null;
    		msg="";
    		try {  
    	        String strMessage = "";  
    	        StringBuffer buffer = new StringBuffer();  
    	        // 接报文的地址  
    	        URL uploadServlet = new URL(  
    	               "http://localhost:8080/PaymentP2P/pay/lendMoney");  
    	        HttpURLConnection servletConnection = (HttpURLConnection) uploadServlet  
    	               .openConnection();  
    	        // 设置连接参数  
    	        servletConnection.setRequestMethod("POST");  
    	        servletConnection.setDoOutput(true);  
    	        servletConnection.setDoInput(true);  
    	        servletConnection.setAllowUserInteraction(true);  
    	        // 开启流，写入XML数据  
    	        OutputStream output = servletConnection.getOutputStream();  
    	        System.out.println("发送的报文：");  
    	        System.out.println(sendStr);  
    	        output.write(sendStr.getBytes());  
    	        output.flush();  
    	        output.close();  
    	        
    	        
    	        // 获取返回的数据  
    	        InputStream inputStream = servletConnection.getInputStream();  
    	        reader = new BufferedReader(new InputStreamReader(inputStream));  
    	        while ((strMessage = reader.readLine()) != null) {  
    	           buffer.append(strMessage);  
    	        }  
    	        msg = buffer.toString();
    	        System.out.println("消息:" + msg);
    	        
    	        
    	        
    	    } catch (java.net.ConnectException e) {  
    	        throw new Exception();  
    	    } finally {  
    	        if (reader != null) {  
    	           reader.close();  
    	        }  
    	    }
    		
    		
    		
    		
	    	
	    	//修改借款人资金表
	    	UserMoney j_Money = userMoneyService.getByName(lbk.getUsername());//借款人资产
	    	BigDecimal j_allMoney=j_Money.getAllmoney();//所有资产
	    	BigDecimal j_needMoney=j_Money.getNeedmoney();//可用金额
	    	BigDecimal j_stillMoney=j_Money.getStillmoney();//待还金额
	    	BigDecimal j_lendMoney=j_Money.getLendmoney();//借款金额
	    	
	    	Double j_allMoney1=(j_allMoney.add(jk_Money,mc)).doubleValue();//原所有资产+借款金额
	    	Double j_needMoney1=(j_needMoney.add(jk_Money,mc)).doubleValue();//可用金额
	    	//待还金额(利率计算)
	    	System.out.println("借款金额:"+jk_Money);
	    	Double a1=Debx.DEBXTotleInteres(jk_Money+"",lbk.getRate()+"",lbk.getLendtime()+"");    	              
	    	System.out.println("待还金额:"+a1);
	    	BigDecimal dh_Money=getBigDecimalByDouble(a1,2);
	    	System.out.println("待还金额:"+dh_Money);
	    	Double j_stillMoney1=(j_stillMoney.add(dh_Money,mc)).doubleValue();//待还金额
	    	System.out.println("待还金额:"+j_stillMoney1);
    		Double j_lendMoney1=(j_lendMoney.add(jk_Money,mc)).doubleValue();//借款金额
	    	
    		
    		BigDecimal j_allMoney2=getBigDecimalByDouble(j_allMoney1,2);
    		BigDecimal j_needMoney2=getBigDecimalByDouble(j_needMoney1,2);
    		
    		
    		
    		Double j_allMoney3=(j_allMoney2.subtract(gs_addMoney,mc)).doubleValue();//借款人实际收到的钱
    		Double j_needMoney3=(j_needMoney2.subtract(gs_addMoney,mc)).doubleValue();
    		
    		BigDecimal j_allMoney4=getBigDecimalByDouble(j_allMoney3,2);
    		BigDecimal j_needMoney4=getBigDecimalByDouble(j_needMoney3,2);
    		
    		//待还金额(利率计算)
    		BigDecimal j_stillMoney2=getBigDecimalByDouble(j_stillMoney1,2);
    		BigDecimal j_lendMoney2=getBigDecimalByDouble(j_lendMoney1,2);
    		
    		j_Money.setAllmoney(j_allMoney4);
    		j_Money.setStillmoney(j_stillMoney2);
    		j_Money.setNeedmoney(j_needMoney4);
    		j_Money.setLendmoney(j_lendMoney2);
    		userMoneyService.updateMoneyByM(j_Money);//修改
    		
    		//每期应还
    		Double mq1=Debx.DEBXMTotleInteres(jk_Money+"",lbk.getRate()+"",lbk.getLendtime()+"");    	              
	    	System.out.println("每期应还金额:"+mq1);
	    	BigDecimal mqdh_Money=getBigDecimalByDouble(mq1,2);
	  
    		//创建还款表
    		Still s=new Still();
    		s.setUsername(us2.getPhone());//借款人
    		s.setRealname(us2.getRealname());//真实姓名
    		s.setLendtime(date1);//借款时间
    		s.setType(lbk.getType());//标的类型
    		s.setTitle(lbk.getTitle()+"("+lbk.getBillcode()+")");//借款标题
    		s.setStage(0);//已还期数
    		s.setStages(lbk.getLendtime());//总期数
    	    Date stillTime=dateAddMonth(date1,lbk.getLendtime());//此时+期数
    		s.setStilltime(stillTime);//应还时间
    		s.setStillmoney(dh_Money);//应还本息
    		s.setHasmoney(mon);//已还本息
    		s.setStaygold(dh_Money);//待还本息
    		s.setStaystatus("未偿还");//还款状态
    	    s.setLendid(lbk.getId());//标id
    	    s.setStayfine(mqdh_Money);//每期应还
    	    photoService.save(s);
    	    

    	 




    	    
    		
	    	//循环扣除所有投资过这个标的人的总金额,冻结金额...[创建收款表]
	    	List<Invest> FyInList=investService.getInvestBybid(p.getStay3());
	    	for(Invest f:FyInList) {
	    		
	    		//修改投资表状态
	    		f.setOrdstatus("投资成功");
	    		investService.updateInvestStatus(f);
	    			    		
	    		Integer userId=f.getUserid();//投资人id
	    		BigDecimal tzMoney=f.getInvestmoney();//投资金额
	    		User u=userService.getById(userId);//用户bean
	    		String phone=u.getPhone();//手机
	    		
	    		    		
	    		//创建收款表
	    		//应收本息
	    		Double ysbx_Money1=Debx.DEBXTotleInteres(tzMoney+"",lbk.getRate()+"",lbk.getLendtime()+"");
	    		BigDecimal ysbx_Money2=getBigDecimalByDouble(ysbx_Money1,2);
	    		
	    		//每期应收
	    		Double mqys_Money1=Debx.DEBXMTotleInteres(tzMoney+"",lbk.getRate()+"",lbk.getLendtime()+"");
	    		BigDecimal mqys_Money2=getBigDecimalByDouble(mqys_Money1,2);
	    		
	    		Gathering saveG=new Gathering();
	    		saveG.setUserid(userId);//投资人id
	    		saveG.setLendid(us2.getId());//借款人id
	    		saveG.setHasmoney(mon);//已收本息
	    		saveG.setStage(lbk.getLendtime());//期数
	    		saveG.setHasstage(0);//已还期数
	    		saveG.setAnswergold(ysbx_Money2);//应收本息
	    		saveG.setAnswerfine(mqys_Money2);//每期应收
	    		saveG.setStilldtate(date1);//还款日期
	    		saveG.setBillcode(lbk.getId()+"");//标id
	    		saveG.setMonthrate(lbk.getRate());//利率
	    		saveG.setOyh1(u.getRealname());//投资人姓名
	    		saveG.setOyh2(us2.getRealname());//借款人姓名
	    		photoService.saveGathering(saveG);
	    		
	    		
	    		//修改平台用户资产
	    		UserMoney m_Money = userMoneyService.getByName(phone);//用户资产
	    		BigDecimal m_allMoney=m_Money.getAllmoney();//总资产
	    		BigDecimal m_gathMoney=m_Money.getGathermoney();//待收金额
	    		BigDecimal m_investMoney=m_Money.getInvestmoney();//投资金额
	    		BigDecimal m_frozenMoney=m_Money.getFrozenmoney();//冻结金额
	    		
	    		Double m_allMoney1=(m_allMoney.subtract(tzMoney,mc)).doubleValue();//总资产-投资金额
	    		//待收金额(利率计算)
	    		Double a2=Debx.DEBXTotleInteres(tzMoney+"",lbk.getRate()+"",lbk.getLendtime()+"");
		    	BigDecimal ds_Money=getBigDecimalByDouble(a2,2);
		    	Double m_gathMoney1=(m_gathMoney.add(ds_Money,mc)).doubleValue();//待还金额
		    	
	    		Double m_investMoney1=(m_investMoney.add(tzMoney,mc)).doubleValue();//原投资金额+投资金额
	    		Double m_frozenMoney1=(m_frozenMoney.subtract(tzMoney,mc)).doubleValue();//冻结金额-投资金额
	    		
	    		BigDecimal m_allMoney2=getBigDecimalByDouble(m_allMoney1,2);
	    		//计算(待收金额)
	    		BigDecimal m_gathMoney2=getBigDecimalByDouble(m_gathMoney1,2);
	    		BigDecimal m_investMoney2=getBigDecimalByDouble(m_investMoney1,2);
	    		BigDecimal m_frozenMoney2=getBigDecimalByDouble(m_frozenMoney1,2);
	    		
	    		m_Money.setAllmoney(m_allMoney2);
	    		m_Money.setInvestmoney(m_investMoney2);
	    		m_Money.setGathermoney(m_gathMoney2);
	    		m_Money.setFrozenmoney(m_frozenMoney2);
	       		userMoneyService.updateMoneyByM(m_Money);//修改
	    			    		
	    	}
	    	
	        //修改汇付投资用户...
	    	//bean	
	    	Froze f=new Froze();
	    	f.setSubjectid(lbk.getId()+"");
			m = new ObjectMapper();  
			sendStr = m.writeValueAsString(f);  
						
			reader = null;
			msg="";
			try {  
		        String strMessage = "";  
		        StringBuffer buffer = new StringBuffer();  
		        // 接报文的地址  
		        URL uploadServlet = new URL(  
		               "http://localhost:8080/PaymentP2P/pay/PaySuccess");  
		        HttpURLConnection servletConnection = (HttpURLConnection) uploadServlet  
		               .openConnection();  
		        //设置连接参数  
		        servletConnection.setRequestMethod("POST");  
		        servletConnection.setDoOutput(true);  
		        servletConnection.setDoInput(true);  
		        servletConnection.setAllowUserInteraction(true);  
		        // 开启流，写入XML数据  
		        OutputStream output = servletConnection.getOutputStream();  
		        System.out.println("发送的报文：");  
		        System.out.println(sendStr);  
		        output.write(sendStr.getBytes());  
		        output.flush();  
		        output.close();  
		        
		        
		        // 获取返回的数据  
		        InputStream inputStream = servletConnection.getInputStream();  
		        reader = new BufferedReader(new InputStreamReader(inputStream));  
		        while ((strMessage = reader.readLine()) != null) {  
		           buffer.append(strMessage);  
		        }  
		        msg = buffer.toString();
		        System.out.println("消息:" + msg);
		        
		        
		        
		    } catch (java.net.ConnectException e) {  
		        throw new Exception();  
		    } finally {  
		        if (reader != null) {  
		           reader.close();  
		        }  
		    }  
	    
	    
	    //修改借款用户汇付资金...
		LendBeckonmoney lbk1=lendBeckonmoneyService.getById(Integer.parseInt(p.getStay3()));
	    BigDecimal lendMoney=lbk1.getHave_cast();
	    System.out.println("已满:"+lendMoney);
	    
	    Double sjjk_Money=(lbk1.getLendmoney().subtract(gs_addMoney,mc)).doubleValue();//借款人实际收到的钱    
	    BigDecimal sjjk_Money1=getBigDecimalByDouble(sjjk_Money,2);
	    System.out.println("啦啦啦:"+sjjk_Money1);
	    Pay lendPay=new Pay();	    
	    lendPay.setCustid(p.getStay2());//电话
		lendPay.setTransamt(sjjk_Money1);//所借金额	
				    
		//bean	
		m = new ObjectMapper();  
		sendStr = m.writeValueAsString(lendPay);  
					
		reader = null;
		msg="";
		try {  
	        String strMessage = "";  
	        StringBuffer buffer = new StringBuffer();  
	        // 接报文的地址  
	        URL uploadServlet = new URL(  
	               "http://localhost:8080/PaymentP2P/pay/lendMoney");  
	        HttpURLConnection servletConnection = (HttpURLConnection) uploadServlet  
	               .openConnection();  
	        // 设置连接参数  
	        servletConnection.setRequestMethod("POST");  
	        servletConnection.setDoOutput(true);  
	        servletConnection.setDoInput(true);  
	        servletConnection.setAllowUserInteraction(true);  
	        // 开启流，写入XML数据  
	        OutputStream output = servletConnection.getOutputStream();  
	        System.out.println("发送的报文：");  
	        System.out.println(sendStr);  
	        output.write(sendStr.getBytes());  
	        output.flush();  
	        output.close();  
	        
	        
	        // 获取返回的数据  
	        InputStream inputStream = servletConnection.getInputStream();  
	        reader = new BufferedReader(new InputStreamReader(inputStream));  
	        while ((strMessage = reader.readLine()) != null) {  
	           buffer.append(strMessage);  
	        }  
	        msg = buffer.toString();
	        System.out.println("消息:" + msg);
	        
	        
	        
	    } catch (java.net.ConnectException e) {  
	        throw new Exception();  
	    } finally {  
	        if (reader != null) {  
	           reader.close();  
	        }  
	    }  
		
	
		
	    }
	    
	    //修改显示用户的余额
	    UserMoney yhMoney = userMoneyService.getByName(p.getStay1());
	    session.removeAttribute("userMoney");
	    session.setAttribute("userMoney",yhMoney);
		
	    return "redirect:/front/index";
	}
	
	
	
	
	//支付投资
	@RequestMapping("user/pay")
	public String pay() {
		return "front/pay";
	}
	
	
	
	
	//相关协议-平台协议书
	@RequestMapping("/pingtaixieyi")
	public String pingtaixieyi() {
		return "front/xieyi/pingtaixieyi";
	}

	// 相关协议-风险揭示书
	@RequestMapping("/fengxianshu")
	public String fengxianshu() {
		return "front/xieyi/fengxianshu";
	}

	// 相关协议-抵押标服务协议
	@RequestMapping("/dybxieyi")
	public String dybxieti() {
		return "front/xieyi/dybxieyi";
	}

	// 相关协议-信用标服务协议
	@RequestMapping("/xybxieyi")
	public String xybxieti() {
		return "front/xieyi/xybxieyi";
	}

	// 相关协议-借款合同
	@RequestMapping("/hetong")
	public String hetong() {
		return "front/xieyi/hetong";
	}

	// 借款
	@RequestMapping("/jiekuan")
	public String jiekuan() {
		return "front/jiekuan2";
	}

	// 安全保障
	@RequestMapping("/anquan")
	public String anquan() {
		return "front/anquan";
	}

	// 新手引导
	@RequestMapping("/xinshou")
	public String xinshou() {
		return "front/xinshou";
	}

	//关于我们（信息披露）
	@RequestMapping("/our/{id}")
	public String our(@PathVariable("id") Integer id,Model model) {
		model.addAttribute("id", id);
		return "front/message/our";
	}
	
	
	//关于我们（信息披露）- 左边面板
	@RequestMapping("/left")
	public String left() {
		return "front/message/left";
	}
	
	//关于我们（信息披露）- 股东背景
	@RequestMapping("/gudongbeijing")
	public String gudongbeijing() {
		return "front/message/gudongbeijing";
	}
	
	//关于我们（信息披露）- 从业机构
	@RequestMapping("/congyejigou")
	public String congyejigou() {
		return "front/message/congyejigou";
	}
	
	//关于我们（信息披露）- 平台运营
	@RequestMapping("/pingtaiyunying")
	public String pingtaiyunying() {
		return "front/message/pingtaiyunying";
	}
	
	//关于我们（信息披露）- 借款项目
	@RequestMapping("/jiekuanxiangmu")
	public String jiekuanxiangmu() {
		return "front/message/jiekuanxiangmu";
	}
	
	//关于我们（信息披露）- 公司简介
	@RequestMapping("/gongsijianjie")
	public String gongsijianjie() {
		return "front/message/gongsijianjie";
	}
	
	//关于我们（信息披露）- 平台资质
	@RequestMapping("/pingtaizizhi")
	public String pingtaizizhi() {
		return "front/message/pingtaizizhi";
	}
	
	//关于我们（信息披露）- 顾问团队
	@RequestMapping("/guwentuandui")
	public String guwentuandui() {
		return "front/message/guwentuandui";
	}
	
	//关于我们（信息披露）- 公司动态
	@RequestMapping("/gongsidongtai")
	public String gongsidongtai() {
		return "front/message/gongsidongtai";
	}
	
	//关于我们（信息披露）- 平台公告
	@RequestMapping("/pingtaigonggao")
	public String pingtaigonggao(Model model,HttpServletRequest request) {
		List<Notice> list=noticeService.list0();
		model.addAttribute("list",list);
		
		return "front/message/pingtaigonggao";
	}
	//公告信息
	@RequestMapping("/gonggaoxinxi/{id}")
	public String gonggaoxinxi(@PathVariable Integer id,Model model) {
		System.out.println(id);
		Notice notice=noticeService.getById(id);
		model.addAttribute("notice", notice);
		return "front/message/gonggaoxinxi";
	}
	
	//关于我们（信息披露）- 招贤纳士
	@RequestMapping("/zhaoxiannashi")
	public String zhaoxiannashi() {
		return "front/message/zhaoxiannashi";
	}
	
	//关于我们（信息披露）- 联系我们
	@RequestMapping("/lianxi")
	public String lianxi() {
		return "front/message/lianxi";
	}

	// 投资排行榜
	@RequestMapping("/rongyu")
	public String rongyu(Model model) {
		List<UserMoney> list=userMoneyService.selTouzi();
		int count=list.size();
		model.addAttribute("list",list);
		model.addAttribute("count",count);
		return "front/rongyu";
	}

	//平台收费标准

	@RequestMapping("/shoufeibiaozhun")
	public String shoufeibiaozhun() {
		return "front/shoufeibiaozhun";
	}

	// 个人中心
	@RequestMapping("/user/PersonalCenter")
	public String PersonalCenter(Model model) {

		Session session = SecurityUtils.getSubject().getSession();

		User user = (User) session.getAttribute("user");

		UserInfo userInfo = userInfoService.getByUserId(user.getId());

		UserMoney userMoney = userMoneyService.getByName(user.getPhone());
		System.out.println("userInfo.getId()：" + userInfo.getId());
		UserBankcard userBankcard = userbankcardService.getByUserinfoId(userInfo.getId() + "");

		session.setAttribute("userInfo", userInfo);
		session.setAttribute("userMoney", userMoney);
		session.setAttribute("userBankcard", userBankcard);

		return "front/user/PersonalCenter";
	}

	// 右边栏
	@RequestMapping("/user/right")
	public String right() {
		return "front/user/right";
	}

	// 充值
	@RequestMapping("/user/Recharge")
	public String Recharge() {
		return "front/user/Recharge";
	}


	// 资金记录capital
	@RequestMapping("/user/capital")
	public String capital() {
		return "front/user/capital";
	}
	
	@RequestMapping("caplitalList")
	public @ResponseBody Object caplitalList(String page, String limit, String time1, String time2) {
		Session session = SecurityUtils.getSubject().getSession();
		User user = (User) session.getAttribute("user");
		
		System.out.println(page+" - "+limit+" - "+time1+" - "+time2);
		// 开始位置
		int x = (Integer.parseInt(page) - 1) * Integer.parseInt(limit);

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("line", Integer.parseInt(limit));
		map.put("number", x);
		map.put("phone",user.getPhone());
		map.put("time1", time1);
		map.put("time2", time2);

		int count = logMoneyService.count();
		
		List<LogMoney> list = logMoneyService.selPhone(map);
		
		Map<String, Object> map1 = new HashMap<String, Object>();
		map1.put("line", count);
		map1.put("number", 0);
		map1.put("phone",user.getPhone());
		map1.put("time1", time1);
		map1.put("time2", time2);
		List<LogMoney> list2 = logMoneyService.selPhone(map1);
		count = list2.size();
		
		Map<String, Object> data = new LinkedHashMap<>();
		data.put("code", 0);
		data.put("msg", "");
		data.put("count", count);
		data.put("data", list);
		
		return data;
	}

//	// 投资管理investment
//	@RequestMapping("/user/investment")
//	public String investment() {
//		return "front/user/investment";
//	}

//	// 借款管理borrow
//	@RequestMapping("/user/borrow")
//	public String borrow(Model model) {
//		List<ExamineApply> ea=userInfoService.sele();
//		
//		int zy=ea.size()/8;
//		if(ea.size()%8!=0) {
//			zy=ea.size()/8+1;
//		}
//		model.addAttribute("ea",ea.size());
//		model.addAttribute("list",ea);
//		model.addAttribute("zy",zy);
//		model.addAttribute("dq",1);
//		
//		return "front/user/borrow";
//	}
		

	// 我的银行卡MyBankCard
	@RequestMapping("/user/MyBankCard")
	public String MyBankCard() {
		Session session = SecurityUtils.getSubject().getSession();

		User user = (User) session.getAttribute("user");

		UserInfo userInfo = userInfoService.getByUserId(user.getId());

		System.out.println("userInfo.getId()：" + userInfo.getId());
		UserBankcard userBankcard = userbankcardService.getByUserinfoId(userInfo.getId() + "");
		session.setAttribute("userBankcard", userBankcard);
		return "front/user/MyBankCard";
	}

	// 安全设置Safety
	@RequestMapping("/user/Safety")
	public String Safety() {
		return "front/user/Safety";
	}

	// 消息中心Message
	@RequestMapping("openMessage")
	public String test(String status,Model model) {
		
		Subject subject = SecurityUtils.getSubject();
		Session session = subject.getSession();

		User user = (User) session.getAttribute("user");
		
		int count1 = letterService.maxCount("","");
		int count2 = letterService.maxCount(user.getPhone(),"已读");
		int count3 = letterService.maxCount(user.getPhone(),"未读");
		
		model.addAttribute("count1",count1);
		model.addAttribute("count2",count2);
		model.addAttribute("count3",count3);
		model.addAttribute("status",status);
				
		return "front/user/Message";
	}
	@RequestMapping("/user/Message")
	public @ResponseBody Object messageList(String status,String page, String limit){
		Subject subject = SecurityUtils.getSubject();
		Session session = subject.getSession();

		User user = (User) session.getAttribute("user");
		
		System.out.println(page+" - "+limit);
		// 开始位置
		int x = (Integer.parseInt(page) - 1) * Integer.parseInt(limit);

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("line", Integer.parseInt(limit));
		map.put("number", x);
		map.put("sender",user.getPhone());
		map.put("status",status);

		int count = letterService.maxCount("","");
		
		List<Letter> list = letterService.letter_List(map);
		
		Map<String, Object> map1 = new HashMap<String, Object>();
		map1.put("line", count);
		map1.put("number", 0);
		map1.put("sender",user.getPhone());
		map1.put("status",status);
		
		List<Letter> list2 = letterService.letter_List(map1);
		count = list2.size();
		
		Map<String, Object> data = new LinkedHashMap<>();
		data.put("code", 0);
		data.put("msg", "");
		data.put("count", count);
		data.put("data", list);
		
		
		return data;
	}
	
	

	@RequestMapping("/user/easyPay")
	public String easyPay() {
		return "front/user/easyPay";
	}

	
	
    public BigDecimal getBigDecimalByDouble(Double d,Integer i) {//把一个Double类型转换成BigDecimal类型i位小数并四舍五入
		
		BigDecimal b1=new BigDecimal(d);
		
		BigDecimal b2 =b1.setScale(i,BigDecimal.ROUND_HALF_UP);
		
		return b2;
	
	}
    
    public static Date dateAddMonth(Date dt,int i) throws Exception {
    	    	
    	  Calendar rightNow = Calendar.getInstance();
    	  rightNow.setTime(dt);
    	  rightNow.add(Calendar.MONTH,i);// 日期加i个月
    	  Date dt1 = rightNow.getTime();
    	 
    	  return dt1;
    	  
    	 }

	
	
	  //意见反馈
	@RequestMapping("/idea")
	public String idea() {
		return "front/idea";
	}



	@RequestMapping("/user/openInvitingFriends")
	public String openInvitingFriends() {
		
		return "front/user/invitingFriends";
	}
	
	@RequestMapping("/user/invitingFriends")
	public @ResponseBody void invitingFriends(HttpServletResponse response, String page, String limit, String time1, String time2) throws JsonProcessingException{

		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json; charset=utf-8");

		Subject subject = SecurityUtils.getSubject();
		Session session = subject.getSession();

		User user = (User) session.getAttribute("user");
		
		System.out.println(page+" - "+limit+" - "+time1+" - "+time2);
		// 开始位置
		int x = (Integer.parseInt(page) - 1) * Integer.parseInt(limit);

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("line", Integer.parseInt(limit));
		map.put("number", x);
		map.put("referrerno",user.getReferrerno());
		map.put("time1", time1);
		map.put("time2", time2);

		int count = userRecommendService.count();
		
		List<UserRecommend> list = userRecommendService.selCode(map);
		
		Map<String, Object> map1 = new HashMap<String, Object>();
		map1.put("line", count);
		map1.put("number", 0);
		map1.put("phone",user.getPhone());
		map1.put("time1", time1);
		map1.put("time2", time2);
		List<UserRecommend> list2 = userRecommendService.selCode(map1);
		count = list2.size();
		
		Map<String, Object> data = new LinkedHashMap<>();
		data.put("code", 0);
		data.put("msg", "");
		data.put("count", count);
		data.put("data", list);
		
		ObjectMapper mapper = new ObjectMapper();
		String jsonfromList = mapper.writeValueAsString(data);
		System.out.println(jsonfromList);
		try {
			PrintWriter out = response.getWriter();
			 out.print(jsonfromList);
             out.flush();
             out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
    //十一月运营报告
	@RequestMapping("November")
	public String November() {
		return "forward:/public/November.pdf";
	}
	
	 //十二月运营报告
	@RequestMapping("December")
	public String December() {
		return "forward:/public/December.pdf";
	}


	@RequestMapping("error")
	public String error() {
		
		return "front/error";
	}

	
	
	@RequestMapping("openBackPwd")
	public String openBackPwd() {
		
		return "front/backPwd";
	}
	@RequestMapping("openBackPwd2")
	public String openBackPwd2(String phone,Model model) {
		
		model.addAttribute("phone", phone);
		
		return "front/backPwd2";
	}
	
}
