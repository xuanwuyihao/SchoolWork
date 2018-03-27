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
		//����SecurityManager����
		Factory<SecurityManager> factory=new IniSecurityManagerFactory("classpath:shiro2.ini");
		//����SecurityManager
		SecurityManager manager=factory.getInstance();
		//��SecurityManager�����ڵ�ǰ���л���
		SecurityUtils.setSecurityManager(manager);
		//����subject
		Subject subject=SecurityUtils.getSubject();
		//����token
		UsernamePasswordToken token=new UsernamePasswordToken("admin","123456");
		
		try {
			subject.login(token);
		} catch (AuthenticationException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		//�ж��Ƿ�ͨ����֤
		System.out.println(subject.isAuthenticated());
		
		//�ж��û��Ƿ�ӵ��ĳ����ɫ
		System.out.println(subject.hasRole("role1"));
		
		//�ж��û��Ƿ�ӵ�ж����ɫ
		System.out.println(subject.hasAllRoles(Arrays.asList("role1","role2")));
		
		//�ж��û��Ƿ�ӵ��ĳ��Ȩ��
		System.out.println(subject.isPermitted("user:list"));
		
		//�ж��û��Ƿ�ӵ�ж��Ȩ��
		System.out.println(subject.isPermittedAll("user:list","user:select"));
		
	}

}
