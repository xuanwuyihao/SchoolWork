package com.test;

import java.util.Arrays;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;

public class Main {
	public static void main(String[] args) {
		//创建SecurityManager
		Factory<SecurityManager> factory=new IniSecurityManagerFactory("classpath:shiro.ini");
		
		//创建SecurityManager
		SecurityManager manager=factory.getInstance();
		
		//讲SecurityManager设置在当前环境
		SecurityUtils.setSecurityManager(manager);
		
		//创建subject
		Subject subject=SecurityUtils.getSubject();
		//创建token
		UsernamePasswordToken token=new UsernamePasswordToken("admin","123456");
		
		//执行认证
		try {
			subject.login(token);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		//判断认证是否通过
		System.out.println(subject.isAuthenticated());
		
		//判断用户是否拥有某个角色
		System.out.println(subject.hasRole("role1"));
		
		//判断用户是否拥有多个角色
		System.out.println(subject.hasAllRoles(Arrays.asList("role1","role2")));
		
		//判断用户是否拥有某个角色
		System.out.println(subject.isPermitted("user:delete"));
		
		//判断用户是否拥有多个角色
		System.out.println(subject.isPermittedAll("user:select","user:list","user:insert"));
	}

}
