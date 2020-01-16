<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.*,com.xzy.beans.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
<style type="text/css">
	table{border-collapse:collapse;border-spacing:0;border-left:1px solid #888;border-top:1px solid #888;background:#efefef;}
	th,td{border-right:1px solid #888;border-bottom:1px solid #888;padding:5px 15px;}
	th{font-weight:bold;background:#ccc;}
</style>
</head>
<body>
<h3>欢迎[${sessionScope.user.username }]访问</h3>
<br>
<table border="1">
	<tr>
		<th>封面</th><th>书名</th><th>作者</th><th>价格</th>
	</tr>
	<%List<Book> list=(List<Book>)request.getAttribute("book_list");
	 for(Book book:list)
	 {
	%>
	
		<tr>
			<td><img src="img/<%=book.getImage() %>" height="60"></td>
			<td><%=book.getName() %></td>
			<td><%=book.getAuthor() %></td>
			<td><%=book.getPrice()%></td>
		</tr>
<%
}
%>
</table>
</body>
</html>