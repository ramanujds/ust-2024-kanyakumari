package com.ust.traineeapp.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Configuration
@ComponentScan("com.ust.traineeapp")
@PropertySource("application.properties")
public class TraineeAppConfig {

    @Value("${db.url}")
    private String url;
    @Value("${db.username}")
    private String username;
    @Value("${db.password}")
    private String password;

    @Bean("postgres")
    public Connection createConnction() throws SQLException {
        Connection connection = DriverManager.getConnection(url,username,password);
        return connection;
    }

    @Bean("mysql")
    @Lazy
    public Connection createConnctionWithMysql() throws SQLException {
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/ust_db",
                "root",
                "password"
        );
        return connection;
    }

}
