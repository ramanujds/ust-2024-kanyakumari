package com.ust.webapp.service;

import com.ust.webapp.dto.TraineeDto;
import com.ust.webapp.model.Trainee;
import com.ust.webapp.repository.TraineeRepository;
import com.ust.webapp.util.EntityDtoUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TraineeServiceImpl implements TraineeService{

    @Autowired
    private TraineeRepository traineeRepo;

    public TraineeDto save(TraineeDto trainee) {

        Trainee obj = EntityDtoUtil.covertToEntity(trainee);
        Trainee savedTrainee = traineeRepo.save(obj);
        return EntityDtoUtil.covertToDto(savedTrainee);
    }

    public TraineeDto getTrainee(int id) {
        return traineeRepo.getTrainee(id).map(EntityDtoUtil::covertToDto).orElse(null);
    }

    public List<TraineeDto> getAllTrainees() {
        return traineeRepo.getAllTrainees().stream().map(EntityDtoUtil::covertToDto).toList();
    }

    public void deleteTrainee(int id) {
        traineeRepo.deleteTrainee(id);
    }

    public TraineeDto findTraineeByName(String name) {
        return traineeRepo.getTraineeByName(name).map(EntityDtoUtil::covertToDto).orElse(null);
    }

    public TraineeDto updateTrainee(int id, TraineeDto trainee) {
        Trainee obj = EntityDtoUtil.covertToEntity(trainee);
        Trainee updatedTrainee = traineeRepo.updateTrainee(id,obj);
        return EntityDtoUtil.covertToDto(updatedTrainee);
    }


}
