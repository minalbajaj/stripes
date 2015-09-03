<%--
  Created by IntelliJ IDEA.
  User: u2
  Date: Sep 28, 2011
  Time: 3:55:49 PM
  To change this template use File | Settings | File Templates.

--%>
<%@ taglib prefix="s" uri="http://stripes.sourceforge.net/stripes.tld" %>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head><title>Simple jsp page</title></head>
  <body>
       <s:form beanclass="action.UserActionBean">
<table align="left" border="1" width="50%">
   
      <c:forEach items="${actionBean.l}" var="item" varStatus="loop" >
                 <tr>

                     <td>FirstName:
                </td>
                     <td>
                 ${item.firstname} </td>
                 </tr>
          <tr>
              <td>
               LastName:
              </td>
              <td>${item.lastname}</td>

          </tr>
             <tr>
               <s:link href="/index.jsp" name="testupdate">For update</s:link>
             </tr>
         </c:forEach>
            </table>
         </s:form>
  </body>
</html>