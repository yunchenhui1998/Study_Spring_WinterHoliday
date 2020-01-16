package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.pojo.User;
import com.xzy.Student;
/**
 * Handler中方法参数
 * HttpServletRequest 
 * HttpServletResponse
 * HttpSession
 * InputStream 
 * OutputStream 
 * reader 
 * Weriter
 * Model
 * Modelview
 * 
 * @author Administrator
 *
 */

@Controller
@RequestMapping("/app")
public class HelloController 
{
	@Autowired
	Student stu;
	
	@ModelAttribute
	public User initUser()
	{
		System.out.println("init...user...");
		User uer=new User();
		uer.setAge(22);
		uer.setName("小明");
		return uer;
	}
	
	
	@RequestMapping("/hello1")
   public String  hello1(@ModelAttribute User user,Model mod)
   {
		
		mod.addAttribute("user", user);
		return "hello";
   }
	
	
}
