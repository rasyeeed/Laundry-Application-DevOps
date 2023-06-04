/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import static Model.DBConnection.conn;
import View.HomeView;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author flxnzz
 */
public class LoginModel {
    private final String username;
    private final char[] password;
    
    public LoginModel(String username, char[] password){
        this.password = password;
        this.username = username;
    }
    
    public void login(javax.swing.JFrame loginFrame){
        DBConnection.connect();
        
        String sql = "SELECT * FROM users WHERE User = ? AND Password = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, username);
            stmt.setString(2, new String(password));
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                loginFrame.setVisible(false);
                new HomeView().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(loginFrame, "Invalid username or password.", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException ex) {
            System.out.println("An error occurred while checking the user credentials: " + ex.getMessage());
        }
    }
}
