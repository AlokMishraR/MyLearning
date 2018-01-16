\<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Untitled Document</title>
<style type="text/css">
<!--
.style1 {color: #FF0000}
.style2 {
	font-size: 24px;
	font-weight: bold;
}
-->
</style>
</head>

<body>
    <form action="Update">
<table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#FFFFCC">
  <!--DWLayoutTable-->
  <tr>
    <td width="339" height="57">&nbsp;</td>
    <td width="157">&nbsp;</td>
    <td width="339">&nbsp;</td>
    <td width="167">&nbsp;</td>
    <td width="282">&nbsp;</td>
  </tr>
  <tr>
    <td height="54">&nbsp;</td>
    <td>&nbsp;</td>
    <td valign="top" bgcolor="#0000FF"><div align="center" class="style2">User Profile </div></td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td height="426">&nbsp;</td>
    <td colspan="3" valign="top"><table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#99CCFF">
      <!--DWLayoutTable-->
      <tr>
        <td width="132" height="24">&nbsp;</td>
        <td width="103">&nbsp;</td>
        <td width="147">&nbsp;</td>
        <td width="13">&nbsp;</td>
        <td width="128">&nbsp;</td>
        <td width="143">&nbsp;</td>
      </tr>
      <tr>
        <td height="22"></td>
        <%@page import="java.sql.*" %>
                           <%
try
{
   String s1=(String)session.getAttribute("id25");
    Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ARS","root","ujjawal");
PreparedStatement pst=con.prepareStatement("select * from customer where username=?");
pst.setString(1, s1);
ResultSet rs=pst.executeQuery();
if(rs.next())
      {
    %>
        <td valign="top"><strong>UserName</strong></td>
        <td colspan="2" valign="top"><label>
                <input type="text" name="textfield" value="<%=rs.getString(1) %>" readonly="true"/>
        </label></td>
        <td valign="top">Cant't Be Updated </td>
        <td>&nbsp;</td>
      </tr>
      <tr>
        <td height="14"></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
      </tr>
      <tr>
        <td height="22"></td>
        <td valign="top"><strong>Password</strong></td>
        <td colspan="2" valign="top"><label>
                <input type="text" name="textfield2" value="<%=rs.getString(2) %>" readonly="true" />
        </label></td>
        <td valign="top">Cant't Be Updated </td>
        <td>&nbsp;</td>
      </tr>
      <tr>
        <td height="18"></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
      </tr>
      <tr>
        <td height="22"></td>
        <td valign="top"><strong>Age</strong></td>
        <td colspan="2" valign="top"><label>
          <input type="text" name="textfield3" value="<%=rs.getString(3) %>" />
        </label></td>
        <td></td>
        <td></td>
      </tr>
      <tr>
        <td height="20"></td>
        <td>&nbsp;</td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
      </tr>
      <tr>
        <td height="22"></td>
        <td valign="top"><strong>Gender</strong></td>
        <td colspan="2" valign="top"><label>
          <input type="text" name="textfield4" value="<%=rs.getString(4) %>" />
        </label></td>
        <td></td>
        <td></td>
      </tr>
      <tr>
        <td height="23"></td>
        <td>&nbsp;</td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
      </tr>
      <tr>
        <td height="22"></td>
        <td valign="top"><strong>City</strong></td>
        <td colspan="2" valign="top"><label>
          <input type="text" name="textfield5" value="<%=rs.getString(5) %>" />
        </label></td>
        <td></td>
        <td></td>
      </tr>
      <tr>
        <td height="19"></td>
        <td>&nbsp;</td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
      </tr>
      <tr>
        <td height="22"></td>
        <td valign="top"><strong>EmailId</strong></td>
        <td colspan="2" valign="top" ><label>
          <input type="text" name="textfield6" value="<%=rs.getString(6) %>"/>
        </label></td>
        <td></td>
        <td></td>
      </tr>
      <tr>
        <td height="24"></td>
        <td>&nbsp;</td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
      </tr>
      <tr>
        <td height="23"></td>
        <td valign="top"><strong>ContactNo</strong></td>
        <td colspan="2" valign="top"><label>
          <input type="text" name="textfield7" value="<%=rs.getString(7) %>" />
        </label></td>
        <td></td>
        <td></td>
      </tr>
      <tr>
                       <%
}
}
catch(Exception e)
{
out.println(e);
}                                 
%>
   
        <td height="40"></td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td></td>
        <td></td>
        <td></td>
      </tr>
      <tr>
        <td height="38"></td>
        <td>&nbsp;</td>
        <td valign="top"><label>
          <input type="submit" name="Submit" value="Update" />
        </label></td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
      </tr>
      <tr>
        <td height="80"></td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td></td>
        <td></td>
        <td></td>
      </tr>
    </table></td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td height="113">&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
</table>
    </form>
</body>
</html>
