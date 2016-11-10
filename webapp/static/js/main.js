$(function(){

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


