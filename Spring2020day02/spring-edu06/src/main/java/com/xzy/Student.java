package com.xzy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
@Component
@Scope("prototype")
public class Student {
   private String name;
   private int age;
   
   @Autowired
   @Qualifier("t3")
   private Teacher tea;
   
   
   public Student()
   {
	   this.name="小明";
	   this.age=23;
   }
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Teacher getTea() {
	return tea;
}
public void setTea(Teacher tea) {
	this.tea = tea;
}
   
}
