package com.p2p.controller.back;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.p2p.commons.DEBXInteresUtil;
import com.p2p.commons.DateUtil;
import com.p2p.commons.UtilDate;
import com.p2p.pojo.LendApply;
import com.p2p.pojo.LendApplyInfo;
import com.p2p.pojo.LendBeckonmoney;
import com.p2p.pojo.LogMoney;
import com.p2p.pojo.Page;
import com.p2p.pojo.Photo;
import com.p2p.pojo.User;
import com.p2p.pojo.UserInfo;
import com.p2p.service.LendApplyInfoService;
import com.p2p.service.LendApplyService;
import com.p2p.service.LendBeckonmoneyService;
import com.p2p.service.UserInfoService;
import com.p2p.service.UserService;

import jdk.nashorn.internal.ir.SetSplitState;

/**
 * 借款申请详情
 * @author Administrator
 *
 */
@Controller
@RequestMapping("lendApplyInfo")
public class LendApplyInfoController {

	@Resource(name="lendApplyInfoServiceImpl")
	private LendApplyInfoService lendApplyInfoService;
	
	@Resource(name="userInfoServiceImpl")
	private UserInfoService userInfoService;
	
	@Resource(name="userServiceImpl")
	private UserService userService;
	
	@Resource(name="lendBeckonmoneyServiceImpl")
	private LendBeckonmoneyService lendBeckonmoneyService;
	
	@Resource(name="lendApplyServiceImpl")
	private LendApplyService lendApplyService;
	
	

	//查询
	@RequestMapping("list")
	public String list(Model model,Page page,LendApplyInfo len) {
		
		List<LendApplyInfo> listone = lendApplyInfoService.list();
		
		int CurrentRoWnumber=5;//当前行数
		int CurrentPage = 0;
		System.out.println("page.getCont():"+page.getCont());
		if(page.getCont()==null) {
			 page.setCont(1);
			 CurrentPage = page.getCont();
			 System.out.println("=CurrentPage =="+CurrentPage );
		}else {
			CurrentPage=page.getCont();//当前页
		}
		
		int c=(CurrentPage-1)*CurrentRoWnumber;//查询前后条数
		System.out.println("--c--:"+c);
		int cont = listone.size();//总行数
		int xx=(cont+CurrentRoWnumber-1)/CurrentRoWnumber;//页数
		page.setFist(c);
		page.setTow(CurrentRoWnumber);
		List<LendApplyInfo> list = lendApplyInfoService.paging(page);
		System.out.println("--list--:"+list);
		System.out.println("--cont--:"+cont);
		
		
        for(LendApplyInfo lai:list) {
			
			String phone=lai.getUsername();
			User u = userService.getid(phone);
			Integer uid=u.getId();
			System.out.println("uid"+uid);
			UserInfo userinfo = userInfoService.getUserInfo(uid);
			
			lai.setOyh1(userinfo.getOyh1());
			
		}
        
     
		
		model.addAttribute("list",list);
		model.addAttribute("cont",cont);
		model.addAttribute("CurrentPage", CurrentPage);
		model.addAttribute("yeshu",xx);
		
		//===============================
	
		return "back/lendapplyinfo-list";
	}
	
	//去基本信息查询页面
	@RequestMapping("jiben")
	public String jiben(Model model,LendApplyInfo len) {
		System.out.println("进入");
		System.out.println("信息查询"+len.getUsername());
		String userName = len.getUsername();
		User list = userService.getid(userName);
		System.out.println("--user_id--:"+list.getId());
		UserInfo userinfo = userInfoService.getUserInfo(list.getId());
		System.out.println("userinfo--:"+userinfo.getOyh1());
		model.addAttribute("username", len.getUsername());
		model.addAttribute("userinfo",userinfo);
		return "back/lendapplyinfo-basic";
	}
	
	
	
