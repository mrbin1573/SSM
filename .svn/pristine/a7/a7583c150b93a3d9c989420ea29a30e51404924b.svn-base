package com.saitejn.Interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 用户身份拦截器验证
 * @class LoginInterceptor.java
 * @Description:
 * @author:罗康元
 * Company:赛特工信科技有限公司
 * @date :2016-9-18
 */
public class LoginInterceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object object) throws Exception {
		//如果是管理页面也放行
				/*if(request.getRequestURI().indexOf("tomain") >=0){
					return true ;
				}*/
		//如果是管理页面也放行tomain
		/*if(request.getRequestURI().indexOf("admin") >=0){
			return true ;
		}*/
		//如果是注册页面也放行
		/*if(request.getRequestURI().indexOf("register.action") >=0){
			return true ;
		}*/
		//处理注册也放行
		/*if(request.getRequestURI().indexOf("doregister.action") >=0){
			return true;
		}*/
		//如果是登录页面也放行
		if(request.getRequestURI().indexOf("dologin.action") >= 0){
			return true;
		}
		HttpSession session = request.getSession();
		//如果用户已经登录也放行
		if(session.getAttribute("user")!=null){
			return true;
		}
		if(request.getRequestURI().indexOf("tosendemail.action")>0){
			return true;
		}
		if(request.getRequestURI().indexOf("uppassword")>0){
			return true;
		}
		if(request.getRequestURI().indexOf("updatePassord")>0){
			return true;
		}
		/*if(session.getAttribute("admin")!=null){
			return true;
		}*/
		//用户没有登录跳转到登录页面
		request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
		return false;
	}

}
