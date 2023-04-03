/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Haikal
 */
public class DBConnection {
    private Connection conn;
    
    private final String url = "jdbc:oracle:thin:@localhost:1521:flxnzz";
    private final String username = "system";
    private final String password = "Fluxion47";
    
    public void connect() {
        try{
            conn = DriverManager.getConnection(url,username,password);
            System.out.println("Connected to database");
        } catch(SQLException se) {
            System.out.println("Connection to database error! "+se);
        }
    }
    
}


