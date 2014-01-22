<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<s:bean name="cn.cms.manage.bean.LoginPage" id="p" />
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>login.jsp</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

<script  language="javascript" type="text/javascript">
	function refresh(obj)
		{
			document.getElementById("authImg").src='validateCodes.action?now='+new Date();
		}
		
function check_login()
 {

  Obj=document.getElementById("uid");
  if(Obj.value=="")
   {
     alert("请输入管理员!");
     Obj.focus();
     return false;
   }


  Obj=document.getElementById("pwd");
  if(Obj.value=="")
   {
     alert("请输入密码!");
     Obj.focus();
     return false;
   }

  Obj=document.getElementById("code");
  if(Obj.value=="")
   {
     alert("请输入验证码!");
     Obj.focus();
     return false;
   }

 }
</script>
	
	
<style>
#layout  {TEXT-ALIGN: center;}
#center { MARGIN-RIGHT: auto; MARGIN-LEFT: auto; }
body{
	text-align: center;
}

.login{
	background-image: url(images/login.jpg);
	height: 350px;
	width: 500px;
	margin-top: 100px;
	margin-left: auto;
	margin-right: auto;
}

#tb_login{
	float:left;
	margin-top:180px;
	margin-left:180px;
	
}
</style>
  </head>
  
  <body>
    <div class="login">
    <s:form action="login.action">
    <table id="tb_login">
    	<tr>
    		<td><s:property value="#p.username"/></td>
    		<td><s:textfield name="uid" label="User Name:" /></td>
    	</tr>
    	<tr>
    		<td><s:property value="#p.password"/></td>
    		<td><s:password name="pwd" label="Password:" /></td>
    	</tr>
    	<tr>
    		<td><s:property value="#p.code"/></td>
    		<td>
    			<s:textfield name="code" label="validate codes:" value="" />
    			<img id="authImg" src="validateCodes.action" onclick="refresh(this)"/> 
    		</td>
    	</tr>
    	<tr>
    		<td></td>
    		<td>
    			<s:submit value="登  录" />
    			&nbsp;&nbsp;&nbsp;
    			<a href="regist.jsp"><s:property value="#p.regist"/></a>
    		</td>
    	</tr>
    	<tr>
    		<td colspan="2"><s:actionerror/></td>
    	</tr>
    </table>
    </s:form>
    </div>
  </body>
</html>
