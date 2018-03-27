package com.p2p.controller.back;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.p2p.pojo.Notice;
import com.p2p.pojo.Page;
import com.p2p.service.NoticeService;

@Controller
@RequestMapping("/notice")
public class NoticeController {

	@Resource(name="noticeServliceImpl")
	private NoticeService noticeService;
	
	@RequestMapping("notice-list")
	public String list(Model model,HttpServletRequest request){
		List<Notice> list=noticeService.list();
		
		int cont=noticeService.count();
		int ye=3;//条数
		int xx=(cont+ye-1)/ye;//页数
		
		List ll=new ArrayList<>();
		ll.add(noticeService.count());
		ll.add(xx);
		//session.setAttribute("ll", ll);
		model.addAttribute("list",list);
		model.addAttribute("ll",ll);
		return "back/notice";
	}
	//去增加界面
	@RequestMapping("notice-getadd")
	public String getadd(){
		return "back/notice-getadd";
	}
	
	@RequestMapping("notice-add")
	@ResponseBody
	public String add(Notice notice){

		notice.setTime(new Date());
		noticeService.save(notice);
		
		return "success";
	}

	//去修改
	@RequestMapping("notice-getupdate")
	public String update(@RequestParam("id") Integer id,Model model){
		Notice notice=noticeService.getById(id);
		
		model.addAttribute("notice", notice);
		
		return "back/notice-edit";
	}
	//修改
	@RequestMapping("notice-update")
	@ResponseBody
	public String update2(Notice notice){
		noticeService.update(notice);
		return "success";
	}
    //删除
	
    @RequestMapping("notice-delete") 
    @ResponseBody
    public String queryByName(Notice notice){
    	System.out.println("ssssssssssssss==="+notice.getId());
        noticeService.remove(notice.getId());
        return "success";
    }
	//分页
	@RequestMapping("notice-fy")
	public String fent(Model model,Notice notice,HttpServletRequest request){
		
		System.out.println("ddd="+notice.getTitle()+"lllllll="+notice.getPeople());
		
		if(notice.getTitle()!=""||notice.getPeople()!=""){
			int a=0;
			int b=3;//查询条数
			Page page=new Page();
			page.setFist(a);
			page.setTow(b);
			page.setPeople(notice.getPeople());
			page.setTitle(notice.getTitle());
			List<Notice> list=noticeService.selectpeople(page);
			List<Notice> list2= noticeService.selectlike(page);//总条数
			int cont=list2.size();
			int ye=b;
			int xx=(cont+ye-1)/ye;
			String title1=notice.getTitle();
			String people1=notice.getPeople();
			
			int cont2=noticeService.count();
			int xx2=(cont2+ye-1)/ye;//页数
			
			List ll=new ArrayList<>();
			ll.add(cont);
			ll.add(xx);
			ll.add(title1);
			ll.add(people1);
			ll.add(xx2);
			ll.add(cont2);
			model.addAttribute("ll",ll);
			
			model.addAttribute("list",list);
			return "back/notice";
		}

		return "redirect:/notice/notice-list";
	}
	
	//分页
	@RequestMapping("text")
	//@ResponseBody
	public String  paging(Model model,Page page){
		int CurrentRoWnumber=3;//当前行数
		int CurrentPage=page.getCont();//当前页
		int c=(CurrentPage-1)*CurrentRoWnumber;//查询前后条数
		
		Page page1=new Page();
		page1.setFist(c);
		page1.setTow(CurrentRoWnumber);
		page1.setTitle(page.getTitle());
		page1.setPeople(page.getPeople());
		List<Notice> list=new ArrayList<>();
		if(page.getTitle()==""&&page.getPeople()==""){
			int coun=noticeService.count();
			if(page1.getFist()>-1){
				System.out.println("=========="+page1.getFist()+"==="+page1.getTow());
				list=noticeService.selectpaging(page1);
			}
		}else {

			list=noticeService.selectpeople(page1);
		}
		
		List<Notice> lli=noticeService.selectlike(page1);
		int cont=0;//总数
		if(page.getTitle()==""&&page.getPeople()==""){
			cont=noticeService.count();			
		}else{
			cont=lli.size();	
			}
		
		int ye=CurrentRoWnumber;//行数
		int xx=(cont+ye-1)/ye;//页数
		
		int cont2=noticeService.count();
		int xx2=(cont2+ye-1)/ye;//页数
		
		String title1=page.getTitle();
		String people=page.getPeople();

		List ll=new ArrayList<>();
		ll.add(cont);
		ll.add(xx);
		ll.add(title1);
		ll.add(people);
		ll.add(xx2);
		ll.add(cont2);
		model.addAttribute("ll",ll);
		model.addAttribute("list",list);
		model.addAttribute("list2",CurrentPage);
		return "back/notice";
		
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
	    	   noticeService.remove(s_id);
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
