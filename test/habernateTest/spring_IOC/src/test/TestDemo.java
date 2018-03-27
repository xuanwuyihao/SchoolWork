package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Demo.Bean;
import Demo.Bean2;

public class TestDemo {
	
	public static void main(String[] args) {
	ApplicationContext acc=new ClassPathXmlApplicationContext("applicationContext.xml");
	Bean bean=(Bean)acc.getBean("bean1");
	bean.method();
	
	System.out.println("----------------------------------------------");
	
	ApplicationContext acc1=new ClassPathXmlApplicationContext("applictionContext2.xml");
	Bean2 bean2=(Bean2)acc1.getBean("bean2");
	bean2.method();
}
}
