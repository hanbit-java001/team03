$(function(){

	 $(".select-Seat").hide();

	var clickedCinemaId
	var clickedMovieId
	var clieckedDate
	var yyyy
    var mm
    var dd


	Date.prototype.yyyymmdd = function()
	{
	    yyyy = this.getFullYear().toString();
	    mm = (this.getMonth() + 1).toString();
	    return yyyy + (mm[1] ? mm : '0'+mm[0]) + (dd[1] ? dd : '0'+dd[0]);
	}



	function getDate(){
		var now = new Date();
		var getDate = parseInt(now.getDate());
		var week = new Array('일', '월', '화', '수', '목', '금', '토');
		var getDay = now.getDay();

		dd = getDate.toString();
		var startDate = now.yyyymmdd();

		for(var i=0; i<7; i++){
			if(mm == 1|3|5|7|8|10|13){
				var dateHTML = "<li><div class='monthly-date-date' data-val='"+startDate+"'>"+ parseInt((getDate+i)%32+(getDate+i)/32) + "일</div>"
							+"<div class='monthly-day-day' data-val='"+startDate+"'>"+ week[(getDay+i)%7] + "요일</div></li>";
			} else if(mm == 2){
				if(yyyy%4 == 0 ){
					var dateHTML = "<li><div class='monthly-date-date' data-val='"+startDate+"'>"+ parseInt((getDate+i)%30+(getDate+i)/30) + "일</div>"
						+"<div class='monthly-day-day' data-val='"+startDate+"'>"+ week[(getDay+i)%7] + "요일</div></li>";
				}else{
					var dateHTML = "<li><div class='monthly-date-date' data-val='"+startDate+"'>"+ parseInt((getDate+i)%29+(getDate+i)/29) + "일</div>"
						+"<div class='monthly-day-day' data-val='"+startDate+"'>"+ week[(getDay+i)%7] + "요일</div></li>";
				}
			} else{
				var dateHTML = "<li><div class='monthly-date-date' >"+ parseInt((getDate+i)%31+(getDate+i)/31) + "일</div>"
					+"<div class='monthly-day-day' data-val='"+startDate+"'>"+ week[(getDay+i)%7] + "요일</div></li>";
			}



			$(".monthly-date ul").append(dateHTML);
		}

		$(".monthly-date-date").on("click", function() {
			clieckedDate = $(this).attr("data-val") + "%";
			alert(clieckedDate)
		});
		$(".monthly-day-day").on("click", function() {
			clieckedDate = $(this).attr("data-val") + "%";
			alert(clieckedDate)
		});


	}



	function getCinemas(){
		$.ajax({
			url:"/api/cinema/list2",
			method: "GET"
		}).done(function(result){
    		  for (var i=0;i<result.length;i++) {
	  				var cinemaName = result[i].cinemaName;
	  				var cinemaId = result[i].cinemaId;
	  				var cinemaHTML = "<a class='list-group-item list-group-item-action list-group-item-info' data-val="+cinemaId+">" + cinemaName + "</a>" ;
	  				$(".cinema-list ul").append(cinemaHTML);
	  			}

    			$(".cinema-list ul a").on("click", function() {
    				clickedCinemaId = $(this).attr("data-val");
    			});
		});
	}

	function getMovies(){

		$.ajax({
			url:"/api/movie/list2",
			method: "GET",
		}).done(function(result){
    		  for (var i=0;i<result.length;i++) {
	  				var movieName = result[i].movieName;
	  				var movieId = result[i].movieId;
	  				var movieHTML = "  <a class='list-group-item list-group-item-action list-group-item-info' data-val="+movieId+">"+ movieName+"</a>";
	  				$(".movie-list ul").append(movieHTML);
	  			}

    		  $(".movie-list ul a").on("click", function() {
    			  clickedMovieId = $(this).attr("data-val");
				 getMovieSchedules(clickedCinemaId, clickedMovieId);

			});
		});
	}


	function getMovieSchedules(clickedCinemaId, clickedMovieId){
		$(".theater-list").empty();
		$.ajax({
			url:"/api/reservation/getMovieSchedule",
			method: "GET",
			data : {
				cinemaId : clickedCinemaId,
				movieId : clickedMovieId
			}
		}).done(function(result){
			  var res= new Array(result.length);

			  var postRes = new Array();

			  function resultSet()
			  {
				  var theaterName;
    			  var theaterId;
    			  var startTime;
    			  var totalSeat;
    			  var remainSeat;
    			  var timeId;
    			  var index;
    			  var movieId;
    			  var cinemaId;
			  }

    		  for (var i=0;i<result.length;i++) {
    			  res[i] = new resultSet();
    			  res[i].theaterName = result[i].theaterName;
    			  res[i].theaterId = result[i].theaterId;
    			  res[i].startTime = result[i].startTime.substr(8,2)+"시 "+result[i].startTime.substr(10,2) + "분";
    			  res[i].totalSeat = result[i].totalSeat;
    			  res[i].remainSeat = res[i].totalSeat - result[i].reservedSeat;
    			  res[i].timeId = result[i].timeId;
    			  res[i].index = i;
    			  res[i].movieId = clickedMovieId;
    			  res[i].cinemaId = clickedCinemaId
	  			  var theaterHTML = "<div><ul><li> 상영관 : " +  res[i].theaterName +"</li>"
	  			  					+"<li> 시작시간 : " + res[i].startTime +"</li>"
	  			  					+"<li> 총 자리 : " + res[i].totalSeat +"</li>"
	  			  					+"<li> 남은자리 : " + res[i].remainSeat +"</li><br>"
	  			  					+"<li class='btn-info' id='index"+res[i].index+"'> 좌석선택</li></ul></div>";
	  				$(".theater-list").append(theaterHTML);
	  			}
    		  $(".btn-info").on("click", function() {
    			  var index = $(this).attr('id').substring(5);
    			  $(".select-Content").hide();
    			  $(".select-Seat").show();

    			  		$.ajax({
    			  			url:"/api/reservation/getSeat",
    			  			method: "GET",
    			  			data:{
    			  				timeId: res[index].timeId,
    			  				theaterId: res[index].theaterId
    			  			}

    			  		}).done(function(result){
    			  			 var seatHTML="";
    			  			 var seatNumberBeforeIndex;
    			  			 var seatNumber;
			 		   		  for (var i=0;i<result.length;i++) {

			 		   			  if(i==0)
			 		   			  {
			 		   				  seatNumberBeforeIndex = 'A';
			 		   			  }
			 		   			  else
			 		   			  {
			 		   				  seatNumberBeforeIndex = result[i-1].seatNumber.substring(0,1);
			 		   			  }

			 		   			  seatNumber = result[i].seatNumber.substring(0,1);


				  				if(result[i].seatNumber.substring(1) == 1){
				  					seatHTML += "<tr>";
				  				}

				  				if(result[i].reserVation == 0)
				  				{
				  					seatHTML += "<td class='emptySeat' id='"+result[i].seatId+"' val='"+(i)+"'>"+result[i].seatNumber+"</td>";
				  				}
				  				else if(result[i].reserVation == 1)
			 		   		  	{
				  					seatHTML += "<td class='reservedSeat' id='"+result[i].seatId+"' val='"+(i)+"' this.style.background='red'>"+result[i].seatNumber+"</td>";
			 		   		  	}
				  				if(i == result.length-1){
				  					seatHTML += "</tr>";
				  				}
				  				else if(i<result.length-1 && result[i+1].seatNumber.substring(0,1) != seatNumber)
				  				{
				  					seatHTML += "</tr>";
				  				}

				  			}
			 		   		$(".main-content tbody").append(seatHTML);


			 		   		$(".seat-Table td").on("click", function() {
			 	    			 if( result[$(this).attr('val')].reserVation == 1)
			 	    			 {
			 	    				 alert("이미 예약된 자리입니다.");
			 	    			 }
			 	    			 else if(result[$(this).attr('val')].reserVation != 3)
			 	    			 {
			 	    				 $(this).css("background-color","pink");
			 	    				result[$(this).attr('val')].reserVation = 3;
			 	    		  	 }
			 	    			 else if( result[$(this).attr('val')].reserVation == 3){
			 	    				 $(this).css("background-color","#FFFFF0");
			 	    				result[$(this).attr('val')].reserVation = 0;
			 	    			 }
			 	    		  });

			 				  $("#commit-btn").on("click", function() {

					 		 		for(var k=0; k<result.length;k++){
					 		   			if (result[k].reserVation == 3){
					 		   				var postObj = new Object();
					 		    			postObj.timdId = res[index].timeId;
					 		    			postObj.theaterId = res[index].theaterId;
					 		    			postObj.cinemaId = res[index].cinemaId;
					 		    			postObj.movieId = res[index].movieId;
					 		   				postObj.seatId = result[k].seatId;
					 		   				postRes.push(postObj);
					 		   			}
					 		   		}
					 		   	 alert(JSON.stringify(postRes));
			 					 $.ajax({
			    			  			url:"/api/reservation/reservation",
			    			  			method: "POST",
			    						contentType: "application/json; charset=utf-8",
			    			  			data: JSON.stringify(postRes)
			    			  		}).done(function(result){
			    			    		  alert("예매되었습니다.");
			    			    		  location.href = "/";
			    					});
			 				  });


			 				  $("#cancel-btn").on("click", function() {
			 					 location.href = "/";
			 				  });

    			  		});
    		  });
		});
	}

	getMovies();
	getCinemas();
	getDate();



});