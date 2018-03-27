package com.yh.serviceImpl;

import org.springframework.stereotype.Service;

import com.yh.service.UserService;


/**
 * 
 * @author yihao
 * spring容器管理服务对象
 * 1，bean标签管理
 * 2，注解管理
 * 		使用注解，容易导包错误。dubbo也提供了service注解，但是dubbo的service注解有代码冲突，在大多数情况下，和spring-context，
 * 		spring-tx有冲突。
 * 		
 *
 */
@Service
public class UserServiceImpl implements UserService{

	public void register(String name, String password) {
		// TODO Auto-generated method stub
		System.out.println("register"+name+":"+password);
		
	}

	public void login(String name, String password) {
		// TODO Auto-generated method stub
		System.out.println("ligin"+name+":"+password);
	}

}
