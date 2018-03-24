package com.saitejn.services.impl;

import java.text.ParseException;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saitejn.mapper.TestEmailUserDao;
import com.saitejn.pojo.TestEmail;
import com.saitejn.util.TestEmailMD5Util;
import com.saitejn.util.TestEmailServiceException;
import com.saitejn.util.TestSendEmail;

@Service
public class RegisterValidateService {
	@Autowired  
    private TestEmailUserDao userDao;  
      
    /** 
     * 处理注册 
     */  
   
    public void processregister(String email){  
        TestEmail user=new TestEmail();  
        Long as=5480l;  
        user.setId(as);  
        user.setName("xiaoming");  
        user.setPassword("324545");  
        user.setEmail(email);  
        user.setRegisterTime(new Date());  
        user.setStatus(0);  
        ///如果处于安全，可以将激活码处理的更复杂点，这里我稍做简单处理  
        //user.setValidateCode(MD5Tool.MD5Encrypt(email));  
        user.setValidateCode(TestEmailMD5Util.encode2hex(email));  
        ///邮件的内容  
        StringBuffer sb=new StringBuffer("点击下面链接激活账号，48小时生效，否则重新注册账号，链接只能使用一次，请尽快激活！</br>");  
       /* sb.append("<a href=\"http://localhost:8080/SaiTeGXJN/updatePassord?action=activate&email=");  
        sb.append(email);   
        sb.append("&validateCode=");   
        sb.append(user.getValidateCode());  
        sb.append("\">http://localhost:8080/SaiTeGXJN/updatePassord?action=activate&email=");   
        sb.append(email);  
        sb.append("&validateCode=");  
        sb.append(user.getValidateCode());  
        sb.append("</a>");  */
        sb.append("<a href=\"http://localhost:8080/SaiTeGXJN/updatePassord.action?action=activate&email=");  
        sb.append(email);   
        sb.append("&validateCode=");   
        sb.append(user.getValidateCode());  
        sb.append("\">http://localhost:8080/SaiTeGXJN/updatePassord.action?action=activate&email=");   
        sb.append(email);  
        sb.append("&validateCode=");  
        sb.append(user.getValidateCode());  
        sb.append("</a>");  
       
          
        //发送邮件  
        TestSendEmail.send(email, sb.toString());  
        System.out.println("发送邮件");  
          
    }  
      
    /** 
     * 处理激活 
     * @throws ParseException  
     */  
      ///传递激活码和email过来  
    public void processActivate(String email , String validateCode)throws TestEmailServiceException, ParseException{    
         //数据访问层，通过email获取用户信息  
          
            
    }   
  
}
