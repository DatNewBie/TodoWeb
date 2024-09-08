<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ include file="/common/header.jsp"%>
<%@ include file="/common/navigation.jsp"%>
<div class="container">
	<h1>Enter Todo Details</h1>
	<form:form method="post" modelAttribute="todo">

		<form:input type="hidden" path="id" />

		<form:input type="hidden" path="username" />

		<fieldset class="mb-3">
			<form:label path="description">Description</form:label>
			<form:input type="text" path="description" required="required" />
			<form:errors path="description" cssClass="text-warning" />
		</fieldset>

		<fieldset class="mb-3">
			<form:label path="targetDate">Target Date</form:label>
			<form:input type="text" path="targetDate" required="required" />
			<form:errors path="targetDate" cssClass="text-warning" />
		</fieldset>

		<form:input type="hidden" path="done" />


		<input type="submit" class="btn btn-success" />

	</form:form>

</div>
<%@ include file="/common/footer.jsp"%>

<script type="text/javascript">
	$('#targetDate').datepicker({
		format : 'yyyy-mm-dd'
	});
</script>

