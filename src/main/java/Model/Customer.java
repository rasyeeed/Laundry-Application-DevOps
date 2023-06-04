/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author flxnzz
 */
public class Customer {
    // INSERT INTO dataPelanggan (name, address, contact, laundry_weight, service_type, laundry_type)
    private final String nama;
    private final String alamat;
    private final String kontak;
    private final double jmlCucian;
    private final String jLayanan; // Express | Kilat | Reguler
    private final String jCucian;  // Kiloan | Satuan
    //private final double totalHarga;
    
    public Customer(String nama, String alamat, String kontak, double jmlCucian, 
            String jLayanan, String jCucian){
        this.nama = nama;
        this.alamat = alamat;
        this.kontak = kontak;
        this.jmlCucian = jmlCucian;
        this.jLayanan = jLayanan;
        this.jCucian = jCucian;
        //this.totalHarga = totalHarga;
    }
    
    public String getNama(){
        return this.nama;
    }
    
    public String getAlamat(){
        return this.alamat;
    }
    
    public String getKontak(){
        return this.kontak;
    }
    
    public double getJumlahCucian(){
        return this.jmlCucian;
    }
    
    public String getJenisLayanan(){
        return this.jLayanan;
    }
    
    public String getJenisCucian(){
        return this.jCucian;
    }
    
}
