<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Hello</title>
</head>
<body>
<c:forEach var="trainee" items="${trainees}">
<div style="{border=1px;padding=5px;}">
<p>ID : ${trainee.id()}</p>
<p>Name : ${trainee.name()}</p>
<p>Location : ${trainee.location()}</p>
</div>
</c:forEach>
</body>
</html>