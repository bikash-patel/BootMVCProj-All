package com.bikash.interceptor;

import java.time.LocalDateTime;

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
		LocalDateTime ldt=LocalDateTime.now();
		long hours=ldt.getHour();
		if(hours>9 && hours<17)
		{
			RequestDispatcher rd=request.getRequestDispatcher("notAvailable.jsp");
			rd.forward(request, response);
			//if we return false it wont execute 
			return false;
		}
		return true;
	}
}
