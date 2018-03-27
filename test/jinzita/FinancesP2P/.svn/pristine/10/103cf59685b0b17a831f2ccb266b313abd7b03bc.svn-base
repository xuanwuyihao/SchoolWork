package com.p2p.controller.back;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

import com.p2p.pojo.LendApply;
import com.p2p.pojo.LendBeckonmoney;
import com.p2p.pojo.LogMoney;
import com.p2p.pojo.Page;
import com.p2p.service.LendBeckonmoneyService;

@Controller
@RequestMapping("/lendbeckonmoney")
public class LendBeckonmoneyController {
	

	@Resource(name = "lendBeckonmoneyServiceImpl")
	private LendBeckonmoneyService frontService;

	@Resource(name = "lendBeckonmoneyServiceImpl")
	private LendBeckonmoneyService lendBeckonmoneyService;


	//后台标的信息显示
	@RequestMapping("/lendbeckonmoney-list")
	public String list(Model model,HttpServletRequest request) {
		List<LendBeckonmoney> list=lendBeckonmoneyService.list();
		for (LendBeckonmoney lendBeckonmoney : list) {
			System.out.println(lendBeckonmoney.toString());
		}
		int cont=lendBeckonmoneyService.count();
		int ye=4;//条数
		int xx=(cont+ye-1)/ye;//页数
		
		List ll=new ArrayList<>();
		ll.add(lendBeckonmoneyService.count());
		ll.add(xx);
		//session.setAttribute("ll", ll);
		model.addAttribute("list",list);
		model.addAttribute("ll",ll);
		return "back/lendbeckonmoney-list";
	}
	
    //删除
    @RequestMapping("lendbeckonmoney-delete") 
    @ResponseBody
    public String queryByName(LendBeckonmoney lBeckonmoney){
    	lendBeckonmoneyService.remove(lBeckonmoney.getId());
        return "success";
    }
    
	//分页
	@RequestMapping("lendbeckonmoney-fy")
	public String fent(Model model,LendBeckonmoney lBeckonmoney,HttpServletRequest request){
		
		if(lBeckonmoney.getTitle()!=""||lBeckonmoney.getType()!=""){
			int a=0;
			int b=4;//查询条数
			Page page=new Page();
			page.setFist(a);
			page.setTow(b);
			page.setPeople(lBeckonmoney.getType());
			page.setTitle(lBeckonmoney.getTitle());
			List<LendBeckonmoney> list=lendBeckonmoneyService.selectpeople(page);
			List<LendBeckonmoney> list2= lendBeckonmoneyService.selectlike(page);//总条数
			int cont=list2.size();
			int ye=b;
			int xx=(cont+ye-1)/ye;
			String title1=lBeckonmoney.getTitle();
			String people1=lBeckonmoney.getType();
			
			List ll=new ArrayList<>();
			ll.add(cont);
			ll.add(xx);
			ll.add(title1);
			ll.add(people1);
			model.addAttribute("ll",ll);
			
			model.addAttribute("list",list);
			return "back/lendbeckonmoney-list";
		}

		return "redirect:/lendbeckonmoney/lendbeckonmoney-list";
	}
	
	//分页
	@RequestMapping("text")
	//@ResponseBody
	public String  paging(Model model,Page page){
		int CurrentRoWnumber=4;//当前行数
		int CurrentPage=page.getCont();//当前页
		int c=(CurrentPage-1)*CurrentRoWnumber;//查询前后条数
		
		Page page1=new Page();
		page1.setFist(c);
		page1.setTow(CurrentRoWnumber);
		page1.setTitle(page.getTitle());
		page1.setPeople(page.getPeople());
		List<LendBeckonmoney> list=new ArrayList<>();
		if(page.getTitle()==""&&page.getPeople()==""){
			 list=lendBeckonmoneyService.selectpaging(page1);
		}else {

			list=lendBeckonmoneyService.selectpeople(page1);
		}

		List<LendBeckonmoney> lli=lendBeckonmoneyService.selectlike(page1);
		int cont=0;//总数
		if(page.getTitle()==""&&page.getPeople()==""){
			cont=lendBeckonmoneyService.count();			
		}else{
			cont=lli.size();	
		}
		int ye=CurrentRoWnumber;//行数
		int xx=(cont+ye-1)/ye;//页数
		String title1=page.getTitle();
		String people=page.getPeople();

		List ll=new ArrayList<>();
		ll.add(cont);
		ll.add(xx);
		ll.add(title1);
		ll.add(people);

		model.addAttribute("ll",ll);
		model.addAttribute("list",list);
		model.addAttribute("list2",CurrentPage);
		return "back/lendbeckonmoney-list";
		
	}
	
