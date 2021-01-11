<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
    <head>
        <title>Form Login</title>
    </head>
    
    <body>
        <h3>Login Form </h3>
        <form:form action="${pageContext.request.contextPath}/processForm" method="POST">
            
            
            <%-- if Invalid Login Show This massage --%>
            <c:if test="${param.error != null}">          
                <b>  
                    Invalid Username OR Password.  
                </b>  
            </c:if>
            
            
            <%-- if press button Logout in secound Page is return to this page and show this massage --%>
             <c:if test="${param.logout != null}">          
                <b>  
                   Logout Done , ):
                </b>  
            </c:if> 
            
            <br>
            <input type="text" name="username" placeholder="User" />
            <br>
            <input type="password" name="password" placeholder="Password" />
            <br>
            <input type="submit" value="Login"/>
        </form:form>
    </body>
</html>
