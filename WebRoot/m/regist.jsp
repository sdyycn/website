<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  
   	<title>My JSP 'regist.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

	<script type="text/javascript">
		function validateName(){
			var url = 'validateName.action';
			var params = Form.Element.serialize('name');
			var myAjax = new Ajax.Request(
			url,
			{
				method:'post',
				parameters:params,
				onComplete:processResponse,
				asynchronous:true
			});
		}
		function processResponse(request){
			var action = request.responseText.parseJSON();
			$("tip").innerHTML = action.tip;
		}
		
		function refresh(obj)
		{
			document.getElementById("authImg").src='validateCodes.action?now='+new Date();
		}
	</script>
  </head>
  
  <body>
    <div align="center">
    <h3>请输入注册信息</h3>
    <s:actionerror/>
    <span id="tip" style="color:red;font-weight:bold"></span>
    <s:form action="regist.action">
    <table>
    	<tr>
    		<td>用户名:</td>
    		<td><s:textfield name="name" label="用户名" onblur="validateName();"/></td>
    	</tr>
    	<tr>
    		<td>密码:</td>
    		<td><s:textfield name="pwd" label="密码" /></td>
    	</tr>
    	<tr>
    		<td>Email:</td>
    		<td><s:textfield name="email" label="EMail" /></td>
    	</tr>
    	<tr>
    		<td>验证码:</td>
    		<td>
    			<s:textfield name="code" label="验证码" value="" />
    			<img id="authImg" src="validateCodes.action" onclick="refresh(this)"/> 
    		</td>
    	</tr>
    	<tr>
    		<td></td><td><s:submit value="注册" /></td>
    	</tr>
    </table>
    </s:form>
    </div>
  </body>
</html>
