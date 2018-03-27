package com.p2p.controller.back;

import java.io.FileOutputStream;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import nl.bitwalker.useragentutils.Browser;
import nl.bitwalker.useragentutils.UserAgent;
import nl.bitwalker.useragentutils.Version;
import com.p2p.pojo.LogLift;
import com.p2p.pojo.LogRecharge;
import com.p2p.pojo.Page;
import com.p2p.pojo.User;
import com.p2p.service.LogRechargeService;

@Controller
@RequestMapping("/logRecharge")
public class LogRechargeController {

	@Resource(name="logRechargeServiceImpl")
	private LogRechargeService logRechargeService;
	
	private int Total=0;//总数
	private int number=7;//条数
	private int pages=0;//页数
	private int CurrentPage=0;//当前页
	private int checks=0;////查询前后条数
	
	@RequestMapping("logRecharge-list")
	private String list(Model model,HttpServletRequest request){
		
		
		if(request.getSession().getAttribute("sss")!=null){
			return "redirect:/logRecharge/logRecharge-mh";
		}else{
		
		List<LogRecharge> list =logRechargeService.list();
		
		
	    		Total=logRechargeService.count();
				pages=(Total+number-1)/number;//页数
				
				List ll=new ArrayList<>();
				ll.add(Total);
				ll.add(pages);
			
			
			model.addAttribute("ll",ll);
			model.addAttribute("list", list);
			
			
			
			
		return "back/log_recharge";
		}
	}
	
	//分页
	@RequestMapping("logRecharge-fy")
	public String  paging(Model model,LogRecharge logRecharge){
		
		CurrentPage=logRecharge.getId();//当前页
		int c=(CurrentPage-1)*number;//查询前后条数
		Page page1=new Page();
		page1.setFist(c);
		page1.setTow(number);
		page1.setTitle(logRecharge.getUsername());
		page1.setPeople(logRecharge.getOyh1());

		List<LogRecharge> list=new ArrayList<>();
		if(logRecharge.getUsername()==""&&logRecharge.getOyh1()==""){
			list=logRechargeService.selectpaging(page1);
		}else {
			list=logRechargeService.selectpeople(page1);
		}

		List<LogRecharge> lli=logRechargeService.selectlike(page1);
		if(logRecharge.getUsername()==""&&logRecharge.getOyh1()==""){
			Total=logRechargeService.count();			
		}else{
			Total=lli.size();	
		}
		pages=(Total+number-1)/number;//页数
		String title1=logRecharge.getUsername();
		String people=logRecharge.getOyh1();
					
		List ll=new ArrayList<>();
		ll.add(Total);
		ll.add(pages);
		ll.add(title1);
		ll.add(people);
		
		model.addAttribute("ll",ll);
		model.addAttribute("list",list);
		model.addAttribute("list2",CurrentPage);
		
		return "back/log_recharge";
		
	}

