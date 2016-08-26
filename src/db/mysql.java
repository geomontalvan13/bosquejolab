package db;

import java.sql.Connection;
import java.sql.DriverManager;

public class mysql{
    private static String db = "agenda";
    private static String user = "geo";
    private static String pass = "";
    private static String url = "dbc:mysql://localhost/"+db;
    private static Connection Conn;
            
    
    public static Connection getConnect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Conn = DriverManager.getConnection(Url,user,pass);
            
        }catch(Exception e)
    }
}