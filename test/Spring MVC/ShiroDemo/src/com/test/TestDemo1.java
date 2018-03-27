package com.test;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;

public class TestDemo1 {
	public static void main(String[] args) {
		Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro2.ini");
	    SecurityManager securityManager = factory.getInstance();
	    
	    SecurityUtils.setSecurityManager(securityManager);
	    
	    Subject subject = SecurityUtils.getSubject();
	    //用户登入输入的用户名和密码
	    UsernamePasswordToken token = new UsernamePasswordToken("admin", "123456");
	    
	    try{
	    	subject.login(token);
	    }catch(Exception e){
	    	e.printStackTrace();
	    }
	    
	    System.out.println(subject.isAuthenticated());
	    
	    subject.logout();
	    
	    System.out.println(subject.isAuthenticated());
	
	}

}
