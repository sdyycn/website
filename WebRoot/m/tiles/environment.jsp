<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<style>
td,div{font-size:9pt;color:#000000;font-family:宋体,Arial;}
.table_style{background-color: #ffffff;}
.table_style1{
    text-align:left;
	border-width: 2px;
	border-bottom-style: solid;
	border-color: #009966;
    Padding-left:2px;
	background-color: #ffffff;
	border-collapse:collapse;  /*separate:边框独立collapse :相邻边被合并 */
}
.table_style2{
	border-width: 1px;
	border-left-style: solid;
	border-right-style: solid;
	border-bottom-style: solid;
	border-top-style: solid;
	border-color:#808080;
    background-color:#D1EAFE;
}
.table_jiange{
	border-width: 0px;
    background-color:#D1EAFE
}

.tdhead{width:110px;text-align:right}

.tdstyle{
        border:0 solid  #4388A9;
        border-width:1px 1px 1px 1px;
	font-size: 12px;
	color: #333333;
        height:25px;
        padding:2px 5px 2px 5px;
        background-color:#ffffff;
       } 
       
</style>
<div>
	<div style="margin-left:10px; margin-top:10px; background-color:#FFF; width:700px;">
	<table class="table_style1">
		<tr>
			<th class="tdstyle" colspan="4">Server Informations</th>
		</tr>
		<tr>
			<td class="tdstyle" width="100px">Server Name: </td>
			<td class="tdstyle" width="200px"><s:property value="serverName"/></td>
			<td class="tdstyle" width="100px">Server Path: </td>
			<td class="tdstyle"><s:property value="serverPath"/></td>
		</tr>
		<tr>
			<td class="tdstyle">Server Port: </td>
			<td class="tdstyle"><s:property value="serverPort"/></td>
			<td class="tdstyle">Server Time</td>
			<td class="tdstyle"><s:property value="serverTime"/></td>
		</tr>
		<tr>
			<th class="tdstyle" colspan="4">System Informations</th>
		</tr>
		<tr>
			<td class="tdstyle">Server OS: </td>
			<td class="tdstyle"><s:property value="serverOS"/></td>
			<td class="tdstyle">Server Arch</td>
			<td class="tdstyle"><s:property value="serverArch"/></td>
		</tr>
		<tr>
			<td class="tdstyle">Server Info: </td>
			<td class="tdstyle"><s:property value="serverInfo"/></td>
			<td class="tdstyle">Java Version:</td>
			<td class="tdstyle"><s:property value="serverJRE"/></td>
		</tr>
		<tr>
			<th class="tdstyle" colspan="4">System Memory Informations</th>
		</tr>
		<tr>
			<td class="tdstyle">freeMemoery:</td>
			<td class="tdstyle"><s:property value="freeMemory"/> M</td>
			<td class="tdstyle">totalMemory: </td>
			<td class="tdstyle"><s:property value="totalMemory"/> M</td>
		</tr>
		<tr>
			<td class="tdstyle">usedMemory:</td>
			<td class="tdstyle"><s:property value="usedMemory"/> M</td>
			<td class="tdstyle">maxMemory: </td>
			<td class="tdstyle"><s:property value="maxMemory"/> M</td>
		</tr>
		<tr>
			<td class="tdstyle">useableMemory:</td>
			<td class="tdstyle"><s:property value="useableMemory"/> M</td>
			<td class="tdstyle"></td>
			<td class="tdstyle"></td>
		</tr>
		<tr>
			<th class="tdstyle" colspan="4">Client Informations</th>
		</tr>
		<tr>
			<td class="tdstyle">Remote IP:</td>
			<td class="tdstyle"><s:property value="remoteIP"/></td>
			<td class="tdstyle">Remote Browser: </td>
			<td class="tdstyle"><s:property value="browser"/></td>
		</tr>
	</table>

	</div>
</div>
