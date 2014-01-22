<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>

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
	
	<script type="text/javascript" charset="utf-8" src="include/ueditor/ueditor.config.js"></script>
	<script type="text/javascript" charset="utf-8" src="include/ueditor/ueditor.all.js"></script>
	<script type="text/javascript" charset="utf-8" src="include/ueditor/lang/zh-cn/zh-cn.js"></script>
	
<style type="text/css">
.td_title{
width:50px;
}

</style>

<script type="text/javascript">
var editor = UE.getEditor('myEditor', {initialFrameHeight:260,initialFrameWidth:800,textarea:'editorValue'});

function Submit(){
	return true;
}
</script>
  </head>
  
  <body>
  <sx:head extraLocales="UTF-8"/>
  <s:head theme="simple" />
  <div>
  <s:form id="farticle" action="article_publish.action?m=add">
  <table class="list-layout wd-900">
	    <thead>
	    	<tr>
	    		<th colspan="2">信息发布</th>
	    	</tr>
	    </thead>
	    <tbody>
	    	<tr>
	    		<td class="td_title">所属栏目</td>
	    		<td>
	    			<s:select name="article.type" list="#{0:'公司介绍',1:'产品展示',2:'文件下载',3:'人才招聘',4:'其他'}"  listkey="key" listValue="value" cssStyle="width:100px"/>
	    		</td>
	    	</tr>
	    	<tr>
	    		<td class="td_title">模型</td>
	    		<td>
	    			<s:select name="article.model" list="#{0:'新闻模型',1:'图片模型',2:'下载模型',3:'广告模型',4:'其他'}"  listkey="key" listValue="value" cssStyle="width:100px"/>
	    		</td>
	    	</tr>
	    	<tr>
	    		<td class="td_title">来源</td>
	    		<td>
	    			<s:select name="article.source" list="#{0:'原创',1:'转载',2:'翻译'}"  listkey="key" listValue="value" cssStyle="width:100px"/>
	    		</td>
	    	</tr>
	    	<tr>
	    		<td class="td_title">标题</td>
	    		<td><s:textfield name="article.title" size="100" maxlength="250"/></td>
	    	</tr>
	    	<tr>
	    		<td class="td_title">作者</td>
	    		<td><s:textfield name="article.author" /></td>
	    	</tr>
	    	
	    	<tr>
	    		<td class="td_title">摘要</td>
	    		<td>
	    			<s:textarea name="article.summary" cols="74" rows="3" label="keys" tooltip="文章摘要" />
	    		</td>
	    	</tr>
	    	<tr>
	    		<td class="td_title">附件</td>
	    		<td><s:textfield name="article.attachment" size="100" maxlength="250"/></td>
	    	</tr>
	    	<tr>
	    		<td class="td_title">内容</td>
	    		<td>
	    			<script type="text/plain" id="myEditor" name="content"></script>
        		</td>
	    	</tr>
	    	<tr>
	    		<td class="td_title">发布日期</td>
	    		<td><sx:datetimepicker language="UTF-8" name="article.timePublish" /></td>
	    	</tr>
	    	<tr>
	    		<td colspan="2">
	    			<center><s:submit value="发  布"/></center>
	    		</td>
	    	</tr>
	    </tbody>
    </table>
   </s:form>
   </div>
  </body>

</html>
