<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Blocks</title>
<link rel="stylesheet" href="/resources/css/common.css">
<link rel="stylesheet" href="/resources/bootstrap/css/bootstrap.css">
<link rel="stylesheet" href="/resources/css/home.css">
<link rel="icon" type="image/png" href="/resources/favicon-32x32.png">
</head>
<body>
	<div class="container-xl">
		<div class="row" style="text-align: right;">
			<div class="col-xl" style="margin: 20px auto">
				<form action="/blocks" method="GET">
					<button type="submit" class="btn btn-outline-primary btn-lg font-weight-bold btn_login">Blocks 시작하기</button>
				</form>
			</div>
		</div>
		<div class="row" style="text-align: center;">
			<div class="col-xl">
				<img class="logo" src="/resources/img/logo.png">
			</div>
		</div>
	</div>
</body>
</html>