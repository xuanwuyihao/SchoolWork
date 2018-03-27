package com.realm;

import java.util.ArrayList;
import java.util.List;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

public class MyRealm extends AuthorizingRealm{

	//������Ȩ
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection parin) {
		//��ȡ�����Ϣ
		String username=(String)parin.getPrimaryPrincipal();
		//�����û���Ϣ�����ݿ��ѯ�Ƿ�һ��
		List<String> list=new ArrayList<>();
		list.add("role1");
		list.add("role2");
		
		//���������Ϣ�����ݿ��ѯ�Ƿ��и�Ȩ��
		List<String> list2=new ArrayList<>();
		list2.add("user:insert");
		list2.add("user:list");
		list2.add("user:delete");
		
		SimpleAuthorizationInfo sa=new SimpleAuthorizationInfo();
		//���ý�ɫ��װ��������
		sa.addRoles(list);
		sa.addStringPermissions(list2);
		
		return sa;
	}

	//������֤
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		//��ȡ�û���
		String username=(String)token.getPrincipal();
		System.out.println(username);
		
		//�����û���������
		if (username.equals("admin1")) {
			return null;
		}
		
		//�����ݿ��в�ѯ���û�������
		String password="123456";
		
		//�ж��û����Ƿ�ƥ��
		SimpleAuthenticationInfo authenticationInfo=new SimpleAuthenticationInfo(username,password,this.getName());
		
		return authenticationInfo;
	}
	

}
