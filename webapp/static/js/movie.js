$(function(){

	function getmovies(){
		$.ajax({
			url:"/api/movie/list",
			method: "GET"
		}).done(function(result){

    		  for (var i=0;i<result.length;i++) {
	  				var movieName = result[i].movieName;
	  				var movieFile = result[i].movieFilePath;
	  				var movieHTML = "<div class='movie-body'><div class='movie-name'><li>"+"<img height='220' width='150' src="+movieFile+">"+ movieName+ "</li></div></div>";
	  				$(".main-content ul").append(movieHTML);



	  			}


		});
	}

	getmovies();





});



