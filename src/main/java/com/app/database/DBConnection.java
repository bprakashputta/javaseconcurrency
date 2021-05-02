package com.app.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    public static Connection getConnection(){
        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/javaseconcurrency","postgres","postgres");
            return connection;
        }catch (Exception e){
            e.printStackTrace();
        }
    return connection;
    }
}
