<%@ taglib prefix="html" uri="/WEB-INF/struts-html.tld" %>
<%@ taglib prefix="bean" uri="/WEB-INF/struts-bean.tld" %>

<form action="test.do">
<center><table>
<tr><td><html:submit property="selector">
					<bean:message key="create.submit"/>
			</html:submit><br>
</td><td><html:submit property="selector">
					<bean:message key="read.submit"/>
			</html:submit><br>
</td><td><html:submit property="selector">
					<bean:message key="update.submit"/>
			</html:submit><br>
</td><td><html:submit property="selector">
					<bean:message key="delete.submit"/>
			</html:submit><br></td>
</table></center>
</form>




