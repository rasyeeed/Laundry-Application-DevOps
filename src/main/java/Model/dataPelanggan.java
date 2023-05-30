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
public class dataPelanggan extends AddDataToTable{
    private PreparedStatement statement;
    private final ResultSet rs;
    private DefaultTableModel Model;
    private javax.swing.JTable table;
    private String sql;
    
    public dataPelanggan(javax.swing.JTable jTable){
        rs = getResultSet();
        this.Model = getModel();
        this.table = getTable();
        
        table = jTable;
        Model = new DefaultTableModel(new String[]
        {
            "ID", "Nama", "Alamat", "Kontak", "Berat/Jml Cucian", "Jenis Layanan", "Jenis Cucian"
        }, 0);
        
        jTable.setModel(Model);
    }
    
    // Nambah data pelanggan ke tabel
    @Override
    public void addToTable(String sql, PreparedStatement statement){
        try {
            DBConnection.connect();

            // Retrieve the data
            ResultSet rs = getResultSet();
            rs = statement.executeQuery();

            // Add the data to the DefaultTableModel
            while (rs.next()) {
                Object[] row = new Object[7];
                row[0] = rs.getInt("ID");
                row[1] = rs.getString("name");
                row[2] = rs.getString("address");
                row[3] = rs.getString("contact");
                row[4] = rs.getDouble("laundry_weight");
                row[5] = rs.getString("service_type");
                row[6] = rs.getString("laundry_type");
                Model.addRow(row);
            }
        } catch (SQLException ex) {
            System.out.println("Error retrieving data: " + ex.getMessage());
        }
    }
    
    public void showData(){
        try { 
            sql = "SELECT * FROM dataPelanggan";
            statement = conn.prepareStatement(sql);
            addToTable(sql, statement);
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
            Model.setNumRows(0); // clear table
            
            try {
                sql = "SELECT * FROM dataPelanggan WHERE name LIKE ?";
                statement = conn.prepareStatement(sql);
                statement.setString(1, "%" + searchQuery + "%");
                addToTable(sql, statement);
            } catch (SQLException ex) {
                System.out.println("Error executing search query: " + ex.getMessage());
            }
        }
    }
}
