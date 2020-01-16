package com.xzy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.druid.support.logging.LogFactory;
import com.xzy.benas.User;
import com.xzy.validator.UserValidator;

@Controller
public class UserController{

	 
	// 注入UserValidator对象
	@Autowired
	@Qualifier("userValidator")
	private UserValidator userValidator;
	
	@RequestMapping(value="/{formName}")
	 public String loginForm(
			 @PathVariable String formName,
			 Model model){
		User user = new User();
		model.addAttribute("user",user);
		// 动态跳转页面
		return formName;
	}
	 
	 @RequestMapping(value="/login",method=RequestMethod.POST)
	 public String login(
			 @ModelAttribute User user,
			 Model model,
			 Errors errors) {
		
		 model.addAttribute("user", user);
		 // 调用userValidator的验证方法
		 userValidator.validate(user, errors);
		 // 如果验证不通过跳转到loginForm视图
		 if(errors.hasErrors()){
			 return "loginForm";
		 }
	     return "success";
	 }

}

