<%@ taglib prefix="html" uri="http://jakarta.apache.org/struts/tags-html" %>
<%@ taglib prefix="bean" uri="http://jakarta.apache.org/struts/tags-bean" %>


<html:form action="test">
		<bean:message key="test.param1"/>
		<html:text property="param1"/><html:errors property="param1"/><br>
		<bean:message key="test.param2"/>
		<html:text property="param2"/>
		<html:errors property="param2"/><br>
		<html:submit>
			<bean:message key="test.submit"/>
		</html:submit>
	
		

</html:form>