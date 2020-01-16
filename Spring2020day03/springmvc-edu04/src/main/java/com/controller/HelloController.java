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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
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
@RequestMapping("/app")
public class HelloController 
{
	@Autowired
	Student stu;
	
	@RequestMapping("/hello1")
   public String  hello1(Model mod)
   {
		mod.addAttribute("msg", "hello1");
		return "hello";
   }
	@RequestMapping(path= {"/hello2","/hi"},method= {RequestMethod.GET})
	   public String  hello2(Model mod)
	   {
			mod.addAttribute("msg", "hello2");
			return "hello";
	   }
	@RequestMapping(path= {"/hello3"},method= {RequestMethod.GET},params= {"name=admin"})
	   public String  hello3(@RequestParam("name")String name,Model mod)
	   {
			mod.addAttribute("msg", "hello3"+name);
			return "hello";
	   }
	@RequestMapping(path= {"/hello4"},produces="application/json;charset=utf-8")
	   public String  hello4(HttpServletResponse resp)
	   {
		  try {
			PrintWriter out=resp.getWriter();
			  out.println("{\"name\":\"lisi\",\"age\":23}");
			  out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
			return null;
	   }
	@ResponseBody
	@RequestMapping(path= {"/hello5"},produces="application/json;charset=utf-8")
	   public String  hello5()
	   {
		
			return "{\"name\":\"lisi\",\"age\":23}";
	   }
}
