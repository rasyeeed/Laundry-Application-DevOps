/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author flxnzz
 */
public class Pelanggan {
    private final String ID, nama, alamat, kontak, jenisLayanan, jenisCucian;
    private int cucian;
    
    public Pelanggan(String ID, String nama, String alamat, String kontak,
            String jenisLayanan, String jenisCucian, int cucian){
        
        this.ID = ID;
        this.nama = nama;
        this.alamat = alamat;
        this.kontak = kontak;
        this.jenisLayanan = jenisLayanan;
        this.jenisCucian = jenisCucian;
        this.cucian = cucian;
    }
}
