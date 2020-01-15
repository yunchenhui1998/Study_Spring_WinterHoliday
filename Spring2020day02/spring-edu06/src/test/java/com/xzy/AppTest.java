package com.xzy;

import java.util.Iterator;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.AppConfig;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {AppConfig.class})
public class AppTest 
{
	@Autowired
	Student stu;
	@Autowired
	Person p;
	
	@Test
     public void test1()
     {
		System.out.println(stu.getName()+"\t"+stu.getAge()+"\t"+stu.getTea().getName());
       //assertEquals("老李", stu.getTea().getName());
     
        Iterator<Map.Entry<String, String>>  all=p.getAa().entrySet().iterator();
        while(all.hasNext())
        {
        	Map.Entry<String, String> aa=all.next();
        	System.out.println(aa.getKey()+":::"+aa.getValue());
        }
     
     }
}
