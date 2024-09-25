<html>
<head>
<title>Home</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
<div class="container">

<jsp:include page="header.jsp" />

<h2>Hello World!</h2>
<p><a href="trainees/get">View Trainees</a></p>
<form class='form-group' action="trainees/add" method="post">
<label class='form-label' for="id">ID</label>
<input class='form-control' type="number" name="id" placeholder="Enter your id">
<label class='form-label' for="name">Name</label>
<input class='form-control' type="text" name="name" placeholder="Enter your name">
<label class='form-label' for="location">Location</label>
<input class='form-control' type="text" name="location" placeholder="Enter your location">
<label class='form-label' for="joinedDate">Joined Date</label>
<input class='form-control' type="date" name="joinedDate" placeholder="Enter your joined date">
<button class='btn btn-dark' type="submit">Enter</button>
</form>
</div>
</body>
</html>
