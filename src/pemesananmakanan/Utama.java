/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pemesananmakanan;

/**
 *
 * @author Salman Alfarisi
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Utama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Produk menu = new Produk();
        
        System.out.println("DAFTAR MENU MAKANAN");
        System.out.println("=====================");
        menu.pesanMakan("1. Batagor               = Rp 5000 ", 5_000, 20);
        Produk.nextId();
        menu.pesanMakan("2. Roti bakar           = Rp 12000 ", 12_000, 20);
        Produk.nextId();
        menu.pesanMakan("3. Indomie+Telor     = Rp 12000 ", 12_000, 10);
        Produk.nextId();
        menu.pesanMakan("4. Kwetiaw              = Rp.12000", 12_000, 10);
        Produk.nextId();
        menu.pesanMakan("5. Nasi Goreng        = Rp.12000", 12_000, 10);
        Produk.nextId();
        menu.pesanMakan("6. Air Mineral           = Rp 3000", 3_000, 20);
        Produk.nextId();
        menu.pesanMakan("7. Teh Manis           = Rp 4000", 4_000, 20);
        Produk.nextId();
        menu.pesanMakan("8. Jus Alpukat         = Rp 8000", 8_000, 20);
        Produk.nextId();
        menu.pesanMakan("9. Teh Botol            = Rp 5000", 5_000, 20);
        Produk.nextId();
        menu.pesanMakan("10. Kopi                  = Rp 3000", 3_000, 10);
        Produk.nextId();
        
        Scanner pesan = new Scanner (System.in);
           
        while (true) {
            menu.tampilkanMenu();
            
            System.out.print("Inputkan ID : ");
            int pesan_id = pesan.nextInt()-1;
            System.out.print("Inputkan Jumlah : ");
            int input_qty = pesan.nextInt();
                    
            menu.cekInfoMakanan(pesan_id, input_qty);
                    
        }
        
    }
    
}
