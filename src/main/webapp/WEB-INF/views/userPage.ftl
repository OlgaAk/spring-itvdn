<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form action="../update" method="post">
	<div>
	<h3>Add new user</h3>
	<input type="hidden" name="id" value="${user.id}">
	<label for="name">Name</label>
	<input type="text" value="${user.name}" name="name" required>
	<label for="email">Email</label>
	<input type="text" value="${user.email}" name="email" required>
		<label for="age">Age</label>
	<input type="text" value="${user.age}" name="age" required>
	</div>
	<br>
<button type="submit">Update</a></button><button style="margin-left:10px"><a href="../delete/${user.id}">Delete</a></button>
	</form>

<br>
<button><a href="../users">Back</a></button>
</body>
</html>