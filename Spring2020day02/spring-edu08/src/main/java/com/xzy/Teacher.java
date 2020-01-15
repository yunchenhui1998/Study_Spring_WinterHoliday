package com.xzy;

import org.springframework.stereotype.Component;

//@Component   //Teacher teacher=new Teacher();
public class Teacher {
    private String name;
    
    public Teacher()
    {
    	this.name="老李";
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "'"+this.name+"'";
	}
    
}
