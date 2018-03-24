package com.saitejn.test;
import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import sun.misc.BASE64Encoder;
public class Jiami {
	private final static String DES = "DES";
	 static String data = "299995";
	 static String key = "123hck321";
	 
	 public static void main(String[] args) {
	  try {
	   String jiami = encrypt(data, key);
	   System.out.print("加密:" + jiami);
	   byte jiemi[]=decrypt(encrypt(data.getBytes(), key.getBytes()), key.getBytes());
	    System.err.println("解密: "+new String(jiemi));
	  } catch (Exception e) {
	   e.printStackTrace();
	  }
	 }
	 
	 
	 
	 
	 public static String encrypt(String data, String key) throws Exception {  //对string进行BASE64Encoder转换
	  byte[] bt = encrypt(data.getBytes(), key.getBytes());
	  BASE64Encoder base64en = new BASE64Encoder();
	  String strs = new String(base64en.encode(bt));
	  return strs;

	 }

	 private static byte[] encrypt(byte[] data, byte[] key) throws Exception {  //加密代码

	  // 生成一个可信任的随机数源

	  SecureRandom sr = new SecureRandom();

	  // 从原始密钥数据创建DESKeySpec对象

	  DESKeySpec dks = new DESKeySpec(key);

	  // 创建一个密钥工厂，然后用它把DESKeySpec转换成SecretKey对象

	  SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(DES);

	  SecretKey securekey = keyFactory.generateSecret(dks);

	  // Cipher对象实际完成加密操作

	  Cipher cipher = Cipher.getInstance(DES);

	  // 用密钥初始化Cipher对象

	  cipher.init(Cipher.ENCRYPT_MODE, securekey, sr);

	  return cipher.doFinal(data);

	 }

	 private static byte[] decrypt(byte[] data, byte[] key) throws Exception { //解密代码

	  // 生成一个可信任的随机数源

	  SecureRandom sr = new SecureRandom();

	  // 从原始密钥数据创建DESKeySpec对象

	  DESKeySpec dks = new DESKeySpec(key);

	  // 创建一个密钥工厂，然后用它把DESKeySpec转换成SecretKey对象

	  SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(DES);

	  SecretKey securekey = keyFactory.generateSecret(dks);

	  // Cipher对象实际完成解密操作

	  Cipher cipher = Cipher.getInstance(DES);

	  // 用密钥初始化Cipher对象

	  cipher.init(Cipher.DECRYPT_MODE, securekey, sr);

	  return cipher.doFinal(data);

	 }
}
