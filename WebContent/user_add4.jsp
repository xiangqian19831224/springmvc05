<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>通过类别传参</title>
</head>
<body>
<h1>用户信息添加4</h1>
<form action="user/add4.do">
	編號:<input type="text" name="userId"/><br/>
	姓名:<input type="text" name="userName"/><br/>
	性別:<input type="text" name="userSex"/><br/>
	兴趣:
	<input type="checkbox" name="userXq" value="LOL"/>LOL
	<input type="checkbox" name="userXq" value="英雄联盟"/>英雄联盟
	<input type="checkbox" name="userXq" value="DOTA"/>DOTA
	
	<input type="submit" value="提交"/>
</form>
</body>
</html>