package com.xzy;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("t3")   //Teacher teacher=new Teacher();
//@Primary

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
    
}
