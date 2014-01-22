<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'admins.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="css/default.css">
	<script type="text/javascript" src="js/jquery-1.10.1.min.js"></script>

<script type="text/javascript">
function submit(){
	return false;
}

function user_add(){
	alert("click user add userAdd.action!");
	$("#t_admins").append("<tr><td>test</td></tr>");
	return false;
}
function user_modify(){
	alert("click user modify userModify.action!");
	return false;
}

function user_delete(uid){
//	alert("user_delete.action?uid="+uid);
	var url = "admin_delete_json.action?uid=" + uid;
//	$.get(url, function(data, status){
//		alert("Data: " + data + "\nStatus: " + status);
//	});
	$.getJSON(url, function(res){
		var json = eval("("+ res + ")");
		if (json.code != -1){
			alert(json.uid);
			// remove the html node.
			$("#tr_"+uid).hide();
		}
	});
	return false;
}
</script>

  </head>
  
  <body>
  <div><h3>管理员账户</h3></div>
  	<s:form name="fadmins" action="" onsubmit="return submit();">
    <table id="t_admins" class="list-layout wd-900">
	    <thead>
	    	<tr>
	    		<th>序号</th>
	    		<th>管理</th>
	    		<th>ID</th>
	    		<th>名称</th>
	    		<th>密码</th>
	    		<th>类型</th>
	    		<th>组别</th>
	    		<th>EMAIL</th>
	    		<th>状态</th>
	    		<th>注册日期</th>
	    		<th>备注</th>
	    	</tr>
	    </thead>
	    <tbody>
	    	<tr>
	    		<td>0</td>
	    		<td>
	    			<a href="">修改</a>
	    			|
	    			<a href="">删除</a>
	    		</td>
	    		<td>admin</td>
	    		<td>mwg</td>
	    		<td>EXDDSEFSDF32dsdf</td>
	    		<td>管理员</td>
	    		<td>2</td>
	    		<td>mwg@163.com</td>
	    		<td>停用(正常)</td>
	    		<td>2013-12-27</td>
	    		<td>测试用固定字段</td>
	    	</tr>
	    	
	    	<s:iterator value="admins" id="column" status="st">
	    		<tr id='tr_<s:property value="uid" />'>
	    			<td><s:property value="#st.count" /></td>
	    			<td>
	    			<a href="admin_modify.action?uid=<s:property value='uid'/>">修改</a>
	    			|
	    			<a href="javascript:user_delete('<s:property value='uid'/>')">删除</a>
	    			</td>
		    		<td><s:property value="uid" /></td>
		    		<td><s:property value="name" /></td>
		    		<td><s:property value="pwd" /></td>
		    		<td>
		    			<s:if test="%{type==0}">
		    			管理员
		    			</s:if>
		    			<s:elseif test="%{type==1 }">
		    			编辑员
		    			</s:elseif>
		    			<s:else>
		    			其他人员
		    			</s:else>
		    		</td>
		    		<td>
		    			<s:if test="%{gid==0}">
		    			管理员组
		    			</s:if>
		    			<s:else>
		    			其他组
		    			</s:else>
		    		</td>
		    		<td><s:property value="email" /></td>
		    		<td>
		    			<s:if test="%{status==0}">
		    			正常
		    			</s:if>
		    			<s:else>
		    			停用
		    			</s:else>
		    		</td>
		    		<td><s:date name="dateRegist" format="yyyy-MM-dd" /></td>
		    		<td><s:property value="description" /></td>
	    		</tr>
	    	</s:iterator>
	    	
	    	<tr>
	    	<td colspan="11">
	    		<a href="admin_add.action">添加账户</a>
	    	</td>
	    	</tr>
	    </tbody>
    </table>
    </s:form>
  </body>
</html>
