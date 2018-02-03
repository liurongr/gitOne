package com.liurr.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnUtil {
    private static final String url="jdbc:mysql//localhost:8080/db_blog2";
    private static final String username="root";
    private static final String password="123456";
    /**
     * 
     * @Description:获得连接  
     * @author liurr 
     * @date 2018年1月27日 上午10:47:36  
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public static Connection getConnection() throws ClassNotFoundException, SQLException{
        Class.forName("com.jdbc.mysql.Driver");
        return DriverManager.getConnection(url, username, password);
    }
    //关闭Connection
    public static void colse(Connection conn) throws SQLException{
        if(conn!=null){
            conn.close();
            conn=null;
        }
    }
    //关闭PreparedStatement
    public static void colse(PreparedStatement pstmt) throws SQLException{
        if(pstmt!=null){
            pstmt.close();
            pstmt=null;
        }
    }
    //关闭结果集
    public static void colse(ResultSet rs) throws SQLException{
        if(rs!=null){
            rs.close();
            rs=null;
        }
    }
}
