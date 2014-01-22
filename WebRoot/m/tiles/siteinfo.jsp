<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

    <title>My JSP 'siteinfo.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

	<link rel="stylesheet" type="text/css" href="css/default.css">


  </head>
  
  <body>

  	<div>
  	<s:form id="fsiteinfo" action="siteinfo.action?m=save">
    <table class="list-layout wd-700" width="90%">
	    <thead>
		    <tr>
		    	<th colspan="2">站点设置</th>
		    </tr>
	    </thead>
    	<tr>
    		<td>站点名称</td>
    		<td><s:textfield name="siteName" size="100" maxlength="200" /></td>
    	</tr>
    	<tr>
    		<td>站点标题</td>
    		<td><s:textfield name="siteTitle" size="100" maxlength="200" /></td>
    	</tr>
    	<tr>
    		<td>LOGO</td>
    		<td><s:textfield name="siteLogo" size="100" maxlength="200" /></td>
    	</tr>
    	<tr>
    		<td>关键字</td>
    		<td>
	    		<s:textarea name="siteKeys" cols="74" rows="5" label="keys" tooltip="站点关键字" />
            </td>
    		
    	</tr>
    	<tr>
    		<td>站点描述</td>
    		<td>
	    		<s:textarea name="siteDescription" cols="74" rows="6" label="description" tooltip="站点描述" />
	         </td>
    	</tr>
    	<tr>
    		<td>Copyright</td>
    		<td><s:textfield name="siteCopyright" size="100" maxlength="200" /></td>
    	</tr>
    	<tr>
    		<td>ICP</td>
    		<td><s:textfield name="siteICP" size="100" maxlength="200" /></td>
    	</tr>
    	<tr>
    		<td>网站底部内容</td>
    		<td><s:textarea name="siteBottom" cols="74" rows="6" label="description" /></td>
    	</tr>
    	<tr>
    		<td colspan="2">
    			<s:submit value="保  存" />
    		</td>
    	</tr>
    </table>
    </s:form>
    </div>
  </body>
</html>
