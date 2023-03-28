package com.xworkz.project.configuration;

import java.util.Arrays;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SignUpWebInti extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		log.info("Running getRootConfigClasses ");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		log.info("Running getServletConfigClasses");
		Class[] classes = { ProjectConfiguration.class };
		return classes;
	}

	@Override
	protected String[] getServletMappings() {
		log.info("Running getServletMappings");
		String[] string = { "/" };
		log.info(Arrays.toString(string));
		return string;
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		log.info("Running configureDefaultServletHandling");
		configurer.enable();
	}

}
