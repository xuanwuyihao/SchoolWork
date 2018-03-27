package com.p2p.realm;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import javax.annotation.Resource;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.Authorizer;

import org.apache.shiro.authz.permission.PermissionResolver;
import org.apache.shiro.authz.permission.RolePermissionResolver;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ByteSource.Util;

import com.mysql.fabric.xmlrpc.base.Array;
import com.p2p.pojo.Jurisdiction;
import com.p2p.pojo.Manager;
import com.p2p.service.JurisdictionService;
import com.p2p.service.ManagerService;


public class BackRealm extends AuthorizingRealm{

	@Resource(name="managerServiceImpl")
	private ManagerService managerService;
	
	@Resource(name="jurisdictionServiceImpl")
	private JurisdictionService jurisdictionService;
	//权限
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principal) {
		// TODO Auto-generated method stub

		String currentUsername = (String) super.getAvailablePrincipal(principal);
		System.out.println("currentUsername:"+currentUsername);
		List<Jurisdiction> permission=jurisdictionService.getRolejur(currentUsername);
		SimpleAuthorizationInfo simp=new SimpleAuthorizationInfo();
		if(permission.size()>0){
			
			for(Jurisdiction ju:permission){
//				System.out.println("==别名====="+ju.getAlias()+"===="+ju.getName()+"=list="+permission.size());
				simp.addStringPermission(ju.getAlias());
			}

			return simp;
		}else{
			simp.addStringPermission("page");
			simp.addStringPermission("loan");
			simp.addStringPermission("fund");
			simp.addStringPermission("authentication");
			simp.addStringPermission("user");
			simp.addStringPermission("propaganda");
			simp.addStringPermission("system");
			return simp;
		}
	
	}

	
	//登陆验证
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken) throws AuthenticationException {
		UsernamePasswordToken authc = (UsernamePasswordToken) authcToken;
		System.out.println("输入用户名:" + authc.getUsername());
		//通过用户名查询用户密码(加密的)
		Manager manager=managerService.getByName(authc.getUsername());
		if( manager != null ) {
			String credentials=manager.getPassword();
			System.out.println("数据库密码:"+credentials);
			// (admin和123456加密后a66abb5684c45962d887564f08346e8d)	
			AuthenticationInfo info=new SimpleAuthenticationInfo(authc.getUsername(),credentials,Util.bytes(authc.getUsername()),this.getName());
			this.setSession("manager", manager);
			return info;
		}else {
			return null;
		}
	}

	/**
	 * 将一些数据放到ShiroSession中,以便于其它地方使用
	 * 
	 * @see 比如Controller,使用时直接用HttpSession.getAttribute(key)就可以取到
	 */
	private void setSession(Object key, Object value) {
		Subject currentUser = SecurityUtils.getSubject();
		if (null != currentUser) {
			Session session = currentUser.getSession();
			System.out.println("Session默认超时时间为[" + session.getTimeout() + "]毫秒");
			if (null != session) {
				session.setAttribute(key, value);
			}
		}
	}
}
