<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:forTokens items="a,b,c" delims="," var="item">
				${	 item }<br>
</c:forTokens>