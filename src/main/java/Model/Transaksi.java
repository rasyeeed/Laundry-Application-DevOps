/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Asus
 */
public class Transaksi extends Layanan {
    private int jumlah;
    
    public Transaksi(String pilihanLayanan , String pilihanWaktu,double cucian) {
        super(pilihanLayanan,pilihanWaktu, cucian);
    }
    // 1 = Reguler, 2 = Express, 3 = Kilat
    public int getBiaya(){
        if(super.getLayanan() == "Kiloan"){
            if(super.getWaktu()=="Regular"){
                return (int) (6000*super.getCucian());
            }else if(super.getWaktu()=="Express"){
                return (int) (10000*super.getCucian());
            }else if (super.getWaktu()=="Kilat"){
                return (int) (12000*super.getCucian());
            }
            
        }else if(super.getLayanan() == "Satuan"){
            if(super.getWaktu()=="Regular"){
                return (int) (5000*super.getCucian());
            }else if(super.getWaktu()=="Express"){
                return (int) (7000*super.getCucian());
            }else if (super.getWaktu()=="Kilat"){
                return (int) (9000*super.getCucian());
            }
        }
        return 0;
    }
    
    
}
