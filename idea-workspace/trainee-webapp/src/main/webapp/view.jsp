<%@ page import="traineeapp.model.Trainee" isELIgnored="false" %>
<%@ page import="java.util.List" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <title>View</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
<div class="container">
<jsp:include page="header.jsp" />
<div class="container">
<div class="row">
<c:forEach var="trainee" items="${trainees}">

    <div class="card mb-3" style="max-width: 18rem;">
        <div class="card-body">
            <h5 class="card-title">${trainee.name}</h5>
            <p class="card-text">ID: ${trainee.id}</p>
            <p class="card-text">Location: ${trainee.location}</p>
            <p class="card-text">Joined Date: ${trainee.joinedDate}</p>
            <a href="trainees/delete?id=${trainee.id}" class="btn btn-danger">Delete</a>
            </div>
            </div>
</c:forEach>
</div>
</row>

   </div>
</body>
</html>

