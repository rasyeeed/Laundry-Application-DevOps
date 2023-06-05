/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Haikal
 */
public class DBConnection {
    private static final String url = "jdbc:mysql://178.128.215.35:3306/Laundry";
    private static final String username = "Flxnzz";
    private static final String password = "Humanzz1337!";
    private static final String url2 = "jdbc:mysql://localhost:3306/Laundry";
    private static final String username2 = "vidya";
    private static final String password2 = "Vdy19052003.";
    
    public static Connection conn;
    
    public static void connect() {
        try{
            conn = DriverManager.getConnection(url,username,password);
            System.out.println("Connected to database");
            
        } catch(SQLException ex) {
            System.out.println("Connection to database error! "+ ex);
        } catch (Exception ex){
            System.out.println("NO responses from server");
        }
    }
}


