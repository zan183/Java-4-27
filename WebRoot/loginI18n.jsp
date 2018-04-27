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

    国际化登录<br>
    <s:actionerror />
<!-- requiredPosition:定义必填标签label的位置 -->
 <s:form action="LoginI18N" method="post">
     	<s:textfield key="username" /><br>
      	<s:password key="password"/><br>
        <s:radio label="选项" name="type" list="{'forward','redirect'}" value="'forward'"/>
		<s:submit />
   </s:form>
   <br><br>
   <br>
<s:debug/>
<br><br>
<%
	//服务器的默认语言
	Locale locale=Locale.getDefault();
	out.println("服务器默认语言："+locale);
	//客户端的默认语言
	out.print("客户端默认语言："+request.getLocale());
 %>
 
  </body>
  <a href="ShowLocs">显示国家和语言</a>
</html>
