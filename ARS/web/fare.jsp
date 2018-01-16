<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Untitled Document</title>
<style type="text/css">
<!--
.style1 {
	font-size: 18px;
	font-weight: bold;
}
.style2 {
	font-size: 24px;
	font-weight: bold;
}
body {
	background-color: #99CCFF;
	background-image: url(images/6.jpg);
}
-->
</style>
</head>

<body>
    <form action="fareinfo.jsp">
<table width="100%" border="0" cellpadding="0" cellspacing="0">
  <!--DWLayoutTable-->
  <tr>
    <td width="497" height="69">&nbsp;</td>
    <td width="420">&nbsp;</td>
    <td width="383">&nbsp;</td>
  </tr>
  <tr>
    <td height="313">&nbsp;</td>
    <td valign="top"><table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#FFFF99">
      <!--DWLayoutTable-->
      <tr>
        <td height="26" colspan="5" valign="top" bgcolor="#0000FF"><div align="center" class="style2">Get Fare Information </div></td>
      </tr>
      <tr>
        <td width="55" height="19">&nbsp;</td>
        <td width="134">&nbsp;</td>
        <td width="95">&nbsp;</td>
        <td width="37">&nbsp;</td>
        <td width="99">&nbsp;</td>
      </tr>
      <tr>
        <td height="22">&nbsp;</td>
        <td valign="top" bgcolor="#99FFFF"><div align="center" class="style1">From</div></td>
        <td colspan="2" valign="top"><label>
          <select name="select">
                  <option value="-1">Select Source </option>
                     <%@page import="java.sql.*" %>
                    <%
try
{
    Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ARS","root","ujjawal");
PreparedStatement pst=con.prepareStatement("select * from fare");
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
        <td height="19">&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
      </tr>
      <tr>
        <td height="22">&nbsp;</td>
        <td valign="top" bgcolor="#99FFFF"><div align="center" class="style1">To</div></td>
        <td colspan="2" valign="top"><label>
          <select name="select2">
                  <option value="-1">Select Source </option>
                     <%@page import="java.sql.*" %>
                    <%
try
{
    Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ARS","root","ujjawal");
PreparedStatement pst=con.prepareStatement("select * from fare");
ResultSet rs=pst.executeQuery();

while(rs.next())
      {
    %>
    
    <option value="<%=rs.getString(2)%>"><%=rs.getString(2)%></option>
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
        <td height="19"></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
      </tr>
      
      <tr>
        <td height="44"></td>
        <td valign="top" bgcolor="#99FFFF"><div align="center" class="style1">Class</div></td>
        <td colspan="2" valign="top"><p>
          <label>
            <input type="radio" name="RadioGroup1" value="First Class" />
            First Class</label>
          <br />
          <label>
            <input type="radio" name="RadioGroup1" value="Economy" />
            Economy</label>
          <br />
        </p></td>
        <td></td>
      </tr>
      
      <tr>
        <td height="19"></td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td></td>
      </tr>
      <tr>
        <td height="24"></td>
        <td>&nbsp;</td>
        <td valign="top"><label>
          <input type="submit" name="Submit" value="Get Fare" />
        </label></td>
        <td>&nbsp;</td>
        <td></td>
      </tr>
      
    </table>
    </td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td height="268">&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
</table>
    </form>
</body>
</html>
