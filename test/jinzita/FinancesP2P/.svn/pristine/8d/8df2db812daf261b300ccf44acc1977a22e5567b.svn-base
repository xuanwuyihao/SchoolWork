package com.p2p.commons;

import org.apache.shiro.crypto.hash.Md5Hash;

public class MD5Util {
		public static String md5Encrypt(String username, String password) {
			Md5Hash md5Hash = new Md5Hash(password, username, 10);
			return md5Hash.toString();
		}
}
