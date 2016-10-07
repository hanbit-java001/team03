$(function(){

	function getmovies(){
		$.ajax({
			url:"/api/movie/list",
			method: "GET"
		}).done(function(result){
			
    		  for (var i=0;i<result.length;i++) {
	  				var movieName = result[i].movieName;
	  				var movieHTML = "<div class='movie-name'><li>" + movieName + "</li></div>";
	  				$(".main-content ul").append(movieHTML);
	  			}
		});
	}

	getmovies();

});



