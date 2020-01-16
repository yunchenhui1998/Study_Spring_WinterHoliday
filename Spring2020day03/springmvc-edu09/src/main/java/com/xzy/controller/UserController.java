package com.xzy.controller;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xzy.beans.User;



@Controller
public class UserController{
	
	private static final Log logger = LogFactory.getLog(UserController.class);
	 
	@RequestMapping(value="/{formName}")
	 public String loginForm(@PathVariable String formName){
		
		// 动态跳转页面
		return formName;
	}
	 
	 @RequestMapping(value="/register",method=RequestMethod.POST)
	 public String register(
			 @ModelAttribute User user,
			 Model model) {
		 logger.info(user);
		 model.addAttribute("user", user);
	     return "success";
	 }

}

