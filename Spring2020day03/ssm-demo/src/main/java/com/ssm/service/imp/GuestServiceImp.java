package com.ssm.service.imp;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssm.mapper.LogsMapper;
import com.ssm.mapper.UsersMapper;
import com.ssm.pojo.Logs;
import com.ssm.pojo.Users;
import com.ssm.service.GuestService;
@Service
public class GuestServiceImp implements GuestService {

	@Autowired
   private UsersMapper  usersMapper;
	@Autowired
   private LogsMapper logsMapper;
   
	@Transactional
	@Override
	public void registUser(Users u) 
	{
		usersMapper.addUser(u);
		
		Logs l=new Logs();
		l.setMsg("增加了一个用户---"+new Date()+u.getId());
	
		logsMapper.addMsg(l);
		 

	}

	public UsersMapper getUsersMapper() {
		return usersMapper;
	}

	public void setUsersMapper(UsersMapper usersMapper) {
		this.usersMapper = usersMapper;
	}

	public LogsMapper getLogsMapper() {
		return logsMapper;
	}

	public void setLogsMapper(LogsMapper logsMapper) {
		this.logsMapper = logsMapper;
	}
	
	

}
