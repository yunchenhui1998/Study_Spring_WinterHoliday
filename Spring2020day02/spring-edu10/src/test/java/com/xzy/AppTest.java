package com.xzy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.AppConfig;
import com.xzy.dao.Email;
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes= {AppConfig.class})
@ContextConfiguration(locations= {"classpath:ApplicationContext.xml"})
public class AppTest 
{
	@Autowired
	Student stu;
	@Autowired
	Email email;
	@Test
     public void test1()
     { 
		email.send();
		email.recieve();
     }
}
