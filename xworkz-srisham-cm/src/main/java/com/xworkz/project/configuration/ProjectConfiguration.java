package com.xworkz.project.configuration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import lombok.extern.slf4j.Slf4j;

@Configuration
@ComponentScan("com.xworkz.project")
@Slf4j
public class ProjectConfiguration {
	@Bean
	public ViewResolver viewResolver() {
		log.info("Created View Resolver ");
		return new InternalResourceViewResolver("/", ".jsp");
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean() {
		log.info("Registering LocalContainerEntityManagerFactoryBean ");
		LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
		bean.setPackagesToScan("com.xworkz.project.entity");
		bean.setDataSource(dataSource());
		bean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		return bean;
	}

	public DataSource dataSource() {
		log.info("Registering data source....");
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/project");
		dataSource.setUsername("root");
		dataSource.setPassword("Xworkzodc@123");
		return dataSource;
	}

}
