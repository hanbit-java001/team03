<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>예매하기</title>
</head>
<body>

		<div class="form-group">
   			<label for="txtName" class="input-required">이름</label>
   			<input type="text" class="form-control" id="txtName" placeholder="이름">
		</div>
		<div class="form-group">
   			<label for="txtEmail" class="input-required">이메일</label>
   			<input type="text" class="form-control" id="txtEmail" placeholder="이메일">
		</div>
		<div class="form-group">
   			<label for="txtPassword" class="input-required">비밀번호</label>
   			<input type="password" class="form-control" id="txtPassword" placeholder="비밀번호">
		</div>
		<div class="form-group">
   			<label for="txtPasswordConfirm" class="input-required">비밀번호확인</label>
   			<input type="password" class="form-control" id="txtPasswordConfirm" placeholder="비밀번호확인">
		</div>
		<div class="form-group">
   			<label for="imgProfile">프로필사진</label>
   			<input type="file" class="form-control" id="imgProfile" placeholder="프로필사진">
		</div>

		<div class="bottom-buttons">
			<button class="btnApply btn btn-success">예매</button>
			<button class="btnBack btn btn-default">취소</button>
		</div>



</body>
</html>