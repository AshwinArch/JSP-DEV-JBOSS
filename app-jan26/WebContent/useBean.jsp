<jsp:useBean id="u1" class="com.ash.User"></jsp:useBean>

<%  u1.setFirstName("abc");
	u1.setLastName("xyz");
	u1.setAge(40);
	u1.setWeight(50.090);	%>
	
<%=u1.getFirstName()%><br>
<%=u1.getLastName()%><br>
<%=u1.getAge()%><br>
<%=u1.getWeight()%><br>

<jsp:setProperty property="firstName" name="u1" value="Latest abc"></jsp:setProperty>
<jsp:setProperty  value="Latest xyz" property="lastName" name="u1"></jsp:setProperty>
<jsp:setProperty property="age" name="u1" value="50"></jsp:setProperty>
<jsp:setProperty property="weight" name="u1" value="60.909"></jsp:setProperty>
<br></br>
<jsp:getProperty property="firstName" name="u1" /><br>
<jsp:getProperty property="lastName" name="u1" /><br>
<jsp:getProperty property="age" name="u1" /><br>
<jsp:getProperty property="weight" name="u1" /><br>