<!--${  5 + 4 }-->

<!--${ 10==12 }-->


<!--${ 1000 }--><!--

${ "abc" }--><!--

${true and true}--><!--

${not false}--><!--

${!false}--><!--

<%
		String s1="abc";
//		pageContext.setAttribute("s1", "from pc");
//		request.setAttribute("s1", "from Servlet1");
//		session.setAttribute("s1", "from Session");
		application.setAttribute("s1", "from Application");
%>
${ s1 } -->
