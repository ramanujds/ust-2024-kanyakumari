package com.ust.traineeapp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnectionUtil {

    // mysql connection details
//    private static final String url="jdbc:mysql://localhost:3306/ust_db";
//    private static final String username="root";
//    private static final String password="password";

    // postgres connection details
//    private static final String url="jdbc:postgresql://localhost:5432/ust_db";
//    private static final String username="postgres";
//    private static final String password="password";

    // sql server connection details
    private static final String url="jdbc:sqlserver://3.16.136.43:1433;databaseName=master;encrypt=true;trustServerCertificate=true";
    private static final String username="sa";
    private static final String password="MyStrongPass123";

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
