$(function(){

	function getDate(){
		var now = new Date()
		var getDate = parseInt(now.getDate());

		var week = new Array('일', '월', '화', '수', '목', '금', '토');
		var getDay = now.getDay();

		for(var i=0; i<7; i++){
			var dateHTML = "<li>"+ parseInt(getDate+i) + "일</li>";
			var dayHTML = "<li>"+ week[(getDay+i)%7] + "요일</li>";
			$(".monthly-day ul").append(dayHTML);
			$(".monthly-date ul").append(dateHTML);
		}
	}

	function getMovie(){
		$.ajax({
			url: "/api/reservation/getMovieSchedule",
			method: "GET",
			data:{
					cinemaId: 1, 		//임시로 1, 1로함
	    			movieId: 1,
			}
		}).done(function(result) {
			//구현해야함
		});

	}


	function getCinemas(){
		$.ajax({
			url:"/api/cinema/list",
			method: "GET"
		}).done(function(result){
    		  for (var i=0;i<result.length;i++) {
	  				var cinemaName = result[i].cinemaName;
	  				var cinemaHTML = "<div class='cinema-name'><li>" + cinemaName + "</li></div>";
	  				$(".movie-list ul").append(cinemaHTML);
	  			}
		});
	}

	getDate();
	getCinemas();
});