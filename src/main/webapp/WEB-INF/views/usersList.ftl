<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Users List</h1>
	<table>
		<tr>
			<th>Id
			<th>
			<th>Name
			<th>
			<th>Email
			<th>
			<th>Age
			<th>
		</tr>
		<#list users as user>
		<tr>
			<td>${user.id}</td>
			<td>${user.name}</td>
			<td>${user.email}</td>
			<td>${user.age}</td>
		</tr>
		</#list>
	</table>

</body>
</html>