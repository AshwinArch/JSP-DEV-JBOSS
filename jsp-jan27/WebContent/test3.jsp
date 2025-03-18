<jsp:useBean id="u1" class="com.ash.User"></jsp:useBean>
<jsp:setProperty property="firstName"  name="u1"/>
<jsp:setProperty property="lastName"  name="u1"/>

<jsp:getProperty property="firstName" name="u1"/><br>
<jsp:getProperty property="lastName" name="u1"/><br>
<%-- here we will pass value in query string--%>

<%-- like:- --%>

<%-- http://localhost:8808/jsp-jan27/test3.jsp?firstName=abc&lastName=xyz--%>	