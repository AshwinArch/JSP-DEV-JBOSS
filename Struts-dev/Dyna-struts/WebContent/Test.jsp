<%@ taglib prefix="html" uri="/WEB-INF/struts-html.tld"%>
<%@ taglib prefix="bean" uri="/WEB-INF/struts-bean.tld"%>
		<html:form action="test">
					<bean:message key="test.param"/><br>
					<html:text property="param"/><br>
					<html:submit>
								<bean:message key="test.submit"/>
					</html:submit>		
		</html:form>