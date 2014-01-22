<%@ page contentType="text/html;charset=gb2312" %>
<%@ page import="java.util.*" %>
<HTML>
<HEAD>
<TITLE>JSP Info v1.0</TITLE>
<META http-equiv="Content-Type" content="text/html; charset=gb2312">
<STYLE type="text/css">
<!--
body {  font-family: "Tahoma", "Verdana"; font-size: 12px; color: #333333}
td {  font-family: "Tahoma", "Verdana"; font-size: 12px; color: #333333}
-->
</STYLE>
</HEAD>

<BODY bgcolor="#FFFFFF" text="#000000" leftmargin="10" topmargin="10" marginwidth="0" marginheight="0">
<TABLE>
  <TR bgcolor="#B4D8ED"> 
    <TD width="30%"><B>Environment (环境)</B></TD>
    <TD width="70%"><B>Values (值)</B></TD>
  </TR>
  <TR bgcolor="#DEEEF8"> 
    <TD bgcolor="#DEEEF8">Server name (服务器名称)</TD>
    <TD><%= request.getServerName() %></TD>
  </TR>
  <TR bgcolor="#DEEEF8"> 
    <TD>Server port (服务器端口)</TD>
    <TD><%= request.getServerPort() %></TD>
  </TR>
  <TR bgcolor="#DEEEF8"> 
    <TD>Remote IP address (客户端IP地址)</TD>
    <TD><%= request.getRemoteAddr() %></TD>
  </TR>
  <TR bgcolor="#DEEEF8"> 
    <TD colspan="2"><B>Context attributes (相关属性)</B></TD>
  </TR>
  <%
	ServletContext context = getServletContext();
	Enumeration enum1 = context.getAttributeNames();
	while (enum1.hasMoreElements()) {
	    String key = (String)enum1.nextElement();
            Object value = context.getAttribute(key);
            out.println("<TR bgcolor=#DEEEF8><TD>" + key + "</TD><TD>" + value + "</TD></TR>");
	}

%>
  <TR bgcolor="#FFFFFF" valign="bottom"> 
    <TD colspan="2" height="50"><B>End (结束)</B></TD>
  </TR>
</TABLE>
</BODY>
</HTML>
