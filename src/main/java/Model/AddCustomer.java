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
public class AddCustomer {
    private String nama, alamat, kontak, layanan, jCucian;
    private double jmlCucian;
    public AddCustomer(String nama, String alamat, String kontak, double jmlCucian, String layanan, String jCucian){
        this.nama = nama;
        this.alamat = alamat;
        this.kontak = kontak;
        this.jmlCucian = jmlCucian;
        this.layanan = layanan;
        this.jCucian = jCucian;
    }
    
    public void addData(javax.swing.JFrame frame){
        Connection connection = null;
        PreparedStatement statement = null;
        PreparedStatement statement2 = null;
        try {
            DBConnection.connect();
            // 2. Prepare the SQL statement
            String sql = "INSERT INTO dataPelanggan (name, address, contact, laundry_weight, service_type, laundry_type) VALUES (?, ?, ?, ?, ?, ?)";
            String sql2 = "INSERT INTO transaksi (nama, waktuPesan, jadwalKirim, statusBayar)"
                    + " VALUES (?, ?, ?, ?)";
            statement = conn.prepareStatement(sql);
            statement2 = conn.prepareStatement(sql2);

            // 3. Set the parameter values
            statement.setString(1, nama);
            statement.setString(2, alamat);
            statement.setString(3, kontak);
            statement.setDouble(4, jmlCucian);
            statement.setString(5, layanan);
            statement.setString(6, jCucian);
            
            statement2.setString(1, nama);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("nl"));
            statement2.setString(2, LocalDateTime.now().format(formatter));
            statement2.setString(3, LocalDateTime.now().plusDays(2).format(formatter));
            statement2.setString(4, "Sudah bayar");

            // 4. Execute the SQL statement
            int rowsInserted = statement.executeUpdate();
            int rows2 = statement2.executeUpdate();
            if (rowsInserted > 0 && rows2 > 0) {
                JOptionPane.showMessageDialog(frame, "Data inserted successfully!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(frame, "Error inserting data: " + ex.getMessage());
        } finally {
            try {
                if (statement != null && statement2 != null) {
                    statement.close();
                    statement2.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(frame, "Error closing connection: " + ex.getMessage());
            }
        }
    }
}
