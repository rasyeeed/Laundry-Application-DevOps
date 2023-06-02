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
    private int pilihanLayanan;
    private int pilihanWaktu;
    public String waktu;
    public String layanan;
    public double cucian;
    
    public Layanan(int pilihanLayanan, int pilihanWaktu,double cucian){
        this.pilihanLayanan = pilihanLayanan;
        this.pilihanWaktu = pilihanWaktu;
        this.cucian = cucian;
    }
    
    
    public int getLayanan(){
        return this.pilihanLayanan;
    }

    public int getWaktu(){
        return this.pilihanWaktu;
    }
    public double getCucian(){
        return this.cucian;
    }
}
