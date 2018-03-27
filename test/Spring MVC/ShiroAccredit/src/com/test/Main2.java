package com.test;

import java.util.Arrays;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;

public class Main2 {
	public static void main(String[] args) {
		//创建SecurityManager工厂
		Factory<SecurityManager> factory=new IniSecurityManagerFactory("classpath:shiro2.ini");
		//创建SecurityManager
		SecurityManager manager=factory.getInstance();
		//讲SecurityManager设置在当前运行环境
		SecurityUtils.setSecurityManager(manager);
		//创建subject
		Subject subject=SecurityUtils.getSubject();
		//创建token
		UsernamePasswordToken token=new UsernamePasswordToken("admin","123456");
		
		try {
			subject.login(token);
		} catch (AuthenticationException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		//判断是否通过认证
		System.out.println(subject.isAuthenticated());
		
		//判断用户是否拥有某个角色
		System.out.println(subject.hasRole("role1"));
		
		//判断用户是否拥有多个角色
		System.out.println(subject.hasAllRoles(Arrays.asList("role1","role2")));
		
		//判断用户是否拥有某个权限
		System.out.println(subject.isPermitted("user:list"));
		
		//判断用户是否拥有多个权限
		System.out.println(subject.isPermittedAll("user:list","user:select"));
		
	}

}
