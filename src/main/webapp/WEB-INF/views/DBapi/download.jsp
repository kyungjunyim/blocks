<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>Select download file</h1>
	<form action="/DBapi/download" method="post">
		파일경로:<input type="text" name="filename">
		<button type=submit>다운로드</button>
	</form>
</body>
</html>