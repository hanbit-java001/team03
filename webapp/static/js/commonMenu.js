$(function(){

	$(".top-login ul li").on("click", function(){
		var loginMenu = $(this).attr("id");

		if(loginMenu == "login"){
			showLoginDialog();
		}
		else if(loginMenu == "register"){
			location.href = "/";
		}
		else if(loginMenu == "findId"){
			location.href = "/";
		}
		else if(loginMenu == "findPw"){
			location.href = "/";
		}
		else if(loginMenu == "memberShip"){
			location.href = "/";
		}
		else if(loginMenu == "customCenter"){
			location.href = "/";
		}

	});

	$(".top-menu ul li").on("click", function(){
		var mainMenu = $(this).attr("id");

		if (mainMenu== "reservation"){
			location.href = "/reservation";
		}
		else if (mainMenu== "movie"){
			location.href = "/movie/now";
		}
		else if (mainMenu== "cinema"){
			location.href = "/cinema/theater";
		}
		else if (mainMenu== "sweetShop"){
			location.href = "/sweetShop";
		}
		else if (mainMenu== "event"){
			location.href = "/event";
		}

	});

	$(".top-logo").on("click", function(){
		location.href = "/";
	});

	$(".btnLoginCancel").on("click", function() {
		hideLoginDialog();
	});

	function showLoginDialog() {
		$(".login-dialog").fadeIn();
	}

	function hideLoginDialog() {
		$(".login-dialog").fadeOut();
	}


});


