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
    private static final String url = "jdbc:mysql://117.53.47.247:3306/Laundry";
    private static final String username = "Gu3st";
    private static final String password = "gu3ss-my-passwd";
    private static final String url2 = "jdbc:mysql://localhost:3306/Laundry";
    private static final String username2 = "Wzrd";
    private static final String password2 = "Humanzz1337";
    
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


