$(function(){

	function getcinemas(){
		$.ajax({
			url:"/api/cinema/list",
			method: "GET"
		}).done(function(result){

    		  for (var i=0;i<result.length;i++) {
	  				var cinemaName = result[i].cinemaName;
<<<<<<< HEAD
	  				var cinemaFile = result[i].cinemaFilePath;
	  				var cinemaHTML = "<li>"+"<img height='220' width='400' src="+cinemaFile+"></li><li>"+ cinemaName +"</li>";
=======
	  				var cinemaHTML = "<div class='cinema-name'><li>" + cinemaName + "</li></div>";
>>>>>>> branch 'master' of https://github.com/hanbit-java001/team03.git
	  				$(".main-content ul").append(cinemaHTML);


	  				console.log(result);
	  			}


		});
	}

	getcinemas();



	$(".cinemaFile").on("click", function() {


	});


});



