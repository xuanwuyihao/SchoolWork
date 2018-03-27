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

import com.p2p.pojo.LogMoney;
import com.p2p.pojo.MonthOperate;
import com.p2p.pojo.Page;
import com.p2p.service.MonthOperateService;


@Controller
@RequestMapping("/monthOperate")
public class MonthOperateController {
	@Resource(name = "monthOperateServiceImpl")
	private MonthOperateService monthOperateService;
	
	private int Total=0;//总数
	private int number=1;//条数
	private int pages=0;//页数
	private int CurrentPage=0;//当前页
	private int checks=0;////查询前后条数
	
	//平台运营数据
	@RequestMapping("/monthoperate-list")
	public String list(Model model,HttpServletRequest request) {
		List<MonthOperate> list=monthOperateService.list();
		Total=monthOperateService.count();//总数
		pages=(Total+number-1)/number;//页数
		
		List ll=new ArrayList<>();
		ll.add(Total);
		ll.add(pages);
			
		model.addAttribute("ll",ll);
		model.addAttribute("list", list);
		
		return "back/monthoperate-list";
	}
	
	//分页
	@RequestMapping("monthoperate-fy")
	public String fent(Model model,MonthOperate monthOperate){
		
		CurrentPage=monthOperate.getId();//当前页
		int c=(CurrentPage-1)*number;//查询前后条数
		Page page1=new Page();
		page1.setFist(c);
		page1.setTow(number);
		
		List<MonthOperate> list=new ArrayList<>();
		list=monthOperateService.selectpaging(page1);

		Total=monthOperateService.count();			

		pages=(Total+number-1)/number;//页数
					
		List ll=new ArrayList<>();
		ll.add(Total);
		ll.add(pages);

		model.addAttribute("ll",ll);
		model.addAttribute("list",list);
		model.addAttribute("list2",CurrentPage);
		
		return "back/monthoperate-list";
	}
	
