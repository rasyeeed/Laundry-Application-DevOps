/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Asus
 */
public class Layanan {
    private final String pilihanLayanan;
    private final String pilihanWaktu;
    public String waktu;
    public String layanan;
    public double cucian;
    
    public Layanan(String pilihanLayanan, String pilihanWaktu,double cucian){
        this.pilihanLayanan = pilihanLayanan;
        this.pilihanWaktu = pilihanWaktu;
        this.cucian = cucian;
    }
    
    
    public String getLayanan(){
        return this.pilihanLayanan;
    }

    public String getWaktu(){
        return this.pilihanWaktu;
    }
    public double getCucian(){
        return this.cucian;
    }
    
    public String getPrintLayanan(){
    
        return null;
    
    }
}
