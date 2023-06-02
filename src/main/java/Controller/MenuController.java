/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author flxnzz
 */
public class MenuController {
    private final javax.swing.JPanel Container;
    
    public MenuController(javax.swing.JPanel Container){
        this.Container = Container;
    }
    
    public void prepareMenuBar(javax.swing.JPanel menu){
        Container.removeAll();
        Container.repaint();
        Container.revalidate();
        
        // Menambahkan panel
        Container.add(menu);
        Container.repaint();
        Container.revalidate();
    }
}
