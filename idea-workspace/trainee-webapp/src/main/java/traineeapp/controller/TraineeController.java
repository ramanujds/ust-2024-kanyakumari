package traineeapp.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import traineeapp.model.Trainee;
import traineeapp.repository.TraineeRepository;
import traineeapp.repository.TraineeRepositoryImpl;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.List;

@WebServlet("/add-trainees")
public class TraineeController extends HttpServlet {

    TraineeRepository traineeRepository;

    public void init() throws ServletException {
        traineeRepository = new TraineeRepositoryImpl();
    }


    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String location = req.getParameter("location");
        String joinedDate = req.getParameter("joinedDate");
        Trainee trainee = new Trainee(id, name, location, LocalDate.parse(joinedDate));
        traineeRepository.save(trainee);
        List<Trainee> trainees = traineeRepository.getAllTrainees();
        req.setAttribute("trainees", trainees);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("view.jsp");

        requestDispatcher.forward(req,resp);

    }
}
