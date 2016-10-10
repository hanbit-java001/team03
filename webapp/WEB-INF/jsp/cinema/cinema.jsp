<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>영화관</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=no" />
<meta name="msapplication-tap-highlight" content="no" />
<link rel="stylesheet" href="/static/plugins/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/static/css/common.css"/>
</head>
<body>

	<div class="main-top-container">
		<div class="top-login">
			<ul>
				<li>로그인</li>
				<li>회원가입</li>
				<li>아이디찾기</li>
				<li>비밀번호찾기</li>
				<li>멤버쉽</li>
				<li>고객센터</li>
			</ul>
		</div>
		<div class="top-logo">
			한빛시네마
		</div>
		<div class="top-menu">
			<ul>
				<li>예매</li>
				<li>영화</li>
				<li>영화관</li>
				<li>스위트샵</li>
				<li>이벤트</li>
			</ul>
		</div>
	</div>



	<div class="cinema-content">
		
	</div>

	<script type="text/javascript">
	var movie = [1,2,3,4,5];
	
	for (var i=0; i<movie.length; i++){
		var movie1 = movie[i];
		var html = "<div class='cinema-content'>" + movie1 + "</div>";
		
		$(".movie").prepend(html)
	}
	</script>


	<div class="main-bottom">
		 2호선 신촌역 6번출구 전방 100미터 거구장건물(1층 스타벅스) 3층
	</div>




<script src="/static/plugins/jquery/jquery-3.1.0.min.js"></script>
<script src="/static/js/cinema.js"></script>
<script type="text/javascript"></script>

</body>
</html>