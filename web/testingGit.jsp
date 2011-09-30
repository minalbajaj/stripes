<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: Sep 3, 2015
  Time: 5:32:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="s" uri="http://stripes.sourceforge.net/stripes.tld"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head><title>Simple jsp page</title></head>
  <body>
  <s:form beanclass="action.UserActionBean">
      ${actionBean.firstname}
  <s:submit name="delete" value="delete"></s:submit>   
   </s:form>
  </body>
</html>