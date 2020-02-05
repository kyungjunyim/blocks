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
	<h1>Select upload folder, your file</h1>
	<form action="/DBapi/upload" method="post" enctype="multipart/form-data">
		<select name="path">
			<%
				List<String> folderList = (List<String>) request.getAttribute("folderList");
				for (String folder : folderList) {
					out.println("<option value='" + folder + "'>" + folder + "</option>\n");

				}
			%>
		</select></br>
		<input type="file" name ="file"></br>
		파일명 : <input type="text" name="filename">
		<button type="submit">upload</button>
	</form>
</body>
</html>