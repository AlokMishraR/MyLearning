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
    <td width="450" height="29">&nbsp;</td>
    <td width="391">&nbsp;</td>
    <td width="459">&nbsp;</td>
  </tr>
  <tr>
    <td height="49">&nbsp;</td>
    <td valign="top" bgcolor="#0000FF"><div align="center" class="style1">Fare Information </div></td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td height="19">&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td height="308">&nbsp;</td>
    <td valign="top"><table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#9999FF">
      <!--DWLayoutTable-->
      <tr>
        <td width="43" height="14"></td>
          <td width="107"></td>
          <td width="31"></td>
          <td width="115"></td>
          <td width="95"></td>
        </tr>
      <tr>
        <td height="29"></td>
              
                     <%@page import="java.sql.*" %>
                    <%
try
{
    String s1=request.getParameter("select");
    String s2=request.getParameter("select2");
    String s3=request.getParameter("RadioGroup1");
    Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ARS","root","ujjawal");
PreparedStatement pst=con.prepareStatement("select * from fare where source=? and destination=? and class=?"); 
pst.setString(1, s1);
pst.setString(2, s2);
pst.setString(3, s3);
ResultSet rs=pst.executeQuery();

if(rs.next())
      {
    %>
          <td valign="top" bgcolor="#99FFFF"><div align="center"><strong>Source</strong></div></td>
          <td>&nbsp;</td>
          <td valign="top"><%= rs.getString(1) %> </td>
          <td>&nbsp;</td>
        </tr>
      <tr>
        <td height="24"></td>
          <td>&nbsp;</td>
          <td></td>
          <td></td>
          <td></td>
        </tr>
      <tr>
        <td height="32"></td>
          <td valign="top" bgcolor="#99FFFF"><div align="center"><strong>Destination</strong></div></td>
          <td></td>
          <td valign="top"><%= rs.getString(2) %></td>
          <td></td>
        </tr>
      <tr>
        <td height="27"></td>
          <td>&nbsp;</td>
          <td></td>
          <td></td>
          <td></td>
        </tr>
      <tr>
        <td height="30"></td>
          <td valign="top" bgcolor="#99FFFF"><div align="center"><strong>Class</strong></div></td>
          <td></td>
          <td valign="top"><%= rs.getString(3) %></td>
          <td></td>
        </tr>
      <tr>
        <td height="25"></td>
          <td>&nbsp;</td>
          <td></td>
          <td></td>
          <td></td>
        </tr>
      <tr>
        <td height="34"></td>
          <td valign="top" bgcolor="#99FFFF"><div align="center"><strong>Fare</strong></div></td>
          <td></td>
          <td valign="top"><%= rs.getString(4) %></td>
          <td></td>
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
        <td height="93"></td>
          <td>&nbsp;</td>
          <td></td>
          <td></td>
          <td></td>
        </tr>
    </table></td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td height="245">&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
</table>
</body>
</html>
