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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.p2p.pojo.LogRecharge;
import com.p2p.pojo.Page;
import com.p2p.pojo.StayStill;
import com.p2p.pojo.UserMoney;
import com.p2p.service.StayStillService;

@Controller
@RequestMapping("/stayStill")
public class StayStillController {

	@Resource(name="stayStillServiceImpl")
	private StayStillService stayStillService;
	
	
	
	private int Total=0;//总数
	private int number=5;//条数
	private int pages=0;//页数
	private int CurrentPage=0;//当前页
	private int checks=0;////查询前后条数
	
	@RequestMapping("stayStill-list")
	public String getlist(Model model){
		
		Page page=new Page();
		page.setFist(checks);
		page.setTow(number);
		List<StayStill> list =stayStillService.selectpaging(page);
		
		
		Total=stayStillService.count();
		pages=(Total+number-1)/number;//页数
		
		List ll=new ArrayList<>();
		ll.add(Total);
		ll.add(pages);
	
	
		model.addAttribute("ll",ll);
		model.addAttribute("list", list);
		
		return "back/stay_still";
		
	}
	
	//分页
		@RequestMapping("stayStill-fy")
		public String  paging(Model model,StayStill stayStill){
			
			CurrentPage=stayStill.getId();//当前页
			int c=(CurrentPage-1)*number;//查询前后条数
			Page page1=new Page();
			page1.setFist(c);
			page1.setTow(number);
			page1.setTitle(stayStill.getUserName());
			page1.setPeople(stayStill.getTitle());

			List<StayStill> list=new ArrayList<>();
			if(stayStill.getUserName()==""&&stayStill.getTitle()==""){
				list=stayStillService.selectpaging(page1);
			}else {
				list=stayStillService.selectpeople(page1);
			}

			List<StayStill> lli=stayStillService.selectlike(page1);
			if(stayStill.getUserName()==""&&stayStill.getTitle()==""){
				Total=stayStillService.count();			
			}else{
				Total=lli.size();	
			}
			pages=(Total+number-1)/number;//页数
			String title1=stayStill.getUserName();
			String people=stayStill.getTitle();
						
			List ll=new ArrayList<>();
			ll.add(Total);
			ll.add(pages);
			ll.add(title1);
			ll.add(people);
			
			model.addAttribute("ll",ll);
			model.addAttribute("list",list);
			model.addAttribute("list2",CurrentPage);
			
			return "back/stay_still";
			
		}
	
