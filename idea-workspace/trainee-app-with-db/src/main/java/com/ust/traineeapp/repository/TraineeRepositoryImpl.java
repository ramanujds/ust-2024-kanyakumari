package com.ust.traineeapp.repository;

import com.ust.traineeapp.model.Trainee;
import com.ust.traineeapp.util.JdbcConnectionUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class TraineeRepositoryImpl implements TraineeRepository{


    public Trainee save(Trainee trainee) {

        Connection connection = JdbcConnectionUtil.createConnction();
        String sql = """
                insert into trainee(name,location,date_joined)
                values('%s','%s','%s')
                """.formatted(trainee.name(),
                              trainee.location(),
                              trainee.joinedDate().toString());

        try {
            Statement statement = connection.createStatement();
            int rowCount = statement.executeUpdate(sql);
            System.out.println(rowCount+" rows inserted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        return trainee;
    }

    public Trainee getTrainee(int id) {
        return null;
    }

    public List<Trainee> getAllTrainees() {
        return List.of();
    }

    public void deleteTrainee(int id) {

    }
}
