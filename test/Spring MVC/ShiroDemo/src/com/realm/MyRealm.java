package com.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

public class MyRealm extends AuthorizingRealm{
	
	
    //Ȩ��  ����ɾ���޸ġ���
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection pricipals) {
		// TODO Auto-generated method stub
		return null;
	}

	//��֤����
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		
		String username = (String)token.getPrincipal();
		System.out.println("�û�����"+username);//admin
		
		
		String password = "a9875d4af430295714c001d8d1295f32";
		
		SimpleAuthenticationInfo  simpleAuthenticationInfo = new SimpleAuthenticationInfo(username, password, ByteSource.Util.bytes("sadf"), this.getName());
		
		// TODO Auto-generated method stub
		return simpleAuthenticationInfo;
	}



}
