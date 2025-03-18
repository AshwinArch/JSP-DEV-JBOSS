<%@ taglib prefix="bean" uri="/WEB-INF/struts-bean.tld"%>
<%@ taglib prefix="html" uri="/WEB-INF/struts-html.tld"%>
<html:errors/>
<form action="test2.do">
		<bean:message key="test2.param"/>
		<input type='text' name='param'><br>
		<input type='submit' value='submit'><br>
</form>