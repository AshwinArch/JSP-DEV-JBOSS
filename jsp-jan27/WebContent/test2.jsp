<jsp:useBean id="u1" class="com.ash.User"></jsp:useBean>
<jsp:setProperty property="firstName" value="abc" name="u1"/>
<jsp:setProperty property="lastName" value="xyz" name="u1"/>

<jsp:getProperty property="firstName" name="u1"/><br>
<jsp:getProperty property="lastName" name="u1"/><br>