$(function(){

	$(".btnlogin").on("click", function(){
		var email = $("#email").val();
		var password = $("#pw").val();

		if (email == "") {
			alert("이메일을 입력하세요.");
			$("#email").focus();
			return;
		}
		else if (password == "") {
			alert("비밀번호를 입력하세요.");
			$("#pw").focus();
			return;
		}

		$.ajax({
			url: "/api/security/login",
			method: "POST",
			data: {
				email: email,
				password: password
			}
		}).done(function(result) {
			processAfterLogin(result.name);
			location.href="/";
		}).fail(function() {
			alert("로그인을 실패하였습니다.");
		});
	});
		$(".btncancel").on("click", function() {
			history.back();
		});

		function processAfterLogin(name) {
			alert(name + "님 반갑습니다.");

			$("#email").val("");
			$("#pw").val("");

			location.reload();
		}

		$("#email").focus();


});