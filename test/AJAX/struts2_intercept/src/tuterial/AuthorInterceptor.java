package tuterial;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class AuthorInterceptor extends AbstractInterceptor{

	@Override
	public String intercept(ActionInvocation ai) throws Exception {
		//当前的session值   放在map
		Map session=ai.getInvocationContext().getSession();
		String role=(String)session.get("ROLE");
		if(null!=role){
			//从ai容器去除action   类型Object
			Object object=ai.getAction();
			if(object instanceof RoleAware){
				//从object类转换RoleAware
				RoleAware action=(RoleAware)object;
				action.setRole(role);
			}
			//返回指定地方 指定到首页
			return ai.invoke();
		}else{
			return Action.LOGIN;
		}
		
	}

}
