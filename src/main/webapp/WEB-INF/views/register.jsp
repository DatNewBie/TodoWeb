<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<%@ include file="/common/navigation.jsp"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css"
	rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Đăng ký</title>
</head>
<body>
	<div class="container">
		<div class="register-form">
			<div class="main-div">
				<form:form action="register" method="post"
					modelAttribute="UserEntity">

					<%-- <fieldset class="mb-3">
						<form:label path="username">username</form:label>
						<form:input type="text" path="username" required="required" />
						<form:errors path="username" cssClass="text-warning" />
					</fieldset>

					<fieldset class="mb-3">
						<form:label path="password">password</form:label>
						<form:input type="text" path="password" required="required" />
						<form:errors path="password" cssClass="text-warning" />
					</fieldset> --%>
					<div class="form-group">
						<form:input type="text" path="username" required="required"
							placeholder="Username" />
					</div>

					<div class="form-group">
						<form:input type="password" path="password" required="required"
							placeholder="Password" />
					</div>


					<button type="submit" class="btn btn-primary">Sign up</button>

				</form:form>
			</div>
		</div>
	</div>
</body>
</html>