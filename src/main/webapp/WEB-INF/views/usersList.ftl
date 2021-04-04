<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.header{
	font-weight: bold;
	border-top: 1px solid gray;
}

.container {
	width: 400px;
  	display: grid;
  	grid-template-columns: 1fr 1fr 2fr 1fr;
	grid-gap: 1px;
	grid-auto-rows: 50px;
	border-right: 1px solid gray;
}
.row{
display: flex;
    justify-content: center;
    align-items: center;
border-bottom: 1px solid gray;
border-left: 1px solid gray;
} 
</style>
</head>
<body>
	<h1>Users List</h1>
<!-- <table>
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
	</table>  -->
	<br>
	<div class="container header">
	<div class="row">Id</div><div class="row">Name</div><div class="row">Email</div><div class="row">Age</div>
	</div>
	<#list users as user>
	<div class="container">
	<span class="row">${user.id}</span><span class="row">${user.name}</span><span class="row">${user.email}</span><span class="row">${user.age}</span>
	</div>
	</#list>

</body>
</html>