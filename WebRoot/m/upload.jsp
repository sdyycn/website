<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

    <title>简单文件上传</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <div style="color:red">
  	<s:fielderror/>
  </div>
    <s:form action="upload.action" method="POST" enctype="multipart/form-data">
    	title:<s:textfield name="title"/><br>
    	file1:<s:file name="upload" /><br>
    	file2:<s:file name="upload" /><br>
    	file3:<s:file name="upload" /><br>
    	<s:submit value="上传" />
    </s:form>
  </body>
</html>
