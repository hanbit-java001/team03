$(function(){
	function getcinemas(){
		$.ajax({
			url:"/api/cinema/list",
			method: "GET"
		}).done(function(result){

    		  for (var i=0;i<result.length;i++) {
	  				var cinemaName = result[i].cinemaName;
	  				var cinemaHTML = "<div class='cinema-name'><li>" + cinemaName + "</li></div>";
	  				$(".main-content ul").append(cinemaHTML);


	  			}
		});
	}

	getcinemas();




});

