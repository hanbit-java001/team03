$(function(){

	$(".top-login ul li").on("click", function(){
		var loginMenu = $(this).attr("id");

		if(loginMenu == "login"){
			location.href = "/"
		}
		else if(loginMenu == "register"){
			location.href = "/"
		}
		else if(loginMenu == "findId"){
			location.href = "/"
		}
		else if(loginMenu == "findPw"){
			location.href = "/"
		}
		else if(loginMenu == "memberShip"){
			location.href = "/"
		}
		else if(loginMenu == "customCenter"){
			location.href = "/"
		}

	});

	$(".top-menu ul li").on("click", function(){
		var mainMenu = $(this).attr("id");

		if (mainMenu== reservation){
			location.href = "/"
		}
		else if (mainMenu== movie){
			location.href = "/movie/now";
		}
		else if (mainMenu== cinema){
			location.href = "/cinema/cinema";
		}
		else if (mainMenu== sweetShop){
			location.href = "/"
		}
		else if (mainMenu== event){
			location.href = "/"
		}

	});

	function showDetailCinema(cinema) {
		var show = {
			name: cinema.cinemaName;
		}

		$("#detailName").html(show.name);
	});

});

