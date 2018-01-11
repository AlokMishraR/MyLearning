<%-- 
    Document   : DeleteResult
    Created on : Jun 9, 2013, 11:43:27 AM
    Author     : ALOK
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="p" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
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
              <%@page import="java.sql.*" %>
                         
                    <%
try
{
    String st=request.getParameter("select");
    Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ARS","root","ujjawal");
PreparedStatement pst=con.prepareStatement("delete from flightinfo where flightno=?");
PreparedStatement pst1=con.prepareStatement("delete from reservationpnr where flightnumber=?");
pst.setString(1, st);
pst1.setString(1, st);
pst.executeUpdate();
pst1.executeUpdate();
}
catch(Exception e)
{
out.println(e);
}                                 
%>
<table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#CCCCCC">
  <!--DWLayoutTable-->
  <tr>
    <td width="470" height="61">&nbsp;</td>
    <td width="437">&nbsp;</td>
    <td width="393">&nbsp;</td>
  </tr>
  <tr>
    <td height="285">&nbsp;</td>
    <td valign="top"><table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#99CCFF">
      <!--DWLayoutTable-->
      <tr>
        <td width="60" height="49">&nbsp;</td>
        <td width="265">&nbsp;</td>
        <td width="45">&nbsp;</td>
        <td width="54">&nbsp;</td>
        <td width="13">&nbsp;</td>
      </tr>
      <tr>
        <td height="123">&nbsp;</td>
        <td colspan="2" valign="top" bgcolor="#00FFFF"><div align="center" class="style1">Flight Deleted Succesfully </div></td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
      </tr>
      <tr>
        <td height="65">&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
      </tr>
      <tr>
        <td height="19">&nbsp;</td>
        <td>&nbsp;</td>
        <td colspan="2" valign="top"><p:link action="/log22">Back To Home</p:link></td>
        <td>&nbsp;</td>
      </tr>
      <tr>
        <td height="29">&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
      </tr>
    </table>
    </td>
    
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td height="304">&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
</table>
    </body>
</html>