		//模糊查询
		@RequestMapping("stayStill-mh")
		public String fent(Model model,StayStill stayStill,HttpServletRequest request){
		
		
			if(stayStill.getUserName()!=null&&stayStill.getUserName()!=""||stayStill.getTitle()!=null&&stayStill.getTitle()!=""){
				Page page=new Page();
				page.setFist(checks);
				page.setTow(number);
				page.setTitle(stayStill.getUserName());
				
				page.setPeople(stayStill.getTitle());
				
				List<StayStill> list=stayStillService.selectpeople(page);
				List<StayStill> list2= stayStillService.selectlike(page);//总条数
				Total=list2.size();
				pages=(Total+number-1)/number;//页数
				String title1=stayStill.getUserName();
				String people=stayStill.getTitle();
				List ll=new ArrayList<>();
				ll.add(Total);
				ll.add(pages);
				ll.add(title1);
				ll.add(people);
				model.addAttribute("ll",ll);
				
				model.addAttribute("list",list);
				return "back/stay_still";
			}

			return "redirect:/stayStill/stayStill-list";
		}
		
		
		@RequestMapping(value="stayStill-testsExport",produces = {"application/text;charset=UTF-8"})
		@ResponseBody
		public String exportExcle(StayStill stayStill,HttpServletRequest request) throws UnsupportedEncodingException{
			
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
			cell.setCellValue("lendId");
			cell.setCellStyle(style);
			cell=row.createCell((short) 2);
			cell.setCellValue("借款人");
			cell.setCellStyle(style);
			cell=row.createCell((short) 3);
			cell.setCellValue("真实姓名");
			cell.setCellStyle(style);
			cell=row.createCell((short) 4);
			cell.setCellValue("借款时间");
			cell.setCellStyle(style);
			cell=row.createCell((short) 5);
			cell.setCellValue("标的类型");
			cell.setCellStyle(style);
			cell=row.createCell((short) 6);
			cell.setCellValue("借款标题");
			cell.setCellStyle(style);
			cell=row.createCell((short) 7);
			cell.setCellValue("期数");
			cell.setCellStyle(style);
			cell=row.createCell((short) 8);
			cell.setCellValue("总期数");
			cell.setCellStyle(style);
			cell=row.createCell((short) 9);
			cell.setCellValue("应还时间");
			cell.setCellStyle(style);
			cell=row.createCell((short) 10);
			cell.setCellValue("实际还款时间");
			cell.setCellStyle(style);
			cell=row.createCell((short) 11);
			cell.setCellValue("待还金额");
			cell.setCellStyle(style);
			cell=row.createCell((short) 12);
			cell.setCellValue("已还罚息");
			cell.setCellStyle(style);
			cell=row.createCell((short) 13);
			cell.setCellValue("待还罚息");
			cell.setCellStyle(style);
			cell=row.createCell((short) 14);
			cell.setCellValue("待还金额");
			cell.setCellStyle(style);
			cell=row.createCell((short) 15);
			cell.setCellValue("逾期天数");
			cell.setCellStyle(style);
			cell=row.createCell((short) 16);
			cell.setCellValue("还款状态");
			cell.setCellStyle(style);
			cell=row.createCell((short) 17);
			cell.setCellValue("描述");
			cell.setCellStyle(style);
			Page page=new Page();
			page.setTitle(stayStill.getUserName());
			page.setPeople(stayStill.getTitle());
			
			List<StayStill> list=stayStillService.selectlike(page);
			
			for(short i=0;i<list.size();i++){
				row=sheet.createRow(i+1);
				row.createCell(0).setCellValue(list.get(i).getId());
				row.createCell(1).setCellValue(list.get(i).getLendId());
				row.createCell(2).setCellValue(list.get(i).getUserName());
				row.createCell(3).setCellValue(list.get(i).getRealName());
				if(list.get(i).getLendTime()!=null) {
					String time=(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(list.get(i).getLendTime());
					row.createCell(4).setCellValue(list.get(i).getLendTime());
				}else{
					row.createCell(4).setCellValue(null+"");
				}
				
				
				row.createCell(5).setCellValue(list.get(i).getType());
				row.createCell(6).setCellValue(list.get(i).getTitle());
				if(list.get(i).getStage()!=null){
					row.createCell(7).setCellValue(list.get(i).getStage());
				}else{
					row.createCell(7).setCellValue(0);
				}
				if(list.get(i).getStages()!=null){
					row.createCell(8).setCellValue(list.get(i).getStages());
				}else{
					row.createCell(8).setCellValue(0);
				}
				
				if(list.get(i).getStillTime()!=null) {
					String time1=(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(list.get(i).getStillTime());
					row.createCell(9).setCellValue(time1);
				}else{
					row.createCell(9).setCellValue(null+"");
				}
				if(list.get(i).getRealstillTime()!=null) {
					String time3=(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(list.get(i).getRealstillTime());
					row.createCell(10).setCellValue(time3);
				}else{
					row.createCell(10).setCellValue(null+"");
				}
				
				row.createCell(12).setCellValue(list.get(i).getHasFine()+"");
				row.createCell(13).setCellValue(list.get(i).getStayFine()+"");
				if(list.get(i).getStayDaly()!=null){
					row.createCell(14).setCellValue(list.get(i).getStayDaly());
				}else{
					row.createCell(14).setCellValue(null+"");
				}
				row.createCell(15).setCellValue(list.get(i).getStaystatus());
				row.createCell(16).setCellValue(list.get(i).getDescription());

			}
			
			String DateName = "金字塔逾期借款表";
			
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
		
		@RequestMapping("stayStill-upda")
		public String update(@RequestParam("id") Integer id){
			StayStill stayStill=new StayStill();
			stayStill.setId(id);
			stayStill.setStaystatus("已偿还");
			System.out.println("=id=="+stayStill.getId());
			stayStillService.update(stayStill);
			return "redirect:/stayStill/stayStill-list";
		}
		
}
