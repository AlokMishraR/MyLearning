<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Untitled Document</title>
<style type="text/css">
<!--
.style1 {font-size: 36px}
.style2 {
	font-size: 18px;
	font-weight: bold;
}
body {
	background-color: #FFFFCC;
}
-->
</style>
</head>

<body>
    <%
    String s1=(String)session.getAttribute("id3");
    String s2=(String)session.getAttribute("id4");
    String s3=(String)session.getAttribute("id5");
    String s4=(String)session.getAttribute("id6");
    String s5=(String)session.getAttribute("id7");
    String s6=(String)session.getAttribute("id8");
    String s7=(String)session.getAttribute("id9");
    String s8=(String)session.getAttribute("id10");
    %>
<table width="100%" border="0" cellpadding="0" cellspacing="0">
  <!--DWLayoutTable-->
  <tr>
    <td width="454" height="47">&nbsp;</td>
    <td width="426" valign="top" bgcolor="#0000FF"><div align="center" class="style1">Ticket Details </div></td>
    <td width="420">&nbsp;</td>
  </tr>
  <tr>
    <td height="540">&nbsp;</td>
    <td valign="top"><table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#99FFFF">
      <!--DWLayoutTable-->
      <tr>
        <td width="57" height="28">&nbsp;</td>
          <td width="139">&nbsp;</td>
          <td width="38">&nbsp;</td>
          <td width="132">&nbsp;</td>
          <td width="60">&nbsp;</td>
        </tr>
      <tr>
        <td height="30">&nbsp;</td>
          <td valign="top"><div align="center" class="style2">PNR No </div></td>
          <td>&nbsp;</td>
          <td valign="top"><%= s1 %></td>
          <td>&nbsp;</td>
        </tr>
      <tr>
        <td height="24">&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
      <tr>
        <td height="32">&nbsp;</td>
          <td valign="top"><div align="center" class="style2">FlightNo</div></td>
          <td>&nbsp;</td>
          <td valign="top"><%= s2 %></td>
          <td>&nbsp;</td>
        </tr>
      <tr>
        <td height="28">&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
      <tr>
        <td height="39">&nbsp;</td>
          <td valign="top"><div align="center" class="style2">Flight Name </div></td>
          <td>&nbsp;</td>
          <td valign="top"><%= s3 %></td>
          <td>&nbsp;</td>
        </tr>
      <tr>
        <td height="28">&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
      <tr>
        <td height="36">&nbsp;</td>
          <td valign="top"><div align="center" class="style2">Source</div></td>
          <td>&nbsp;</td>
          <td valign="top"><%= s4 %></td>
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
        <td height="35">&nbsp;</td>
          <td valign="top"><div align="center" class="style2">Destination</div></td>
          <td>&nbsp;</td>
          <td valign="top"><%= s5 %></td>
          <td>&nbsp;</td>
        </tr>
      <tr>
        <td height="28">&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
      <tr>
        <td height="37">&nbsp;</td>
          <td valign="top"><div align="center" class="style2">Date</div></td>
          <td>&nbsp;</td>
          <td valign="top"><%= s6 %></td>
          <td>&nbsp;</td>
        </tr>
      <tr>
        <td height="28">&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
      <tr>
        <td height="36">&nbsp;</td>
          <td valign="top"><div align="center" class="style2">Arrival</div></td>
          <td>&nbsp;</td>
          <td valign="top"><%= s7 %></td>
          <td>&nbsp;</td>
        </tr>
      <tr>
        <td height="27">&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
      <tr>
        <td height="41"></td>
          <td valign="top"><div align="center" class="style2">Departure</div></td>
          <td></td>
          <td valign="top"><%= s8 %></td>
          <td></td>
        </tr>
      <tr>
        <td height="41"></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
        </tr>
      
    </table></td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td height="63">&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
</table>
</body>
</html>
