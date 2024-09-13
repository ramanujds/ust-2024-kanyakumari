package com.ust.traineeapp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnectionUtil {

    private static final String url="jdbc:mysql://localhost:3306/ust_db";
    private static final String username="root";
    private static final String password="password";

    private static Connection connection = null;

    public static Connection createConnction(){
        try {
            if(connection!=null){
                return connection;
            }
            connection = DriverManager.getConnection(url,username,password);
            return connection;
        }
        catch (SQLException ex){
            throw new RuntimeException(ex.getMessage());
        }

    }


}
