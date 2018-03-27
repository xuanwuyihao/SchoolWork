package com.p2p.controller.back;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;

import org.apache.struts2.ServletActionContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.p2p.pojo.Page;
import com.p2p.commons.StillExportExcel;
import com.p2p.pojo.Fy;
import com.p2p.pojo.Gathering;
import com.p2p.pojo.Photo;
import com.p2p.pojo.Still;
import com.p2p.pojo.User;
import com.p2p.service.ManagerService;
import com.p2p.service.PhotoService;
import com.sun.java_cup.internal.runtime.Symbol;



@Controller
@RequestMapping("/photo")
public class PhotoController {

	@Resource(name="photoServiceImpl")
	private PhotoService photoService;
	
	@RequestMapping("/list")
	public String list(Model model,  String currentPage, String page) {
		Integer rows = 3;
		Integer current = 0;
		if(currentPage != null && page != null) {
			rows = Integer.parseInt(page);
			current = (Integer.parseInt(currentPage)-1)*rows;
		}
		Page pa = new Page();
		pa.setFist(current);
		pa.setTow(rows);
		List<Photo> p=photoService.list();
		List<Photo> photos = photoService.pagingSelect(pa);
		//总页数
		Integer pages =  (p.size() + pa.getTow() - 1) / pa.getTow();
	    model.addAttribute("photoList",photos);
	    System.out.println("大小:"+photos.size());
	    model.addAttribute("count",p.size());
	    model.addAttribute("current",currentPage);
	    model.addAttribute("pages",pages);
	    model.addAttribute("pageSize",rows);
		
		return "back/banner-list";
	}
	
	
	@RequestMapping("/file")
	public @ResponseBody String upload(HttpServletRequest request,String fileName,String link,String desc) throws IOException {
		MultipartHttpServletRequest mh = (MultipartHttpServletRequest) request;
		// 根据文件名称获取文件对象
		System.out.println("添加");
		CommonsMultipartFile cm = (CommonsMultipartFile) mh.getFile(fileName);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		String newFileName = sdf.format(new Date());
       
		// 获取文件扩展名
		String originalFilename = cm.getOriginalFilename();
		String suffix = originalFilename.substring(originalFilename.lastIndexOf("."));
		// 获取上下文路径
//		String contextPath = "F:\\Workspace2\\FinancesP2P\\WebContent\\photo\\";
		String contextPath = request.getSession().getServletContext().getRealPath("/photo/");
		contextPath = contextPath.replace("\\", "/");
		
		// 文件上传
		cm.transferTo(new File(contextPath + newFileName + suffix));

		// 图片的相对路径
		String relativePath = "photo/" + newFileName + suffix;

		// 返回上传图片的相对路径
		String jsonStr = "{\"relativePath\" : \"" + relativePath + "\"}";

		
		String lk = link.substring(0,link.indexOf(","));
		
		String ds = desc.substring(0,desc.indexOf(","));
		
		Photo p=new Photo();
	    p.setPhoto(relativePath);
	    p.setLink(lk);
	    p.setDescription(ds);    
	    
	    photoService.save(p);
	    	
		return "success";
	}
	
	
	@RequestMapping("/remove")
	@ResponseBody
	public String remove(@RequestParam("id") Integer id) {
		
		
		photoService.remove(id);
	
		return "success";
	}
	
	@RequestMapping("/banner-edit/{id}")
	public String banneredit(Model model,@PathVariable("id") Integer id) {
		
		System.out.println("修改");
		
		Photo p=photoService.getById(id);
	
		model.addAttribute("photo",p);
		
		return "back/banner-edit";
	}
	
	
	@RequestMapping("/updatep")
	public @ResponseBody String updatep(HttpServletRequest request,String fileName,String link,String desc,String id) throws IOException {
		
	    
	    if(fileName!=null) {//修改了图片
	    	
	    	MultipartHttpServletRequest mh = (MultipartHttpServletRequest) request;
			// 根据文件名称获取文件对象
			CommonsMultipartFile cm = (CommonsMultipartFile) mh.getFile(fileName);
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
			String newFileName = sdf.format(new Date());

			// 获取文件扩展名
			String originalFilename = cm.getOriginalFilename();
			String suffix = originalFilename.substring(originalFilename.lastIndexOf("."));
			
			// 获取上下文路径
			String contextPath = request.getSession().getServletContext().getRealPath("/photo/");
			contextPath = contextPath.replace("\\", "/");
			
			// 文件上传
			cm.transferTo(new File(contextPath + newFileName + suffix));

			// 图片的相对路径
			String relativePath = "photo/" + newFileName + suffix;

			// 返回上传图片的相对路径
			String jsonStr = "{\"relativePath\" : \"" + relativePath + "\"}";

			
			String lk = link.substring(0,link.indexOf(","));
			
			String ds = desc.substring(0,desc.indexOf(","));
			
			String pid =id.substring(0,id.indexOf(","));
			
			Integer p_id=Integer.parseInt(pid);
			
			Photo p=new Photo();
			p.setId(p_id);
		    p.setPhoto(relativePath);
		    p.setLink(lk);
		    p.setDescription(ds);    
		    
		    photoService.update(p);
	    	
	    }else {
	    	
	    	String lk = link.substring(0,link.indexOf(","));
			
			String ds = desc.substring(0,desc.indexOf(","));
			
			String pid =id.substring(0,id.indexOf(","));
			
			Integer p_id=Integer.parseInt(pid);
			
			Photo p=new Photo();
			p.setId(p_id);
		    p.setLink(lk);
		    p.setDescription(ds);    
		    
		    photoService.update1(p);
	    	
	    	
	    }
	    
			
		return "success";
	}
	
	
	@RequestMapping("/updatep1")
	public @ResponseBody String updatep1(String id,String status) {
		
		Integer pid=Integer.parseInt(id);
		
		Photo p=new Photo();
		p.setId(pid);
		p.setStatus(status);
		
		photoService.update2(p);
		
		return "success";
	}
	
