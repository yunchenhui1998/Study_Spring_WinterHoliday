package com.xzy;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.AppConfig;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {AppConfig.class})
public class AppTest 
{
	@Autowired
	Student stu;
	
	@Test
     public void test1()
     {
		System.out.println(stu.getName()+"\t"+stu.getAge()+"\t"+stu.getTea().getName());
      // assertEquals("老李", stu.getTea().getName());
     }
}
