package com.saitejn.exception;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import org.zefer.d.c.m;

/**
 * 
 *<p>Title:CustomExceptionResolver </p>
 * <p>Description: </p>
 * <p>Company:康佳集团有限责任公司 </p> 
 * @author :罗康元
 * @date2016-12-21
 */
public class CustomExceptionResolver implements HandlerExceptionResolver  {

	//前端控制器DispatcherServlet在进行HandlerMapping、调用HandlerAdapter执行Handler过程中，如果遇到异常就会执行此方法
	//handler最终要执行的Handler，它的真实身份是HandlerMethod
	//Exception ex就是接收到异常信息
	@Override
	public ModelAndView resolveException(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex) {
		//输出异常
		ex.printStackTrace();
		
		//统一异常处理代码
		//针对系统自定义的CustomException异常，就可以直接从异常类中获取异常信息，将异常处理在错误页面展示
		//异常信息
		String message = null;
		CustomException customException = null;
		//如果ex是系统 自定义的异常，直接取出异常信息
		if(ex instanceof CustomException){
			customException = (CustomException)ex;
		}else{
			//针对非CustomException异常，对这类重新构造成一个CustomException，异常信息为“未知错误”
			customException = new CustomException("未知错误");
		}
		
		//错误 信息
		message = customException.getMessage();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message", message);
		
		modelAndView.setViewName("error");

		return modelAndView;
	}

}
