package com.util;

import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.crypto.hash.SimpleHash;

public class MD5Util {
	public static void main(String[] args) {
		String password="123456";
		String salt="sadf";
		
		String password2="123456";
		String salt2="sdsadfs";
		
		//加密
		Md5Hash md5Hash=new Md5Hash(password,salt,10);
		Md5Hash md5Hash2=new Md5Hash(password2,salt,10);
		
		//列散点分布
		SimpleHash simpleHash=new SimpleHash("MD5",password,salt,10);
		System.out.println(simpleHash.toString());
	}

}
