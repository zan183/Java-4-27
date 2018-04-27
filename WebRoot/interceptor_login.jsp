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

  拦截器登录<br>
 <s:form action="interceptor" method="post">
     	<s:textfield label="用户名" name="username"/><br>
		<s:submit />
   </s:form>
   <br><br>
   
   
     用户名检查（以“r”结尾）登录<br>
<%--   <s:url var="userCheck" action="endWith" namespace="/sec1" /> --%>
<%--  不支持    <s:form action="${userCheck}" method="post">  --%>

   <s:form action="endWith"  namespace="/sec1" method="post" >
     	<s:textfield label="用户名" name="username" errorPosition="bottom" /><br>
		<s:submit />
   </s:form>
   <a href="/no1/sec1/myio">IO异常</a>
   <br><br>
<s:debug/>
  </body>
</html>
