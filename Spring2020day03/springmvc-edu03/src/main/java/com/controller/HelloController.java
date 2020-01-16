package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
public class HelloController 
{
	@Autowired
	Student stu;
	
	@RequestMapping("/app/hello")
   public String  hello(@RequestParam(name="name",defaultValue="admin")String name,
		   @RequestParam(name="age",defaultValue="23")int age,Model mod)
   {
		User user=new User();
		user.setName(name);
		user.setAge(age);
		
		mod.addAttribute("user", user);
		
		return "hello";
   }
	@RequestMapping(value= {"/app/hello2"},method= {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView  hello2( User user)
	   {
		   ModelAndView mv=new ModelAndView();
		   
		   mv.addObject("user", user);
			mv.setViewName("hello");
			return mv;
	   }
	
	@RequestMapping("/app/{artid}.do")
	   public String  hello(@PathVariable(name="artid")int artid,Model mod)
	   {
			
			mod.addAttribute("artid", artid);
			
			return "hello";
	   }
}
