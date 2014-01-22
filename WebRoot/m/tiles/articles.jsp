<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

    <title>My JSP 'content.jsp' starting page</title>
    
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

function article_add(){
	alert("click user add userAdd.action!");
	$("#t_admins").append("<tr><td>test</td></tr>");
	return false;
}
function article_modify(){
	alert("click user modify userModify.action!");
	return false;
}

function article_delete(id){
//	alert("article_delete.action?id="+id);
	var url = "article_delete_json.action?id=" + id;
//	$.get(url, function(data, status){
//		alert("Data: " + data + "\nStatus: " + status);
//	});
	$.getJSON(url, function(res){
		var json = eval("("+ res + ")");
		if (json.code != -1){
			alert("delete successful, id="+json.id);
			// remove the html node.
			$("#tr_"+id).hide();
		}
	});
	return false;
}
</script>
  </head>
  
  <body>
   	<div><h3>信息管理</h3></div>
   	<s:form name="farticles" action="" onsubmit="return submit();">
   	<table class="list-layout wd-900">
   		<tr>
   			<th>序号</th>
   			<th>管理</th>
   			<th>标题</th>
   			<th>栏目</th>
   			<th>模型</th>
		   	<th>发布人</th>
		   	<th>来源</th>
		   	<th>发布时间</th>
		   	<th>修改时间</th>
   		</tr>
	   	<tr>
	   		<td>0</td>
	   		<td>修改 | 删除</td>
		   	<td>标题1</td>
		   	<td>公司介绍</td>
		   	<td>文章模型</td>
		   	<td>作者</td>
		   	<td>原创</td>
		   	<td>发布时间</td>
		   	<td>修改时间</td>	   	
	   	</tr>
	   	
	   	<s:iterator value="articles" id="column" status="st">
    		<tr id='tr_<s:property value="id" />'>
    			<td><s:property value="#st.count" /></td>
    			<td>
    			<a href="article_modify.action?id=<s:property value='id'/>">修改</a>
    			|
    			<a href="javascript:article_delete('<s:property value='id'/>')">删除</a>
    			</td>
	    		<td><s:property value="title" /></td>
	    		<td><s:property value="type" /></td>
	    		<td>
	    			<s:if test="%{model==0}">
	    			文章模型
	    			</s:if>
	    			<s:elseif test="%{model==1 }">
	    			图片模型
	    			</s:elseif>
	    			<s:elseif test="%{model==2 }">
	    			下载模型
	    			</s:elseif>
	    			<s:elseif test="%{model==3 }">
	    			广告模型
	    			</s:elseif>
	    			<s:else>
	    			其他模型
	    			</s:else>
	    		</td>
	    		<td><s:property value="author" /></td>
	    		<td>
	    			<s:if test="%{source==0}">
	    			原创
	    			</s:if>
	    			<s:elseif test="%{model==1 }">
	    			转载
	    			</s:elseif>
	    			<s:else>
	    			其他
	    			</s:else>
	    		</td>
	    		<td><s:date name="timePublish" format="yyyy-MM-dd" /></td>
	    		<td><s:date name="timeUpdate" format="yyyy-MM-dd" /></td>
    		</tr>
    	</s:iterator>
    	
	   <tr>
		   	<td colspan="9">
		   		<a href="article_add.action">添  加</a>
		   		[首页] [前一页] [后一页] [末页]
		    </td>
	   </tr>
   </table>
   </s:form>
   
<!--    <div><img src="/tt/m/images/news.png" alt="mwg"/></div>  -->
  </body>
</html>
