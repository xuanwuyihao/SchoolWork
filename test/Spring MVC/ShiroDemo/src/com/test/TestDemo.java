package com.test;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;

public class TestDemo {

	public static void main(String[] args) {
		Factory<SecurityManager> factory=new IniSecurityManagerFactory("classpath:shiro.ini");
		SecurityManager securityManager=factory.getInstance();
		//∂¡»°
		SecurityUtils.getSecurityManager();
		//∆Ù∂Ø»ŒŒÒ
		Subject subject=SecurityUtils.getSubject();
		//’À∫≈√‹¬Î¡Ó≈∆
		UsernamePasswordToken token=new UsernamePasswordToken("admin","123456");
		
		try {
			subject.login(token);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(subject.isAuthenticated());
		
		subject.logout();
		System.out.println(subject.isAuthenticated());
	}
}
