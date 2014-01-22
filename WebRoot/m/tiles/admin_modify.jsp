<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'useradd.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="css/default.css">
	<script type="text/javascript" src="js/jquery-1.10.1.min.js"></script>
	
<script type="text/javascript">
function Submit(){
	var pwd = $("#pwd").val();
	var pwd1 = $("#pwd1").val();
	if (pwd != pwd1){
		alert("两次输入的密码不一致，请重新输入!");
		return false;
	}
	// check mobile, phone, mail, login id.
	
	return true;
}
</script>
  </head>
  
  <body>
  	<div>
  		<h3>修改账户</h3>
  		<s:form id="fadminmodify" action="admin_modify.action?m=modify">
  		<table class="list-layout wd-600">
  			<tr>
  				<th>类型</th>
  				<td>
  					<s:select name="admin.type" list="#{0:'管理员',1:'编辑员'}"  listkey="key" listValue="value" cssStyle="width:100px"/>
  				</td>
  			</tr>
  			<tr>
  				<th>用户名</th>
  				<td><s:textfield name="admin.name" size="30" maxlength="50" /></td>
  			</tr>
  			<tr>
  				<th>登录名</th>
  				<td><s:textfield name="admin.uid" size="30" maxlength="50" readonly="true" /></td>
  			</tr>
  			<tr>
  				<th>密码</th>
  				<td><s:password name="pwd" size="30" maxlength="50" /></td>
  			</tr>
  			<tr>
  				<th>确认密码</th>
  				<td><s:password name="pwd1" size="30" maxlength="50" /></td>
  			</tr>
  			<tr>
  				<th>用户组</th>
  				<td>
  					<s:select name="admin.gid" list="#{0:'管理员组',1:'其他组'}"  listkey="key" listValue="value" cssStyle="width:100px"/>
  				</td>
  			</tr>
  			<tr>
  				<th>邮箱</th>
  				<td><s:textfield name="admin.email" size="30" maxlength="50" /></td>
  			</tr>
  			<tr>
  				<th>状态</th>
  				<td>
  					<s:select name="admin.status" list="#{0:'正常',1:'停用'}"  listkey="key" listValue="value" cssStyle="width:100px"/>
  			</tr>
  			<tr>
  				<th>QQ</th>
  				<td><s:textfield name="admin.qq" size="30" maxlength="50" /></td>
  			</tr>
  			<tr>
  				<th>手机</th>
  				<td><s:textfield name="admin.mobile" size="30" maxlength="50" /></td>
  			</tr>
  			<tr>
  				<th>联系电话</th>
  				<td><s:textfield name="admin.phone" size="30" maxlength="50" /></td>
  			</tr>
  			<tr>
  				<th>地址</th>
  				<td><s:textfield name="admin.address" size="80" maxlength="100" /></td>
  			</tr>
  			<tr>
  				<th>备注</th>
  				<td><s:textfield name="admin.description" size="80" maxlength="100" /></td>
  			</tr>
  			<tr>
  				<td colspan="2">
  					<a href="admins.action">返回</a>
  					<s:submit value="提交" onclick="return Submit();"/>
  				</td>
  			</tr>
  		</table>
  		</s:form>
  	</div>
    <br>
  <!--    <div><img src="/tt/m/images/newuser.png" alt="mwg"/></div> --> 
  </body>
</html>
