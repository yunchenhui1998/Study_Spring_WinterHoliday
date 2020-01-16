package com.xzy.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xzy.beans.Book;


/**
 * 处理图书请求控制器
 * */
@Controller
public class BookController {


	/**
	 * 处理/main请求
	 * */
	@RequestMapping(value="/main")
	 public String main(Model model){
		// 模拟数据库获得所有图书集合
		List<Book> book_list = new ArrayList<Book>();
		book_list.add(new Book("a1.jpg","Java","李四",74.2));
		book_list.add(new Book("a2.jpg","Java EE","张三",59.2));
		book_list.add(new Book("a3.jpg","Android","小明",60.6));
		book_list.add(new Book("a4.jpg","Ajax讲义","小强",66.6));
		// 将图书集合添加到model当中
		model.addAttribute("book_list", book_list);
		// 跳转到main页面
		return "main";
	}
	
}
