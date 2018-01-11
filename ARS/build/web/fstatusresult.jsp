<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Untitled Document</title>
<style type="text/css">
<!--
.style1 {
	font-size: 24px;
	font-weight: bold;
}
body {
	background-color: #FFFFCC;
}
-->
</style>
</head>

<body>
<table width="100%" border="0" cellpadding="0" cellspacing="0">
  <!--DWLayoutTable-->
  <tr>
    <td width="503" height="60">&nbsp;</td>
    <td width="466">&nbsp;</td>
    <td width="331">&nbsp;</td>
  </tr>
  <tr>
    <td height="39">&nbsp;</td>
    <td valign="top" bgcolor="#0000FF"><div align="center" class="style1">Flight Status </div></td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td height="19">&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  
  <tr>
    <td height="376">&nbsp;</td>
    <td valign="top"><table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#9999FF">
      <!--DWLayoutTable-->
      <tr>
        <td width="67" height="27">&nbsp;</td>
        <td width="109">&nbsp;</td>
        <td width="26">&nbsp;</td>
        <td width="97">&nbsp;</td>
        <td width="167">&nbsp;</td>
      </tr>
      <%
      String s1=(String)session.getAttribute("id19");
      String s2=(String)session.getAttribute("id20");
      String s3=(String)session.getAttribute("id21");
      String s4=(String)session.getAttribute("id22");
      String s5=(String)session.getAttribute("id23");
      String s6=(String)session.getAttribute("id24");
      String s7=(String)session.getAttribute("id25");
      
      %>
              
      <tr>
        <td height="24">&nbsp;</td>
        <td valign="top" bgcolor="#99FFFF"><div align="center"><strong>Flight No </strong></div></td>
        <td>&nbsp;</td>
        <td valign="top"><%= s1 %></td>
        <td>&nbsp;</td>
      </tr>
      <tr>
        <td height="19">&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
      </tr>
      <tr>
        <td height="25">&nbsp;</td>
        <td valign="top" bgcolor="#99FFFF"><div align="center"><strong>Flight Name </strong></div></td>
        <td>&nbsp;</td>
        <td valign="top"><%= s2 %></td>
        <td>&nbsp;</td>
      </tr>
      <tr>
        <td height="21">&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
      </tr>
      <tr>
        <td height="29">&nbsp;</td>
        <td valign="top" bgcolor="#99FFFF"><div align="center"><strong>Source</strong></div></td>
        <td>&nbsp;</td>
        <td valign="top"><%= s3 %></td>
        <td>&nbsp;</td>
      </tr>
      <tr>
        <td height="22">&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
      </tr>
      <tr>
        <td height="28">&nbsp;</td>
        <td valign="top" bgcolor="#99FFFF"><div align="center"><strong>Destination</strong></div></td>
        <td>&nbsp;</td>
        <td valign="top"><%= s4 %></td>
        <td>&nbsp;</td>
      </tr>
      <tr>
        <td height="20">&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
      </tr>
      <tr>
        <td height="27">&nbsp;</td>
        <td valign="top" bgcolor="#99FFFF"><div align="center"><strong>Date</strong></div></td>
        <td>&nbsp;</td>
        <td valign="top"><%= s5 %></td>
        <td>&nbsp;</td>
      </tr>
      <tr>
        <td height="23">&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
      </tr>
      <tr>
        <td height="27">&nbsp;</td>
        <td valign="top" bgcolor="#99FFFF"><div align="center"><strong>Arrival</strong></div></td>
        <td>&nbsp;</td>
        <td valign="top"><%= s6 %></td>
        <td>&nbsp;</td>
      </tr>
      <tr>
        <td height="21">&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
      </tr>
      <tr>
        <td height="26">&nbsp;</td>
        <td valign="top" bgcolor="#99FFFF"><div align="center"><strong>Departure</strong></div></td>
        <td>&nbsp;</td>
        <td valign="top"><%= s7 %></td>
        <td>&nbsp;</td>
      </tr>
      <tr>
        <td height="37">&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
      </tr>
    </table></td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td height="156">&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
</table>
</body>
</html>
