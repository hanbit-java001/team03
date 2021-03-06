<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>한빛 영화관</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=no" />
<meta name="msapplication-tap-highlight" content="no" />
<link rel="stylesheet" href="/static/plugins/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/static/css/common.css"/>
<link rel="stylesheet" href="/static/css/join.css"/>
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

	<div class="main-content">
		<div class="main-content-body login-form">
				<div class="form-group has-success has-feedback">
					<lable class="member" for="email">이메일</lable>
					<input type="text" class="form-control" placeholder="이메일" id="email" maxlength="20" size="15">
				</div>

				<div class="form-group has-success has-feedback">
					<lable class="member" for="pw">비밀번호</lable>
					<input type="password" class="form-control" placeholder="비밀번호" id="pw" maxlength="20" size="10">
				</div>

				<div class="container">
					  <div class="container-btn">
					    <button class="btnlogin btn btn-success">로그인</button>
					    <button class="btncancel btn btn-danger">돌아가기</button>
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


<script type="text/javascript"></script>
<script src="/static/plugins/jquery/jquery-3.1.0.min.js"></script>
<script src="/static/js/commonMenu.js"></script>
<script src="/static/js/login.js"></script>

</body>
</html>