<% pageContext.setAttribute("abc", "hello");
	%>
<%
	String s1 = (String)pageContext.getAttribute("abc");
	out.println(s1);
%>