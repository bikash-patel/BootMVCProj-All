package com.bikash.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class MyAppAvailableInterceptor implements HandlerInterceptor {
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String browser=request.getHeader("User-Agent");
		System.out.println(browser);
		if(!browser.equals(null) && browser.contains("Chrome"))
		{
			return true;
		}
		RequestDispatcher rd=request.getRequestDispatcher("result.jsp");
		rd.forward(request, response);
		return false;
	}
}
