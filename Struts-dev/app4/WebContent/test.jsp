<%@ taglib prefix="html" uri="http://jakarta.apache.org/struts/tags-html"%>
<%@ taglib prefix="bean" uri="http://jakarta.apache.org/struts/tags-bean"%>

<html:form action="test">
	<bean:message key="test.param"/>
	<html:text property="param"/>
	<html:errors property="param"/><br>
	
	<bean:message key="test.date"/>
	<html:text property="birthDate"/>
	<html:errors property="birthDate"/><br>
	
	<bean:message key="test.email"/>
	<html:text property="email"/>
	<html:errors property="email"/><br>
	
	<bean:message key="test.creditCard"/>
	<html:text property="creditCard"/>
	<html:errors property="creditCard"/><br>
	
	
	
	<html:submit>
		<bean:message key="test.submit"/>
	</html:submit>
</html:form>