<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@taglib uri="/WEB-INF/struts-tiles.tld" prefix="p" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Untitled Document</title>
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
<table width="100%" border="0" cellpadding="0" cellspacing="0">
  <!--DWLayoutTable-->
  <tr>
      <td height="80" colspan="2" valign="top"><p:insert attribute="Header"></p:insert></td>
  </tr>
  <tr>
      <td width="150" height="550" valign="top"><p:insert attribute="Menu"></p:insert></td>
      <td width="856" valign="top"><p:insert attribute="Body"></p:insert></td>
  </tr>

  <tr>
      <td height="20" colspan="2" valign="top"><p:insert attribute="Footer"></p:insert></td>
  </tr>
</table>
    <div id="Layer1">
        <div align="right"><a href="index.jsp" style="text-decoration: none;size: 20px">Logout</a></div>
</div>
</body>
</html>
