<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="col col-md-auto"
	style="background-color: rgba(120, 120, 120, 0.05); padding: 0; padding-left: 15px; height: 100vh; border-right: 1px solid rgba(107, 107, 107, 0.3);">
	<div class="main_nav" style="text-align: center;">
		<button type="button" class="btn_upload">업로드</button>
	</div>
	<div class="btn_grp">
		<form action="/blocks/pages" method="GET">
			<button type="submit" class="btn_nav">
				<img src="/resources/img/btn_1.png" class="img_btn_nav">최근 업로드
			</button>
		</form>
		<form action="/blocks/pages" method="GET">
			<button type="submit" class="btn_nav">
				<img src="/resources/img/btn_2.png" class="img_btn_nav">사진
			</button>
		</form>
		<form action="/blocks/pages" method="GET">
			<button type="submit" class="btn_nav">
				<img src="/resources/img/btn_4.png" class="img_btn_nav">동영상
			</button>
		</form>
		<form action="/blocks/pages" method="GET">
			<button type="submit" class="btn_nav">
				<img src="/resources/img/btn_5.png" class="img_btn_nav">문서
			</button>
		</form>
		<form action="/blocks/pages" method="GET">
			<button type="submit" class="btn_nav">
				<img src="/resources/img/btn_6.png" class="img_btn_nav">오디오
			</button>
		</form>

	</div>
	<div class="btn_grp">
		<div class="container">
			<div class="row">
				<button type="button" class="btn_nav">
					<div class="row align-items-center">
						<div class="col-3">
							<img src="/resources/img/g_logo.png" class="img_btn_nav">
						</div>
						<div class="col">
							<div class="row">
								<div class="col">Google Drive</div>
							</div>
							<div class="row">
								<div class="col cap">0 KB / 15.0 GB</div>
							</div>
						</div>
					</div>
				</button>
			</div>
			<div class="row">
				<button type="button" class="btn_nav">
					<div class="row align-items-center">
						<div class="col-3">
							<img src="/resources/img/o_logo.png" class="img_btn_nav">
						</div>
						<div class="col">
							<div class="row">
								<div class="col">OneDrive</div>
							</div>
							<div class="row">
								<div class="col cap">0 KB / 15.0 GB</div>
							</div>
						</div>
					</div>
				</button>
			</div>
			<div class="row">
				<button type="button" class="btn_nav">
					<div class="row align-items-center" style="opacity: 0.2">
						<div class="col-3">
							<img src="/resources/img/d_logo.png" class="img_btn_nav">
						</div>
						<div class="col">
							<div class="row">
								<div class="col">Dropbox</div>
							</div>
							<div class="row">
								<div class="col cap">계정 연동하기</div>
							</div>
						</div>
					</div>
				</button>
			</div>
		</div>
	</div>
</div>