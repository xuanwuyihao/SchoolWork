package com.p2p.commons;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

public class CookieUtils {

	
	/**
	 * 从Cookie里面获取指定的值
	 */
	public static Object getKey(HttpServletRequest request,String compName) {
		
		Cookie[] ck = request.getCookies();//返回一个数组，该数组包含这个请求中当前的所有Cookie
		for (Cookie cookie : ck) {
			String key = cookie.getName();
			if(compName.equals(key) ) {
				
				return cookie.getValue();
				
			}
		}
		return null;
		
	}
}
