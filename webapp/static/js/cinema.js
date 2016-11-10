$(function(){

	function getcinemas(){

		$(".cinema-contents").hide();
		$.ajax({
			url:"/api/cinema/list",
			method: "GET"
		}).done(function(result){
    		  for (var i=0;i<result.length;i++) {
    			  	var cinemaId = result[i].cinemaId;
	  				var cinemaName = result[i].cinemaName;
	  				var cinemaFile = result[i].cinemaFilePath;
	  				console.log(cinemaId);
	  				var cinemaHTML = "<div class='cinemalist'>"
	  				cinemaHTML += "<img cinemaId='"+ cinemaId +"'height='220' width='400' src='"+cinemaFile+"'>"
	  				cinemaHTML += "<br><p cinemaId='"+ cinemaId +"' class='name'>"
	  				cinemaHTML += cinemaName
	  				cinemaHTML += "</p></div>"
	  				cinemaHTML += "<br><br>";
	  				$(".cinema-content").append(cinemaHTML);
	  				console.log(result);
	  			}



    		   $(".cinemalist img, .name").on("click", function(){
	               $(".cinema-content").hide();
	               var cinemaId = $(this).attr("cinemaId");
	               var shinchon = '서울특별시 서대문구 신촌로 129까지 버스타고 오세요';
	               var hongdae = '서울특별시 마포구 양화로 153, 4층까지 걸어오세요';

	               $.ajax({
	                  url:"/api/cinema/detail",
	                  method: "GET",
	                  data:{
	                	 cinemaId:cinemaId
	                  }
	               }).done(function(result){
	                  var details = "<div class='cinemalistdetail'>"
	                  	  details += "<img src='"+result.cinemaFilePath+"'><br><br>"
	                  	  details += "<p class='names'>" + result.cinemaName + "는 고객 여러분께 최상의 서비스를 제공할 것 입니다.</p></div>";

	                  $(".cinema-contents").append(details);


	                  if (cinemaId == 1) {
	                 	 $(".cinema-contents").append("<p>"+ shinchon +"</p>");
	                  } else if (cinemaId == 2) {
	                 	 $(".cinema-contents").append("<p>" + hongdae + "</p>");
	                  }

	                  var back = "<br><br><br><br><span class='back'>영화관 목록 보기</span>";
	                  $(".cinema-contents").append(back);
	                  $(".cinema-contents").show();



	                  $(".back").on("click", function() {
	                	  location.replace("/cinema/theater");
	                  });
	               });

	            });


		});

	}
	getcinemas();
});



