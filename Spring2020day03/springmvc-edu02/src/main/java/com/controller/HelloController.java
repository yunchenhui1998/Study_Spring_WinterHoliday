package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
public class HelloController 
{
	@Autowired
	Student stu;
	
	@RequestMapping("/app/hello")
   public void hello(HttpServletRequest req,HttpServletResponse resp)
   {
	     try {
			resp.setContentType("text/html;charset=utf-8");
			 PrintWriter out=resp.getWriter();
			 
			 out.println("<h1>hello,"+stu.getName()+"</h1>");
			 
			 out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   }
	@RequestMapping("/app/hello2")
	   public void hello2(Writer out,Model mod)
	   {
		     try {
				//resp.setContentType("text/html;charset=utf-8");
				 //PrintWriter out=resp.getWriter();
				 
		    	 mod.addAttribute("stu", stu);
		    	 out.write("<h1>hello,"+stu.getName()+"</h1>");
				 
				 out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	   }
}
