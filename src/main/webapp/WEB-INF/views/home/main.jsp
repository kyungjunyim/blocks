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
		<header class="header">
			<div class="row">
				<div class="col col-9">
					<a href="/blocks">
						<img src="/resources/img/logo_white.png" class="logo_nav">
					</a>	
				</div>	
				<div class="col col-md-auto" style="line-height: 32px;">
					<form style="line-height: 38px;">
						<button type="submit" class="btn_search"><img src="/resources/img/search-13-128.png" class="img_search"></button>
						<input type="text" class="input_search" placeholder="웹 드라이브의 파일을 검색하세요">
					</form>
				</div>
				<div class="col col-md-auto">
					<form>
						<button type="submit" class="btn_search"><img src="/resources/img/user-icon.png" style="height: 40px;"></button>
					</form>
				</div>
			</div>
		</header>
		<main class="main">
			<div class="main_container">
				<div class="row">
					<div class="col col-md-auto" style="background-color: rgba(120, 120, 120, 0.05); padding: 0; padding-left: 15px; height: 100vh; border-right: 1px solid rgba(107, 107, 107, 0.3);">
						<div class="main_nav" style="text-align: center;">
							<button type="button" class="btn_upload">업로드</button>
						</div>
						<div class="btn_grp">
							<button type="button" class="btn_nav"><img src="/resources/img/btn_3.png" class="img_btn_nav">즐겨찾기</button>
							<button type="button" class="btn_nav"><img src="/resources/img/btn_1.png" class="img_btn_nav">최근 업로드</button>
							<button type="button" class="btn_nav"><img src="/resources/img/btn_2.png" class="img_btn_nav">사진</button>
							<button type="button" class="btn_nav"><img src="/resources/img/btn_4.png" class="img_btn_nav">동영상</button>
							<button type="button" class="btn_nav"><img src="/resources/img/btn_5.png" class="img_btn_nav">문서</button>
							<button type="button" class="btn_nav"><img src="/resources/img/btn_6.png" class="img_btn_nav">오디오</button>
							
						</div>
						<div class="btn_grp">
							<button type="button" class="btn_nav">
								<img src="/resources/img/g_logo.png" class="img_btn_nav">
								<label>Google Drive</label>
								<label class="label_cap">0 KB / 15.0 GB</label>
							</button>
							<button type="button" class="btn_nav"><img src="/resources/img/o_logo.png" class="img_btn_nav">
								<label>OneDrive</label>
								<label class="label_cap">0 KB / 15.0 GB</label>
							</button>
							<button type="button" class="btn_nav"><img src="/resources/img/d_logo.png" class="img_btn_nav">
								<label>Dropbox</label>
								<label class="label_cap">0 KB / 15.0 GB</label>
							</button>
						</div>
					</div>
					<div class="col col-md-auto">
						<div class="main_contents" style="border: 1px solid black">
							최근 업로드
							<div class="col"></div>
							<div class="col"></div>
							<div class="col"></div>
							<div class="col"></div>
							<div class="col"></div>
							<div class="col"></div>
							<div class="col"></div>
							사진
							<div class="col"></div>
							<div class="col"></div>
							<div class="col"></div>
							<div class="col"></div>
							<div class="col"></div>
							<div class="col"></div>
							<div class="col"></div>
							<div class="col">동영상</div>
							<div class="col">문서</div>
							<div class="col"></div>
							<div class="col">
								<table>
									<thead>
										<tr>
											<th>이름</th>
											<th>크기</th>
											<th>위치</th>
										</tr>
									</thead>
									<tbody>
										<tr>
											<td>123123123123123</td>
											<td>42.5 KB</td>
											<td>로고</td>
										</tr>
										<tr>
											<td>123123123123123</td>
											<td>42.5 KB</td>
											<td>로고</td>
										</tr>
										<tr>
											<td>123123123123123</td>
											<td>42.5 KB</td>
											<td>로고</td>
										</tr>
										<tr>
											<td>123123123123123</td>
											<td>42.5 KB</td>
											<td>로고</td>
										</tr>
										<tr>
											<td>123123123123123</td>
											<td>42.5 KB</td>
											<td>로고</td>
										</tr>
									</tbody>
								</table>
							</div>
						</div>
					</div>
				</div>
			</div>
		</main>
	</div>
</body>
</html>
