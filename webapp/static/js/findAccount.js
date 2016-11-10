$(function(){

	$(".btnlogin").on("click", function(){
		var email = $("#email").val();
		var name = $("#name").val();

		$.ajax({
			url: "/api/member/join",
			method: "POST",
			data: {
				email: email,
				name: name,
			}
		}).done(function(result) {

		}).fail(function() {
			alert("테스트");
		});
	});

	$(".btncancel").on("click", function() {
		history.back();
	});


});