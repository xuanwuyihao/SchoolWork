package com.p2p.controller.back;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.p2p.commons.DateUtil;
import com.p2p.pojo.Gathering;
import com.p2p.pojo.LogRecharge;
import com.p2p.pojo.Page;
import com.p2p.pojo.User;
import com.p2p.pojo.UserMoney;
import com.p2p.service.GatheringService;

/**
 * 借款记录的Controller
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/gathering")
public class GatheringController {
	
	@Resource(name = "gatheringServiceImpl")
	private GatheringService gatheringService;
	
	private int Total=0;//总数
	private int number=7;//条数
	private int pages=0;//页数
	private int CurrentPage=0;//当前页
	private int checks=0;////查询前后条数

	
	//遍历申请记录
	@RequestMapping("/list")
	public String lendList(Model model,HttpServletRequest request) {
		
		if(request.getSession().getAttribute("Lift")!=null){
			return "redirect:/gathering/gathering-mh";
		}
		
		List<Gathering> list = gatheringService.list();
		
		int cont=gatheringService.count();
		int ye=7;//条数
		int xx=(cont+ye-1)/ye;//页数
		
		Float list2= gatheringService.selectSum();
		
		List ll=new ArrayList<>();
		ll.add(gatheringService.count());
		ll.add(xx);
		
		model.addAttribute("list",list);
		model.addAttribute("ll",ll);
		model.addAttribute("sum",list2);
		return "back/gathering-list";
	}
	

	//分页
	@RequestMapping("text")
	public String  paging(Model model,Page page){
		int CurrentRoWnumber=7;//当前行数
		int CurrentPage=page.getCont();//当前页
		int c=(CurrentPage-1)*CurrentRoWnumber;//查询前后条数
		Page page1=new Page();
		page1.setFist(c);
		page1.setTow(CurrentRoWnumber);
		page1.setPeople(page.getPeople());
		List<Gathering> list=new ArrayList<>();
		List<Gathering> lli=new ArrayList<>();
		if(page.getPeople()==""||page.getPeople()==null){
			list=gatheringService.selectpaging(page1);
		}else {
			list=gatheringService.selectpeople(page1);
			lli=gatheringService.selectlike(page1);
		}

		int cont=0;//总数
		if(page.getPeople()==""){
			cont=gatheringService.count();			
		}else{
			cont=lli.size();	
		}
		
		Float list3=0f;
		if(cont!=0) {
			list3= gatheringService.selectSumMH(page1);//总金额
		}else {
			list3=0.00f;//总金额
		}
		int ye=CurrentRoWnumber;//行数
		int xx=(cont+ye-1)/ye;//页数
		String people=page.getPeople();

		List ll=new ArrayList<>();
		ll.add(cont);
		ll.add(xx);
		ll.add(people);

		model.addAttribute("sum",list3);
		model.addAttribute("ll",ll);
		model.addAttribute("list",list);
		model.addAttribute("list2",CurrentPage);
  		return "back/gathering-list";
  		
  	}
  	
   //模糊查询
	@RequestMapping("gathering-mh")
	public String fent2(Model model,Gathering gathering,HttpServletRequest request){
		if(request.getSession().getAttribute("Lift")!=null){
			gathering.setRealname(request.getSession().getAttribute("Lift")+"");
			request.getSession().removeAttribute("Lift") ;
		}
		
		if(gathering.getRealname()!=""){
			Page page=new Page();
			page.setFist(checks);
			page.setTow(number);
			page.setPeople(gathering.getRealname());
			List<Gathering> list=gatheringService.selectpeople(page);
			List<Gathering> list2= gatheringService.selectlike(page);//总条数
			Total=list2.size();
			pages=(Total+number-1)/number;//页数
			String people1=gathering.getRealname();
			
			Float list3=0f;
			if(Total!=0) {
				list3= gatheringService.selectSumMH(page);//总金额
			}else {
				list3=0.00f;//总金额
			}
			
			
			List ll=new ArrayList<>();
			ll.add(Total);
			ll.add(pages);
			ll.add(people1);
			
			model.addAttribute("sum",list3);
			model.addAttribute("ll",ll);
			model.addAttribute("list",list);
			return "back/gathering-list";
		}

		return "redirect:/gathering/list";
	}
  	
  	@RequestMapping(value="testsExport",produces = {"application/text;charset=UTF-8"})
	@ResponseBody
	public String exportExcle(Gathering gathering,HttpServletRequest request) throws UnsupportedEncodingException{
		
		//方法一：导出的数据中可以有空值
		HSSFWorkbook wb=new HSSFWorkbook();
		//表格下面的名称
		HSSFSheet sheet=wb.createSheet("收款记录");
		//每列的宽度
		sheet.setDefaultColumnWidth((short) 17);
		HSSFCellStyle style=wb.createCellStyle();
		HSSFRow row=sheet.createRow(0);
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		
		HSSFCell cell=row.createCell((short) 0);
		cell.setCellValue("ID");
		cell.setCellStyle(style);
		cell=row.createCell((short) 1);
		cell.setCellValue("用户名");
		cell.setCellStyle(style);
		cell=row.createCell((short) 2);
		cell.setCellValue("真实姓名");
		cell.setCellStyle(style);
		cell=row.createCell((short) 3);
		cell.setCellValue("借款标题");
		cell.setCellStyle(style);
		cell=row.createCell((short) 4);
		cell.setCellValue("项目期限");
		cell.setCellStyle(style);
		cell=row.createCell((short) 5);
		cell.setCellValue("还款时间");
		cell.setCellStyle(style);
		cell=row.createCell((short) 6);
		cell.setCellValue("已收本金（￥元）");
		cell.setCellStyle(style);
		cell=row.createCell((short) 7);
		cell.setCellValue("已收利息（￥元）");
		cell.setCellStyle(style);
		cell=row.createCell((short) 8);
		cell.setCellValue("待收总额（￥元）");
		cell.setCellStyle(style);
		
		Page page=new Page();
		page.setPeople(gathering.getRealname());
		
		List<Gathering> list=gatheringService.selectlike(page);
		for(short i=0;i<list.size();i++){
			row=sheet.createRow(i+1);
			row.createCell(0).setCellValue(list.get(i).getId());
			if(list.get(i).getUsername()!=null&&!list.get(i).getUsername().equals("")) {
				row.createCell(1).setCellValue(list.get(i).getUsername());
			}else {
				row.createCell(1).setCellValue(null+"");
			}
			
			if(list.get(i).getRealname()!=null&&!list.get(i).getRealname().equals("")) {
				row.createCell(2).setCellValue(list.get(i).getRealname());
			}else {
				row.createCell(2).setCellValue(null+"");
			}
			
			if(list.get(i).getBillcode()!=null&&!list.get(i).getBillcode().equals("")) {
				row.createCell(3).setCellValue(list.get(i).getBillcode());
			}else {
				row.createCell(3).setCellValue(null+"");
			}
			
			if(list.get(i).getLendtime()!=null&&!list.get(i).getLendtime().equals("")) {
				row.createCell(4).setCellValue(list.get(i).getLendtime());
			}else {
				row.createCell(4).setCellValue(null+"");
			}
			
			if(list.get(i).getStilldtate()!=null&&!list.get(i).getStilldtate().equals("")) {
				String time=(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(list.get(i).getStilldtate());
				row.createCell(5).setCellValue(time);
			}else {
				row.createCell(5).setCellValue(null+"");
			}
			
			if(list.get(i).getHasgold()!=null&&!list.get(i).getHasgold().equals("")) {
				row.createCell(6).setCellValue(list.get(i).getHasgold()+"");
			}else {
				row.createCell(6).setCellValue(null+"");
			}
			
			if(list.get(i).getHasmoney()!=null&&!list.get(i).getHasmoney().equals("")) {
				row.createCell(7).setCellValue(list.get(i).getHasmoney()+"");
			}else {
				row.createCell(7).setCellValue(null+"");
			}
			
			if(list.get(i).getHasallmoney()!=null&&!list.get(i).getHasallmoney().equals("")) {
				row.createCell(8).setCellValue(list.get(i).getHasallmoney()+"");
			}else {
				row.createCell(8).setCellValue(null+"");
			}
			
		}
		
		//用当前时间给文件创建名称
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		String DateName = "金字塔收款表";
		
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
  	
    //批量删除
  	@RequestMapping("csNat")
  	@ResponseBody
  	public void csNat(HttpServletRequest request,HttpServletResponse response) {
	    try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	    response.setContentType("text/html;charset=UTF-8");
	    String[] dels = request.getParameterValues("des");//"des"为获取的前台数组 
	
	    if(dels.length>0){
		    //循环数组
		    for(int i=0;i<dels.length;i++) {
			   
			   int s_id=Integer.parseInt(dels[i]);
			 //  noticeService.getById(s_id);
			   gatheringService.remove(s_id);
			  // manageService.delNat(s_id);//单个删除的方法(自己的方法)
		    }
	    }
	    PrintWriter out = null;
	    try {
			out = response.getWriter();
		} catch (IOException e) {
			 e.printStackTrace();
		}
	  	out.print("{\"msg\":\"success\"}");
	}
  	
  	@RequestMapping("session")	
	@ResponseBody
	public String sess(HttpServletRequest request,Gathering gathering){
		request.getSession().setAttribute("Lift", gathering.getRealname());

		return "success";
	}
}
