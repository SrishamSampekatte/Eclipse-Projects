package error.configuration;

import java.util.Arrays;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class FoodInti extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Running getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Created getServletConfigClasses");
		Class[] configClass = { FoodConfiguration.class };
		System.out.println("Config class " + Arrays.toString(configClass));
		return configClass;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Running getServletMappings");
		String[] ref = { "/" };
		System.out.println("getServletMappings" + Arrays.toString(ref));
		return ref;
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println(" Running configureDefaultServletHandling ");
		configurer.enable();
	}

}
