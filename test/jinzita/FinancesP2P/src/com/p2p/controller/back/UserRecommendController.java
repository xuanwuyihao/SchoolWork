package com.p2p.controller.back;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
import com.p2p.pojo.LendApply;
import com.p2p.pojo.LendApplyInfo;
import com.p2p.pojo.Page;
import com.p2p.pojo.User;
import com.p2p.pojo.UserRecommend;
import com.p2p.service.UserRecommendService;

/*
 * 推荐人管理
 */
@Controller
@RequestMapping("/userRecommend")
public class UserRecommendController {
	@Resource(name = "userRecommendServiceImpl")
	private UserRecommendService userRecommendService;
	
	//遍历申请记录
	@RequestMapping("/userRecommend-list")
	public String lendList(Model model,HttpServletRequest request) {
		
		List<UserRecommend> list = userRecommendService.list();
		
		int cont=userRecommendService.count();
		int ye=7;//条数
		int xx=(cont+ye-1)/ye;//页数
		
		List ll=new ArrayList<>();
		ll.add(userRecommendService.count());
		ll.add(xx);
		
		model.addAttribute("list",list);
		model.addAttribute("ll",ll);
		return "back/userRecommend";
	}
	
	//去修改
	@RequestMapping("userRecommend-update")
	public String update(@RequestParam("id") Integer id,Model model){
		UserRecommend userRecommend=userRecommendService.getById(id);
		
		model.addAttribute("userRecommend", userRecommend);
		
		return "back/userRecommend-edit";
	}
	//修改
	@RequestMapping("lendApply-updateStates")
	@ResponseBody
	public String update2(UserRecommend userRecommend){
		userRecommendService.update(userRecommend);
		return "success";
	}

	//删除
	@RequestMapping("userRecommend-delter") 
	@ResponseBody
	public String queryByName(UserRecommend userRecommend){
		userRecommendService.remove(userRecommend.getId());
        return "success";
    }


