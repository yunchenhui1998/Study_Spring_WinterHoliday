package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

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
	
	@RequestMapping("/hello1")
   public String  hello1(HttpSession session,Model mod)
   {
		session.setAttribute("aa", "123");
		mod.addAttribute("msg", "hello1");
		return "hello";
   }
	
	@RequestMapping("/hello2")
	   public String  hello1(@CookieValue("JSESSIONID")String sid,Model mod)
	   {

			mod.addAttribute("sid", sid);
			return "hello";
	   }
	@RequestMapping("/hello3")
	   public String  hello3(@RequestHeader("Accept-Language")String sl,Model mod)
	   {

			mod.addAttribute("sl", sl);
			return "hello";
	   }
	
}
