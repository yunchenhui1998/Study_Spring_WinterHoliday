package com.xzy.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//@Controller
//@Component
@Repository
///@Service
public class FlashEmail implements Email {

	@Override
	public void send() {
		// TODO Auto-generated method stub
		System.out.println("Send Email..");
	}

	@Override
	public void recieve() {
		// TODO Auto-generated method stub
		System.out.println("Recieve Email..");
	}

}
