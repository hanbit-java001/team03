$(function(){

	function getcinemas(){
		$.ajax({
			url:"/api/cinema/list",
			method: "GET"
		}).done(function(result){

    		  for (var i=0;i<result.length;i++) {
	  				var cinemaName = result[i].cinemaName;
	  				var cinemaFile = result[i].cinemaFilePath;
	  				var cinemaHTML = "<li>"+"<img height='220' width='400' src="+cinemaFile+"></li><li>"+ cinemaName +"</li>";
	  				$(".main-content ul").append(cinemaHTML);


	  				console.log(result);
	  			}


		});
	}

	getcinemas();



	$(".cinemaFile").on("click", function() {


	});


});



