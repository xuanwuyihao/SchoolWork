package com.p2p.realm;

import java.util.ArrayList;
import java.util.List;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;


public class CustomRealm extends AuthorizingRealm {
	
	/**
	 * 验证当前登录的Subject
	 * 
	 * @see 经测试:本例中该方法的调用时机为LoginController.login()方法中执行Subject.login()时
	 */
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken) {
		// 获取基于用户名和密码的令牌
				// 实际上这个authcToken是从LoginController里面currentUser.login(token)传过来的
				// 两个token的引用都是一样的,本例中是org.apache.shiro.authc.UsernamePasswordToken@33799a1e
				UsernamePasswordToken token = (UsernamePasswordToken) authcToken;
				/*AuthAccount authAccount = new AuthAccount();
				String loginname = token.getUsername();
				if (loginname != null && !loginname.isEmpty()) {
					authAccount.setLoginname(loginname);
				}
				AuthAccount account = accountService.findByLoginName(loginname);
				if (account != null) {
					AuthenticationInfo authcInfo = new SimpleAuthenticationInfo(account.getLoginname(), account.getPassword(),
							account.getLoginname());
					this.setSession("account", account);
					return authcInfo;
				} else {
					return null;
				}*/
				return null;
	}
	
	/**
	 * 为当前登录的Subject授予角色和权限
	 * 
	 * @see 经测试:本例中该方法的调用时机为需授权资源被访问时
	 * @see 经测试:并且每次访问需授权资源时都会执行该方法中的逻辑,这表明本例中默认并未启用AuthorizationCache
	 * @see 比如说这里从数据库获取权限信息时,先去访问Spring3.1提供的缓存,而不使用Shior提供的AuthorizationCache
	 */
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		//获取登录的用户名
		String currentUsername = (String) super.getAvailablePrincipal(principals);
		List<String> roleList = new ArrayList<String>();
		List<String> permissionList = new ArrayList<String>();
		/*AuthAccount acc = accountService.findByLoginName(currentUsername);
		if(acc!=null){
			int roleid = acc.getRoleid();
			String role = roleService.selectModelById(roleid);
			String rolename = roleService.selectRoleNameById(roleid);
			if(role!=null && role!="" && !role.isEmpty()){
				String ps[] =  role.split(",");
				for(String pid : ps){
					permissionList.add(modelService.selectMethodById(Integer.parseInt(pid)));
				}
			
			roleList.add(rolename);
		}
		
			
			SimpleAuthorizationInfo simpleAuthorInfo = new SimpleAuthorizationInfo();
			//进行角色授予和权限授予
			simpleAuthorInfo.addRoles(roleList);
			simpleAuthorInfo.addStringPermissions(permissionList);
			return simpleAuthorInfo;
		}else{
			SimpleAuthorizationInfo simpleAuthorInfo = new SimpleAuthorizationInfo();
			//进行角色授予和权限授予
			simpleAuthorInfo.addRoles(roleList);
			simpleAuthorInfo.addStringPermissions(permissionList);
			return simpleAuthorInfo;
		}*/
		return null;
	}

	

}
