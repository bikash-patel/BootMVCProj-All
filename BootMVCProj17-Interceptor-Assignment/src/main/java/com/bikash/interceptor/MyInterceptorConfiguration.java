package com.bikash.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class MyInterceptorConfiguration implements WebMvcConfigurer {
	
	@Autowired
	private MyAppAvailableInterceptor inter;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(inter);
		WebMvcConfigurer.super.addInterceptors(registry);
	}
}
