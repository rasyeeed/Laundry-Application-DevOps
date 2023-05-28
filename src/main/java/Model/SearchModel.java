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
 * @param <T>
 */
public class SearchModel<T> {
    javax.swing.JTextField searchField;
    private ResultSet resultSet;
    private PreparedStatement statement;
    private DefaultTableModel model;
    private javax.swing.JTable table;
    private String sql;
        

    public SearchModel(javax.swing.JTable jTable, javax.swing.JTextField searchField){
        this.searchField = searchField;
        table = jTable;
        model = new DefaultTableModel(new String[]
        {
            "ID", "Nama", "Alamat", "Kontak", "Berat/Jml Cucian", "Jenis Layanan", "Jenis Cucian"
        }, 0);
        
        jTable.setModel(model);
    }

    public void searchData() {
        String searchQuery = searchField.getText();
        model.setNumRows(0); // clear table

        try {
            DBConnection.connect();
            // Execute the search query
            String sql = "SELECT * FROM dataPelanggan WHERE ID LIKE ? OR name LIKE ? OR address LIKE ? OR contact LIKE ? OR laundry_weight LIKE ?";
            statement = conn.prepareStatement(sql);
            statement.setString(1, "%" + searchQuery + "%");
            statement.setString(2, "%" + searchQuery + "%");
            statement.setString(3, "%" + searchQuery + "%");
            statement.setString(4, "%" + searchQuery + "%");
            statement.setString(5, "%" + searchQuery + "%");
            resultSet = statement.executeQuery();

            // Add the search results to the DefaultTableModel
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
            System.out.println("Error executing search query: " + ex.getMessage());
        }
    }
    
    
}