	//模糊查询
	@RequestMapping("logRecharge-mh")
	public String fent(Model model,LogRecharge logRecharge,HttpServletRequest request){
		
	if(request.getSession().getAttribute("sss")!=null){
		logRecharge.setUsername(request.getSession().getAttribute("sss")+"");
		logRecharge.setOyh1("");
		request.getSession().removeAttribute("sss") ;
		
	}
	
		if(logRecharge.getUsername()!=null&&logRecharge.getUsername()!=""||logRecharge.getOyh1()!=null&&logRecharge.getOyh1()!=""){
			Page page=new Page();
			page.setFist(checks);
			page.setTow(number);
			page.setTitle(logRecharge.getUsername());
			
			page.setPeople(logRecharge.getOyh1());
			
			
			List<LogRecharge> list=logRechargeService.selectpeople(page);
			List<LogRecharge> list2= logRechargeService.selectlike(page);//总条数
			Total=list2.size();
			pages=(Total+number-1)/number;//页数
			String title1=logRecharge.getUsername();
			String people=logRecharge.getOyh1();
			List ll=new ArrayList<>();
			ll.add(Total);
			ll.add(pages);
			ll.add(title1);
			ll.add(people);
			model.addAttribute("ll",ll);
			
			model.addAttribute("list",list);
			return "back/log_recharge";
		}

		return "redirect:/logRecharge/logRecharge-list";
	}
			
			
			
			
	@RequestMapping("session")	
	@ResponseBody
	public String sess(HttpServletRequest request,LogRecharge logRecharge){
		request.getSession().setAttribute("sss", logRecharge.getUsername());
		
		return "success";
		
	}	

	
	@RequestMapping(value="testsExport",produces = {"application/text;charset=UTF-8"})
	@ResponseBody
	public String exportExcle(LogRecharge logRecharge,HttpServletRequest request) throws UnsupportedEncodingException{
		HSSFWorkbook wb=new HSSFWorkbook();
		HSSFSheet sheet=wb.createSheet("充值记录");
		sheet.setDefaultColumnWidth((short) 17);
		HSSFCellStyle style=wb.createCellStyle();
		HSSFRow row=sheet.createRow(0);
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		HSSFCell cell=row.createCell((short) 0);
		
		cell.setCellValue("ID");
		cell.setCellStyle(style);
		cell=row.createCell((short) 1);
		cell.setCellValue("用户名称");
		cell.setCellStyle(style);
		cell=row.createCell((short) 2);
		cell.setCellValue("银行卡号");
		cell.setCellStyle(style);
		cell=row.createCell((short) 3);
		cell.setCellValue("所属银行");
		cell.setCellStyle(style);
		cell=row.createCell((short) 4);
		cell.setCellValue("充值金额");
		cell.setCellStyle(style);
		cell=row.createCell((short) 5);
		cell.setCellValue("充值时间");
		cell.setCellStyle(style);
		cell=row.createCell((short) 6);
		cell.setCellValue("状态");
		cell.setCellStyle(style);
		
		Page page=new Page();
		page.setTitle(logRecharge.getUsername());
		page.setPeople(logRecharge.getOyh1());
		
		List<LogRecharge> list=logRechargeService.selectlike(page);
		
		for(short i=0;i<list.size();i++){
			row=sheet.createRow(i+1);
			row.createCell(0).setCellValue(list.get(i).getId());
			
			if(list.get(i).getUsername()!=null&&!list.get(i).getUsername().equals("")) {
				row.createCell(1).setCellValue(list.get(i).getUsername());
			}else {
				row.createCell(1).setCellValue(null+"");
			}
			
			if(list.get(i).getBankcard()!=null&&!list.get(i).getBankcard().equals("")) {
				row.createCell(2).setCellValue(list.get(i).getBankcard());
			}else {
				row.createCell(2).setCellValue(null+"");
			}
			
			if(list.get(i).getBanktype()!=null&&!list.get(i).getBanktype().equals("")) {
				row.createCell(3).setCellValue(list.get(i).getBanktype());
			}else {
				row.createCell(3).setCellValue(null+"");
			}
			
			if(list.get(i).getMoney()!=null&&!list.get(i).getMoney().equals("")) {
				row.createCell(4).setCellValue(list.get(i).getMoney()+"");
			}else {
				row.createCell(4).setCellValue(null+"");
			}
			
			if(list.get(i).getTime()!=null||!list.get(i).getTime().equals("")) {
				String time=(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(list.get(i).getTime());
				row.createCell(5).setCellValue(time);
			}else {
				row.createCell(5).setCellValue(null+"");
			}
			
			if(list.get(i).getStatus()!=null&&!list.get(i).getStatus().equals("")) {
				row.createCell(6).setCellValue(list.get(i).getStatus());
			}else {
				row.createCell(6).setCellValue(null+"");
			}
		}
		
		String DateName = "金字塔充值记录表";
		
		//获取项目中存放Excel文件的xls文件夹的绝对路径
		String contextPath = request.getSession().getServletContext().getRealPath("/xls/");
		contextPath = contextPath.replace("\\", "/");
		
		//下载到项目文件夹中完整路径和文件名称
		String fileName=contextPath+DateName+".xls";
		
		try {
			//文件创建的路径地址和名称
			FileOutputStream out=new FileOutputStream(fileName);
			wb.write(out);
			wb.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "失败";
		}
		String fName=DateName+".xls";
		
		return fName;
	}
			
}
