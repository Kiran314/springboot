
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<p>Customer details</p>

	<form:form modelAttribute="customer" action="addCustomer" method="POST">

		<table>
			<tr>
				<td><form:label path="id"> Id</form:label></td>
				<td><form:input path="id" /></td>
			</tr>

			<tr>
				<td><form:label path="name"> name</form:label></td>
				<td><form:input path="name" /></td>
			</tr>

			<tr>
				<td><form:label path="address"> address</form:label></td>
				<td><form:input path="address" /></td>
			</tr>

			<tr>
				<td><input type="submit" value="Submit"></td>
			</tr>
		</table>

	</form:form>
</body>
</html>