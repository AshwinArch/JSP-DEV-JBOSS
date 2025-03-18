<jsp:useBean id="u1" class="com.ash.User"></jsp:useBean>
<jsp:setProperty property="*"  name="u1"/>

<jsp:getProperty property="firstName" name="u1"/><br>
<jsp:getProperty property="lastName" name="u1"/><br>

<%-- pass query string like this --%>
<%--http://localhost:8808/jsp-jan27/test4.jsp?firstName=Ashwin&lastName=Gupta--%>