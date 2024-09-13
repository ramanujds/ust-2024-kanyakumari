package com.ust.traineeapp.repository;

import com.ust.traineeapp.model.Trainee;
import com.ust.traineeapp.util.JdbcConnectionUtil;

import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class TraineeRepositoryImpl implements TraineeRepository{


    public Trainee save(Trainee trainee) {

        Connection connection = JdbcConnectionUtil.createConnction();
        String sql = """
                insert into trainee(name,location,date_joined)
                values(?,?,?)
                """;

        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1,trainee.name());
            statement.setString(2,trainee.location());
            statement.setString(3,trainee.joinedDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
            int rowCount = statement.executeUpdate();
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

        Connection connection = JdbcConnectionUtil.createConnction();

        String sql = """
                select * from trainee
                """;

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            List<Trainee> trainees = new ArrayList<>();
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String location = resultSet.getString("location");
                LocalDate joinedDate = resultSet.getDate("date_joined").toLocalDate();
                Trainee trainee = new Trainee(id,name,location,joinedDate);
                trainees.add(trainee);
            }
            return trainees;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteTrainee(int id) {

    }
}