	@RequestMapping(value="testsExport",produces = {"application/text;charset=UTF-8"})
	@ResponseBody
	public String exportExcle(LendBeckonmoney lendBeckonmoney,HttpServletRequest request) throws UnsupportedEncodingException{
		
		//方法一：导出的数据中可以有空值
		HSSFWorkbook wb=new HSSFWorkbook();
		//表格下面的名称
		HSSFSheet sheet=wb.createSheet("所有借款");
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
		cell.setCellValue("货后管理员");
		cell.setCellStyle(style);
		cell=row.createCell((short) 4);
		cell.setCellValue("标的类型");
		cell.setCellStyle(style);
		cell=row.createCell((short) 5);
		cell.setCellValue("借款标题");
		cell.setCellStyle(style);
		cell=row.createCell((short) 6);
		cell.setCellValue("借款金额（￥元）");
		cell.setCellStyle(style);
		cell=row.createCell((short) 7);
		cell.setCellValue("利率");
		cell.setCellStyle(style);
		cell=row.createCell((short) 8);
		cell.setCellValue("借款期限");
		cell.setCellStyle(style);
		cell=row.createCell((short) 9);
		cell.setCellValue("筹标期限");
		cell.setCellStyle(style);
		cell=row.createCell((short) 10);
		cell.setCellValue("剩余可投");
		cell.setCellStyle(style);
		cell=row.createCell((short) 11);
		cell.setCellValue("状态");
		cell.setCellStyle(style);
		cell=row.createCell((short) 12);
		cell.setCellValue("还款方式");
		cell.setCellStyle(style);
		cell=row.createCell((short) 13);
		cell.setCellValue("融资管理费（￥元）");
		cell.setCellStyle(style);
		cell=row.createCell((short) 14);
		cell.setCellValue("订单号");
		cell.setCellStyle(style);
		cell=row.createCell((short) 15);
		cell.setCellValue("发布时间");
		cell.setCellStyle(style);
		
		Page page=new Page();
		page.setTitle(lendBeckonmoney.getTitle());
		page.setPeople(lendBeckonmoney.getType());
		
		List<LendBeckonmoney> list=lendBeckonmoneyService.selectlike(page);
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
			
			if(list.get(i).getPeople()!=null&&!list.get(i).getPeople().equals("")) {
				row.createCell(3).setCellValue(list.get(i).getPeople());
			}else {
				row.createCell(3).setCellValue(null+"");
			}
			
			if(list.get(i).getType()!=null&&!list.get(i).getType().equals("")) {
				row.createCell(4).setCellValue(list.get(i).getType());
			}else {
				row.createCell(4).setCellValue(null+"");
			}
			
			if(list.get(i).getTitle()!=null&&!list.get(i).getTitle().equals("")) {
				row.createCell(5).setCellValue(list.get(i).getTitle());
			}else {
				row.createCell(5).setCellValue(null+"");
			}

			if(list.get(i).getLendmoney()!=null&&!list.get(i).getLendmoney().equals("")) {
				row.createCell(6).setCellValue(list.get(i).getLendmoney()+"");
			}else {
				row.createCell(6).setCellValue(null+"");
			}
			
			if(list.get(i).getRate()!=null&&!list.get(i).getRate().equals("")) {
				row.createCell(7).setCellValue(list.get(i).getRate()+"");
			}else {
				row.createCell(7).setCellValue(null+"");
			}
			
			if(list.get(i).getLendtime()!=null&&!list.get(i).getLendtime().equals("")) {
				row.createCell(8).setCellValue(list.get(i).getLendtime()+"");
			}else {
				row.createCell(8).setCellValue(null+"");
			}
			
			if(list.get(i).getRaisetime()!=null&&!list.get(i).getRaisetime().equals("")) {
				row.createCell(9).setCellValue(list.get(i).getRaisetime());
			}else {
				row.createCell(9).setCellValue(null+"");
			}
			
			if(list.get(i).getHave_cast()!=null&&!list.get(i).getHave_cast().equals("")) {
				row.createCell(10).setCellValue(list.get(i).getHave_cast()+"");
			}else {
				row.createCell(10).setCellValue(null+"");
			}
			
			if(list.get(i).getHave_cast()!=null&&!list.get(i).getHave_cast().equals("")) {
				row.createCell(11).setCellValue(list.get(i).getStatus());
			}else {
				row.createCell(11).setCellValue(null+"");
			}
			
			if(list.get(i).getBack_type()!=null&&!list.get(i).getBack_type().equals("")) {
				row.createCell(12).setCellValue(list.get(i).getBack_type());
			}else {
				row.createCell(12).setCellValue(null+"");
			}
			
			if(list.get(i).getFinancing()!=null&&!list.get(i).getFinancing().equals("")) {
				row.createCell(13).setCellValue(list.get(i).getFinancing()+"");
			}else {
				row.createCell(13).setCellValue(null+"");
			}
			
			if(list.get(i).getBillcode()!=null&&!list.get(i).getBillcode().equals("")) {
				row.createCell(14).setCellValue(list.get(i).getBillcode());
			}else {
				row.createCell(14).setCellValue(null+"");
			}
			
			if(list.get(i).getReleasetime()!=null&&!list.get(i).getReleasetime().equals("")) {
				String time=(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(list.get(i).getReleasetime());
				row.createCell(15).setCellValue(time);
			}else {
				row.createCell(15).setCellValue(null+"");
			}
			
		}
		
		//用当前时间给文件创建名称
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		String DateName = "金字塔所有借款表";
		
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        response.setContentType("text/html;charset=UTF-8");
        String[] dels = request.getParameterValues("des");//"des"为获取的前台数组 

        if(dels.length>0){
	        //循环数组
	        for(int i=0;i<dels.length;i++) {
	    	   int s_id=Integer.parseInt(dels[i]);
	    	 //  frontService.getById(s_id);
	    	   lendBeckonmoneyService.remove(s_id);
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
	
	//后台招标中的借款显示
	@RequestMapping("/lendbeckon-list")
	public String list0(Model model,HttpServletRequest request) {
		List<LendBeckonmoney> list=lendBeckonmoneyService.list0();
		int cont=lendBeckonmoneyService.count0();
		int ye=4;//条数
		int xx=(cont+ye-1)/ye;//页数
		
		List ll=new ArrayList<>();
		ll.add(cont);
		ll.add(xx);
		//session.setAttribute("ll", ll);
		model.addAttribute("list",list);
		model.addAttribute("ll",ll);
		return "back/lendbeckon-list";
	}
	
	//分页
	@RequestMapping("lendbeckon-fy")
	public String fent0(Model model,LendBeckonmoney lBeckonmoney,HttpServletRequest request){
		
		if(lBeckonmoney.getTitle()!=""||lBeckonmoney.getType()!=""){
			int a=0;
			int b=4;//查询条数
			Page page=new Page();
			page.setFist(a);
			page.setTow(b);
			page.setPeople(lBeckonmoney.getType());
			page.setTitle(lBeckonmoney.getTitle());
			List<LendBeckonmoney> list=lendBeckonmoneyService.selectpeople0(page);
			List<LendBeckonmoney> list2= lendBeckonmoneyService.selectlike0(page);//总条数
			int cont=list2.size();
			int ye=b;
			int xx=(cont+ye-1)/ye;
			String title1=lBeckonmoney.getTitle();
			String people1=lBeckonmoney.getType();
			
			List ll=new ArrayList<>();
			ll.add(cont);
			ll.add(xx);
			ll.add(title1);
			ll.add(people1);
			model.addAttribute("ll",ll);
			
			model.addAttribute("list",list);
			return "back/lendbeckon-list";
		}

		return "redirect:/lendbeckonmoney/lendbeckon-list";
	}
	
	//分页
	@RequestMapping("text0")
	//@ResponseBody
	public String  paging0(Model model,Page page){
		int CurrentRoWnumber=4;//当前行数
		int CurrentPage=page.getCont();//当前页
		int c=(CurrentPage-1)*CurrentRoWnumber;//查询前后条数
		
		Page page1=new Page();
		page1.setFist(c);
		page1.setTow(CurrentRoWnumber);
		page1.setTitle(page.getTitle());
		page1.setPeople(page.getPeople());
		List<LendBeckonmoney> list=new ArrayList<>();
		if(page.getTitle()==""&&page.getPeople()==""){
			 list=lendBeckonmoneyService.selectpaging0(page1);
		}else {

			list=lendBeckonmoneyService.selectpeople0(page1);
		}

		List<LendBeckonmoney> lli=lendBeckonmoneyService.selectlike0(page1);
		int cont=0;//总数
		if(page.getTitle()==""&&page.getPeople()==""){
			cont=lendBeckonmoneyService.count0();			
		}else{
			cont=lli.size();	
		}
		int ye=CurrentRoWnumber;//行数
		int xx=(cont+ye-1)/ye;//页数
		String title1=page.getTitle();
		String people=page.getPeople();

		List ll=new ArrayList<>();
		ll.add(cont);
		ll.add(xx);
		ll.add(title1);
		ll.add(people);

		model.addAttribute("ll",ll);
		model.addAttribute("list",list);
		model.addAttribute("list2",CurrentPage);
		return "back/lendbeckon-list";
		
	}
	
	@RequestMapping(value="testsExport0",produces = {"application/text;charset=UTF-8"})
	@ResponseBody
	public String exportExcle0(LendBeckonmoney lendBeckonmoney,HttpServletRequest request) throws UnsupportedEncodingException{
		
		//方法一：导出的数据中可以有空值
		HSSFWorkbook wb=new HSSFWorkbook();
		//表格下面的名称
		HSSFSheet sheet=wb.createSheet("招标中的借款");
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
		cell.setCellValue("货后管理员");
		cell.setCellStyle(style);
		cell=row.createCell((short) 4);
		cell.setCellValue("标的类型");
		cell.setCellStyle(style);
		cell=row.createCell((short) 5);
		cell.setCellValue("借款标题");
		cell.setCellStyle(style);
		cell=row.createCell((short) 6);
		cell.setCellValue("借款金额（￥元）");
		cell.setCellStyle(style);
		cell=row.createCell((short) 7);
		cell.setCellValue("利率");
		cell.setCellStyle(style);
		cell=row.createCell((short) 8);
		cell.setCellValue("借款期限");
		cell.setCellStyle(style);
		cell=row.createCell((short) 9);
		cell.setCellValue("筹标期限");
		cell.setCellStyle(style);
		cell=row.createCell((short) 10);
		cell.setCellValue("剩余可投");
		cell.setCellStyle(style);
		cell=row.createCell((short) 11);
		cell.setCellValue("状态");
		cell.setCellStyle(style);
		cell=row.createCell((short) 12);
		cell.setCellValue("还款方式");
		cell.setCellStyle(style);
		cell=row.createCell((short) 13);
		cell.setCellValue("订单号");
		cell.setCellStyle(style);
		cell=row.createCell((short) 14);
		cell.setCellValue("发布时间");
		cell.setCellStyle(style);
		
		Page page=new Page();
		page.setTitle(lendBeckonmoney.getTitle());
		page.setPeople(lendBeckonmoney.getType());
		
		List<LendBeckonmoney> list=lendBeckonmoneyService.selectlike0(page);
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
			
			if(list.get(i).getPeople()!=null&&!list.get(i).getPeople().equals("")) {
				row.createCell(3).setCellValue(list.get(i).getPeople());
			}else {
				row.createCell(3).setCellValue(null+"");
			}
			
			if(list.get(i).getType()!=null&&!list.get(i).getType().equals("")) {
				row.createCell(4).setCellValue(list.get(i).getType());
			}else {
				row.createCell(4).setCellValue(null+"");
			}
			
			if(list.get(i).getTitle()!=null&&!list.get(i).getTitle().equals("")) {
				row.createCell(5).setCellValue(list.get(i).getTitle());
			}else {
				row.createCell(5).setCellValue(null+"");
			}

			if(list.get(i).getLendmoney()!=null&&!list.get(i).getLendmoney().equals("")) {
				row.createCell(6).setCellValue(list.get(i).getLendmoney()+"");
			}else {
				row.createCell(6).setCellValue(null+"");
			}
			
			if(list.get(i).getRate()!=null&&!list.get(i).getRate().equals("")) {
				row.createCell(7).setCellValue(list.get(i).getRate()+"");
			}else {
				row.createCell(7).setCellValue(null+"");
			}
			
			if(list.get(i).getLendtime()!=null&&!list.get(i).getLendtime().equals("")) {
				row.createCell(8).setCellValue(list.get(i).getLendtime()+"");
			}else {
				row.createCell(8).setCellValue(null+"");
			}
			
			if(list.get(i).getRaisetime()!=null&&!list.get(i).getRaisetime().equals("")) {
				row.createCell(9).setCellValue(list.get(i).getRaisetime());
			}else {
				row.createCell(9).setCellValue(null+"");
			}
			
			if(list.get(i).getHave_cast()!=null&&!list.get(i).getHave_cast().equals("")) {
				row.createCell(10).setCellValue(list.get(i).getHave_cast()+"");
			}else {
				row.createCell(10).setCellValue(null+"");
			}
			
			if(list.get(i).getHave_cast()!=null&&!list.get(i).getHave_cast().equals("")) {
				row.createCell(11).setCellValue(list.get(i).getStatus());
			}else {
				row.createCell(11).setCellValue(null+"");
			}
			
			if(list.get(i).getBack_type()!=null&&!list.get(i).getBack_type().equals("")) {
				row.createCell(12).setCellValue(list.get(i).getBack_type());
			}else {
				row.createCell(12).setCellValue(null+"");
			}
			
			if(list.get(i).getBillcode()!=null&&!list.get(i).getBillcode().equals("")) {
				row.createCell(13).setCellValue(list.get(i).getBillcode());
			}else {
				row.createCell(13).setCellValue(null+"");
			}
			
			if(list.get(i).getReleasetime()!=null&&!list.get(i).getReleasetime().equals("")) {
				String time=(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(list.get(i).getReleasetime());
				row.createCell(14).setCellValue(time);
			}else {
				row.createCell(14).setCellValue(null+"");
			}
			
		}
		
		//用当前时间给文件创建名称
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		String DateName = "金字塔招标中的借款表";
		
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
