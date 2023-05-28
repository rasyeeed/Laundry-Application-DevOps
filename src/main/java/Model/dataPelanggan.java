/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import static Model.DBConnection.conn;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author flxnzz
 */
public class dataPelanggan {
    private PreparedStatement statement;
    private ResultSet resultSet;
    private final DefaultTableModel model;
    private final javax.swing.JTable table;
    private String sql;
    
    public dataPelanggan(javax.swing.JTable jTable){
        table = jTable;
        model = new DefaultTableModel(new String[]
        {
            "ID", "Nama", "Alamat", "Kontak", "Berat/Jml Cucian", "Jenis Layanan", "Jenis Cucian"
        }, 0);
        
        jTable.setModel(model);
    }
    
    public void addData(String sql, PreparedStatement statement){
        try {
            DBConnection.connect();

            // Retrieve the data
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
    
    public void showData(){
        try { 
            sql = "SELECT * FROM dataPelanggan";
            statement = conn.prepareStatement(sql);
            addData(sql, statement);
        } catch (SQLException ex) {
            System.out.println("Error retrieving data: " + ex.getMessage());
        }
    }
    
    // Inner Class
    public class Search {
        javax.swing.JTextField searchField;
        
        public Search(javax.swing.JTextField searchField){
            this.searchField = searchField;
        }
        
        public void searchData() {
            String searchQuery = searchField.getText();
            model.setNumRows(0); // clear table
            
            try {
                sql = "SELECT * FROM dataPelanggan WHERE name LIKE ?";
                statement = conn.prepareStatement(sql);
                statement.setString(1, "%" + searchQuery + "%");
                addData(sql, statement);
            } catch (SQLException ex) {
                System.out.println("Error executing search query: " + ex.getMessage());
            }
        }
    }
}
