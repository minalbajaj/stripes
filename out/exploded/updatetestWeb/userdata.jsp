<%--
  Created by IntelliJ IDEA.
  User: u2
  Date: Sep 28, 2011
  Time: 12:43:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="http://stripes.sourceforge.net/stripes.tld" %>
<html>
  <head><title>User Detail</title></head>
  <body>

  <s:form beanclass="action.UserActionBean">
  FirstName: <s:text name="firstname"></s:text>
  LastName :<s:text name="lastname"></s:text>    
         <s:submit name="update" value="Submit"/>
  </s:form>

  </body>
</html>