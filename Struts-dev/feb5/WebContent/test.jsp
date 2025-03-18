<%@ taglib prefix="html" uri="/WEB-INF/struts-html.tld"%>
<%@ taglib prefix="bean" uri="/WEB-INF/struts-bean.tld"%>
	<html:errors/><hr>
		<html:form action="testAction">
					<bean:message key="test.param"/>
					<html:text property="param"/><br>
					<html:submit>
						<bean:message key="test.submit"/>
					</html:submit>	
				<br>
		</html:form>