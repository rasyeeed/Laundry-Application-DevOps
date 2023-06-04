/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import View.HomeView;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class RegisterModel {
    private final String username;
    private final char[] password;
    
    public RegisterModel(String username, char[] password){
        this.password = password;
        this.username = username;
    }
    
    public void register(javax.swing.JFrame regisFrame){
        DBConnection.connect();
        String sql = "INSERT INTO users (ID, User, Password) VALUES (?, ?, ?)";
        Random random = new Random();
        String id = String .valueOf(random.nextInt(90000000) + 10000000);
        try (PreparedStatement stmt = DBConnection.conn.prepareStatement(sql)) {
            stmt.setString(1, id);
            stmt.setString(2, username);
            stmt.setString(3, new String(password));
            int rowsInserted = stmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new user has been inserted into the database.");
                JOptionPane.showMessageDialog(regisFrame, "User baru berhasil ditambahkan");
                regisFrame.setVisible(false);
                new HomeView().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(regisFrame, "Gagal menambah user baru");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(regisFrame, "Gagal membuat koneksi ke database");
        }
    }
}
