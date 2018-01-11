<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@taglib uri="http://struts.apache.org/tags-html" prefix="p" %>
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
-->
</style>
</head>

<body>
<table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#FFFF99">
  <!--DWLayoutTable-->
  <tr>
    <td width="340" height="50">&nbsp;</td>
    <td width="187">&nbsp;</td>
    <td width="311" valign="top" bgcolor="#FF99FF"><div align="center" class="style1">Search Results </div></td>
    <td width="182">&nbsp;</td>
    <td width="280">&nbsp;</td>
  </tr>
  <tr>
    <td height="433">&nbsp;</td>
    <td colspan="3" valign="top"><table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#99CCFF">
      <!--DWLayoutTable-->
      <tr>
        <td width="49" height="29">&nbsp;</td>
          <td width="111" valign="top"><div align="center"><strong>Flight No</strong> </div></td>
          <td width="40">&nbsp;</td>
          <td width="102" valign="top"><div align="center"><strong>Flight Name </strong></div></td>
          <td width="36">&nbsp;</td>
          <td width="85" valign="top"><div align="center"><strong>Arrival Time </strong></div></td>
          <td width="40">&nbsp;</td>
          <td width="78" valign="top"><div align="center"><strong>Departure Time </strong></div></td>
          <td width="30">&nbsp;</td>
          <td width="65">&nbsp;</td>
          <td width="44">&nbsp;</td>
      </tr>
      <tr>
        <td height="27">&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
      </tr>
      <tr>
             <%@page import="java.sql.*" %>
                         
                    <%
try
{
    String st=request.getParameter("select2");
    String st1=request.getParameter("select3");
    String st2=request.getParameter("textfield3");
    Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ARS","root","ujjawal");
PreparedStatement pst=con.prepareStatement("select * from flightinfo where source=? and destination=? and date=?");
pst.setString(1, st);
pst.setString(2, st1);
pst.setString(3, st2);
ResultSet rs=pst.executeQuery();

while(rs.next())
      {
    %>
        <td height="27">&nbsp;</td>
        <td valign="top"><%= rs.getString(1) %> </td>
          <td>&nbsp;</td>
          <td valign="top"><%= rs.getString(2) %> </td>
          <td>&nbsp;</td>
          <td valign="top"><%= rs.getString(6) %> </td>
          <td>&nbsp;</td>
          <td valign="top"><%= rs.getString(7) %> </td>
          <td>&nbsp;</td>
          <td valign="top" bgcolor="#00FFFF"><div align="center"><p:link action="/log20">Book</p:link></div></td>
          <td>&nbsp;</td>
      </tr>
             <%
}
}
catch(Exception e)
{
out.println(e);
}                                 
%>
      <tr>
        <td height="350">&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
      </tr>
    </table></td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td height="167">&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
</table>
</body>
</html>
