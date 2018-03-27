package com.p2p.controller.back;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.struts2.ServletActionContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.p2p.commons.StillExportExcel;
import com.p2p.pojo.LogMoney;
import com.p2p.pojo.LogRecharge;
import com.p2p.pojo.Page;
import com.p2p.pojo.Still;
import com.p2p.service.LogMoneyService;


@Controller
@RequestMapping("/logMoney")
public class LogMoneyController {
	
	@Resource(name = "logMoneyServiceImpl")
	private LogMoneyService logMoneyService;

	private int Total=0;//总数
	private int number=7;//条数
	private int pages=0;//页数
	private int CurrentPage=0;//当前页
	private int checks=0;////查询前后条数
	
	@RequestMapping("logMoney-list")
	public String list(Model model,HttpServletRequest request){
		
		
		if(request.getSession().getAttribute("Money")!=null){
			return "redirect:/logMoney/logMoney-mh";
		}
		
		
		List<LogMoney> list =logMoneyService.list();

		Total=logMoneyService.count();
		pages=(Total+number-1)/number;//页数
		
		List ll=new ArrayList<>();
		ll.add(Total);
		ll.add(pages);
			
		model.addAttribute("ll",ll);
		model.addAttribute("list", list);
		
		return "back/log_money";
	}
	
	//分页
	@RequestMapping("logMoney-fy")
	public String  paging(Model model,LogMoney logMoney){
		
		CurrentPage=logMoney.getId();//当前页
		int c=(CurrentPage-1)*number;//查询前后条数
		Page page1=new Page();
		page1.setFist(c);
		page1.setTow(number);
		page1.setTitle(logMoney.getUsername());
		page1.setPeople(logMoney.getOyh1());

		List<LogMoney> list=new ArrayList<>();
		if(logMoney.getUsername()==""&&logMoney.getOyh1()==""){
			list=logMoneyService.selectpaging(page1);
		}else {
			list=logMoneyService.selectpeople(page1);
		}

		List<LogMoney> lli=logMoneyService.selectlike(page1);
		if(logMoney.getUsername()==""&&logMoney.getOyh1()==""){
			Total=logMoneyService.count();			
		}else{
			Total=lli.size();	
		}
		pages=(Total+number-1)/number;//页数
		String title1=logMoney.getUsername();
		String people=logMoney.getOyh1();
					
		List ll=new ArrayList<>();
		ll.add(Total);
		ll.add(pages);
		ll.add(title1);
		ll.add(people);

		model.addAttribute("ll",ll);
		model.addAttribute("list",list);
		model.addAttribute("list2",CurrentPage);
		
		return "back/log_money";
		
	}

	//模糊查询
	@RequestMapping("logMoney-mh")
	public String fent(Model model,LogMoney logMoney,HttpServletRequest request){
		
		if(request.getSession().getAttribute("Money")!=null){
			logMoney.setUsername(request.getSession().getAttribute("Money")+"");
			logMoney.setOyh1("");
			request.getSession().removeAttribute("Money") ;
			
		}


		if(logMoney.getUsername()!=null&&logMoney.getUsername()!=""||logMoney.getOyh1()!=null&&logMoney.getOyh1()!=""){
			Page page=new Page();
			page.setFist(checks);
			page.setTow(number);
			page.setTitle(logMoney.getUsername());
			
			page.setPeople(logMoney.getOyh1());
			
			
			List<LogMoney> list=logMoneyService.selectpeople(page);
			List<LogMoney> list2= logMoneyService.selectlike(page);//总条数
			Total=list2.size();
			pages=(Total+number-1)/number;//页数
			String title1=logMoney.getUsername();
			String people=logMoney.getOyh1();
			List ll=new ArrayList<>();
			ll.add(Total);
			ll.add(pages);
			ll.add(title1);
			ll.add(people);
			model.addAttribute("ll",ll);
			
			model.addAttribute("list",list);
			return "back/log_money";
		}

		return "redirect:/logMoney/logMoney-list";
	}
	

	
	@RequestMapping(value="testsExport",produces = {"application/text;charset=UTF-8"})
	@ResponseBody
	public String exportExcle(LogMoney logMoney,HttpServletRequest request) throws UnsupportedEncodingException{
		//方法一：导出的数据中可以有空值
		HSSFWorkbook wb=new HSSFWorkbook();
		//表格下面的名称
		HSSFSheet sheet=wb.createSheet("资金流向记录");
		//每列的宽度
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
		cell.setCellValue("交易时间");
		cell.setCellStyle(style);
		cell=row.createCell((short) 3);
		cell.setCellValue("交易类型");
		cell.setCellStyle(style);
		cell=row.createCell((short) 4);
		cell.setCellValue("收入（￥元）");
		cell.setCellStyle(style);
		cell=row.createCell((short) 5);
		cell.setCellValue("支出（￥元）");
		cell.setCellStyle(style);
		cell=row.createCell((short) 6);
		cell.setCellValue("可用余额（￥元）");
		cell.setCellStyle(style);
		cell=row.createCell((short) 7);
		cell.setCellValue("待收金额（￥元）");
		cell.setCellStyle(style);
		cell=row.createCell((short) 8);
		cell.setCellValue("冻结资金（￥元）");
		cell.setCellStyle(style);
		cell=row.createCell((short) 9);
		cell.setCellValue("总金额（￥元）");
		cell.setCellStyle(style);
		cell=row.createCell((short) 10);
		cell.setCellValue("记录时间");
		cell.setCellStyle(style);
		
		Page page=new Page();
		page.setTitle(logMoney.getUsername());
		page.setPeople(logMoney.getOyh1());
		
		List<LogMoney> list=logMoneyService.selectlike(page);
		for(short i=0;i<list.size();i++){
			row=sheet.createRow(i+1);
			row.createCell(0).setCellValue(list.get(i).getId());
			if(list.get(i).getUsername()!=null&&!list.get(i).getUsername().equals("")) {
				row.createCell(1).setCellValue(list.get(i).getUsername());
			}else {
				row.createCell(1).setCellValue(null+"");
			}
			
			if(list.get(i).getTime()!=null||!list.get(i).getTime().equals("")) {
				String time=(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(list.get(i).getTime());
				row.createCell(2).setCellValue(time);
			}else {
				row.createCell(2).setCellValue(null+"");
			}
			
			if(list.get(i).getType()!=null&&!list.get(i).getType().equals("")) {
				row.createCell(3).setCellValue(list.get(i).getType());
			}else {
				row.createCell(3).setCellValue(null+"");
			}
			
			if(list.get(i).getDealmoney()!=null&&!list.get(i).getDealmoney().equals("")) {
				row.createCell(4).setCellValue(list.get(i).getDealmoney()+"");
			}else {
				row.createCell(4).setCellValue(null+"");
			}
			
			if(list.get(i).getStates()!=null&&!list.get(i).getStates().equals("")) {
				row.createCell(5).setCellValue(list.get(i).getStates()+"");
			}else {
				row.createCell(5).setCellValue(null+"");
			}
		}
		
		//用当前时间给文件创建名称
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		String DateName = "金字塔资金流向记录表";
		
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
	public String sess(HttpServletRequest request,LogMoney logMoney){
		
		request.getSession().setAttribute("Money", logMoney.getUsername());

		return "success";
		
	}	
	
	
}
