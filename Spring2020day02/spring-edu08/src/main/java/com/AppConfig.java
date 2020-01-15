package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

import com.xzy.Teacher;
import com.xzy.TeacherCondition;
import com.xzy.tt;

@Configuration
@ComponentScan(basePackages= {"com.xzy"})
//@Import(DaoConfig.class)
@ImportResource(locations= {"ApplicationContext.xml"})
@PropertySource("classpath:info.properties")
public class AppConfig {

	
	@Bean
	@tt()
	@Conditional(TeacherCondition.class)
	public Teacher createTeacher()
	{
		Teacher t=new Teacher();
		t.setName("老刘");
		return t;
	}
}
