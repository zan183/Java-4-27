<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'demo1.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<s:head/>
  </head>
  
  <body>
  form表单登录<br>
   <form action="checkLogin" method="post">
     	帐号:<input type="text" name="username"><br>
      	密码:<input type="password" name="password"><br>
      	<a href="./check.jsp">登录后才能查看信息</a><br>
      		<input type="submit" value="提交">
   </form>

<br><br>
标签从对象登录<br>
<!-- requiredPosition:定义必填标签label的位置 -->
 <s:form action="checkByObj" method="post">
     	<s:textfield label="帐号" name="stu.username" requiredLabel="true" requiredPosition="left"  errorPosition="bottom"/><br>
      	<s:password label="密码" name="stu.pass" errorPosition="bottom"/><br>
		<s:submit />
   </s:form>

   <br>
<s:debug/>
   <a href="Username">Action中执行自定义方法good</a>
  </body>
</html>
