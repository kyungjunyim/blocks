<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>This is home</h1>
	<button id = "login">login</button>
	
</body>
<script>
	<%String url = (String)request.getAttribute("url"); %>
	var btn = document.getElementById("login");
	btn.onclick = function(){
		location.href ="<%=url%>";
	};
</script>
</html>