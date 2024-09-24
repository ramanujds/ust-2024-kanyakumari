package traineeapp.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/add-trainees")
public class TraineeController extends HttpServlet {

    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("username");
        PrintWriter out = resp.getWriter();
        out.println("""
                    <html>
                        <head>
                            <title>Hello World</title>
                        </head>
                        <body>
                            <h1>Hello %s</h1>
                         </body>
                      </html>
                """.formatted(name));

    }
}
