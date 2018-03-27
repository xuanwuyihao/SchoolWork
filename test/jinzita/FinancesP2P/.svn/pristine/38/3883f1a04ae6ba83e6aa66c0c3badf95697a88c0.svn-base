package com.p2p.controller.back;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.p2p.pojo.Letter;
import com.p2p.service.LetterService;

@Controller
@RequestMapping("/letter")
public class LetterController {

	@Resource(name="letterServiceImpl")
	private LetterService letterService;
	
	@RequestMapping("/list")
	public String list(Model model,String time1,String time2,String numbers,String sender) {
		System.out.println(time1+" - "+time2+" - "+numbers+" - "+sender);
		int line = 7;// 行个数
		int number = 1;// 当前页
		int lineall = 0;// 总行数
		int numberall = 0;// 总页数
        if(numbers!=null&&!numbers.equals("")) {
        	number=Integer.parseInt(numbers);
        }
        // 获取总行数
        lineall=letterService.maxCount("","");
		System.out.println();
        //总页数
        numberall=(lineall+line-1)/line;
        if(number>numberall) {
        	number=numberall;
        }
        if(number<1) {
        	number=1;
        }
        // 开始位置
     	int x = (number - 1) * line;
     	
     	Map<String, Object> map = new HashMap<String, Object>();
		
     	map.put("sender",sender);
		map.put("time1",time1);
		map.put("time2",time2);
		map.put("line",line);
		map.put("number",x);
		
		int mh = 1;
		
		List<Letter> letterList = letterService.letter_List(map);
		
		if(sender==""&&time1==""&&time2=="") {
			mh = 0;
		}
		
        model.addAttribute("letterList", letterList);
        model.addAttribute("numberall", numberall);
        model.addAttribute("number",number);
        model.addAttribute("sender", sender);
        model.addAttribute("time1", time1);
        model.addAttribute("time2", time2);
        model.addAttribute("mh", mh);
        
		return "back/letter-list";
	}
	
	@RequestMapping("add")
	public @ResponseBody String add(Letter letter) {
		
		System.out.println(letter.getSendpeople()+" - "+letter.getReceivepeople()+" - "+letter.getTitle()+" - "+letter.getContent());
		
		letter.setTime(new Date());
		letter.setOyh1("未读");
		letterService.save(letter);
		
		return "success";
	}
	
	@RequestMapping("delete")
	public @ResponseBody String delete(Integer id) {
		letterService.remove(id);
		return "success";
	}
	
	@RequestMapping("update")
	public @ResponseBody String update(Letter letter) {
		letterService.update(letter);
		return "success";
	}
	
	@RequestMapping("selById")
	public String selById(Integer id,Model model) {
		Letter letter = letterService.getById(id);
		
		model.addAttribute("letter", letter);
		return "back/letter-edit";
	}
	
	@RequestMapping("remall")
	public @ResponseBody String remAll(String[] des,Model model) {
		System.out.println("进来了");
		System.out.println(des.length);
		for (int i = 0; i < des.length; i++) {
			letterService.remove(Integer.parseInt(des[i]));
		}
		
		
		return "success";
	}
	
	@RequestMapping("updateStatus")
	public @ResponseBody String upStatus(String[] des,String status,Model model) {
		System.out.println("进来了");
		System.out.println(des.length);
		System.out.println("status:"+status);
		String x = status;
		for (int i = 0; i < des.length; i++) {
			System.out.println("i:"+i+"x:"+x);
			System.out.println("des[i]:"+des[i]);
			Letter letter = letterService.getById(Integer.parseInt(des[i]));
			System.out.println(letter.toString());
			letter.setOyh1(x);
			letterService.update(letter);
		}
		return "success";
	}
	
}
