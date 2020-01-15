package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Profile;

import com.xzy.Teacher;

@Configuration
@ComponentScan(basePackages= {"com.xzy"})
//@Import(DaoConfig.class)
//@ImportResource(locations= {"ApplicationContext.xml"})
public class AppConfig {

	@Bean
	@Profile("dev")
	public Teacher createTeacher()
	{
		Teacher t=new Teacher();
		t.setName("老刘");
		return t;
	}
	@Bean
	@Profile("test")
	public Teacher createTeacher1()
	{
		Teacher t=new Teacher();
		t.setName("老张");
		return t;
	}
}
