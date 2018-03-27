package com.p2p.controller.back;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.p2p.pojo.LendApply;
import com.p2p.pojo.Notice;
import com.p2p.pojo.Page;
import com.p2p.pojo.UserGroup;
import com.p2p.pojo.UserOpinion;
import com.p2p.service.UseropinionService;

@Controller
@RequestMapping("/opinion")
public class UseropinionController {
	
	@Resource(name="useropinionServiceImpl")
	private UseropinionService useropinion;
	
	@RequestMapping("list")
	public String list(Model model) {
		List<UserOpinion> list = useropinion.list();
		int cont=useropinion.count();
		int ye=6;//条数
		int xx=(cont+ye-1)/ye;//页数
		
		List ll=new ArrayList<>();
		ll.add(useropinion.count());
		ll.add(xx);
		
		model.addAttribute("list",list);
		model.addAttribute("ll",ll);
		return "back/useropinion-list";
	}
	
	@RequestMapping("remove")
	@ResponseBody
	public String delete(@RequestParam("id") Integer id) {
		useropinion.remove(id);
		
		return "success";
	}
	
	@RequestMapping("edit")
	public String edit(@RequestParam("id") Integer id,Model model) {
		
		UserOpinion list = useropinion.getById(id);
		System.out.println(list.getId());
		model.addAttribute("user", list);
		return "back/useropinion-edit";
	}
	
	@RequestMapping("update")
	@ResponseBody
	public String update(UserOpinion user) {
		System.out.println("zz"+user.getId());
		System.out.println("zz"+user.getPhone());
		System.out.println("zz"+user.getContent());
		System.out.println("zz"+user.getTime());
		useropinion.update(user);
		return "success";
	}
	
		
	//查询
  	@RequestMapping("useropinion-fy")
  	public String fent(Model model,UserOpinion opinion,HttpServletRequest request){
  		if(opinion.getPhone()!=""||opinion.getContent()!=""){
  			int a=0;
  			int b=6;//查询条数
  			Page page=new Page();
  			page.setFist(a);
  			page.setTow(b);
  			page.setPeople(opinion.getPhone());
  			page.setTitle(opinion.getContent());
  			List<UserOpinion> list=useropinion.selectpeople(page);
  			List<UserOpinion> list2= useropinion.selectlike(page);//总条数
  			int cont=list2.size();
  			System.out.println("数量:"+cont);
  			int ye=b;
  			int xx=(cont+ye-1)/ye;
  			String title1=opinion.getPhone();
  			String people1=opinion.getContent();
  			
  			List ll=new ArrayList<>();
  			ll.add(cont);
  			ll.add(xx);
  			ll.add(title1);
  			ll.add(people1);
  			model.addAttribute("ll",ll);
  			model.addAttribute("list",list);
  			return "back/useropinion-list";
  		}

  		return "redirect:/opinion/list";
  	}
  	
    //分页
	@RequestMapping("text")
	//@ResponseBody
	public String  paging(Model model,Page page){
		int CurrentRoWnumber=6;//当前行数
		int CurrentPage=page.getCont();//当前页
		int c=(CurrentPage-1)*CurrentRoWnumber;//查询前后条数
		Page page1=new Page();
		page1.setFist(c);
		page1.setTow(CurrentRoWnumber);
		page1.setTitle(page.getTitle());
		page1.setPeople(page.getPeople());
		List<UserOpinion> list=new ArrayList<>();
		if(page.getTitle()==""&&page.getPeople()==""){
			 list=useropinion.selectpaging(page1);
		}else {

			list=useropinion.selectpeople(page1);
		}

		List<UserOpinion> lli=useropinion.selectlike(page1);
		int cont=0;//总数
		if(page.getTitle()==""&&page.getPeople()==""){
			cont=useropinion.count();			
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
		return "back/useropinion-list";
		
	}
	//批量删除
		@RequestMapping("plsc")
		@ResponseBody
		public void plsc(HttpServletRequest request,HttpServletResponse response) {
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
		    	 //  noticeService.getById(s_id);
		    	   useropinion.remove(s_id);
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
		
		
		@RequestMapping("/insert")
		public String insert(String phone,String content) throws ParseException{
			System.out.println("phone"+phone);
			
			//获取当前时间
			SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置时间格式
			String tm=df.format(new Date());
			System.out.println(tm);// new Date()为获取当前系统时间
			Date dt=df.parse(tm);
			UserOpinion uop=new UserOpinion();
			uop.setPhone(phone);
			uop.setContent(content);
			uop.setTime(dt);
			
			useropinion.insert(uop);
			
			return "front/index";
		}
		  	
}
