package com.xzy;

import org.springframework.stereotype.Component;

//@Component   //Teacher teacher=new Teacher();
public class Teacher {
    private String name;
    
    public Teacher()
    {
    	System.out.println("Teacher构造方法 。。。。。。。");
    	this.name="老李";
    }
    public Teacher(String name)
    {
    	this.name=name;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void init()
	{
		System.out.println("^^^^^^^^^^^^");
	}
	public void des()
	{
		System.out.println("%%%%%%%%%%%%%");
	}
    
}
