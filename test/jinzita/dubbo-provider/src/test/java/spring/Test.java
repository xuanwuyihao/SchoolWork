package spring;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	
	public static void main(String[] args) throws Exception {
		//1.创建spring容器，并扫描配置文件，ClassPathXmlApplicationContext继承了Thread
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("classpath:spring/*.xml");
		System.out.println("Provider  正在启动。。。。");
		
		//2.启动spring容器
		context.start();
		
		System.out.println("Provider  已启动。。。。");
		//线程阻塞，如果线程终止，则服务端代码停止，发布服务失效
		System.in.read();
		
	}

}