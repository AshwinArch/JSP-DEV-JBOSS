<%@ taglib prefix="html" uri="http://jakarta.apache.org/struts/tags-html"%>
<%@ taglib prefix="bean" uri="http://jakarta.apache.org/struts/tags-bean"%>
<html:errors/>
<form action="test.do">
<bean:message key="test.param1"/>
<input type="text" name="param1"/><br>
<bean:message key="test.param2"/>
<input type="text" name="param2"/>
<html:submit><bean:message key="test.submit"/></html:submit>
</form>