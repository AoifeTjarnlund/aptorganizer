package com.yrgo.aptorganizer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgreSqlConnection {
    private final String url = "jdbc:postgresql://localhost/aptorganizer";
    private final String user = "aoife";
    private final String psw = "martin";

    public Connection connect(){
        Connection conn = null;
        try{
            conn = DriverManager.getConnection(url, user, psw);
            System.out.println("Connected to server");
            } catch (SQLException e){
            System.out.println(e.getMessage());
        }

        return conn;
    }

    public static void main(String[] args){
        PostgreSqlConnection psc = new PostgreSqlConnection();
        psc.connect();
    }

}
