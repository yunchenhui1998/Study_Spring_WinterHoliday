package com.ssm.service;

import com.ssm.pojo.Users;

public interface GuestService {

	/**
	 * 注册一个用户，同时要在日志表增加一条记录
	 * @param u
	 */
	  public void registUser(Users u);
}
