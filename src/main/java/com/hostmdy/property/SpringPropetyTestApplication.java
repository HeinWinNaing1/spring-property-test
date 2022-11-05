package com.hostmdy.property;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.hostmdy.property.bean.CloudDataSource;
import com.hostmdy.property.bean.DataSource;
import com.hostmdy.property.bean.DataTransferTest;
import com.hostmdy.property.bean.LombokTest;
import com.hostmdy.property.bean.MyDataSource;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class SpringPropetyTestApplication implements CommandLineRunner{
	
	@Autowired
	LombokTest lombokTest;
	
	@Autowired
	DataTransferTest dataTransferTest;
	
	
	public static void main(String[] args) {
		log.info("Involked");
		ApplicationContext context = SpringApplication.run(SpringPropetyTestApplication.class, args);
		
		MyDataSource dataSourceBean = context.getBean(MyDataSource.class);
		
		System.out.println("UserName : "+dataSourceBean.getUsername());
		System.out.println("Password : "+dataSourceBean.getPassword());
		System.out.println("URL : "+dataSourceBean.getUrl());
		
		
		CloudDataSource cloudBean = context.getBean(CloudDataSource.class);
		
		System.out.println(cloudBean.getService());
		System.out.println(cloudBean.getAuthentication());
		System.out.println(cloudBean.getCached());
		
		DataSource dataBean = context.getBean(DataSource.class);
		
		System.out.println("YML username : "+dataBean.getUser());
		System.out.println("YML password : "+dataBean.getPassword());
		System.out.println("YML url : "+dataBean.getUrl());
		System.out.println("YML service : "+dataBean.getService());
		System.out.println("YML authentication : "+dataBean.getAuthentication());
		System.out.println("YML Service : "+dataBean.getService());
		System.out.println("Servers : "+dataBean.getServers());

		
	}

	@Override
	public void run(String... args) throws Exception {
//		System.out.println(lombokTest);
//		System.out.println("HashCode:"+ lombokTest.hashCode());
//		LombokTest testObject = new LombokTest(1001,"MgMg","mgmg@gmail.com");
//		System.out.println("Equal?"+lombokTest.equals(testObject));
		System.out.println(dataTransferTest);
	}

}
