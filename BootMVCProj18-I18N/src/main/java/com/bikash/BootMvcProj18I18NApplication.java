package com.bikash;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@SpringBootApplication
public class BootMvcProj18I18NApplication {


	//These SessionLocaleResolver object creation enable I18N in Spring Boot
	
    @Bean("localeResolver")     //Fixed bean name
    SessionLocaleResolver localeResolver()
	{
		SessionLocaleResolver locale=new SessionLocaleResolver();
		locale.setDefaultLocale(new Locale("en","UK"));  
		//It would be the locale which execute at the starting of the project
		return locale;
	}
  
    
    //LocaleChangeInterceptor will be executed because it is registered with 
    //Interceptor Registry which means for overriding the Local obj based on our req
    
    @Bean("intercept") //Here name not fixed
    LocaleChangeInterceptor setInterceptor()
    {
    	LocaleChangeInterceptor interceptor=new LocaleChangeInterceptor();
    	interceptor.setParamName("lang"); 
    	//Whenever we click on hyperlink of languages it will pass locale 
    	//Details to lang var and it will set here and from here it will  
    	//goes to intercepter and intercepter will execute
		return interceptor;
    }
    
	
	public static void main(String[] args) {
		SpringApplication.run(BootMvcProj18I18NApplication.class, args);
	}

}