	@RequestMapping(value="testsExport",produces = {"application/text;charset=UTF-8"})
	@ResponseBody
	public String exportExcle(MonthOperate monthOperate,HttpServletRequest request) throws UnsupportedEncodingException{
		
		//方法一：导出的数据中可以有空值
		HSSFWorkbook wb=new HSSFWorkbook();
		//表格下面的名称
		HSSFSheet sheet=wb.createSheet("平台运营数据");
		//每列的宽度
		sheet.setDefaultColumnWidth((short) 20);
		HSSFCellStyle style=wb.createCellStyle();
		HSSFRow row=sheet.createRow(0);
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		
		HSSFCell cell=row.createCell((short) 0);
		cell.setCellValue("ID");
		cell.setCellStyle(style);
		cell=row.createCell((short) 1);
		cell.setCellValue("标题");
		cell.setCellStyle(style);
		cell=row.createCell((short) 2);
		cell.setCellValue("生成时间");
		cell.setCellStyle(style);
		cell=row.createCell((short) 3);
		cell.setCellValue("平台交易总金额（￥元）");
		cell.setCellStyle(style);
		cell=row.createCell((short) 4);
		cell.setCellValue("月交易总额（￥元）");
		cell.setCellStyle(style);
		cell=row.createCell((short) 5);
		cell.setCellValue("截止待还总额（￥元）");
		cell.setCellStyle(style);
		cell=row.createCell((short) 6);
		cell.setCellValue("总收益（￥元）");
		cell.setCellStyle(style);
		cell=row.createCell((short) 7);
		cell.setCellValue("月总收益（￥元）");
		cell.setCellStyle(style);
		cell=row.createCell((short) 8);
		cell.setCellValue("总用户数");
		cell.setCellStyle(style);
		cell=row.createCell((short) 9);
		cell.setCellValue("月注册人数");
		cell.setCellStyle(style);
		cell=row.createCell((short) 10);
		cell.setCellValue("总投资数");
		cell.setCellStyle(style);
		cell=row.createCell((short) 11);
		cell.setCellValue("月投资数");
		cell.setCellStyle(style);
		cell=row.createCell((short) 12);
		cell.setCellValue("人均投资金额（￥元）");
		cell.setCellStyle(style);
		cell=row.createCell((short) 13);
		cell.setCellValue("月均投资额（￥元）");
		cell.setCellStyle(style);
		cell=row.createCell((short) 14);
		cell.setCellValue("借款总人数");
		cell.setCellStyle(style);
		cell=row.createCell((short) 15);
		cell.setCellValue("借款笔数");
		cell.setCellStyle(style);
		cell=row.createCell((short) 16);
		cell.setCellValue("当月贷款笔数");
		cell.setCellStyle(style);
		cell=row.createCell((short) 17);
		cell.setCellValue("当月贷款总额（￥元）");
		cell.setCellStyle(style);
		cell=row.createCell((short) 18);
		cell.setCellValue("逾期金额（￥元）");
		cell.setCellStyle(style);
		cell=row.createCell((short) 19);
		cell.setCellValue("逾期笔数");
		cell.setCellStyle(style);
		
		List<MonthOperate> list=monthOperateService.list0();
		for(short i=0;i<list.size();i++){
			row=sheet.createRow(i+1);
			row.createCell(0).setCellValue(list.get(i).getId());
			if(list.get(i).getTitle()!=null&&!list.get(i).getTitle().equals("")) {
				row.createCell(1).setCellValue(list.get(i).getTitle());
			}else {
				row.createCell(1).setCellValue(null+"");
			}
			
			if(list.get(i).getDate()!=null&&!list.get(i).getDate().equals("")) {
				String time=(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(list.get(i).getDate());
				row.createCell(2).setCellValue(time);
			}else {
				row.createCell(2).setCellValue(null+"");
			}
			
			if(list.get(i).getAllmoney()!=null&&!list.get(i).getAllmoney().equals("")) {
				row.createCell(3).setCellValue(list.get(i).getAllmoney()+"");
			}else {
				row.createCell(3).setCellValue(null+"");
			}
			
			if(list.get(i).getMonthmoney()!=null&&!list.get(i).getMonthmoney().equals("")) {
				row.createCell(4).setCellValue(list.get(i).getMonthmoney()+"");
			}else {
				row.createCell(4).setCellValue(null+"");
			}
			
			if(list.get(i).getActingmoney()!=null&&!list.get(i).getActingmoney().equals("")) {
				row.createCell(5).setCellValue(list.get(i).getActingmoney()+"");
			}else {
				row.createCell(5).setCellValue(null+"");
			}
			
			if(list.get(i).getAllinterest()!=null&&!list.get(i).getAllinterest().equals("")) {
				row.createCell(6).setCellValue(list.get(i).getAllinterest()+"");
			}else {
				row.createCell(6).setCellValue(null+"");
			}
			
			if(list.get(i).getMonthinterest()!=null&&!list.get(i).getMonthinterest().equals("")) {
				row.createCell(7).setCellValue(list.get(i).getMonthinterest()+"");
			}else {
				row.createCell(7).setCellValue(null+"");
			}
			
			if(list.get(i).getAlluser()!=null&&!list.get(i).getAlluser().equals("")) {
				row.createCell(8).setCellValue(list.get(i).getAlluser()+"");
			}else {
				row.createCell(8).setCellValue(null+"");
			}
			
			if(list.get(i).getMonthreqister()!=null&&!list.get(i).getMonthreqister().equals("")) {
				row.createCell(9).setCellValue(list.get(i).getMonthreqister()+"");
			}else {
				row.createCell(9).setCellValue(null+"");
			}
			
			if(list.get(i).getAllimest()!=null&&!list.get(i).getAllimest().equals("")) {
				row.createCell(10).setCellValue(list.get(i).getAllimest()+"");
			}else {
				row.createCell(10).setCellValue(null+"");
			}
			
			if(list.get(i).getMonthinvest()!=null&&!list.get(i).getMonthinvest().equals("")) {
				row.createCell(11).setCellValue(list.get(i).getMonthinvest()+"");
			}else {
				row.createCell(11).setCellValue(null+"");
			}
			
			if(list.get(i).getUsermoney()!=null&&!list.get(i).getUsermoney().equals("")) {
				row.createCell(12).setCellValue(list.get(i).getUsermoney()+"");
			}else {
				row.createCell(12).setCellValue(null+"");
			}
			
			if(list.get(i).getUsermoney()!=null&&!list.get(i).getUsermoney().equals("")) {
				row.createCell(12).setCellValue(list.get(i).getUsermoney()+"");
			}else {
				row.createCell(12).setCellValue(null+"");
			}
			
			if(list.get(i).getMonthmoney()!=null&&!list.get(i).getMonthmoney().equals("")) {
				row.createCell(13).setCellValue(list.get(i).getMonthmoney()+"");
			}else {
				row.createCell(13).setCellValue(null+"");
			}
			
			if(list.get(i).getAlllenduser()!=null&&!list.get(i).getAlllenduser().equals("")) {
				row.createCell(14).setCellValue(list.get(i).getAlllenduser()+"");
			}else {
				row.createCell(14).setCellValue(null+"");
			}
			
			if(list.get(i).getAlllendcount()!=null&&!list.get(i).getAlllendcount().equals("")) {
				row.createCell(15).setCellValue(list.get(i).getAlllendcount()+"");
			}else {
				row.createCell(15).setCellValue(null+"");
			}
			
			if(list.get(i).getMonthlendcount()!=null&&!list.get(i).getMonthlendcount().equals("")) {
				row.createCell(16).setCellValue(list.get(i).getMonthlendcount()+"");
			}else {
				row.createCell(16).setCellValue(null+"");
			}
			
			if(list.get(i).getMonthlend()!=null&&!list.get(i).getMonthlend().equals("")) {
				row.createCell(17).setCellValue(list.get(i).getMonthlend()+"");
			}else {
				row.createCell(17).setCellValue(null+"");
			}
			
			if(list.get(i).getStaymoney()!=null&&!list.get(i).getStaymoney().equals("")) {
				row.createCell(18).setCellValue(list.get(i).getStaymoney()+"");
			}else {
				row.createCell(18).setCellValue(null+"");
			}
			
			if(list.get(i).getStaycount()!=null&&!list.get(i).getStaycount().equals("")) {
				row.createCell(19).setCellValue(list.get(i).getStaycount()+"");
			}else {
				row.createCell(19).setCellValue(null+"");
			}
		}
		
		//用当前时间给文件创建名称
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		String DateName = "金字塔平台运营数据表";
		
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
		System.out.println("导出表："+fName);
		
		return fName;
	}
}
