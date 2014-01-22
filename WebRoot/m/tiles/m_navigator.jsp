<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<script type="text/javascript" src="js/menu1.js"></script>
<style type="text/css">
#menubar {
	margin-left:auto;
	margin-right:auto;
	width:160px;
	height:650px;
}

dt {
	background-image: url("images/menu_bg.jpg");
	width:140px;
	height:26px;
	color:#0C3A9C;
	font-weight:bold;
	line-height:26px;
	text-indent:0 px;
}
#menu_list{
	margin-left:8px;
	text-align:center;
}

.mdl{
	height:300px;
}

#menu_top {
	background-image:url("images/menu_head.jpg");
	text-align:center;
	width:160px;
	height:27px;
}

#menu_body{
	background-image: url("images/slide.jpg");
	text-align: center;
	height:100%;
}

.mtop1{
	float:left;
	margin-left:20px;
}
.mtop2{
	float:left;
	margin-left:15px;
}
</style>

<div id="menubar">
	<div id="menu_top">
		<div class="mtop1"><a href="manage.action">管理首页</a></div>
		<div class="mtop2"><a href="index.action">站点首页</a></div>
	</div>
	<div id="menu_body">
		<div id="menu_list">
		<dl>
		  	<dt onclick="javascript:show(this);">基本配置</dt>
		  	<dd><a href="environment.action">系统环境</a></dd>
		  	<dd><a href="siteinfo.action">网站配置</a></dd>
		  	<dd><a href="db.action">数据管理</a></dd>
		</dl>
		<dl>
		  	<dt onclick="javascript:show(this);">信息设置</dt>
		  	<dd><a href="menus.action">栏目设置</a></dd>
		  	<dd><a href="articles.action">信息管理</a></dd>
		  	<dd><a href="article_publish.action">发布信息</a></dd>
		</dl>
		<dl>
		  	<dt onclick="javascript:show(this);">模型设置</dt>
		  	<dd><a href="manage.action">新闻页面</a></dd>
		  	<dd><a href="manage.action">图片页面</a></dd>
		  	<dd><a href="manage.action">下载页面</a></dd>
		  	<dd><a href="manage.action">广告页面</a></dd>
		</dl>
	 	<dl>
		  	<dt onclick="javascript:show(this);">账户设置</dt>
		  	<dd><a href="members.action">普通会员</a></dd>
		  	<dd><a href="admins.action">系统账户</a></dd>
		</dl>
		</div>
	</div>
</div>
