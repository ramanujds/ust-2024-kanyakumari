<%@ page import="traineeapp.model.Trainee" isELIgnored="false" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
    <title>View</title>
</head>
<body>
   <%
   List<Trainee> trainees = (List<Trainee>) request.getAttribute("trainees");
   out.println("<table border=1><tr><th>ID</th><th>Name</th><th>Location</th><th>Joined Date</th></tr>");
    for(Trainee trainee : trainees){
        out.println("<tr><td>" + trainee.getId() + "</td><td>" + trainee.getName() + "</td><td>" + trainee.getLocation() + "</td><td>" + trainee.getJoinedDate() + "</td></tr>");
    }
    out.println("</table>");

   %>
</body>
</html>

<!--
import
class View{
    service(){
        out.println("<html>");
        out.println("<head>");
        .....
        Trainee trainee = (Trainee) request.getAttribute("trainee");
        out.println("<h2>Hello " + trainee.getName() + "!</h2>");

-->