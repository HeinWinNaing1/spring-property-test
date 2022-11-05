package com.hostmdy.property.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

import com.hostmdy.property.bean.CloudDataSource;
import com.hostmdy.property.bean.DataTransferTest;
import com.hostmdy.property.bean.LombokTest;
import com.hostmdy.property.bean.MyDataSource;

@Configuration
//@PropertySource({"classpath:oracle_datasource.properties","classpath:aws_cloud_datasource.properties"})
@PropertySource("classpath:datasource.yml")
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "oracle")
public class PropertyConfig {
	
	@Autowired
	Environment env;
	
	@Value("${oracle.username}")
	String username;
	
	@Value("${oracle.password}")
	String password;
	
	@Value("${oracle.url}")
	String url;
	
	@Value("${aws.cloud.service}")
	String service;
	
	@Value("${aws.cloud.authentication}")
	String authentication;
	
	@Value("${aws.cloud.cached}")
	String cached;
	
	//Lombok test
	@Bean
	LombokTest lombokTest() {
		return new LombokTest(1001,"MgMg","mgmg@gmail.com");
	}
	
	@Bean
	DataTransferTest dataTransferTest() {
		return new DataTransferTest(2001,"KyawKyaw", "kk@gmail.com");
	}
	
	@Bean
	CloudDataSource cloudDataSource() {
		return new CloudDataSource(service, authentication, cached);
		
	}
	
	@Bean
	MyDataSource myDataSource() {
		return new MyDataSource(username, password, url);
	}
	
//	@Bean
//	static PropertySourcesPlaceholderConfigurer properties() {
//		return new PropertySourcesPlaceholderConfigurer();
//	}
}
