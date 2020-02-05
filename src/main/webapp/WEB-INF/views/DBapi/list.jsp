<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<%@ page import="java.util.*"%>
<body>
	<h1>This is list page.</h1>
	<h3>Files and folders in your root are...</h3>
	<%
		List<String> list = (List<String>) request.getAttribute("list");
		for (String name : list) {
			out.println(name+"</br>");
		}
	%>

</body>
</html>