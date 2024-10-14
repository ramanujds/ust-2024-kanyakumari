package com.ust.traineeapp.service;

import com.ust.traineeapp.exception.RecordNotFoundException;
import com.ust.traineeapp.model.Project;
import com.ust.traineeapp.model.Trainee;
import com.ust.traineeapp.repository.ProjectRepository;
import com.ust.traineeapp.repository.TraineeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TraineeServiceImpl implements TraineeService{

    @Autowired
    private TraineeRepository traineeRepo;

    @Autowired
    private ProjectRepository projectRepository;

    public Trainee saveTrainee(Trainee trainee) {

        if(traineeRepo.existsById(trainee.getId())){
            throw new RuntimeException("Trainee with ID "+trainee.getId()+" Already Present");
        }
        Trainee savedTrainee = null;
//        if(trainee.getProject()!=null) {
//            Project project = projectRepository.findById(trainee.getProject().getId()).orElse(null);
//
//
//            if (project != null) {
//                trainee.setProject(project);
//                savedTrainee = traineeRepo.save(trainee);
//                project.getTrainees().add(savedTrainee);
//                projectRepository.save(project);
//            }
//            else{
//                savedTrainee = traineeRepo.save(trainee);
//            }
//        }

            savedTrainee = traineeRepo.save(trainee);



        return savedTrainee;

    }

    public Trainee getTraineeById(int id) {
        return traineeRepo.findById(id)
                .orElseThrow(()->new RecordNotFoundException("Trainee with ID "+id+ " Not Found"));
    }

    public void deleteTrainee(int id) {
        traineeRepo.deleteById(id);
    }

    public List<Trainee> getAllTrainees() {
        return traineeRepo.findAll();
    }

    public Trainee updateTrainee(int id, Trainee trainee) {
        if (!traineeRepo.existsById(id)){
            throw new RuntimeException("Trainee with ID "+id+" Not Found");
        }
        Trainee traineeToUpdate = getTraineeById(id);
        if(trainee.getName()!=null){
            traineeToUpdate.setName(trainee.getName());
        }
        if(trainee.getLocation()!=null){
            traineeToUpdate.setLocation(trainee.getLocation());
        }
        if(trainee.getJoinedDate()!=null){
            traineeToUpdate.setJoinedDate(trainee.getJoinedDate());
        }
        return traineeRepo.save(traineeToUpdate);
    }

    public Trainee findTraineeByName(String name) {
        return traineeRepo.findByName(name).orElse(null);
    }


    public List<Trainee> findTraineeByMonthAndYear(int month, int year) {
        return traineeRepo.getAllByMonthAndYear(month,year);
    }
}
