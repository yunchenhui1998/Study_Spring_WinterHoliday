package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xzy.Student;

@Controller
public class HelloController 
{
	@Autowired
	Student stu;
	
	@RequestMapping("/app/hello")
   public String hello(Model mod)
   {
	   mod.addAttribute("msg", "Hello Spring MVC");
	   mod.addAttribute("stu", stu);
	   return "hello";
   }
}
