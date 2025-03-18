<%@ taglib prefix="html" uri="/WEB-INF/struts-html.tld"%>
<%@ taglib prefix="bean" uri="/WEB-INF/struts-bean.tld"%>

<html:form action="test" enctype="multipart/form-data">
Parameter1:
<html:file property="param1"/><br>
<html:submit value="upload"/>
</html:form>