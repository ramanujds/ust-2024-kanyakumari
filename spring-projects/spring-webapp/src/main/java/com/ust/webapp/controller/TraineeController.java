package com.ust.webapp.controller;

import com.ust.webapp.dto.TraineeDto;
import com.ust.webapp.model.Trainee;
import com.ust.webapp.service.TraineeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TraineeController {

    @Autowired
    private TraineeService traineeService;


    @PostMapping("/add-trainee")
    public String addTrainee(@ModelAttribute TraineeDto trainee, Model m){
        TraineeDto savedTrainee = traineeService.save(trainee);
        m.addAttribute("trainee",savedTrainee);
        return "view-trainee.jsp";
    }

    @GetMapping("/search-trainee")
    public String getTrainee(@RequestParam("id") int id, Model m){
        TraineeDto trainee = traineeService.getTrainee(id);
        m.addAttribute("trainee",trainee);
        return "view-trainee.jsp";
    }

    @GetMapping("/view-all")
    public String viewAllTrainees(Model m){
        var trainees = traineeService.getAllTrainees();
        m.addAttribute("trainees",trainees);
        return "view-all.jsp";
    }

}
