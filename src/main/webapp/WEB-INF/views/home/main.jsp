<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Blocks</title>
<link rel="stylesheet" href="/resources/css/common.css">
<link rel="stylesheet" href="/resources/css/main.css">
<link rel="stylesheet" href="/resources/bootstrap/css/bootstrap.css">
<link rel="icon" type="image/png" href="/resources/favicon-32x32.png">
</head>
<body style="overflow-x: hidden">
	<div class="wrap">
		<%@ include file="header.jsp"%>
		<main class="main">
		<div class="main_container">
			<div class="row">
				<%@ include file="nav_left.jsp"%>
				<div class="col col-md-auto" style="padding: 15px; height: 100vh;">
					<div class="row" style="margin-left: 20px;">
						<button type="button" class="btn_main">최근 업로드 (3)</button>
					</div>
					<div class="row" style="margin-left: 50px; margin-top: 15px;">
						<div class="col">
							<button type="button" class="btn_thumb">
								<img src="/resources/img/word_thumb.jpg" class="temp_thumb">
								<div class="thumb_cap">word_1.docx</div>
							</button>
						</div>
						<div class="col">
							<button type="button" class="btn_thumb">
								<img src="/resources/img/word_thumb.jpg" class="temp_thumb">
								<div class="thumb_cap">word_2.docx</div>
							</button>
						</div>
						<div class="col">
							<button type="button" class="btn_thumb">
								<img src="/resources/img/word_thumb.jpg" class="temp_thumb">
								<div class="thumb_cap">word_3.docx</div>
							</button>
						</div>
					</div>
					<div class="row" style="margin-left: 20px; margin-top: 40px;">
						<button type="button" class="btn_main">문서 (3)</button>
					</div>
					<div class="row" style="margin-left: 50px; margin-top: 15px;">
						<div class="col">
							<button type="button" class="btn_thumb">
								<img src="/resources/img/word_thumb.jpg" class="temp_thumb">
								<div class="thumb_cap">word_1.docx</div>
							</button>
						</div>
						<div class="col">
							<button type="button" class="btn_thumb">
								<img src="/resources/img/word_thumb.jpg" class="temp_thumb">
								<div class="thumb_cap">word_2.docx</div>
							</button>
						</div>
						<div class="col">
							<button type="button" class="btn_thumb">
								<img src="/resources/img/word_thumb.jpg" class="temp_thumb">
								<div class="thumb_cap">word_3.docx</div>
							</button>
						</div>
					</div>
					<div class="row" style="margin-left: 20px; margin-top: 40px;">
						<button type="button" class="btn_main">사진 (0)</button>
					</div>
				</div>
			</div>
		</div>
		</main>
	</div>
</body>
</html>
