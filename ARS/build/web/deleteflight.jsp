<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Untitled Document</title>
<style type="text/css">
<!--
.style1 {
	font-size: 36px;
	font-weight: bold;
}
.style2 {
	font-size: 18px;
	font-weight: bold;
}
-->
</style>
</head>

<body>
    <form action="DeleteResult.jsp">
<table width="100%" border="0" cellpadding="0" cellspacing="0">
  <!--DWLayoutTable-->
  <tr>
    <td width="457" height="59">&nbsp;</td>
    <td width="431">&nbsp;</td>
    <td width="412">&nbsp;</td>
  </tr>
  <tr>
    <td height="326">&nbsp;</td>
    <td valign="top"><table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#FFFF99">
      <!--DWLayoutTable-->
      <tr>
        <td height="56" colspan="5" valign="top" bgcolor="#0000FF"><div align="center" class="style1">Cancel Flight </div></td>
      </tr>
      <tr>
        <td width="54" height="28">&nbsp;</td>
        <td width="119">&nbsp;</td>
        <td width="100">&nbsp;</td>
        <td width="18">&nbsp;</td>
        <td width="140">&nbsp;</td>
      </tr>
      <tr>
        <td height="30">&nbsp;</td>
        <td valign="top"><div align="center" class="style2">Flight No </div></td>
        <td colspan="2" valign="top"><label>
                  <%@page import="java.sql.*" %>
          <select name="select">
                                                <option value="-1">Select FlightNo </option>
                    <%
try
{
    
    Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ARS","root","ujjawal");
PreparedStatement pst=con.prepareStatement("select * from flightinfo");
ResultSet rs=pst.executeQuery();

while(rs.next())
      {
    %>
    
    <option value="<%=rs.getString(1)%>"><%=rs.getString(1)%></option>
    <%
}
}
catch(Exception e)
{
out.println(e);
}                                 
%>  
              
              
              
          </select>
        </label></td>
        <td>&nbsp;</td>
      </tr>
      <tr>
        <td height="26">&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
      </tr>
      <tr>
        <td height="23">&nbsp;</td>
        <td>&nbsp;</td>
        <td valign="top"><label>
          <input type="submit" name="Submit" value="Cancel Flight" />
        </label></td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
      </tr>
      <tr>
        <td height="163">&nbsp;</td>
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
    <td height="265">&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
</table>
    </form>
</body>
</html>
