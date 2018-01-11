<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@taglib uri="/WEB-INF/struts-tiles.tld" prefix="p" %>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="p1" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Untitled Document</title>
<style type="text/css">
<!--
#Layer1 {
	position:absolute;
	left:256px;
	top:154px;
	width:1px;
	height:59px;
	z-index:1;
	background-color: #0000FF;
}
#Layer2 {
	position:absolute;
	left:40px;
	top:212px;
	width:217px;
	height:60px;
	z-index:2;
	background-color: #0000FF;
}
#Layer3 {
	position:absolute;
	left:11px;
	top:155px;
	width:246px;
	height:56px;
	z-index:1;
	background-color: #0000FF;
}
#Layer4 {
	position:absolute;
	left:11px;
	top:214px;
	width:246px;
	height:60px;
	z-index:2;
	background-color: #0000FF;
}
.style1 {font-weight: bold}
-->
</style>
<script type="text/javascript">
    function preventBack()
    {
       window.history.forward();
       
    }
    setTimeout("preventBack()", 0);
    window.onunload=function()
    {
        null;
    }
</script>
</head>

<body>
<div id="Layer3">
    <div align="center" ><p1:link action="/log10" style="color:white;text-decoration:none"  ><div>Add Flights</div></p1:link></div>
</div>
<div id="Layer4">
    <div align="center"><p1:link action="/log11" style="color:white;text-decoration:none">Cancel Flights</p1:link></div>
</div>
<div id="Layer5">
    <div align="right"><a href="index.jsp" style="text-decoration: none">Logout</a></div>
</div>
<table width="100%" border="0" cellpadding="0" cellspacing="0">
  <!--DWLayoutTable-->
  <tr>
    <td height="140" colspan="2" valign="top"><img src="images/head.jpg" width="1349" height="140" /></td>
  </tr>
  <tr>
    <td width="249" height="523" valign="top"><table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#9999FF">
      <!--DWLayoutTable-->
      <tr>
        <td width="249" height="60" valign="top"><div></div>
          <div></div></td>
      </tr>
      <tr>
        <td height="59" valign="top"><div></div>
          <div></div></td>
      </tr>
      <tr>
        <td height="404">&nbsp;</td>
      </tr>
      
    </table>    </td>
    <td width="1100" valign="top"><p>&nbsp;</p>
    <p><p:insert attribute="Body1"></p:insert></p>
    <p>&nbsp;</p></td>
  </tr>
  <tr>
    <td height="36" colspan="2" valign="top" bgcolor="#FF0000"><div class="style1" id="copyrights">
      <div align="center"><br />
        This Site works best when viewed in Mozilla Firefox (3.6.1 or higher)</div>
    </div>
      <div id="copyrights">
        <div align="center">Copyright &copy; ALOK INFOTECH. All rights reserved.</div>
      </div>
    <div id="designedby">
      <div align="center">Designed by ALOK MISHRA </div>
    </div></td>
  </tr>
</table>
</body>
</html>
