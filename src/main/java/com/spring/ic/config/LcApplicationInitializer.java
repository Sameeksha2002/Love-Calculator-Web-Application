package com.spring.ic.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class LcApplicationInitializer //implements WebApplicationInitializer 
{

	public void onStartup(ServletContext servletContext) throws ServletException {
		
		// This is to define Spring config file which is in (.xml) format
	/*	XmlWebApplicationContext wac = new XmlWebApplicationContext();
		wac.setConfigLocation("classpath:appConfig.xml");
	*/
		// This is to define java based Spring config file 
		AnnotationConfigWebApplicationContext wac = new AnnotationConfigWebApplicationContext();
		wac.register(LcApplicationConfig.class);
		
		// create DispatcherServlet object
		DispatcherServlet ds = new DispatcherServlet(wac);
		
		//resigter/set DispatcherServlet with ServletContext
		ServletRegistration.Dynamic customDispatcherServlet =servletContext.addServlet("myDispatcher", ds);
		
		customDispatcherServlet.setLoadOnStartup(1);
		customDispatcherServlet.addMapping("/myWebsite/*");
		

	}

}
