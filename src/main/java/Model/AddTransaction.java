/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import static Model.DBConnection.conn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author flxnzz
 */
public class AddTransaction extends AddCustomer {
    private Customer pelanggan;
    public AddTransaction(Customer pelanggan) {
        super(pelanggan);
        this.pelanggan = pelanggan;
    }
    
    public AddTransaction(Customer pelanggan, Transaksi transaksi) {
        super(pelanggan);
        this.pelanggan = pelanggan;
    }
    
    public void insertTransaksi(javax.swing.JFrame frame, double harga){
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("nl"));
            DBConnection.connect();
            // 2. Prepare the SQL statement
            String query = "INSERT INTO transaksi (nama, waktuPesan, jadwalKirim, cost)"
                    + " VALUES (?, ?, ?, ?)";
            statement = conn.prepareStatement(query);
            statement.setString(1, pelanggan.getNama());
            statement.setString(2, LocalDateTime.now().format(formatter));
            statement.setString(3, LocalDateTime.now().plusDays(2).format(formatter));
            statement.setDouble(4, harga);

            // 4. Execute the SQL statement
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(frame, "Data inserted successfully!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(frame, "Error inserting data: " + ex.getMessage());
        } 
    }
    
    public void show() {
        try { 
            String sql = "SELECT * FROM transaksi";
            PreparedStatement statement = conn.prepareStatement(sql);
            super.addToTable(sql, statement);
        } catch (SQLException ex) {
            System.out.println("Error retrieving data: " + ex.getMessage());
        }
    }
    
}
