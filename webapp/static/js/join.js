$(function(){

	$(".btnlogin").on("click", function(){
		var email = $("#email").val();
		var name = $("#name").val();
		var password = $("#pw").val();
		var passwordcheck = $("#pwcheck").val();

		$.ajax({
			url: "/api/member/join",
			method: "POST",
			data: {
				email: email,
				name: name,
				password: password
			}
		}).done(function(result) {
			processAfterLogin(result.name);
			location.href="/";
		}).fail(function() {
			alert("로그인을 실패하였습니다.");
		});
	});
		function processAfterLogin(name) {
			alert("회원가입을성공하였습니다");

			$("#email").val("");
			$("#pw").val("");

			location.reload();
		}


	$(".btncancel").on("click", function() {
		history.back();
	});


});