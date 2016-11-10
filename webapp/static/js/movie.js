$(function(){

	function getmovies(){

		$(".movielistdetail").hide();

		$.ajax({
			url:"/api/movie/list",
			method: "GET"
		}).done(function(result){
    		  for (var i=0;i<result.length;i++) {
    			  	var movieId = result[i].movieId;
	  				var movieName = result[i].movieName;
	  				var movieFile = result[i].movieFilePath;
	  				var movieHTML = "<div class='movietotal'>";
	  				movieHTML += "<img movieId='" + movieId +"' class='movielink' height='220' width='180' src="+movieFile+"><br>";
	  				movieHTML += "<span movieId='" + movieId+"' class='movielink'>"+movieName+"</span></div>";
	  				$(".movie-content").append(movieHTML);
    		  }


    		  $(".movielink").on("click", function(){
    			  $(".movie-content").hide();
    			  var movieId = $(this).attr("movieId");
    			  $.ajax({
    				  url:"/api/movie/detail",
    				  method: "GET",
    				  data:{
    					  movieId:movieId
    				  }
    			  }).done(function(result){
    				  var details = "<div class='movielistdetails'><img height='500' width='350' src="+result.movieFilePath+"><br><br><li>영화감독:"+result.movieDirector+"</li><li>장르:"+result.movieGenre+
    				  "</li><li>영화 제목:"+result.movieName+"</li>";
    				  $(".movielistdetail").append(details);

    				  var back = "<br><br><br><br><div class='back'>영화목록보기</div>";

    				  $(".movielistdetail").show();
    				  $(".movielistdetail").append(back);

    				  $(".back").on("click", function(){
    					  location.href = "/movie/now";

    				  });
    			  });

    		  });
		});
	}

	getmovies();


	});



