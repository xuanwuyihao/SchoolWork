package com.p2p.controller.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.p2p.commons.StillExportExcel;
import com.p2p.pojo.InvestAword;
import com.p2p.pojo.Investpaging;
import com.p2p.pojo.Investseek;
import com.p2p.pojo.Paging;
import com.p2p.service.InvestAwordService;

@Controller
@RequestMapping("/investAword")
public class InvestAwordController {
	Logger log =LogManager.getLogger(InvestAwordController .class.getName());
	@Resource(name="investAwordServiceImpl")
	private InvestAwordService investAwordService;
	
	
	@RequestMapping("/list")
	private String list(Model model){
		

		Paging p=new Paging();
		p.setDq(0);
		p.setMygs(5);
		List<InvestAword> list1 = investAwordService.selpaging(p);
		
		List<InvestAword> list=investAwordService.list();
		model.addAttribute("count",list.size());
		
		int zy=list.size()/5;
		if(list.size()%5!=0){
			zy=list.size()/5+1;
		}
		
		
		model.addAttribute("userList", list1);	
		model.addAttribute("zy",zy);//页数
		model.addAttribute("dq",1);
		model.addAttribute("awa", "null");
		model.addAttribute("fid", "null");
		
		return "back/investAword";
	}
	
	@RequestMapping("/seek")
	private String seek(String username,String fid,String awa,Model model,String dq1,String pdmhfycx){
		
		if(pdmhfycx.equals("1")){//模糊查询之后分页

			if(fid.equals("0")){
				fid="";
			}
	        if(awa.equals("0")){
				awa="";
			}
			Investpaging ip=new Investpaging();
			
			Integer ee=(Integer.parseInt(dq1)-1)*5;			
			ip.setDq1(ee);
			ip.setMygs1(5);
			ip.setFid(fid);
			ip.setUsername(username);
			ip.setAwa(awa);
			
			
			Investseek seek=new Investseek();
			seek.setUsername(username);
			seek.setFid(fid);
			seek.setAwa(awa);
	
			List<InvestAword> list1 = investAwordService.investpaging(ip);
			List<InvestAword> list2=investAwordService.seek(seek);
			
			
			int zy=list2.size()/5;
			if(list2.size()%5!=0) {
				
				zy=list2.size()/5+1;
			}
			
			model.addAttribute("count",list2.size());
			
			model.addAttribute("zy",zy);//页数
			model.addAttribute("dq",dq1);
			model.addAttribute("awa", awa);
			model.addAttribute("username", username);
			model.addAttribute("fid", fid);
			model.addAttribute("pdmhfy", 1);//判断模糊查询分页
			
	     	model.addAttribute("userList", list1);	
	     	model.addAttribute("count",list2.size());
			
		}else{
			if(fid.equals("0")){
				
				fid="";
			}
	        if(awa.equals("0")){
				
				awa="";
			}
			Investpaging ip=new Investpaging();
			ip.setDq1(0);
			ip.setMygs1(5);
			ip.setAwa(awa);
			ip.setFid(fid);
			ip.setUsername(username);
			List<InvestAword> list1=investAwordService.investpaging(ip);
			
			Investseek seek=new Investseek();
			seek.setUsername(username);
			seek.setFid(fid);
			seek.setAwa(awa);
			
			
			List<InvestAword> list=investAwordService.seek(seek);
			
			int zy=list.size()/5;
			if(list.size()%5!=0) {
				zy=list.size()/5+1;
			}
			model.addAttribute("zy",zy);//页数
			model.addAttribute("dq",1);
			model.addAttribute("awa", awa);
			model.addAttribute("username", username);
			model.addAttribute("fid", fid);
			model.addAttribute("userList", list1);	
			model.addAttribute("count",list.size());
			model.addAttribute("pdmhfy", 1);//判断模糊查询分页
		}
		return "back/investAword";
		
	}
	