	//模糊查询
	@RequestMapping("text")
	public String  paging(Model model,Page page){
		int CurrentRoWnumber=7;//当前行数
		int CurrentPage=page.getCont();//当前页
		int c=(CurrentPage-1)*CurrentRoWnumber;//查询前后条数
	
		Page page1=new Page();
		page1.setFist(c);
		page1.setTow(CurrentRoWnumber);
		page1.setTitle(page.getTitle());
		page1.setPeople(page.getPeople());
		List<UserRecommend> list=new ArrayList<>();
		if(page.getTitle()==""&&page.getPeople()==""){
			list=userRecommendService.selectpaging(page1);
		}else {

			list=userRecommendService.selectpeople(page1);
		}

		List<UserRecommend> lli=userRecommendService.selectlike(page1);
		int cont=0;//总数
		if(page.getTitle()==""&&page.getPeople()==""){
			cont=userRecommendService.count();			
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
  	
  		return "back/userRecommend";
  		
  	}
  	
    //分页
  	@RequestMapping("userRecommend-fy")
  	public String fent(Model model,UserRecommend userRecommend,HttpServletRequest request){
  		
  		if(userRecommend.getReferrername()!=""||userRecommend.getByreferrername()!=""){
  			int a=0;
  			int b=7;//查询条数
  			Page page=new Page();
  			page.setFist(a);
  			page.setTow(b);
  			page.setTitle(userRecommend.getReferrername());
  			page.setPeople(userRecommend.getByreferrername());
  			List<UserRecommend> list=userRecommendService.selectpeople(page);
  			List<UserRecommend> list2= userRecommendService.selectlike(page);//总条数
  			int cont=list2.size();
  			int ye=b;
  			int xx=(cont+ye-1)/ye;
  			String title1=userRecommend.getReferrername();
  			String people1=userRecommend.getByreferrername();
  			
  			List ll=new ArrayList<>();
  			ll.add(cont);
  			ll.add(xx);
  			ll.add(title1);
  			ll.add(people1);
  			model.addAttribute("ll",ll);
  			
  			model.addAttribute("list",list);
  			return "back/userRecommend";
  		}

  		return "redirect:/userRecommend/userRecommend-list";
  	}
  	
  	@RequestMapping(value="testsExport",produces = {"application/text;charset=UTF-8"})
	@ResponseBody
	public String exportExcle(UserRecommend userRecommend,HttpServletRequest request) throws UnsupportedEncodingException{
		
		//方法一：导出的数据中可以有空值
		HSSFWorkbook wb=new HSSFWorkbook();
		//表格下面的名称
		HSSFSheet sheet=wb.createSheet("推荐人管理");
		//每列的宽度
		sheet.setDefaultColumnWidth((short) 17);
		HSSFCellStyle style=wb.createCellStyle();
		HSSFRow row=sheet.createRow(0);
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		
		HSSFCell cell=row.createCell((short) 0);
		cell.setCellValue("ID");
		cell.setCellStyle(style);
		cell=row.createCell((short) 1);
		cell.setCellValue("推荐人姓名");
		cell.setCellStyle(style);
		cell=row.createCell((short) 2);
		cell.setCellValue("推荐人推荐码");
		cell.setCellStyle(style);
		cell=row.createCell((short) 3);
		cell.setCellValue("被推荐人姓名");
		cell.setCellStyle(style);
		cell=row.createCell((short) 4);
		cell.setCellValue("被推荐人推荐码");
		cell.setCellStyle(style);
		cell=row.createCell((short) 5);
		cell.setCellValue("奖励金额（￥元）");
		cell.setCellStyle(style);
		cell=row.createCell((short) 6);
		cell.setCellValue("奖励时间");
		cell.setCellStyle(style);
		
		Page page=new Page();
		page.setTitle(userRecommend.getReferrername());
		page.setPeople(userRecommend.getByreferrername());
		
		List<UserRecommend> list=userRecommendService.selectlike(page);
		for(short i=0;i<list.size();i++){
			row=sheet.createRow(i+1);
			row.createCell(0).setCellValue(list.get(i).getId());
			if(list.get(i).getReferrername()!=null&&!list.get(i).getReferrername().equals("")) {
				row.createCell(1).setCellValue(list.get(i).getReferrername());
			}else {
				row.createCell(1).setCellValue(null+"");
			}
			
			if(list.get(i).getReferrerno()!=null&&!list.get(i).getReferrerno().equals("")) {
				row.createCell(2).setCellValue(list.get(i).getReferrerno());
			}else {
				row.createCell(2).setCellValue(null+"");
			}
			
			if(list.get(i).getByreferrername()!=null&&!list.get(i).getByreferrername().equals("")) {
				row.createCell(3).setCellValue(list.get(i).getByreferrername());
			}else {
				row.createCell(3).setCellValue(null+"");
			}
			
			if(list.get(i).getByreferrerno()!=null&&!list.get(i).getByreferrerno().equals("")) {
				row.createCell(4).setCellValue(list.get(i).getByreferrerno());
			}else {
				row.createCell(4).setCellValue(null+"");
			}
			
			if(list.get(i).getAwardmoney()!=null&&!list.get(i).getAwardmoney().equals("")) {
				row.createCell(5).setCellValue(list.get(i).getAwardmoney()+"");
			}else {
				row.createCell(5).setCellValue(null+"");
			}
			
			if(list.get(i).getAwardtime()!=null&&!list.get(i).getAwardtime().equals("")) {
				String time=(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(list.get(i).getAwardtime());
				row.createCell(6).setCellValue(time);
			}else {
				row.createCell(6).setCellValue(null+"");
			}
			
		}
		
		//用当前时间给文件创建名称
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		String DateName = "金字塔推荐人管理表";
		
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
			   userRecommendService.remove(s_id);
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
}
