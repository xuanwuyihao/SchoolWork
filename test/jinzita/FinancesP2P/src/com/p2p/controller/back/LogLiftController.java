package com.p2p.controller.back;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.rmi.server.ExportException;
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

import com.p2p.commons.ExportExcel;
import com.p2p.pojo.LogLift;
import com.p2p.pojo.LogRecharge;
import com.p2p.pojo.Page;
import com.p2p.service.LogLiftService;

@Controller
@RequestMapping("/logLift")

public class LogLiftController {

	@Resource(name="logLiftServiceImpl")
	private LogLiftService logLiftService;
	
	private int Total=0;//总数
	private int number=7;//条数
	private int pages=0;//页数
	private int CurrentPage=0;//当前页
	private int checks=0;////查询前后条数
	
	@RequestMapping("logLift-list")
	public String list(Model model,HttpServletRequest request){
		
		
		if(request.getSession().getAttribute("Lift")!=null){
			return "redirect:/logLift/logLift-mh";
		}
		
		List<LogLift> list =logLiftService.list();

		Total=logLiftService.count();
		pages=(Total+number-1)/number;//页数
		
		List ll=new ArrayList<>();
		ll.add(Total);
		ll.add(pages);
		
		model.addAttribute("ll",ll);
		model.addAttribute("list", list);
		
		return "back/log_lift";
	}
	
	
	//分页
	@RequestMapping("logLift-fy")
	public String  paging(Model model,LogLift logLift){
		
		CurrentPage=logLift.getId();//当前页
		int c=(CurrentPage-1)*number;//查询前后条数
		Page page1=new Page();
		page1.setFist(c);
		page1.setTow(number);
		page1.setTitle(logLift.getUsername());
		page1.setPeople(logLift.getOyh1());

		List<LogLift> list=new ArrayList<>();
		if(logLift.getUsername()==""&&logLift.getOyh1()==""){
			list=logLiftService.selectpaging(page1);
		}else {
			list=logLiftService.selectpeople(page1);
		}

		List<LogLift> lli=logLiftService.selectlike(page1);
		if(logLift.getUsername()==""&&logLift.getOyh1()==""){
			Total=logLiftService.count();			
		}else{
			Total=lli.size();	
		}
		pages=(Total+number-1)/number;//页数
		String title1=logLift.getUsername();
		String people=logLift.getOyh1();
					
		List ll=new ArrayList<>();
		ll.add(Total);
		ll.add(pages);
		ll.add(title1);
		ll.add(people);

		model.addAttribute("ll",ll);
		model.addAttribute("list",list);
		model.addAttribute("list2",CurrentPage);
		
		return "back/log_lift";
		
	}

	//模糊查询
	@RequestMapping("logLift-mh")
	public String fent(Model model,LogLift logLift,HttpServletRequest request){
		
		if(request.getSession().getAttribute("Lift")!=null){
			logLift.setUsername(request.getSession().getAttribute("Lift")+"");
			logLift.setOyh1("");
			request.getSession().removeAttribute("Lift") ;
		}

		if(logLift.getUsername()!=null&&logLift.getUsername()!=""||logLift.getOyh1()!=null&&logLift.getOyh1()!=""){
			Page page=new Page();
			page.setFist(checks);
			page.setTow(number);
			page.setTitle(logLift.getUsername());
			
			page.setPeople(logLift.getOyh1());
			
			
			List<LogLift> list=logLiftService.selectpeople(page);
			List<LogLift> list2= logLiftService.selectlike(page);//总条数
			Total=list2.size();
			pages=(Total+number-1)/number;//页数
			String title1=logLift.getUsername();
			String people=logLift.getOyh1();
			List ll=new ArrayList<>();
			ll.add(Total);
			ll.add(pages);
			ll.add(title1);
			ll.add(people);
			model.addAttribute("ll",ll);
			
			model.addAttribute("list",list);
			return "back/log_lift";
		}

		return "redirect:/logLift/logLift-list";
	}
	

	
	@RequestMapping(value="testsExport",produces = {"application/text;charset=UTF-8"})
	@ResponseBody
	public String exportExcle(LogLift logLift,HttpServletRequest request) throws UnsupportedEncodingException{
		HSSFWorkbook wb=new HSSFWorkbook();
		HSSFSheet sheet=wb.createSheet("提现记录");
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
		cell.setCellValue("所属银行");
		cell.setCellStyle(style);
		cell=row.createCell((short) 3);
		cell.setCellValue("银行卡号");
		cell.setCellStyle(style);
		cell=row.createCell((short) 4);
		cell.setCellValue("提现金额");
		cell.setCellStyle(style);
		cell=row.createCell((short) 5);
		cell.setCellValue("提现手续费");
		cell.setCellStyle(style);
		cell=row.createCell((short) 6);
		cell.setCellValue("提现时间");
		cell.setCellStyle(style);
		cell=row.createCell((short) 7);
		cell.setCellValue("到账金额");
		cell.setCellStyle(style);
		
		Page page=new Page();
		page.setTitle(logLift.getUsername());
		page.setPeople(logLift.getOyh1());
		
		List<LogLift> list=logLiftService.selectlike(page);
		
		for(short i=0;i<list.size();i++){
			row=sheet.createRow(i+1);
			row.createCell(0).setCellValue(list.get(i).getId());
			if(list.get(i).getUsername()!=null&&!list.get(i).getUsername().equals("")) {
				row.createCell(1).setCellValue(list.get(i).getUsername());
			}else {
				row.createCell(1).setCellValue(null+"");
			}
			
			if(list.get(i).getBanktype()!=null&&!list.get(i).getBanktype().equals("")) {
				row.createCell(2).setCellValue(list.get(i).getBanktype());
			}else {
				row.createCell(2).setCellValue(null+"");
			}
			
			if(list.get(i).getBankcord()!=null&&!list.get(i).getBankcord().equals("")) {
				row.createCell(3).setCellValue(list.get(i).getBankcord());
			}else {
				row.createCell(3).setCellValue(null+"");
			}
			
			if(list.get(i).getLiftmoney()!=null&&!list.get(i).getLiftmoney().equals("")) {
				row.createCell(4).setCellValue(list.get(i).getLiftmoney()+"");
			}else {
				row.createCell(4).setCellValue(null+"");
			}
			
			if(list.get(i).getLiftfee()!=null&&!list.get(i).getLiftfee().equals("")) {
				row.createCell(5).setCellValue(list.get(i).getLiftfee()+"");
			}else {
				row.createCell(5).setCellValue(null+"");
			}
			
			if(list.get(i).getLefttime()!=null&&!list.get(i).getLefttime().equals("")) {
				String time=(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(list.get(i).getLefttime());
				row.createCell(6).setCellValue(time);
			}else {
				row.createCell(6).setCellValue(null+"");
			}
			
			if(list.get(i).getLastmoney()!=null&&!list.get(i).getLastmoney().equals("")) {
				row.createCell(7).setCellValue(list.get(i).getLastmoney()+"");
			}else {
				row.createCell(7).setCellValue(null+"");
			}
		}
		
		String DateName = "金字塔提现记录表";
		
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
	
	@RequestMapping("session")	
	@ResponseBody
	public String sess(HttpServletRequest request,LogRecharge logRecharge){
		request.getSession().setAttribute("Lift", logRecharge.getUsername());

		return "success";
	}	
}
