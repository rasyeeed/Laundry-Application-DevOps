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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author flxnzz
 */
public class AddCustomer extends AddDataToTable{
    private Customer pelanggan;
    private double jmlCucian;
    private javax.swing.JTable table;
    private DefaultTableModel model;
    private ResultSet rs;
    
    public AddCustomer(javax.swing.JTable jTable){
        rs = getResultSet();
        model = new DefaultTableModel(new String[]
        {
            "ID", "Nama", "Waktu Pesan","Jadwal Pengiriman", "Total Harga"
        }, 0);
        
        jTable.setModel(model);
    }
    public AddCustomer(Customer pelanggan){
        this.pelanggan = pelanggan;
    }
    
    
    public void insertData(javax.swing.JFrame frame, int harga){
        Layanan layanan_kilo = new Layanan_Kiloan(pelanggan.getJenisCucian(), pelanggan.getJenisLayanan(), pelanggan.getJumlahCucian());
        Layanan layanan_pcs = new Layanan_pcsan(pelanggan.getJenisCucian(), pelanggan.getJenisLayanan(), pelanggan.getJumlahCucian());
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            DBConnection.connect();
            // 2. Prepare the SQL statement
            String sql = "INSERT INTO dataPelanggan (name, address, contact, laundry_weight, service_type, laundry_type) VALUES (?, ?, ?, ?, ?, ?)";
            statement = conn.prepareStatement(sql);

            // 3. Set the parameter values
            statement.setString(1, pelanggan.getNama());
            statement.setString(2, pelanggan.getAlamat());
            statement.setString(3, pelanggan.getKontak());
            statement.setDouble(4, pelanggan.getJumlahCucian());
            statement.setString(5, pelanggan.getJenisLayanan());
            statement.setString(6, pelanggan.getJenisCucian());
            AddTransaction transaksi = new AddTransaction(this.pelanggan);
            transaksi.insertTransaksi(frame, harga);
            // 4. Execute the SQL statement
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                String layanan;
                if(pelanggan.getJenisCucian() == "Satuan"){
                    layanan = layanan_pcs.getPrintLayanan();
                }else{
                    layanan = layanan_kilo.getPrintLayanan();
                }
                JOptionPane.showMessageDialog(frame, "Data Sudah Masuk! \n"+ layanan);
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
                Object[] row = new Object[5];
                row[0] = rs.getInt("ID");
                row[1] = rs.getString("nama");
                row[2] = rs.getString("waktuPesan");
                row[3] = rs.getString("jadwalKirim");
                row[4] = rs.getDouble("cost");
                model.addRow(row);
            }
        } catch (SQLException ex) {
            System.out.println("Error retrieving data: " + ex.getMessage());
        }
    }
    
    @Override
    // Tampilkan data transaksi
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
