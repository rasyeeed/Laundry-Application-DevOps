/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import static Model.DBConnection.conn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author flxnzz
 */
public class AddCustomer extends AddDataToTable{
    private String nama, alamat, kontak, layanan, jCucian;
    private double jmlCucian;
    private javax.swing.JTable table;
    private DefaultTableModel model;
    private ResultSet rs;
    
    public AddCustomer(javax.swing.JTable jTable){
        this.table = getTable();
        rs = getResultSet();
        
        table = jTable;
        model = new DefaultTableModel(new String[]
        {
            "Nama", "Waktu Pemesanan", "Jadwal Pengiriman", "Status Pembayaran"
        }, 0);
        
        jTable.setModel(model);
    }
    public AddCustomer(String nama, String alamat, String kontak, double jmlCucian, String layanan, String jCucian){
        this.nama = nama;
        this.alamat = alamat;
        this.kontak = kontak;
        this.jmlCucian = jmlCucian;
        this.layanan = layanan;
        this.jCucian = jCucian;
    }
    
    public String getNama(){
        return this.nama;
    }
    
    public void insertData(javax.swing.JFrame frame){
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            DBConnection.connect();
            // 2. Prepare the SQL statement
            String sql = "INSERT INTO dataPelanggan (name, address, contact, laundry_weight, service_type, laundry_type) VALUES (?, ?, ?, ?, ?, ?)";
            statement = conn.prepareStatement(sql);

            // 3. Set the parameter values
            statement.setString(1, nama);
            statement.setString(2, alamat);
            statement.setString(3, kontak);
            statement.setDouble(4, jmlCucian);
            statement.setString(5, layanan);
            statement.setString(6, jCucian);
            AddTransaction transaksi = new AddTransaction(this.nama, this.alamat, this.kontak, this.jmlCucian, this.layanan, this.jCucian);
            transaksi.insertTransaksi(frame);
            // 4. Execute the SQL statement
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(frame, "Data inserted successfully!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(frame, "Error inserting data: " + ex.getMessage());
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(frame, "Error closing connection: " + ex.getMessage());
            }
        }
    }

    @Override
    public void addToTable(String sql, PreparedStatement statement) {
        try {
            DBConnection.connect();

            // Retrieve the data
            rs = statement.executeQuery();

            // Add the data to the DefaultTableModel
            while (rs.next()) {
                Object[] row = new Object[7];
                row[0] = rs.getInt("ID");
                row[1] = rs.getString("nama");
                row[2] = rs.getString("jadwalKirim");
                row[3] = rs.getString("statusBayar");
                row[4] = rs.getDouble("cost");
                model.addRow(row);
            }
        } catch (SQLException ex) {
            System.out.println("Error retrieving data: " + ex.getMessage());
        }
    }
    
    @Override
    public void showData() {
        try { 
            String sql = "SELECT * FROM transaksi";
            PreparedStatement statement = conn.prepareStatement(sql);
            addToTable(sql, statement);
        } catch (SQLException ex) {
            System.out.println("Error retrieving data: " + ex.getMessage());
        }
    }

}
