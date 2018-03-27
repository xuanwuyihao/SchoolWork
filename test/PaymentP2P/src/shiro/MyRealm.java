package shiro;

import javax.annotation.Resource;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource.Util;

import com.ht.model.User;
import com.ht.service.UserService;

public class MyRealm extends AuthorizingRealm{
	
	@Resource(name="userServiceImpl")
	private UserService userService;

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	
	//登入认证
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		// TODO Auto-generated method stub
		
		//输入用户名
		String username=(String)token.getPrincipal();
		System.out.println("输入用户名:"+username);
		
		//输入密码
		String password=new String((char[])token.getCredentials());
		System.out.println("输入密码:"+password);
				
		
		//通过用户名查询密码(加密的)
		User user=userService.getByName(username);
		String password2=user.getPassword();
		System.out.println("数据库用户密码:"+password2);
		
		Object principal  = username;//用户名
		//Object credentials = "a66abb5684c45962d887564f08346e8d";//密码
		Object credentials = password2;
		
		AuthenticationInfo info=new SimpleAuthenticationInfo(principal, credentials, Util.bytes(username), this.getName());
		
		return info;
	}

}
