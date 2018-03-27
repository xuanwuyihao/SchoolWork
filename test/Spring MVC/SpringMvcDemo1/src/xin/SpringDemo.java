package xin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

@Controller
@RequestMapping(value="test")
public class SpringDemo {
	@RequestMapping(value="first")
	public String first(){
		System.out.println("|+|=2");
		return "demo";
	}
	
	@RequestMapping(value="two")
	public ModelAndView two(HttpServletRequest request,HttpServletResponse response){
		String message="abc";
		return new ModelAndView("hello","message",message);
	}

}