	@RequestMapping("/still-list")
    public String stilList(Model model) {
		
		
		Fy f=new Fy();
		f.setDq(0);
		f.setMygs(6);
		List<Still> sti=photoService.pageList(f);//真正
		
		List<Still> st=photoService.StList();//大小
		
		int count=st.size();
		
		model.addAttribute("still",sti);
		model.addAttribute("count",count);
		
		int page=count/6;
		if(count%6!=0) {
			
			page=count/6+1;
		}
		
		
		model.addAttribute("page",page);
		model.addAttribute("dqy",1);
		
		return "back/still-list";
	}
	
	
	@RequestMapping("/fy")
	public String page(Model model,String mygs,String dqy) {
		
		
			//总数据
			List<Still> s=photoService.StList();
	        int count=s.size();
			model.addAttribute("count",count);
			
			int page=count/6;
			if(count%6!=0) {
				
				page=count/6+1;
			}
			
			model.addAttribute("page",page);
			
			
			//分页数据
			Integer mygs_a=Integer.parseInt(mygs);
			Integer dqy_a=Integer.parseInt(dqy);
			
			
			Integer dq=(dqy_a-1)*mygs_a;//当前第一个
			
			Fy f=new Fy();
			f.setDq(dq);
			f.setMygs(mygs_a);
			
			List<Still> st=photoService.pageList(f);
			model.addAttribute("still",st);
			model.addAttribute("dqy",dqy_a);
		
			return "back/still-list";
	}
	
	
	@RequestMapping("/mhStill")
	public String mhStill(Model model,Fy si) {
		
		if(si.getPdmhfyzh().equals("1")) {//模糊分页
			
	
			String username=si.getUsername();
			String realname=si.getRealname();
			String title=si.getTitle();
			String type=si.getType();
			String staystatus=si.getStaystatus();
			

			Integer mhdq=(si.getDq()-1)*si.getMygs();
			
			Fy f=new Fy();
			f.setDq(mhdq);
			f.setMygs(si.getMygs());
			f.setUsername(username);
			f.setRealname(realname);
			f.setTitle(title);
			f.setType(type);
			f.setStaystatus(staystatus);

	        Integer mhCount=photoService.mhStillCount(f);//总个数
	        
	        List<Still> s=photoService.mhStillList(f);//List
	        
	        model.addAttribute("still",s);
			model.addAttribute("count",mhCount);
			
			int page=mhCount/6;
			if(mhCount%6!=0) {
				
				page=mhCount/6+1;
			}
			
			
			model.addAttribute("page",page);
			model.addAttribute("dqy",si.getDq());
			model.addAttribute("mh",1);//页面判断模糊查询
			
			Fy sk=new Fy();//搜索框数据
			sk.setUsername(username);
			sk.setRealname(realname);
	        sk.setTitle(title);
	        sk.setType(type);
	        sk.setStaystatus(staystatus);
	       
	        
	        model.addAttribute("sk",sk);//页面模糊查询数据
			
		}else {//第一次进
			
			
			String username=si.getUsername();
			String realname=si.getRealname();
			String title=si.getTitle();
			String type=si.getType();
			String staystatus=si.getStaystatus();
			
			Fy f=new Fy();
			f.setDq(0);
			f.setMygs(6);
			f.setUsername(username);
			f.setRealname(realname);
			f.setTitle(title);
			f.setType(type);
			f.setStaystatus(staystatus);

	        Integer mhCount=photoService.mhStillCount(f);//总个数
	        
	        List<Still> s=photoService.mhStillList(f);//List
	        
	        model.addAttribute("still",s);
			model.addAttribute("count",mhCount);
			
			int page=mhCount/6;
			if(mhCount%6!=0) {
				
				page=mhCount/6+1;
			}
			
			
			model.addAttribute("page",page);
			model.addAttribute("dqy",1);
			model.addAttribute("mh",1);//页面判断模糊查询
			
			Fy sk=new Fy();//搜索框数据
			sk.setUsername(username);
			sk.setRealname(realname);
	        sk.setTitle(title);
	        sk.setType(type);
	        sk.setStaystatus(staystatus);
	      
	        
	        model.addAttribute("sk",sk);//页面模糊查询数据
		}
		return "back/still-list";
	}
	
	
	 
//	@RequestMapping("/export1")
	@RequestMapping(value="export1",produces = {"application/text;charset=UTF-8"})
	public @ResponseBody String export1(HttpServletRequest request) throws UnsupportedEncodingException {
		
		String sheetName = "借款记录";
		String titleName = "金字塔借款记录表";
		String[] headers = {"Id", "借款人", "真实姓名", "贷后管理员","借款时间","标的类型","借款标题",
				            "期数", "总期数", "应还时间", "应还本息","实际还款时间","已还本息","待还本金",
				            "待还利息", "已还罚息", "待还罚息", "逾期天数","还款状态","借款id","是否逾期",
				            "是否网站待还","逾期执行时间"};
		
		List<Still> dataSet =photoService.StList();
		

	

		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		String DateName = titleName;
		
		String contextPath = request.getSession().getServletContext().getRealPath("/xls/");
		contextPath = contextPath.replace("\\", "/");
		
		String fileName=contextPath+DateName+".xls";
//		String fileName="E:\\jsp1.3\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp2\\wtpwebapps\\FinancesP2P\\xls\\"+DateName+".xls";
		String resultUrl =fileName;
		String pattern = "yyyy-MM-dd";
		StillExportExcel.exportExcel(sheetName, titleName, headers, dataSet, resultUrl, pattern);
		
		String fName=DateName+".xls";

		
		//对中文编码再解码。解决中文传递到jsp页面成乱码的问题。下面用replace("+","%20")是因为encode会把空格编码成+，所以要替换回空格。%20就是空格的html编码。
		String msg = URLEncoder.encode(fName, "UTF-8").replace("+","%20");
		return msg;
	}
	
	
	@RequestMapping(value="export2",produces = {"application/text;charset=UTF-8"})
	public @ResponseBody String export2(HttpServletRequest request,String username,String realname,String title,String type,String staystatus) throws UnsupportedEncodingException {
		
		String sheetName = "借款记录";
		String titleName = "金字塔借款记录表";
		String[] headers = {"Id", "借款人", "真实姓名", "贷后管理员","借款时间","标的类型","借款标题",
				            "期数", "总期数", "应还时间", "应还本息","实际还款时间","已还本息","待还本金",
				            "待还利息", "已还罚息", "待还罚息", "逾期天数","还款状态","借款id","是否逾期",
				            "是否网站待还","逾期执行时间","89","p"};
		
		Fy f=new Fy();
		f.setDq(0);
		f.setUsername(username);
		f.setRealname(realname);
		f.setTitle(title);
		f.setType(type);
		f.setStaystatus(staystatus);
        Integer mhCount=photoService.mhStillCount(f);//总个数
		f.setMygs(mhCount);
        
        List<Still> dataSet=photoService.mhStillList(f);//List	
        
		
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		String DateName = titleName;
		
		String contextPath = request.getSession().getServletContext().getRealPath("/xls/");
		contextPath = contextPath.replace("\\", "/");
		
		String fileName=contextPath+DateName+".xls";
		String resultUrl =fileName;
		String pattern = "yyyy-MM-dd HH:mm:ss";
		StillExportExcel.exportExcel(sheetName, titleName, headers, dataSet, resultUrl, pattern);
		
		String fName=DateName+".xls";
		
		return fName;
	}
	
	
	//收款查看
	@RequestMapping("/gathering-see/{bid}/{title}")
	public String gatheringsee(Model model,@PathVariable("bid") String bid,@PathVariable("title") String title) {
		
		System.out.println("借款id:"+bid);		
		
		Gathering g=new Gathering();
		g.setBillcode(bid);
		
		List<Gathering> list=photoService.getGatherListByLidAndTitle(g);
		
		model.addAttribute("title",title);
		model.addAttribute("count",list.size());
		model.addAttribute("gatList",list);
		
		return "back/gathering-see";
	}
	
}
