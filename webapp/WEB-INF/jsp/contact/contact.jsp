<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=no" />
<meta name="msapplication-tap-highlight" content="no" />
<link rel="stylesheet"
	href="/static/plugins/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/static/css/main.css" />
<link rel="stylesheet" href="/static/css/contact.css" />
<link rel="stylesheet" href="/static/css/common.css" />
</head>
<body id="hanbit">


	<div class="common-top-container">
		<div class="common-login-container">
		      <div class="common-login">
		         <ul>
		         <li id="login">로그인</li>
		         <li id="join">회원가입</li>
		            <li id="shoppingBasket">장바구니</li>
		            <li id="contact">고객센터</li>
		         </ul>
		      </div>

		       <div class="common-logined">
		         <ul>
		         <li id="loginout">로그아웃</li>
		         <li id="ticketCheck">영화예매확인</li>
		            <li id="shoppingBasket">장바구니</li>
		            <li id="contact">고객센터</li>
		         </ul>
		        </div>
		</div>

		<div class="common-top-logo">
			<div class="logo center-block">
			<img alt="" src="/static/images/logo.jpg">
			</div>
		</div>

		<div class="common-main-menu">
			<ul>
				<li id="reservation">예매</li>
				<li id="movie">영화</li>
				<li id="cinema">영화관</li>
				<li id="sweetShop">스위트샵</li>
				<li id="event">이벤트</li>
			</ul>
		</div>
	</div>

		<div class="content">
				<div class="mapWapper">
					<div id="googleMap"></div>
				</div>
				<div class="row test">
					<h2 class="text-center">CONTACT</h2>
					<div class="col-sm-5">
					<p>24시간 내에 처리 됩니다.</p>
						<p>
							<span class="glyphicon glyphicon-map-marker"></span> 신수동, 마포구
						</p>
						<p>
							<span class="glyphicon glyphicon-phone"></span> +10 1234 5678
						</p>
						<p>
							<span class="glyphicon glyphicon-envelope"></span>
							email@thing.com
						</p>
					</div>

					<div class="col-sm-7">
						<div class="row">
							<div class="col-sm-6 form-group">
								<input class="form-control" id="name" name="name"
									placeholder="Name" type="text" required>
							</div>
							<div class="col-sm-6 form-group">
								<input class="form-control" id="email" name="email"
									placeholder="Email" type="email" required>
							</div>
						</div>
						<textarea class="form-control" id="comments" name="comments"
							placeholder="Comment" rows="5"></textarea>
						<br>
						<div class="row">
							<div class="col-sm-12 form-group">
								<button class="btn btn-default pull-right" type="submit">Send</button>
							</div>
						</div>
					</div>
				</div>
		</div>




	<div class="common-bottom">
	 <a href="#hanbit" title="To Top">
    	<span class="glyphicon glyphicon-chevron-up"></span>
 	 </a>
		<footer class="container-fluid bg-4 text-center">
	  		<p>2호선 신촌역 6번출구 전방 100미터 거구장건물(1층 스타벅스) 3층</p><br>
	  		대표이사 김은비 | 사업자등록번호 123-45-67899 | 통신판매업신고번호 제1557호
		</footer>

	</div>

	<script src="/static/plugins/jquery/jquery-3.1.0.min.js"></script>
	<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script src="/static/js/commonMenu.js"></script>
	<script src="/static/js/contact.js"></script>
	<script src="http://maps.googleapis.com/maps/api/js"></script>

</body>
</html>