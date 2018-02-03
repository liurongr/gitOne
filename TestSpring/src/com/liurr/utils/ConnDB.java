package com.liurr.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnDB {
    private static Connection conn=null;
    private static final String DRIVER_NAME="com.mysql.jdbc.Driver";
    private static final String URL="jdbc:mysql//localhost:8080/db_blog2?characterEncoding=UTF-8";
    private static final String UER_NAME="root";
    private static final String PASS_WORD="123456";
    
    public static Connection getConn(){
        try {
            Class.forName(DRIVER_NAME);
            conn=DriverManager.getConnection(URL, UER_NAME, PASS_WORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
