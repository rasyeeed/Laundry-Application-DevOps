/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author flxnzz
 */
public abstract class AddDataToTable {
    private ResultSet resultSet;
    private DefaultTableModel model;
    private javax.swing.JTable table;

    public abstract void addToTable(String sql, PreparedStatement statement);
    public abstract void showData();
    
    public ResultSet getResultSet(){
        return this.resultSet;
    }
    
    public DefaultTableModel getModel(){
        return this.model;
    }
    
    public javax.swing.JTable getTable(){
        return this.table;
    }
    
}
