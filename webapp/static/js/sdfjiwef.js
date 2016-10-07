$(function() {

	for (var i=0;i<result.length;i++) {
		var movieName = result[i].name;
		var movieHTML = "<li>" + movieName + "</li>";;

		$(".main-content ul").append(movieHTML);
	}
});

		-------------------------------------------



function getMovie(movieId) {
    jQuery.ajax({
    	url: "/api/movie/list",
    	method: "GET",
    	data: {
    		startDt: startDt,
    		endDt: endDt
    	}
    }).done(function(result) {
    	  for (var i=0;i<result.length;i++)
{  applyScheduleToCalendar(result[i], "add");	  }
    }).fail(function() {
		alert("사용자가 폭주하여 잠

시 후 사용해주세요.");
    });
}