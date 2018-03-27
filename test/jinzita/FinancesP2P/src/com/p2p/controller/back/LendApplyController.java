package com.p2p.controller.back;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.text.ParseException;
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
import com.p2p.pojo.LendBeckonmoney;
import com.p2p.pojo.Page;
import com.p2p.pojo.User;
import com.p2p.service.LendApplyService;
import com.p2p.service.LendBeckonmoneyService;

/**
 * 借款记录的Controller
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/lendApply")
public class LendApplyController {
	
	@Resource(name = "lendApplyServiceImpl")
	private LendApplyService lendApplyService;

	@Resource(name = "lendBeckonmoneyServiceImpl")
	private LendBeckonmoneyService lendBeckonmoneyService;
	
	
	//遍历申请记录
	@RequestMapping("/list")
	public String lendList(Model model,HttpServletRequest request) {
		
		List<LendApply> list = lendApplyService.list();
		
		int cont=lendApplyService.count();
		int ye=7;//条数
		int xx=(cont+ye-1)/ye;//页数
		
		List ll=new ArrayList<>();
		ll.add(lendApplyService.count());
		ll.add(xx);
		
		model.addAttribute("list",list);
		model.addAttribute("ll",ll);
		return "back/lendapply-list";
	}
	
	
	//新增一条申请记录
	@RequestMapping("lendApply-add")
	@ResponseBody
	public String lendSave(HttpSession session, LendApply lendApply) {
		User user = (User) session.getAttribute("user");
		System.out.println("用户信息："+user.toString());
		String province = lendApply.getTitle();
		String city = lendApply.getBackType();
//		lendApply.setTitle("");
//		lendApply.setBackType("");
		DateUtil du = new DateUtil();
		String time = new Date().toLocaleString();
		//当前申请时间
		lendApply.setApplytime(du.convert(time));
		//当前申请用户
		lendApply.setUsername(user.getPhone());
		lendApply.setBackType("等额本息");
		
		int a = (int)(Math.random()*(9999-1000+1))+1000;
		//标类型
		if(lendApply.getLendmoney() == null) {
			lendApply.setTupe("信用标");
			lendApply.setTitle("YXYB"+a);
		}else {
			lendApply.setTupe("抵押标");
			lendApply.setTitle("YDYB"+a);
		}
		lendApply.setStatus("未处理");
		lendApply.setRate(new BigDecimal("12"));
		
		lendApplyService.save(lendApply);
		
		return "success";
	}
	

		
	//去修改
	@RequestMapping("lendApply-update")
	public String update(@RequestParam("id") Integer id,Model model){
		LendApply lendApply=lendApplyService.getById(id);
		
		model.addAttribute("lendApply", lendApply);
		
		return "back/lendapply-edit";
	}
	//修改
//	@RequestMapping("lendApply-updateStates")
//	@ResponseBody
//	public String update2(LendApply lendApply){
//		lendApplyService.update(lendApply);
//		return "success";
//	}
	//修改
	@RequestMapping("lendApply-update2")
	@ResponseBody
	public String update2(LendApply lendApply){
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			lendApply.setApplytime(sdf.parse(lendApply.getOyh1()));
			lendApply.setOyh1("");
			System.out.println("借款状态："+lendApply.getStatus());
			if (lendApply.getStatus().equals("已处理")) {
				System.out.println("已处理");
				String province = lendApply.getTitle();
				String city = lendApply.getBackType();
				
				LendApplyInfo lendApplyInfo = new LendApplyInfo();
				lendApplyInfo.setUsername(lendApply.getPhone());
				lendApplyInfo.setLendmoney(lendApply.getLendmoney());
				lendApplyInfo.setRate(new BigDecimal("12"));
				lendApplyInfo.setOther(province+city);
				lendApplyInfo.setStatus("未审核");
				lendApplyInfo.setOyh2("0");
				lendApplyService.saveInfo(lendApplyInfo);
				lendApplyService.update(lendApply);
			}else {
				System.out.println("未处理");
				lendApplyService.update(lendApply);
			}
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "success";
	}

	//删除
	@RequestMapping("delter") 
	@ResponseBody
	public String queryByName(LendApply lendApply){
		lendApplyService.remove(lendApply.getId());
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
		List<LendApply> list=new ArrayList<>();
		if(page.getTitle()==""&&page.getPeople()==""){
			list=lendApplyService.selectpaging(page1);
		}else {
			list=lendApplyService.selectpeople(page1);
		}

		List<LendApply> lli=lendApplyService.selectlike(page1);
		int cont=0;//总数
		if(page.getTitle()==""&&page.getPeople()==""){
			cont=lendApplyService.count();			
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
  	
  		return "back/lendapply-list";
  		
  	}
  	
    //分页
  	@RequestMapping("lendApply-fy")
  	public String fent(Model model,LendApply lendApply,HttpServletRequest request){
  		
  		System.out.println("lendApply.getUsername():"+lendApply.getUsername());
  		System.out.println("lendApply.getgetRealname():"+lendApply.getRealname());
  		if(lendApply.getUsername()!=""||lendApply.getRealname()!=""){
  			int a=0;
  			int b=7;//查询条数
  			Page page=new Page();
  			page.setFist(a);
  			page.setTow(b);
  			page.setTitle(lendApply.getUsername());
  			page.setPeople(lendApply.getRealname());
  			List<LendApply> list=lendApplyService.selectpeople(page);
  			List<LendApply> list2= lendApplyService.selectlike(page);//总条数
  			int cont=list2.size();
  			System.out.println("数量:"+cont);
  			int ye=b;
  			int xx=(cont+ye-1)/ye;
  			String title1=lendApply.getUsername();
  			String people1=lendApply.getRealname();
  			
  			List ll=new ArrayList<>();
  			ll.add(cont);
  			ll.add(xx);
  			ll.add(title1);
  			ll.add(people1);
  			model.addAttribute("ll",ll);
  			
  			model.addAttribute("list",list);
  			return "back/lendapply-list";
  		}

  		return "redirect:/lendApply/list";
  	}
  	
  	@RequestMapping(value="testsExport",produces = {"application/text;charset=UTF-8"})
	@ResponseBody
	public String exportExcle(LendApply lendApply,HttpServletRequest request) throws UnsupportedEncodingException{
		
		//方法一：导出的数据中可以有空值
		HSSFWorkbook wb=new HSSFWorkbook();
		//表格下面的名称
		HSSFSheet sheet=wb.createSheet("借款申请");
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
		cell.setCellValue("联系电话");
		cell.setCellStyle(style);
		cell=row.createCell((short) 4);
		cell.setCellValue("性别");
		cell.setCellStyle(style);
		cell=row.createCell((short) 5);
		cell.setCellValue("标的类型）");
		cell.setCellStyle(style);
		cell=row.createCell((short) 6);
		cell.setCellValue("借款金额（￥元）");
		cell.setCellStyle(style);
		cell=row.createCell((short) 7);
		cell.setCellValue("借款标题");
		cell.setCellStyle(style);
		cell=row.createCell((short) 8);
		cell.setCellValue("利率");
		cell.setCellStyle(style);
		cell=row.createCell((short) 9);
		cell.setCellValue("借款期限");
		cell.setCellStyle(style);
		cell=row.createCell((short) 10);
		cell.setCellValue("申请时间");
		cell.setCellStyle(style);
		cell=row.createCell((short) 11);
		cell.setCellValue("还款方式");
		cell.setCellStyle(style);
		cell=row.createCell((short) 12);
		cell.setCellValue("审核状态");
		cell.setCellStyle(style);
		
		System.out.println("lendApply:+++"+lendApply.getUsername()+"-----"+lendApply.getRealname());
		Page page=new Page();
		page.setTitle(lendApply.getUsername());
		page.setPeople(lendApply.getRealname());
		System.out.println("page:+++"+page.getTitle()+"-----"+page.getPeople());
		
		List<LendApply> list=lendApplyService.selectlike(page);
		System.out.println("数量:"+list.size());
//		List<LendApply> list=lendApplyService.list0();
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
			
			if(list.get(i).getPhone()!=null&&!list.get(i).getPhone().equals("")) {
				row.createCell(3).setCellValue(list.get(i).getPhone());
			}else {
				row.createCell(3).setCellValue(null+"");
			}
			
			if(list.get(i).getSex()!=null&&!list.get(i).getSex().equals("")) {
				row.createCell(4).setCellValue(list.get(i).getSex());
			}else {
				row.createCell(4).setCellValue(null+"");
			}
			
			if(list.get(i).getTupe()!=null&&!list.get(i).getTupe().equals("")) {
				row.createCell(5).setCellValue(list.get(i).getTupe());
			}else {
				row.createCell(5).setCellValue(null+"");
			}
			
			if(list.get(i).getLendmoney()!=null&&!list.get(i).getLendmoney().equals("")) {
				row.createCell(6).setCellValue(list.get(i).getLendmoney()+"");
			}else {
				row.createCell(6).setCellValue(null+"");
			}
			
			if(list.get(i).getTitle()!=null&&!list.get(i).getTitle().equals("")) {
				row.createCell(7).setCellValue(list.get(i).getTitle());
			}else {
				row.createCell(7).setCellValue(null+"");
			}
			
			if(list.get(i).getRate()!=null&&!list.get(i).getRate().equals("")) {
				row.createCell(8).setCellValue(list.get(i).getRate()+"");
			}else {
				row.createCell(8).setCellValue(null+"");
			}
			
			if(list.get(i).getLendtime()!=null&&!list.get(i).getLendtime().equals("")) {
				row.createCell(9).setCellValue(list.get(i).getLendtime()+"");
			}else {
				row.createCell(9).setCellValue(null+"");
			}
			
			if(list.get(i).getApplytime()!=null&&!list.get(i).getApplytime().equals("")) {
				String time=(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(list.get(i).getApplytime());
				row.createCell(10).setCellValue(time);
			}else {
				row.createCell(10).setCellValue(null+"");
			}
			
			if(list.get(i).getBackType()!=null&&!list.get(i).getBackType().equals("")) {
				row.createCell(11).setCellValue(list.get(i).getBackType());
			}else {
				row.createCell(11).setCellValue(null+"");
			}
			
			if(list.get(i).getStatus()!=null&&!list.get(i).getStatus().equals("")) {
				row.createCell(12).setCellValue(list.get(i).getStatus());
			}else {
				row.createCell(12).setCellValue(null+"");
			}
		}
		
		//用当前时间给文件创建名称
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		String DateName = "金字塔借款申请表";
		
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
			   lendApplyService.remove(s_id);
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
  	
  	@RequestMapping("lendApply-len")
  	@ResponseBody
  	public String len(LendApply lendApply){

  		
  		LendBeckonmoney len=new LendBeckonmoney();
  		len.setUsername(lendApply.getUsername());
  		
  		LendApply lendApply1=new LendApply();
  		lendApply1.setUsername(lendApply.getUsername());
  		
  		LendApplyInfo lendApplyInfo=new LendApplyInfo();
  		lendApplyInfo.setUsername(lendApply.getUsername());
  		
  		List<LendBeckonmoney> list=lendBeckonmoneyService.getList(len);
  		List<LendApply> Llist= lendBeckonmoneyService.getLend(lendApply1);
  		List<LendApplyInfo> Llist_info=lendBeckonmoneyService.getLend_info(lendApplyInfo);
  		
  	
  		if(list.size()==0&&Llist.size()==0&&Llist_info.size()==0){
  			return "success";
  		}else if(Llist.size()!=0&&list.size()==0&&Llist_info.size()==0){//提交了申请
  			return "error1";
  		}else if(Llist_info.size()!=0&&Llist.size()==0&&list.size()==0){//正在审核
  			return "error2";
  		}
//  		if(list.size()!=0&&Llist.size()==0&&Llist_info.size()==0){//正在招标
  		return "error3";
  		
  		
  		
  	}
}
