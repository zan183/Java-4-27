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
    
    <title>My JSP 'showlocs.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body><table style="border:1px solid green">
   <s:iterator value="loc" var="l">
   		 <tr>
   		 <td><s:property value="#l.displayname" />
   		--</td>
   		<td><s:property value="#l.getDisplayName(#l)" /></td>
   		</tr>
   </s:iterator>
   </table>
<!--    listkey:给用户看的  listValue:给程序的 -->
	<s:select list="loc" listkey="" listValue="displayName" />
	<s:select list="locMaps" listKey="value" listValue="key" />
  </body>
</html>
