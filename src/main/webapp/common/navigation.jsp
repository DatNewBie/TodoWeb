<%@include file="/common/taglib.jsp"%>
<%@ page import="com.springmvc.util.SecurityUtils"%>
<nav class="navbar navbar-expand-md navbar-light bg-light mb-3 p-1">
	<a class="navbar-brand m-1" href="https://courses.in28minutes.com">Credit</a>
	<div class="collapse navbar-collapse">
		<ul class="navbar-nav">
			<security:authorize access="isAnonymous()">
				<li class="nav-item"><a class="nav-link" href="login">Login</a></li>
				<li class="nav-item"><a class="nav-link" href="register">Register</a></li>
			</security:authorize>
			<security:authorize access="isAuthenticated()">
				<li class="nav-item"><a class="nav-link" href="home">Welcome
						<%=SecurityUtils.getPrincipal().getUsername()%></a></li>
				<li class="nav-item"><a class="nav-link" href="list-todos">List Todos</a></li>
			</security:authorize>
		</ul>
	</div>
	<ul class="navbar-nav">
		<security:authorize access="isAuthenticated()">
			<li class="nav-item"><a class="nav-link" href="logout">Logout</a></li>
		</security:authorize>
		
	</ul>
</nav>