	@RequestMapping("/tofenye")
	public String tofenye(Model model,String dqy){
		int line=5;//页个数
	    
		int dq=Integer.parseInt(dqy);//当前页
		
		int dy=(dq-1)*line;//第一个
		Paging p=new Paging();
		p.setDq(dy);
	    p.setMygs(line);
	    
	    List<InvestAword> list = investAwordService.selpaging(p);
		List<InvestAword> ListSize = investAwordService.list();//查大小
		
		int zy=ListSize.size()/5;
		if(ListSize.size()%5!=0) {
			zy=ListSize.size()/5+1;
		}
		
		model.addAttribute("zy",zy);//页数
		model.addAttribute("dq",dq);
		model.addAttribute("userList", list);
		model.addAttribute("count",ListSize.size());
		
		return "back/investAword";
	}
	
	
	@RequestMapping("/export")
	/*
	 * @ResponseBody和@RequestBody的区别
	 * 
	 * @RequestBody：  i) 该注解用于读取Request请求的body部分数据，使用系统默认配置的HttpMessageConverter进行解析，然后把相应的数据绑定到要返回的对象上；
      								ii) 再把HttpMessageConverter返回的对象数据绑定到 controller中方法的参数上。
											使用时机：
											A) GET、POST方式提时， 根据request header Content-Type的值来判断:
		*@ResponseBody： 该注解用于将Controller的方法返回的对象，通过适当的HttpMessageConverter转换为指定格式后，
		*							写入到Response对象的body数据区。
									使用时机：
							      	返回的数据不是html标签的页面，而是其他某种格式的数据时（如json、xml等）使用；
	 * */
	public @ResponseBody String export(HttpServletRequest request){
		String sheetName="book";
		String titleName="金字塔用户累计资金奖励表";
		String[] headers={"id","用户"," 用户累计投资金额（￥元）","奖励类型"," 奖励描述","发放状态","奖励发放时间",
				" 奖励计算时间","奖励发放"};
		
		List<InvestAword> dataSet=investAwordService.list();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmssSS");
		String DateName=sdf.format(new Date());
		
		String contextPath=request.getSession().getServletContext().getRealPath("/xls/");
		contextPath=contextPath.replace("\\", "/");
		String fileName=contextPath+DateName+".xls";
		String resultUrl=fileName;
		String pattern="yyyy-MM-dd";
		StillExportExcel.exportExcel(sheetName, titleName, headers, dataSet, resultUrl, pattern);
		
		String fName=DateName+".xls";
		return fName;
	}
	
	@RequestMapping("/export2")
	public @ResponseBody String export2(HttpServletRequest request,String username,String awa,String fid){
		if(fid.equals("0")){
			
			fid="";
		}
        if(awa.equals("0")){
			
			awa="";
		}
		String sheetName="book";
		String titleName="金字塔用户累计资金奖励表";
		String[] headers={"id","用户"," 用户累计投资金额（￥元）","奖励类型"," 奖励描述","发放状态","奖励发放时间",
				" 奖励计算时间","奖励发放"};
		
		Investseek it=new Investseek();
		it.setAwa(awa);
		it.setFid(fid);
		it.setUsername(username);
		
		
		List<InvestAword> dataSet=investAwordService.seek(it);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmssSS");
		String DateName=sdf.format(new Date());
		String contextPath=request.getSession().getServletContext().getRealPath("/xls/");
		contextPath=contextPath.replace("\\", "/");
		String fileName=contextPath+DateName+".xls";
		String resultUrl=fileName;
		String pattern="yyyy-MM-dd";
		StillExportExcel.exportExcel(sheetName, titleName, headers, dataSet, resultUrl, pattern);
		
		String fName=DateName+".xls";
		return fName;
	}
	
	@RequestMapping("/update")
	public String update(int id){
		InvestAword iu=new InvestAword();
		iu.setId(id);
		iu.setStatus("已发放");
		investAwordService.update(iu);
		return "success";
	}
	
	@RequestMapping("/upall")
	public void upall(HttpServletRequest request,HttpServletResponse response){
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	       
	    response.setContentType("text/html;charset=UTF-8");
	       
	    String[] ups = request.getParameterValues("des");//"des"为获取的前台数组 
	    //循环数组
	    for(int i=0;i<ups.length;i++) {
	    	   
	    	int s_id=Integer.parseInt(ups[i]);
	    	InvestAword iu=new InvestAword();
	   		iu.setId(s_id);
	   		iu.setStatus("已发放");
	   		investAwordService.update(iu);
	    	   
	    }
	    PrintWriter out = null;
		try {
			out = response.getWriter();
		} catch (IOException e) {
			e.printStackTrace();
		}
			
		out.print("{\"msg\":\"success\"}");
		
	}
	
}
