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
	width: 700px;
  	display: grid;
  	grid-template-columns: 1fr 3fr 3fr 1fr;
	grid-gap: 1px;
	grid-auto-rows: 50px;
	border-right: 1px solid gray;
}
.cell{
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
			</th>
			<th>Name
			</th>
			<th>Email
			</th>
			<th>Age
			</th>
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
	
	<form action="adduser" method="post">

	<p>Add new user</p>
	<label for="name">Name</label>
	<input type="text" name="name" required>
	<label for="email">Email</label>
	<input type="text" name="email" required>
		<label for="age">Age</label>
	<input type="text" name="age" required>

	<button type="submit">Add</button>
	</form>
	
	<br>
	<div class="container header">
	<div class="cell">Id</div>
	<div class="cell">Name</div>
	<div class="cell">Email</div>
	<div class="cell">Age</div>
	</div>
	<#list users as user>
	<div class="container">
	<span class="cell"><a href="user/${user.id}">${user.id}</a></span>
	<span class="cell">${user.name}</span>
	<span class="cell">${user.email}</span>
	<span class="cell">${user.age}</span>
	</div>
	</#list>
	

</body>
</html>