<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

    <title>My JSP 'menuinfo.jsp' starting page</title>
    
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

function menu_add(){
}

function menu_modify(id){
	var url = "menus.action?m=modify&mid="+id;
}

function menu_delete(id){
	var url = "menus.action?m=delete&mid="+id;
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
  	<div><h3>栏目设置</h3></div>
  	<div>
  	<s:form name="fmenus" action="" onsubmit="return submit();">
  	<table class="list-layout wd-900">
  		<tr>
  			<th>名称</th>
  			<th>类型</th>
  			<th>目录</th>
  			<th>显示</th>
  			<th>KEY</th>
  			<th>管理</th>
  		</tr>
	  	<tr>
	  		<td>首页</td>
	  		<td>首页</td>
	  		<td>/</td>
	  		<td>显示</td>
	  		<td>0</td>
	  		<td>子栏目|删除</td>
	  	</tr>
	  	<tr>
	  		<td>介绍</td>
	  		<td>栏目页</td>
	  		<td>/jieshao</td>
	  		<td>显示</td>
	  		<td>1</td>
	  		<td>子栏目|删除</td>
	  	</tr>
	  	<tr>
	  		<td>产品中心</td>
	  		<td>栏目页</td>
	  		<td>/product</td>
	  		<td>显示</td>
	  		<td>2</td>
	  		<td>子栏目|删除</td>
	  	</tr>
	  	
	  	<s:iterator value="menus" id="column" status="st">
    		<tr id='tr_<s:property value="mid" />'>
    		
	    		<td><s:textfield name="name" /></td>
	    		<td>栏目页</td>
	    		<td><s:textfield name="directory" /></td>
	    		<td>
	    			<s:if test="%{status==1}">
	    			显示
	    			</s:if>
	    			<s:else>
	    			隐藏
	    			</s:else>
	    		</td>
	    		<td><s:textfield name="key" /></td>
	    		<td>
    			<a href="javascript:menu_modify('<s:property value='mid'/>')">修改</a>
    			|
    			<a href="javascript:menu_delete('<s:property value='mid'/>')">删除</a>
    			</td>
    		</tr>
	    </s:iterator>
	    	
	  	<tr>
	  		<td colspan="6"><a href="javascript:menu_add()">添加菜单</a></td>
	  	</tr>
	  	
  	</table>
  	</s:form>
  	</div>
  </body>
</html>
