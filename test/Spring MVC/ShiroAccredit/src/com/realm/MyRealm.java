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

	//用于授权
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection parin) {
		//获取身份信息
		String username=(String)parin.getPrimaryPrincipal();
		//根据用户信息到数据库查询是否一致
		List<String> list=new ArrayList<>();
		list.add("role1");
		list.add("role2");
		
		//根据身份信息到数据库查询是否有该权限
		List<String> list2=new ArrayList<>();
		list2.add("user:insert");
		list2.add("user:list");
		list2.add("user:delete");
		
		SimpleAuthorizationInfo sa=new SimpleAuthorizationInfo();
		//将该角色封装到对象中
		sa.addRoles(list);
		sa.addStringPermissions(list2);
		
		return sa;
	}

	//用于认证
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		//获取用户名
		String username=(String)token.getPrincipal();
		System.out.println(username);
		
		//假如用户名不存在
		if (username.equals("admin1")) {
			return null;
		}
		
		//从数据库中查询该用户的密码
		String password="123456";
		
		//判断用户名是否匹配
		SimpleAuthenticationInfo authenticationInfo=new SimpleAuthenticationInfo(username,password,this.getName());
		
		return authenticationInfo;
	}
	

}
