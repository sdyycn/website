<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html>
<head>
	<meta http-equiv="Expires" content="0">  
	<meta http-equiv="Cache-Control" content="no-cache">  
	<meta http-equiv="Cache-Control" content="no-store">  
	<meta http-equiv="Pragma" content="no-cache"> 

	<link rel="stylesheet" type="text/css" href="css/base.css" />
	<link rel="stylesheet" type="text/css" href="css/master.css" />
   	<title><tiles:getAsString name="title" /></title>
    
<style>
.content {
	margin: 0 auto;
}

.top{
	background-color:#369;
	background-image:url("images/bg_top.jpg");
	height:75px;
}

.middle{
	padding-top:10px;
	background-color:rgb(210,230,250);
	height:680px;
	min-width:1080px;
}

.bottom{
	background-image:url("images/bg_bottom.jpg");
	background-color:#369;
	height:30px;
}

.left{
	background-color:rgb(210,230,250);
	float:left;
	width:180px;
	height:100%;
}

.right{
	background-color:rgb(210,230,250);
	float:left;
	height:100%;
	bording-left:1px;
}

.mbody{
	height:100%;
	width:900px;
}

</style>

</head>
<body>
<div class="content">
	<div class="top"><tiles:insertAttribute name="m_header" /></div>
	<div class="middle">
		<div class="left"><tiles:insertAttribute name="m_navigator" /></div>
		<div class="right">
			<div class="mbody"><tiles:insertAttribute name="m_body" /></div>
		</div>
	</div>
	<div class="clear"></div>
	<div class="bottom"><tiles:insertAttribute name="m_footer" /></div>
</div>
</body>
</html>
