<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
 
    <title>My JSP 'member.jsp' starting page</title>
    
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
	var url = "user_delete_json.action?uid=" + uid;
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
    <a href="member_setting.action">注册设置</a>
    <div><h3>会员账户</h3></div>
    <table class="list-layout wd-900">
	    <thead>
	    	<tr>
	    		<th>口</th>
	    		<th>管理</th>
	    		<th>用户ID</th>
	    		<th>用户名</th>
	    		<th>类型</th>
	    		<th>性别</th>
	    		<th>部门</th>
	    		<th>状态</th>
	    		<th>最近登录</th>
	    		<th>手机</th>
	    		<th>联系电话</th>
	    		<th>QQ</th>
	    		<th>EMAIL</th>
	    		
	    		<th>注册日期</th>
	    	</tr>
	    </thead>
	    <tbody>
	    	<tr>
	    		<td>口</td>
	    		<td>修改|删除</td>
	    		<td>vip001</td>
	    		<td>mwg</td>
	    		<td>VIP会员</td>
	    		<td>M</td>
	    		<td>技术部</td>
	    		<td>正常</td>
	    		<td>2013-12-27</td>
	    		<td>13867506596</td>
	    		<td>89990777</td>
	    		<td>89990777</td>
	    		<td>d@d.com</td>
	    		<td>2013-12-27</td>
	    	</tr>
	    	<tr>
	    		<td>口</td>
	    		<td>修改|删除</td>
	    		<td>test001</td>
	    		<td>mwg</td>
	    		<td>普通会员</td>
	    		<td>M</td>
	    		<td>技术部</td>
	    		<td>停用</td>
	    		<td>2013-12-27</td>
	    		<td>13867506596</td>
	    		<td>89990777</td>
	    		<td>89990777</td>
	    		<td>d@d2.com</td>
	    		<td>2013-12-27</td>
	    	</tr>
	    	<s:iterator value="users" id="column" status="st">
	    		<tr id='tr_<s:property value="uid" />'>
	    			<td><s:property value="#st.count" /></td>
	    			<td>
	    			<a href="member_modify.action?uid=<s:property value='uid'/>">修改</a>
	    			|
	    			<a href="javascript:user_delete('<s:property value='uid'/>')">删除</a>
	    			</td>
		    		<td><s:property value="uid" /></td>
		    		<td><s:property value="name" /></td>
		    		<td>
		    			<s:if test="%{type==0}">
		    			VIP会员
		    			</s:if>
		    			<s:elseif test="%{type==1 }">
		    			普通会员
		    			</s:elseif>
		    			<s:else>
		    			其他会员
		    			</s:else>
		    		</td>
		    		<td>
		    			<s:if test="%{sex==0}">
		    			男
		    			</s:if>
		    			<s:else>
		    			女
		    			</s:else>
		    		</td>
		    		<td><s:property value="department" /></td>
		    		<td>
		    			<s:if test="%{status==0}">
		    			正常
		    			</s:if>
		    			<s:else>
		    			停用
		    			</s:else>
		    		</td>
		    		<td><s:date name="dateLogin" format="yyyy-MM-dd" /></td>
		    		<td><s:property value="mobile" /></td>
		    		<td><s:property value="phone" /></td>
		    		<td><s:property value="qq" /></td>
		    		<td><s:property value="email" /></td>
		    		<td><s:date name="dateRegist" format="yyyy-MM-dd" /></td>
	    		</tr>
	    	</s:iterator>
	    	<tr>
	    	<td colspan="14">
	    		<a href="member_add.action">添加</a> | 删除
	    		[前一页][下一页][首页][尾页] 第[1]页
	    	</td>
	    	</tr>
	    </tbody>
    </table>
  </body>
</html>

