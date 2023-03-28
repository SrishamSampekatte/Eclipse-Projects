package com.xworkz.trimmer.configuration;

import java.io.File;
import java.util.Arrays;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class TrimmerWebInti extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Running getRootConfigClasses ");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Running getServletConfigClasses");
		Class[] classes = { TrimmerConfiguration.class };
		return classes;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Running getServletMappings");
		String[] string = { "/" };
		System.out.println(Arrays.toString(string));
		return string;
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("Running configureDefaultServletHandling");
		configurer.enable();
	}

	@Override
	protected void customizeRegistration(Dynamic registration) {
		String tempDir = "D:\\temp";
		int maxUploadSizeInMb = 3 * 1024 * 1024;
		File uploadDirectory = new File(tempDir);
		MultipartConfigElement multipartConfigElement = new MultipartConfigElement(uploadDirectory.getAbsolutePath(),
				maxUploadSizeInMb, maxUploadSizeInMb * 2, maxUploadSizeInMb / 2);
		registration.setMultipartConfig(multipartConfigElement);
	}
}
