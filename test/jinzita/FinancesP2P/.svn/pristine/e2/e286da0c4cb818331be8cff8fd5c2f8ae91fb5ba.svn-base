package com.p2p.controller.view;


import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.p2p.pojo.Fuzzypaging;
import com.p2p.pojo.Media;
import com.p2p.pojo.Paging;
import com.p2p.service.MediaService;
import com.sun.org.glassfish.gmbal.ManagedAttribute;

@Controller
@RequestMapping("/media")
public class MediaController {
	Logger log = LogManager.getLogger(MediaController.class.getName());
	@Resource(name="mediaServiceImpl")
	private MediaService mediaservice;
	
	@RequestMapping("/list")
	public String list(Model model){
		
		Paging p=new Paging();
		p.setDq(0);
		p.setMygs(5);
		
		List<Media> list1 = mediaservice.selpaging(p);
		
		
		List<Media> list = mediaservice.list();	
		
		System.out.println("大小是："+list.size());
		
		int zy=list.size()/5;
		if(list.size()%5!=0) {
			
			zy=list.size()/5+1;
		}
		
		System.out.println("页数:"+zy);
		
		model.addAttribute("count",list.size());
		model.addAttribute("userList", list1);	
		model.addAttribute("zy",zy);//页数
		model.addAttribute("dq",1);
		
		
		
		return "back/member-list";
	}
	
	@RequestMapping("/toUpdate")
	public String toUpdate(@RequestParam("id") Integer id,Model model){
		/*
		 * @PathVariable和@RequestParam的区别就在于：
		 * @RequestParam用来获得静态的URL请求参数；@PathVariable用来获得动态的URL请求入参
		 */
		System.out.println("看+id="+id);
		Media media= mediaservice.getById(id);
		model.addAttribute("md", media);
		System.out.println("看+=====id="+media.getContent());
		return "/back/member-edit";
	}
	
	@RequestMapping("/update")
	public  @ResponseBody  String update(HttpServletRequest request,int id,String src,String fileName,String title,String address,String content) throws ParseException, IllegalStateException, IOException{
		Media media=new Media();
		System.out.println("修改进来了！"+id+"    "+title);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		String tm=df.format(new Date());
		System.out.println(tm);// new Date()为获取当前系统时间
		Date dt=df.parse(tm);
		media.setTime(dt);
		media.setId(id);
		
		
		if(fileName!=null){
			
			MultipartHttpServletRequest mh=(MultipartHttpServletRequest)request;
			//根据文件名获取文件对象
			CommonsMultipartFile cm=(CommonsMultipartFile)mh.getFile(fileName);
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
			String newfilename=sdf.format(new Date());
			
			// 获取文件扩展名
			String originalFilename = cm.getOriginalFilename();
			String suffix = originalFilename.substring(originalFilename.lastIndexOf("."));
			
			// 获取上下文路径
			String contextPath = request.getSession().getServletContext().getRealPath("/mtphoto/");
			contextPath = contextPath.replace("\\", "/");
			
			// 文件上传
			cm.transferTo(new File(contextPath + newfilename + suffix));


			// 图片的相对路径
			String relativePath = "mtphoto/" + newfilename + suffix;


			// 返回上传图片的相对路径
			String jsonStr = "{\"relativePath\" : \"" + relativePath + "\"}";


			System.out.println("上传图片的相对路径:"+jsonStr);
			
			String ad = address.substring(0,address.indexOf(","));
			System.out.println("address:"+ad);
			
			String ti = title.substring(0,title.indexOf(","));
			System.out.println("title:"+ti);
			
			String co = content.substring(0,content.indexOf(","));
			System.out.println("content:"+co);
			media.setAddress(ad);
			media.setContent(co);
			media.setPhoto(relativePath);
			media.setTitle(ti);
			
		
			
		}else{
			String ad = address.substring(0,address.indexOf(","));
			System.out.println("address:"+ad);
			
			String ti = title.substring(0,title.indexOf(","));
			System.out.println("title:"+ti);
			
			String co = content.substring(0,content.indexOf(","));
			System.out.println("content:"+co);
			
			String sr = src.substring(0,src.indexOf(","));
			System.out.println("src:"+sr);
			
			media.setAddress(ad);
			media.setContent(co);
			media.setTitle(ti);
			media.setPhoto(sr);
			
			
		}
		System.out.println("jihe "+media.toString());
		mediaservice.update(media);
		return "success";
		
	}
	
	
	