	//修改基本信息
	@RequestMapping("updatebasic")
	@ResponseBody
	public String updatebasic(Model model,LendApplyInfo len,UserInfo info) {
		System.out.println("信息查询"+len.getUsername());
		System.out.println("Birthdate()"+info.getBirthdate());
		String userName = len.getUsername();
		String sta = "2";
		info.setOyh1(sta);
		User list = userService.getid(userName);
		UserInfo userinfo = userInfoService.getUserInfo(list.getId());
		userInfoService.update(info);
		
		return "success";
	} 
	
	//去资料列表页面
	@RequestMapping("ziliao")
	public String ziliao(LendApplyInfo len,Model model) {
		System.out.println("去资料页面");
		Integer id = len.getId();
		System.out.println("id"+id);
		LendApplyInfo lendApplyInfo = lendApplyInfoService.getById(id);
		System.out.println("lendApplyInfo.getOyh2()"+lendApplyInfo.getOyh2());
		model.addAttribute("lendApplyInfo", lendApplyInfo);
		return "back/lendapplyinfo-ziliao";
	}
	
	
	//修改文件
	@RequestMapping("text")
	@ResponseBody
	public String zz(HttpServletRequest request, String file,LendApplyInfo len) throws IllegalStateException, IOException {
		MultipartHttpServletRequest mh = (MultipartHttpServletRequest) request;
		
		List<MultipartFile> list = mh.getFiles(file);
		System.out.println("list大小..."+list.size());
		List<String> filePathList = new ArrayList<>();
		
		for (MultipartFile mf : list) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
			String newFileName = sdf.format(new Date());
			
			// 获取文件扩展名
			String originalFilename = mf.getOriginalFilename();
			String suffix = originalFilename.substring(originalFilename.lastIndexOf("."));
			
			// 获取上下文路径
			String contextPath = request.getSession().getServletContext().getRealPath("/photo/");
			contextPath = contextPath.replace("\\", "/");
			
			mf.transferTo(new File(contextPath + newFileName + suffix));
			
			// 图片的相对路径
			String relativePath = "photo/" + newFileName + suffix;
			
			filePathList.add(relativePath);
		
	
		}
		LendApplyInfo lend =new LendApplyInfo();
		lend.setId(len.getId());
		lend.setCardphoto(filePathList.get(0));
		lend.setLicense(filePathList.get(1));
		lend.setBackaccount(filePathList.get(2));
		String sta = "1";
		lend.setOyh2(sta);
		lendApplyInfoService.updatefile(lend);
		return "succees";
	}
	
	

	//查询资料文件
	@RequestMapping("listziliao")
	public String listziliao(LendApplyInfo len,Model model) {
		System.out.println("id:"+len.getId());
		LendApplyInfo list = lendApplyInfoService.listfile(len.getId());
		String lists = lendApplyInfoService.oyh(len.getId());
		System.out.println("-list1-:"+list);
		System.out.println("-lists-:"+lists);
		model.addAttribute("list",list);
		model.addAttribute("lists",lists);
		return "back/lendapplyinfo-ziliao";
	}
	
	
	//发布借款
	@RequestMapping("gojie")
	@ResponseBody
	public String gojie(LendApplyInfo len,Model model) {
		System.out.println("...id..."+len.getId());
		System.out.println("len.getStatus()"+len.getStatus());
		System.out.println("len.getOyh1()"+len.getOyh1());
		System.out.println("len.getOyh2()"+len.getOyh2());
		System.out.println("len.getUsername():"+len.getUsername());
		String ss = len.getOyh1();
		String zz = len.getOyh2();
		System.out.println("ss:"+ss);
		System.out.println("zz:"+zz);
		if(!ss.equals("2") && !zz.equals("1") ) {
			System.out.println("不通过");
			
			return "false";
		}
		if(ss.equals("0") && zz.equals("1")) {
			System.out.println("不通过");
			
			return "false";
		}
		//修改状态
		lendApplyInfoService.updatestatus(len);
		
		Date date = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		String userName = len.getUsername();
		User list = userService.getid(userName);
		System.out.println("--user_id--:"+list.getId());
		UserInfo userinfo = userInfoService.getUserInfo(list.getId());
		LendApply lendapply = lendApplyService.getusername(len.getUsername());
		DateUtil dateUtil = new DateUtil();
		LendBeckonmoney lenbeck = new LendBeckonmoney();
		lenbeck.setUsername(len.getUsername());//添加用户名
		lenbeck.setRealname(userinfo.getRealname());//添加真实姓名
		lenbeck.setPeople("李晶");//添加贷后管理员
		lenbeck.setType(lendapply.getTupe());//添加标的类型
		lenbeck.setTitle(lendapply.getTitle());//添加标的标题
		lenbeck.setLendmoney(lendapply.getLendmoney());//添加借款金额
		lenbeck.setRate(lendapply.getRate());//添加利率
        lenbeck.setLendtime(lendapply.getLendtime());//添加期限
        lenbeck.setRaisetime(5);//筹标期限
        lenbeck.setStatus("招标中");//状态

        lenbeck.setReleasetime(dateUtil.convert(sf.format(date)));//发布时间

        lenbeck.setBillcode(sf.format(date));//订单号
        lenbeck.setBack_type(lendapply.getBackType());//还款类型
        lenbeck.setHave_cast(lendapply.getLendmoney());//未投金额
        
      /*  String rate = "0.06";
        BigDecimal yrate = new BigDecimal(rate);
        BigDecimal ll =  lendapply.getLendmoney();
        BigDecimal db =  ll.multiply(yrate);
        System.out.println("融资管理费："+db);*/
        
        lenbeck.setFinancing(new BigDecimal(200));//融资管理费

        lendBeckonmoneyService.save(lenbeck);
		return "success";
	}
	
	
	//去新增页面
	@RequestMapping("goadd")
	public String goadd() {
		
		System.out.println("去新增");
		return "back/lendapplyinfo-add";
	}
	
	
	//==新增==
	@RequestMapping("add")
	@ResponseBody
	public String save(Model model,LendApplyInfo len) {
		System.out.println("len.getUsername()"+len.getUsername()); 
		System.out.println("len.getLendmoney()"+len.getLendmoney()); 
	 lendApplyInfoService.save(len);
		return "success";
	}
	
	//去编辑页面
	@RequestMapping("goup")
	public String goup(LendApplyInfo len,Model model) {
	
		System.out.println("去编辑的id--"+len.getId());
		Integer id = len.getId();
		LendApplyInfo lendApplyInfo = lendApplyInfoService.getById(id);
		model.addAttribute("lendApplyInfo", lendApplyInfo);
		return "back/lendapplyinfo-edit";
	}
	
	
	//编辑
	@RequestMapping("update")
	@ResponseBody
	public String update(LendApplyInfo len,Model model) {
		
		System.out.println("len.getId();"+len.getId());
		System.out.println("len.getUsername();"+len.getUsername());
		System.out.println("getLendmoney();"+len.getLendmoney());
		lendApplyInfoService.update(len);;
		
		return "success";
	}
	
	//删除
	@RequestMapping("delete")
	@ResponseBody
	public String del(LendApplyInfo len) {
		int id = len.getId();
		System.out.println("--id--"+id);
		lendApplyInfoService.remove(id);
		
		return "success";
	}
	
	
	
	
	//模糊查询
	@RequestMapping("mohu")
	public String mohu(Model model,LendApplyInfo len,HttpServletRequest request,Page page) {
		System.out.println("=名字=:"+len.getUsername());
		System.out.println("=金额=:"+len.getLendmoney());
		if(len.getUsername()!=""||len.getLendmoney()!=null){
			
			List<LendApplyInfo> list2= lendApplyInfoService.selectlike();//总条数
			int CurrentRoWnumber=5;//当前行数
			int CurrentPage = 0;

			
			if(page.getCont()==null) {
				 page.setCont(1);
				 CurrentPage = page.getCont();
			}else {
				CurrentPage=page.getCont();//当前页
		
			}
			
			int c=(CurrentPage-1)*CurrentRoWnumber;//查询前后条数
			int cont = list2.size();//总行数
			int xx=(cont+CurrentRoWnumber-1)/CurrentRoWnumber;//页数
			
		
			page.setFist(c);
			page.setTow(CurrentRoWnumber);
			page.setPeople(len.getUsername());
			page.setMoney(len.getLendmoney());
			
			List<LendApplyInfo> list=lendApplyInfoService.selectpeople(page);
			List<LendApplyInfo> listfou = lendApplyInfoService.selectcont(page);
			cont =	listfou.size();
				
			String username = len.getUsername();
			BigDecimal lendmoney = len.getLendmoney();
			
			model.addAttribute("cont",cont);
			model.addAttribute("CurrentPage", CurrentPage);
			model.addAttribute("yeshu",xx);
			model.addAttribute("username", username);
			model.addAttribute("lendmoney", lendmoney);
			model.addAttribute("list",list);
			return "back/lendapplyinfo-list";
		}
		
		return "redirect:/lendApplyInfo/list";
	}
	
	//导出
	@RequestMapping(value="exportt",produces = {"application/text;charset=UTF-8"})
	@ResponseBody
	public String exportt(LendApplyInfo len,HttpServletRequest request) {
		
		HSSFWorkbook hw = new HSSFWorkbook();
		
		HSSFSheet sheet = hw.createSheet("融资申请审核详情");
		
		sheet.setDefaultColumnWidth((short) 17);
		HSSFCellStyle style = hw.createCellStyle();
		HSSFRow row = sheet.createRow(0);
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		
		HSSFCell cell = row.createCell((short) 0);
		cell.setCellValue("ID");
		cell.setCellStyle(style);
		cell = row.createCell((short) 1);
		cell.setCellValue("用户名");
		cell.setCellStyle(style);
		cell = row.createCell((short) 2);
		cell.setCellValue("募集资金");
		cell.setCellStyle(style);
		cell = row.createCell((short) 3);
		cell.setCellValue("预期年化收益");
		cell.setCellStyle(style);
		cell = row.createCell((short) 4);
		cell.setCellValue("起息日期");
		cell.setCellStyle(style);
		cell = row.createCell((short) 5);
		cell.setCellValue("资金用途");
		cell.setCellStyle(style);
		cell = row.createCell((short) 6);
		cell.setCellValue("收益方式");
		cell.setCellStyle(style);
		cell = row.createCell((short) 7);
		cell.setCellValue("还款来源");
		cell.setCellStyle(style);
		cell = row.createCell((short) 8);
		cell.setCellValue("借款人介绍");
		cell.setCellStyle(style);
		cell = row.createCell((short) 9);
		cell.setCellValue("项目描述");
		cell.setCellStyle(style);
		cell = row.createCell((short) 10);
		cell.setCellValue("保障措施");
		cell.setCellStyle(style);
		cell = row.createCell((short) 11);
		cell.setCellValue("银行账户");
		cell.setCellStyle(style);
		cell = row.createCell((short) 12);
		cell.setCellValue("其他资料");
		cell.setCellStyle(style);
		cell = row.createCell((short) 13);
		cell.setCellValue("审核通过时间");
		cell.setCellStyle(style);
		cell = row.createCell((short) 14);
		cell.setCellValue("状态");
		cell.setCellStyle(style);
		
		Page page=new Page();
		page.setPeople(len.getUsername());
		page.setMoney(len.getLendmoney());
		System.out.println("len.getUsername()"+len.getUsername());
		System.out.println("len.getLendmoney()"+len.getLendmoney());
		List<LendApplyInfo> list=lendApplyInfoService.selectcont(page);
		System.out.println("大小:"+list.size());
		for(short i=0;i<list.size();i++){
			row=sheet.createRow(i+1);
			row.createCell(0).setCellValue(list.get(i).getId());
			if(list.get(i).getUsername()!=null&&!list.get(i).getUsername().equals("")) {
				row.createCell(1).setCellValue(list.get(i).getUsername());
			}else {
				row.createCell(1).setCellValue(null+"");
			}
			
			if(list.get(i).getLendmoney()!=null&&!list.get(i).getLendmoney().equals("")) {
				
				row.createCell(2).setCellValue(list.get(i).getLendmoney()+"");
			}else {
				row.createCell(2).setCellValue(null+"");
			}
			
			if(list.get(i).getRate()!=null&&!list.get(i).getRate().equals("")) {
				row.createCell(3).setCellValue(list.get(i).getRate()+"");
			}else {
				row.createCell(3).setCellValue(null+"");
			}
			
			if(list.get(i).getHastime()!=null&&!list.get(i).getHastime().equals("")) {
				String time=(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(list.get(i).getHastime());
				row.createCell(4).setCellValue(time);
			}else {
				row.createCell(4).setCellValue(null+"");
			}
			
			if(list.get(i).getMoneypurpose()!=null&&!list.get(i).getMoneypurpose().equals("")) {
				row.createCell(5).setCellValue(list.get(i).getMoneypurpose()+"");
			}else {
				row.createCell(5).setCellValue(null+"");
			}
			if(list.get(i).getBacktype()!=null&&!list.get(i).getBacktype().equals("")) {
				row.createCell(6).setCellValue(list.get(i).getBacktype()+"");
			}else {
				row.createCell(6).setCellValue(null+"");
			}
			if(list.get(i).getStillsoure()!=null&&!list.get(i).getStillsoure().equals("")) {
				row.createCell(7).setCellValue(list.get(i).getStillsoure()+"");
			}else {
				row.createCell(7).setCellValue(null+"");
			}
			if(list.get(i).getIntroduce()!=null&&!list.get(i).getIntroduce().equals("")) {
				row.createCell(8).setCellValue(list.get(i).getIntroduce()+"");
			}else {
				row.createCell(8).setCellValue(null+"");
			}
			if(list.get(i).getDescription()!=null&&!list.get(i).getDescription().equals("")) {
				row.createCell(9).setCellValue(list.get(i).getDescription()+"");
			}else {
				row.createCell(9).setCellValue(null+"");
			}
			if(list.get(i).getEnsure()!=null&&!list.get(i).getEnsure().equals("")) {
				row.createCell(10).setCellValue(list.get(i).getEnsure()+"");
			}else {
				row.createCell(10).setCellValue(null+"");
			}
			if(list.get(i).getBackaccount()!=null&&!list.get(i).getBackaccount().equals("")) {
				row.createCell(11).setCellValue(list.get(i).getBackaccount()+"");
			}else {
				row.createCell(11).setCellValue(null+"");
			}
			if(list.get(i).getOther()!=null&&!list.get(i).getOther().equals("")) {
				row.createCell(12).setCellValue(list.get(i).getOther()+"");
			}else {
				row.createCell(12).setCellValue(null+"");
			}
			if(list.get(i).getAdopttime()!=null&&!list.get(i).getAdopttime().equals("")) {
				String time=(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(list.get(i).getAdopttime());
				row.createCell(13).setCellValue(time);
			}else {
				row.createCell(13).setCellValue(null+"");
			}
			if(list.get(i).getStatus()!=null&&!list.get(i).getStatus().equals("")) {
				row.createCell(14).setCellValue(list.get(i).getStatus()+"");
			}else {
				row.createCell(14).setCellValue(null+"");
			}
			}
		
		
		//用当前时间给文件创建名称
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		String DateName = "融资申请审核详情";
		
		//获取项目中存放Excel文件的xls文件夹的绝对路径
		String contextPath = request.getSession().getServletContext().getRealPath("/xls/");
		contextPath = contextPath.replace("\\", "/");
		
		//下载到项目文件夹中完整路径和文件名称
		String fileName=contextPath+DateName+".xls";

		try {
			 
			//文件创建的路径地址和名称
			FileOutputStream out=new FileOutputStream(fileName);
			hw.write(out);
			hw.close();
		} catch (Exception e) {
			e.printStackTrace();
			return "失败";
		}
		
		
		String fName=DateName+".xls";
		
		return fName;
	}
}
