package com.xzy;

import org.springframework.stereotype.Component;

//@Component   //Teacher teacher=new Teacher();
public class Teacher {
    private String name;
    
    public Teacher()
    {
    	System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$");
    	this.name="老李";
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
}