	@RequestMapping("/add")
	public @ResponseBody String add(HttpServletRequest request,String fileName,String title,String address,String content) throws ParseException, IllegalStateException, IOException{
		
		Media media=new Media();
		System.out.println("123456");
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		String tm=df.format(new Date());
		System.out.println(tm);// new Date()为获取当前系统时间
		Date dt=df.parse(tm);
		media.setTime(dt);
		
		MultipartHttpServletRequest mh = (MultipartHttpServletRequest) request;
		// 根据文件名称获取文件对象
		CommonsMultipartFile cm = (CommonsMultipartFile) mh.getFile(fileName);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		String newFileName = sdf.format(new Date());


		// 获取文件扩展名
		String originalFilename = cm.getOriginalFilename();
		String suffix = originalFilename.substring(originalFilename.lastIndexOf("."));
		
		// 获取上下文路径
		String contextPath = request.getSession().getServletContext().getRealPath("/mtphoto/");
		contextPath = contextPath.replace("\\", "/");
		
		// 文件上传
		cm.transferTo(new File(contextPath + newFileName + suffix));


		// 图片的相对路径
		String relativePath = "mtphoto/" + newFileName + suffix;


		// 返回上传图片的相对路径
		String jsonStr = "{\"relativePath\" : \"" + relativePath + "\"}";


		System.out.println("上传图片的相对路径:"+jsonStr);
		
		String ad = address.substring(0,address.indexOf(","));
		System.out.println("address:"+ad);
		
		String ti = title.substring(0,title.indexOf(","));
		System.out.println("title:"+ti);
		
		String co = content.substring(0,content.indexOf(","));
		System.out.println("content:"+co);
		
		System.out.println("media ---->:"+media.toString());
		
		media.setAddress(ad);
		media.setContent(co);
		media.setPhoto(relativePath);
		media.setTitle(ti);
		
		mediaservice.save(media);
		
		return "success";
	}
	@RequestMapping("/del")
	public String del(int id){
		System.out.println("jinlail");
		System.out.println("id为："+id);
		mediaservice.remove(id);
		return "redirect:/media/list";
	}
	
	@RequestMapping("/fuzzy")
	public String fuzzy(Model model,String title,String dq1,String pdmhfycx){
		
		
		if(pdmhfycx.equals("1")){//模糊查询之后分页
			
			
			System.out.println("模糊查询之后分页");
			System.out.println("标题："+title);
			
			Fuzzypaging f=new Fuzzypaging();
			
			Integer ee=(Integer.parseInt(dq1)-1)*5;			
			f.setDq1(ee);
			f.setMygs1(5);
			f.setTitle(title);
	
			List<Media> list1 = mediaservice.fuzzypaging(f);
			List<Media> list2=mediaservice.fuzzy(title);
			
			System.out.println("大小是："+list2.size());
			
			int zy=list2.size()/5;
			if(list2.size()%5!=0) {
				
				zy=list2.size()/5+1;
			}
			
			System.out.println("页数121111:"+zy);
			model.addAttribute("count",list2.size());
			
			model.addAttribute("zy",zy);//页数
			model.addAttribute("dq",dq1);
			model.addAttribute("tt", title);
			model.addAttribute("pdmhfy", 1);//判断模糊查询分页
			
			
	     	model.addAttribute("userList", list1);	
	     	System.out.println("模糊查询大小："+list2.size());
	     	model.addAttribute("count",list2.size());
			
			
			
		}else{//第一次模糊查询
			
			System.out.println("第一次模糊查询");
			System.out.println("标题："+title);
			Fuzzypaging f=new Fuzzypaging();
			f.setDq1(0);
			f.setMygs1(5);
			f.setTitle(title);
			
			
			
			
			List<Media> list1 = mediaservice.fuzzypaging(f);
			List<Media> list2=mediaservice.fuzzy(title);
			
			System.out.println("大小是："+list2.size());
			
			int zy=list2.size()/5;
			if(list2.size()%5!=0) {
				
				zy=list2.size()/5+1;
			}
			
			System.out.println("页数121111:"+zy);
			model.addAttribute("count",list2.size());
			
			model.addAttribute("zy",zy);//页数
			model.addAttribute("dq",1);
			model.addAttribute("tt", title);
			model.addAttribute("pdmhfy", 1);//判断模糊查询分页
			
			
	     	model.addAttribute("userList", list1);	
	     	System.out.println("模糊查询大小："+list2.size());
	     	model.addAttribute("count",list2.size());
			
		}
		
	
	
		return "back/member-list";
	}
	
	@RequestMapping("/remall")
	@ResponseBody
	public void remall( HttpServletRequest request,HttpServletResponse response){
		 try {
				request.setCharacterEncoding("UTF-8");
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	       
	       response.setContentType("text/html;charset=UTF-8");
			
			
	       String[] dels = request.getParameterValues("des");//"des"为获取的前台数组 
	     

	       //循环数组
	       for(int i=0;i<dels.length;i++) {
	    	   
	    	   int s_id=Integer.parseInt(dels[i]);
	    	   
	    	   mediaservice.remove(s_id);//单个删除的方法(自己的方法)
	    	
	       }
	       
	       
		   PrintWriter out = null;
		   try {
				out = response.getWriter();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		  	out.print("{\"msg\":\"success\"}");
		
		
		
	}
	
	@RequestMapping("/paging")
	public String paging(Model model,String dqy){
		System.out.println("分页909090");
		System.out.println("当前页898："+dqy);
		int line=5;//页个数
	    
		int dq=Integer.parseInt(dqy);//当前页
		
		int dy=(dq-1)*line;//第一个
		
		Paging p=new Paging();
		p.setDq(dy);
	    p.setMygs(line);
	    
		List<Media> list = mediaservice.selpaging(p);
		List<Media> ListSize = mediaservice.list();//查大小
		
		int zy=ListSize.size()/5;
		if(ListSize.size()%5!=0) {
			
			zy=ListSize.size()/5+1;
		}
		
		System.out.println("页数:"+zy);
		
		

		model.addAttribute("zy",zy);//页数
		model.addAttribute("dq",dq);
		model.addAttribute("userList", list);
		model.addAttribute("count",ListSize.size());
		
		return "back/member-list";
	}
	
	@RequestMapping("/meiti")
	public String meiti(Model model) {
		List<Media> list = mediaservice.meiti();
		model.addAttribute("list", list);
		System.out.println(list);
		return "front/message/gongsidongtai";
	}
}
