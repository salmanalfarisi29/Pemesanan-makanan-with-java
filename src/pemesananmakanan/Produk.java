/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pemesananmakanan;

/**
 *
 * @author Salman Alfarisi
 */
public class Produk {
    
    public String[] namaMkn;
    public double[] hargaMkn;
    public double hargaTotal;
    public int[] stok;
    public static byte id = 0;
    
    public Produk() {
    namaMkn = new String[10];
    hargaMkn = new double[10];
    stok = new int[10];
}
    public void pesanMakan(String nama, double harga, int stok){
        namaMkn[id] = nama;
        hargaMkn[id] = harga;
        this.stok[id] = stok; 
    }
    
    public void tampilkanMenu(){
        System.out.println("                Daftar Menu                ");
        System.out.println("===========================================");
        for (int i=0; i<=id; i++) {
            if (!isOutOfStock(i)) {
	System.out.println(i+1 + ". \t" + namaMkn[i] + "\t[" + stok[i] + "]" + "\tRp. " + hargaMkn[i]);
	}
        }
        System.out.println("===========================================");
        System.out.println("");
    }
    
    public void cekInfoMakanan(int pesan_id, int input_qty){
    System.out.println("");
    System.out.println("             Menu Produk Terpilih          ");
    System.out.println("===========================================");

        // CEK PRODUK
        if (pesan_id >= namaMkn.length || pesan_id < 0) {
            System.out.println("        Produk Tidak Ada Dalam List        ");
                } else{
                            // CEK STOK
                            hargaTotal = input_qty*hargaMkn[pesan_id];
                            if (stok[pesan_id] >= input_qty) {
                            System.out.println(namaMkn[pesan_id] + "\tRp. " + hargaMkn[pesan_id] + "*" + input_qty + " " + hargaTotal);

                            // PROSES MENGURANGI STOK
                            stok[pesan_id] = stok[pesan_id] - input_qty;
                            } else{
                                    System.out.println("             Stok Produk Kurang            ");
		}
	}

                            System.out.println("===========================================");
                            System.out.println("");
	}
    
    public boolean isOutOfStock(int id){
        return stok[id] == 0;
        }
    
    public static void nextId(){
        id++;
        }
}
