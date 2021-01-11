<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
<html>
    <head>
        <title>Welcome ...! </title>
    </head>
    
    <body>
      
        <%-- Show Username And Role For Users --%> 
        <b>User </b> : <security:authentication property="principal.username"/>
        <br>
        <b>Rule </b> : <security:authentication property="principal.authorities"/>
        
        <br>
        
        <%-- Show Content For Roles if manger Or doctor or Student --%>
        <security:authorize access="hasRole('manger')">
            Your System IS Good :)
        </security:authorize>
            
        <security:authorize access="hasRole('doctor')">
            You Have 75 Students 
        </security:authorize>
            
        <security:authorize access="hasRole('student')">
            You Have 4 Course 
        </security:authorize>
        
            <br>
        <%-- Button For Logout From System --%>
        <form:form action="${pageContext.request.contextPath}/logout" method="post">
            <input type="submit" value="Logout From System .." />
        </form:form>
                   
    </body>
</html>
