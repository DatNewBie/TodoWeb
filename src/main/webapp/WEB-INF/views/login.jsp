<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<%@ include file="/common/navigation.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css"
	rel="stylesheet">
<title>Đăng nhập</title>
</head>
<body>
	<div class="container">
		<!-- <h1 class="form-heading">login Form</h1> -->
		<div class="login-form">
			<div class="main-div">
				<c:if test="${param.incorrectAccount != null}">
					<div class="alert alert-danger">Username or password
						incorrect</div>
				</c:if>
				<c:if test="${param.accessDenied != null}">
					<div class="alert alert-danger">you Not authorize</div>
				</c:if>
				<form action="j_spring_security_check" id="formLogin" method="post">
					<div class="form-group">
						<input type="text" class="form-control" id="userName"
							name="j_username" placeholder="Username">
					</div>

					<div class="form-group">
						<input type="password" class="form-control" id="password"
							name="j_password" placeholder="Password">
					</div>
					<button type="submit" class="btn btn-primary">Sign in</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>