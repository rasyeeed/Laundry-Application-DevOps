/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Asus
 */
public class Layanan_Kiloan extends Layanan {
    public Layanan_Kiloan(int pilihanLayanan, int pilihanWaktu, double cucian) {
        super(pilihanLayanan, pilihanWaktu,cucian);
    }
    

    public String getPrintLayanan(){
        if(super.getWaktu()==1) {
             return "Paket cucian perkilo \n Laundry anda akan selesai kurang lebih 1 hingga 2 hari lagi";
        }else if(super.getWaktu()==2){
            return"Paket cucian perkilo \n Laundry anda akan selesai 6 jam lagi";
        }else if(super.getWaktu()==3){
            return "Paket cucian perkilo \n Laundry anda akan selesai 3 jam lagi";
        }else{
           return "Pilihan tidak tersedia";
        }
        
        
    }
}
