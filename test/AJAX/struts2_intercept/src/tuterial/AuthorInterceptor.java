package tuterial;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class AuthorInterceptor extends AbstractInterceptor{

	@Override
	public String intercept(ActionInvocation ai) throws Exception {
		//��ǰ��sessionֵ   ����map
		Map session=ai.getInvocationContext().getSession();
		String role=(String)session.get("ROLE");
		if(null!=role){
			//��ai����ȥ��action   ����Object
			Object object=ai.getAction();
			if(object instanceof RoleAware){
				//��object��ת��RoleAware
				RoleAware action=(RoleAware)object;
				action.setRole(role);
			}
			//����ָ���ط� ָ������ҳ
			return ai.invoke();
		}else{
			return Action.LOGIN;
		}
		
	}

}
