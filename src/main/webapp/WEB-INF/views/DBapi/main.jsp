<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>This is main page.</h1>
	<button id="list">file list</button>
	<button id="upload">upload</button>
	<button id="download">download</button>
</body>
<script>
	var list = document.getElementById("list");
	var upload = document.getElementById("upload");
	var download = document.getElementById("download");
	upload.onclick = function(){
		location.href = "/DBapi/upload";
	};
	list.onclick = function(){
		location.href = "/DBapi/list";
	};
	download.onclick = function(){
		location.href = "/DBapi/download";
	};
</script>
</html>