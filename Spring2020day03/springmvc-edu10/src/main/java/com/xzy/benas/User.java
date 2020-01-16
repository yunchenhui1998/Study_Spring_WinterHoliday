package com.xzy.benas;

import java.io.Serializable;

// 域对象，实现序列化接口
public class User implements Serializable{
	
	private String loginname;
	private String password;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getLoginname() {
		return loginname;
	}

	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [loginname=" + loginname + ", password=" + password + "]";
	}
	
	
}
