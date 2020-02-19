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
						<button type="button" class="btn_main">최근 업로드</button>
					</div>
					<table class="table table-hover pages_table">
						<thead>
							<tr>
								<th scope="col" style="width: 1000px;">이름</th>
								<th scope="col" style="width: 100px; text-align: center;">크기</th>
								<th scope="col" style="width: 80px; text-align: center;">위치</th>
								<th scope="col" style="text-align: center;">최근 수정일</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td><img src="/resources/img/word_logo.png"
									class="logo_list"> Word_example_1.docx</td>
								<td style="text-align: center;">40 KB</td>
								<td style="text-align: center;"><img src="/resources/img/g_logo.png" class="logo_list">
								</td>
								<td style="text-align: center;">2020.01.11 오후 08:28</td>
							</tr>
							<tr>
								<td><img src="/resources/img/word_logo.png"
									class="logo_list"> Word_example_1.docx</td>
								<td style="text-align: center;">40 KB</td>
								<td style="text-align: center;"><img src="/resources/img/g_logo.png" class="logo_list">
								</td>
								<td style="text-align: center;">2020.01.11 오후 08:28</td>
							</tr>
							<tr>
								<td><img src="/resources/img/word_logo.png"
									class="logo_list"> Word_example_1.docx</td>
								<td style="text-align: center;">40 KB</td>
								<td style="text-align: center;"><img src="/resources/img/g_logo.png" class="logo_list">
								</td>
								<td style="text-align: center;">2020.01.11 오후 08:28</td>
							</tr>
							<tr>
								<td><img src="/resources/img/word_logo.png"
									class="logo_list"> Word_example_1.docx</td>
								<td style="text-align: center;">40 KB</td>
								<td style="text-align: center;"><img src="/resources/img/g_logo.png" class="logo_list">
								</td>
								<td style="text-align: center;">2020.01.11 오후 08:28</td>
							</tr>
							<tr>
								<td><img src="/resources/img/word_logo.png"
									class="logo_list"> Word_example_1.docx</td>
								<td style="text-align: center;">40 KB</td>
								<td style="text-align: center;"><img src="/resources/img/g_logo.png" class="logo_list">
								</td>
								<td style="text-align: center;">2020.01.11 오후 08:28</td>
							</tr>
							<tr>
								<td><img src="/resources/img/word_logo.png"
									class="logo_list"> Word_example_1.docx</td>
								<td style="text-align: center;">40 KB</td>
								<td style="text-align: center;"><img src="/resources/img/g_logo.png" class="logo_list">
								</td>
								<td style="text-align: center;">2020.01.11 오후 08:28</td>
							</tr>
							<tr>
								<td><img src="/resources/img/word_logo.png"
									class="logo_list"> Word_example_1.docx</td>
								<td style="text-align: center;">40 KB</td>
								<td style="text-align: center;"><img src="/resources/img/g_logo.png" class="logo_list">
								</td>
								<td style="text-align: center;">2020.01.11 오후 08:28</td>
							</tr>
							<tr>
								<td><img src="/resources/img/word_logo.png"
									class="logo_list"> Word_example_1.docx</td>
								<td style="text-align: center;">40 KB</td>
								<td style="text-align: center;"><img src="/resources/img/g_logo.png" class="logo_list">
								</td>
								<td style="text-align: center;">2020.01.11 오후 08:28</td>
							</tr>
							<tr>
								<td><img src="/resources/img/word_logo.png"
									class="logo_list"> Word_example_1.docx</td>
								<td style="text-align: center;">40 KB</td>
								<td style="text-align: center;"><img src="/resources/img/g_logo.png" class="logo_list">
								</td>
								<td style="text-align: center;">2020.01.11 오후 08:28</td>
							</tr>
							<tr>
								<td><img src="/resources/img/word_logo.png"
									class="logo_list"> Word_example_1.docx</td>
								<td style="text-align: center;">40 KB</td>
								<td style="text-align: center;"><img src="/resources/img/g_logo.png" class="logo_list">
								</td>
								<td style="text-align: center;">2020.01.11 오후 08:28</td>
							</tr>
							<tr>
								<td><img src="/resources/img/word_logo.png"
									class="logo_list"> Word_example_1.docx</td>
								<td style="text-align: center;">40 KB</td>
								<td style="text-align: center;"><img src="/resources/img/g_logo.png" class="logo_list">
								</td>
								<td style="text-align: center;">2020.01.11 오후 08:28</td>
							</tr>
							<tr>
								<td><img src="/resources/img/word_logo.png"
									class="logo_list"> Word_example_1.docx</td>
								<td style="text-align: center;">40 KB</td>
								<td style="text-align: center;"><img src="/resources/img/g_logo.png" class="logo_list">
								</td>
								<td style="text-align: center;">2020.01.11 오후 08:28</td>
							</tr>
						</tbody>
					</table>
					<nav aria-label="Page navigation example">
					<ul class="pagination justify-content-center">
						<li class="page-item"><a class="page-link" href="#">&laquo;</a></li>
						<li class="page-item active"><a class="page-link" href="#">1</a></li>
						<li class="page-item"><a class="page-link" href="#">2</a></li>
						<li class="page-item"><a class="page-link" href="#">3</a></li>
						<li class="page-item"><a class="page-link" href="#">4</a></li>
						<li class="page-item"><a class="page-link" href="#">5</a></li>
						<li class="page-item"><a class="page-link" href="#">&raquo;</a>
						</li>
					</ul>
					</nav>
				</div>
			</div>
		</div>
		</main>
	</div>
</body>
</html>

