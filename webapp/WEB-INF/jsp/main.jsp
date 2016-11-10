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
<link rel="stylesheet" href="/static/css/main.css"/>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
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
      <div class="main1">
         <img alt="" src="/static/images/mainbanner.jpg">
      </div>


      <div class="caro">
      <div id="myCarousel" class="carousel slide" data-ride="carousel">
        <!-- Indicators -->
        <ol class="carousel-indicators">
          <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
          <li data-target="#myCarousel" data-slide-to="1"></li>
          <li data-target="#myCarousel" data-slide-to="2"></li>
        </ol>

        <!-- Wrapper for slides -->
        <div class="carousel-inner" role="listbox">
          <div class="item active">
            <img src="../../static/images/mainimage.jpg" class="center-block">
            <div class="carousel-caption">
<!--               <h3>New York</h3> -->
<!--               <p>The atmosphere in New York is lorem ipsum.</p> -->
            </div>
          </div>

          <div class="item">
            <img src="../../static/images/mainimage2.jpg" class="center-block">
            <div class="carousel-caption">
            </div>
          </div>

          <div class="item">
            <img  src="../../static/images/mainimage.jpg" class="center-block">
            <div class="carousel-caption">
            </div>
          </div>
          </div>

        <!-- Left and right controls -->
        <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
          <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
          <span class="sr-only">Previous</span>
        </a>
        <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
          <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
          <span class="sr-only">Next</span>
        </a>
        </div>
   </div>

   <div class="main2">
      <img alt="" src="/static/images/movieselection.jpg">

      <br>
      <br>
      <div class="portfolio">
        <div class="row text-center">
          <div class="col-sm-4">
            <div class="thumbnail">
              <img src="/static/images/strange.jpg">
              <br>
              <p><strong>닥터 스트레인지</strong></p>
              <p>Yes, we built Paris</p>
            </div>
          </div>
          <div class="col-sm-4">
            <div class="thumbnail">
              <img src="/static/images/lucky.jpg">
              <br>
              <p><strong>럭키</strong></p>
              <p>We built New York</p>
            </div>
          </div>
          <div class="col-sm-4">
            <div class="thumbnail">
              <img src="/static/images/inferno.jpg">
              <br>
              <p><strong>인페르노</strong></p>
              <p>Yes, San Fran is ours</p>
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
<script src="/static/js/main.js"></script>

</body>
</html>