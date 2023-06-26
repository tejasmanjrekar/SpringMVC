<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body bgcolor="cyan">
	<h1>Add Course Details:</h1>
	<form action="course" method="post">
		<pre>
			Course ID = <input type="number" name="id"/>
			Course Title = <input type="text" name="title"/>
			Course Duration = <input type="number" name="duration"/>
			Course Provider = <input type="text" name="provider"/>
			Course Cost = <input type="number" name="cost">
			<input type="submit" value="Submit"/>
		</pre>
	</form>
</body>
</html>