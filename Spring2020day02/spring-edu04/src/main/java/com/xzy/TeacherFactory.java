package com.xzy;

public class TeacherFactory {

	public static Teacher createTea()
	{
		Teacher t=new Teacher();
		t.setName("李明");
		
		return t;
	}
	
	
	public Teacher creatTea1()
	{
		Teacher t=new Teacher();
		t.setName("李明2");
		
		return t;
	}
	
	
}
