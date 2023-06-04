/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author flxnzz
 */
public class CetakLaporan{
    //private final Customer pelanggan;
    private ArrayList<Customer> customerList = new ArrayList<>();
    
    public CetakLaporan(ArrayList<Customer> customerList){
        this.customerList = customerList;
    }
    
    public void DownloadAsTxt(javax.swing.JFrame frame){
        
        String filePath = "output.txt";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("nl"));
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
            writer.print("Laporan Laundry pada tanggal: ");
            writer.println(LocalDateTime.now().format(formatter));
            writer.println("-----------------------------------");
            for (int i=0; i<customerList.size(); i++){
                writer.println("-----  Informasi Pelanggan " + (i+1) + " -----");
                writer.println("Nama pelanggan\t: " + customerList.get(i).getNama());
                writer.println("Alamat\t\t: " + customerList.get(i).getAlamat());
                writer.println("Kontak\t\t: " + customerList.get(i).getKontak());
                writer.println("Jumlah Cucian\t: " + customerList.get(i).getJumlahCucian());
                writer.println("Jenis Layanan\t: " + customerList.get(i).getJenisLayanan());
                writer.println("Jenis Cucian\t: " + customerList.get(i).getJenisCucian() + "\n");               
            }

            JOptionPane.showMessageDialog(frame, "Text exported to " + filePath);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(frame, "An error occurred: " + e.getMessage());
        }
    }
}
