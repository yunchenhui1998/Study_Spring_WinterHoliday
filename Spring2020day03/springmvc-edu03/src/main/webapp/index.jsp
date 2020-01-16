<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>hello jsp</h1>
<center>
<h1>传参给Handler</h1>
   
  <a href="app/hello?name=lisi&age=23">Get传参</a><br/>
  <h3>Post传参</h3>
  <form action="app/hello2" method="post">
    UserName:<input type="text" name="name" /><br/>
     UserAge:<input type="number" name="age" /><br/>
     <input type="submit" value="Post传参"/>
  </form>
   <h2>路径变量</h2>
   <p>http://localhost/cms/aricle/delete?id=23</p>
   <p>http://localhost/cms/aricle/delete/23.do</p>
   <a href="app/23.do">路径变量</a>
</center>
</body>
</html>