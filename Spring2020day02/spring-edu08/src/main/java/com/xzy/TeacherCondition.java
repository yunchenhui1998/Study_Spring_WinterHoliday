package com.xzy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class TeacherCondition implements Condition {

	//返回true条件成产，，false不成立
	@Override
	public boolean matches(ConditionContext arg0, AnnotatedTypeMetadata arg1) {
	
		Environment  env=arg0.getEnvironment();
		 System.out.println("------------------------");
	     System.out.println(env);
		 System.out.println("------------------------");
		 
		 try {
			ResourceLoader rd=arg0.getResourceLoader();
			 Resource res=rd.getResource("info.properties");
			 InputStream is=res.getInputStream();
			 BufferedReader br=new BufferedReader(new InputStreamReader(is));
			 String str=null;
			 while(null!=(str=br.readLine()))
			 {
				 System.out.println(str);
			 }
			 
			 Map<String,Object> aa= arg1.getAnnotationAttributes(tt.class.getName());
			 
			 System.out.println("aa:"+aa);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
		return true;
	}

}
