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
import View.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author flxnzz
 */
public class dataPelanggan {
    private PreparedStatement statement;
    private ResultSet resultSet;
    private DefaultTableModel model;
    private javax.swing.JTable table;
    
    public dataPelanggan(javax.swing.JTable jTable){
        table = jTable;
        model = new DefaultTableModel(new String[]{
            "ID", "Nama", "Alamat", "Kontak", "Berat/Jml Cucian", "Jenis Layanan", "Jenis Cucian"
            }, 0);
        
        jTable.setModel(model);
    }
    public void showData(){
        try {
            DBConnection.connect();

            // Retrieve the data
            String sql = "SELECT * FROM detailPelanggan";
            statement = conn.prepareStatement(sql);
            resultSet = statement.executeQuery();

            // Add the data to the DefaultTableModel
            while (resultSet.next()) {
                Object[] row = new Object[7];
                row[0] = resultSet.getInt("ID");
                row[1] = resultSet.getString("name");
                row[2] = resultSet.getString("address");
                row[3] = resultSet.getString("contact");
                row[4] = resultSet.getDouble("laundry_weight");
                row[5] = resultSet.getString("service_type");
                row[6] = resultSet.getString("laundry_type");
                model.addRow(row);
            }
        } catch (SQLException ex) {
            System.out.println("Error retrieving data: " + ex.getMessage());
        }
    }
    
}
