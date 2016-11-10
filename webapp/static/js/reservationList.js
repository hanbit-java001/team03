$(function(){

	$.ajax({
		url:"/api/reservation/reservationList",
		method: "GET"
	}).done(function(result){
		  for (var i=0;i<result.length;i++) {
				var reserveId = result[i].reserveId;
				var startTime = result[i].startTime;
				var movieName = result[i].movieName;
  				var reservationListHTML = "<a class='reservationList' data-val="+reserveId+"> 예매번호: "+reserveId
  												 + " 영화 : " + movieName  +" 시작시간 : "+ startTime +"</a>" ;


  				$(".myReservationList ul").append(reservationListHTML);
  			}

			$(".reservationList").on("click", function() {
				var reserveDetailId = $(this).attr("data-val");
				$(".myReservationList ul").hide();

				$.ajax({
					url:"/api/reservation/reservationDetail",
					method: "GET",
					data : {
						reserveId : reserveDetailId
					}
				}).done(function(detailResult){
							var reserveId = detailResult.reserveId;
							var cinemaName = detailResult.cinemaName;
							var theaterName = detailResult.theaterName;
							var movieName = detailResult.movieName;
							var startTime = detailResult.startTime;
							var seatNumber = detailResult.seatNumber;

			  				var reservationDetailHTML = "<div><ul class='reservationDetail' data-val="+reserveId+"> <li>예매번호: "+reserveId+"</li>"
			  												+"<li>영화관: " + cinemaName +"</li>"+ "<li>상영관: "+ theaterName+"</li>" +"<li>영화: " + movieName+"</li>"
			  												+"<li>시작시간: "+ startTime+"</li>" +"<li>좌석번호: " + seatNumber +"</li><ul></div>" ;
			  				$(".myReservationDetail ul").append(reservationDetailHTML);

//						$(".reservationDetail").on("click", function() {
//							alert($(this).attr("data-val"));
//						});


				});


			});



	});



});