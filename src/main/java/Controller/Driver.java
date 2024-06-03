/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Controller;

import Model.DBConnection;
import View.LoginView;
import View.RegisterView;

/**
 *
 * @author Haikal
 */
public class Driver {

    public static void main(String[] args) { 
        DBConnection.connect();
        LoginView login = new LoginView();
        login.setVisible(true); 
    }
}
