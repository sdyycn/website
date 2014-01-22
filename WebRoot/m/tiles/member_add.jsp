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

  </head>
  
  <body>
  	<div>
  		<h3>添加账户</h3>
  		<s:form id="fuseradd" action="member_add.action?m=add">
  		<table class="list-layout wd-500">
  			<tr>
  				<th>类型</th>
  				<td>
  					<s:select name="user.type" list="#{0:'VIP会员',1:'普通会员',2:'其他会员'}"  listkey="key" listValue="value" cssStyle="width:100px"/>
  				</td>
  			</tr>
  			<tr>
  				<th>用户名</th>
  				<td><s:textfield name="user.name" maxlength="30"/></td>
  			</tr>
  			<tr>
  				<th>登录名</th>
  				<td><s:textfield name="user.uid" maxlength="20"/></td>
  			</tr>
  			<tr>
  				<th>密码</th>
  				<td><s:password id="pwd" name="pwd" size="30" maxlength="30" /></td>
  			</tr>
  			<tr>
  				<th>确认密码</th>
  				<td><s:password id="pwd1" name="pwd1" size="30" maxlength="30" /></td>
  			</tr>
  			<tr>
  				<th>性别</th>
  				<td><s:select name="user.sex" list="#{0:'男',1:'女'}" listkey="key" listValue="value" />
  			</tr>
  			<tr>
  				<th>年龄</th>
  				<td><s:textfield name="user.age" onkeyup="value=value.replace(/[^\d]/g,'')" /></td>
  			</tr>
  			<tr>
  				<th>学校</th>
  				<td><s:textfield name="user.school" maxlength="30"/> </td>
  			</tr>
  			<tr>
  				<th>公司</th>
  				<td><s:textfield name="user.company" maxlength="50"/></td>
  			</tr>
  			<tr>
  				<th>部门职位</th>
  				<td><s:textfield name="user.department" maxlength="25"/></td>
  			</tr>
  			<tr>
  				<th>邮箱</th>
  				<td><s:textfield name="user.email" maxlength="50"/></td>
  			</tr>
  			<tr>
  				<th>状态</th>
  				<td>
  					<s:select name="user.status" list="#{0:'正常',1:'停用'}"  listkey="key" listValue="value" cssStyle="width:100px"/>
  				</td>
  			</tr>
  			<tr>
  				<th>手机</th>
  				<td><s:textfield name="user.mobile" maxlength="15"/></td>
  			</tr>
  			<tr>
  				<th>QQ</th>
  				<td><s:textfield name="user.qq" maxlength="15"/></td>
  			</tr>
  			<tr>
  				<th>联系电话</th>
  				<td><s:textfield name="user.phone" maxlength="15"/></td>
  			</tr>
  			<tr>
  				<th>FAX</th>
  				<td><s:textfield name="user.fax" maxlength="15"/></td>
  			</tr>
  			<tr>
  				<th>联系地址</th>
  				<td><s:textfield name="user.address" size="50" maxlength="50"/></td>
  			</tr>
  			<tr>
  				<th>备注</th>
  				<td><s:textfield name="user.note" size="50" maxlength="250"/></td>
  			</tr>
  			<tr>
  				<td colspan="2">
  					<a href="members.action">返回</a>
  					<s:submit value="提交" />
  				</td>
  			</tr>
  		</table>
  		</s:form>
  	</div>
    <br>
    
  <!--    <div><img src="/tt/m/images/newuser.png" alt="mwg"/></div> --> 
  </body>
</html>
