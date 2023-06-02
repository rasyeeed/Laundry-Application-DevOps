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
    
    public Transaksi(int pilihanLayanan , int pilihanWaktu,double cucian) {
        super(pilihanLayanan,pilihanWaktu, cucian);
    }
    
    public int getBiaya(){
        if(super.getLayanan() == 1){
            if(super.getLayanan()==1){
                return (int) (6000*super.getCucian());
            }else if(super.getLayanan()==2){
                return (int) (10000*super.getCucian());
            }else if (super.getLayanan()==3){
                return (int) (12000*super.getCucian());
                       }
            
        }else if(super.getLayanan() == 2){
            if(super.getLayanan()==1){
                return (int) (5000*super.getCucian());
            }else if(super.getLayanan()==2){
                return (int) (7000*super.getCucian());
            }else if (super.getLayanan()==3){
                return (int) (9000*super.getCucian());
            }
        }
        return 0;
    }
    
    
}
