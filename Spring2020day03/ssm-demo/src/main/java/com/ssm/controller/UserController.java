package com.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.pojo.Users;
import com.ssm.service.GuestService;

@Controller
public class UserController {
	@Autowired
	private GuestService guestService;
	
@RequestMapping("/toregist.htm")
public String toregist()
{
return "regist";
}
	
  @RequestMapping("/regist.htm")
	public String regist(Users u,Model mode)
	{
	  guestService.registUser(u);
	  mode.addAttribute("user",u);
		return "success";
	}
	
	
	public GuestService getGuestService() {
		return guestService;
	}

	public void setGuestService(GuestService guestService) {
		this.guestService = guestService;
	}
	
	
	
	

}
