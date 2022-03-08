package com.ecommerce.user.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ecommerce.user.dao.UserDAOImpl;

/**
 * @author Sagar Walke
 * @email sagarwalke7030@gmail.com
 * Base64.java
 * 27-Feb-2022
 */
public class Base64 {
	private static final Logger log = LoggerFactory.getLogger(Base64.class);

	/**
	 * @param str
	 * @return
	 */
	public static String encrypt(String str) {
		String encodeString=null;
		try {
			log.info("Base64 encryption start");
			encodeString=new String(org.apache.tomcat.util.codec.binary.Base64.encodeBase64(str.getBytes()));
			log.info("Base64 encryption end");
		} catch (Exception e) {
			log.error("Base64 encrypt error: ",e);
		}
		return encodeString;
	}
	
	/**
	 * @param str
	 * @return
	 */
	public static String decrypt(String str) {
		String decodeString=null;
		try {
			log.info("Base64 decryption start");
			decodeString=new String(org.apache.tomcat.util.codec.binary.Base64.decodeBase64(str));
			log.info("Base64 decryption end");
		} catch (Exception e) {
			log.error("Base64 decrypt error: "+e.getMessage());
		}
		return decodeString;
	}
}
