/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasir;

import java.util.Scanner;

/**
 *
 * @author Indrachelsea
 */
public class Kasir {

    /**
     * @param args the command line arguments
     */
    
    public static int pilihan, jumlahbarang, jumlahbarang1 = 0, jumlahbarang2, harga;
    public static double total = 0, totalharga, diskon;
    public static String perintah = "";

    public static void main(String[] args) {
         Scanner a = new Scanner(System.in);

   
        barang();
        System.out.println("");
        System.out.println("Harga yang harus dibayar : " + diskon());
        System.out.println("");
        System.out.println("Nama Kasir : Ridho indra Kriswiyanto");
        System.out.println("");
        System.out.println("Terima kasih telah berbelanja disini");
      
    }

    static void barang() {
        //tampilkan daftar semua barang
        Scanner a = new Scanner(System.in);
        do {
            System.out.println(" ");
            System.out.println("TOKO ALAT TULIS");
            System.out.println("1. Buku");
            System.out.println("2. Pensil");
            System.out.println("3. Bolpoin");
            System.out.println("4. Penggaris");
            System.out.println("5. Penghapus");

            //Coding ini untuk input pilihan barang
            System.out.print("Masukkan Pilihan Barang yang Dibeli = ");
            pilihan = a.nextInt();
            //input jumlah barang yang akan dibeli

            switch (pilihan) {
                case 1:
                    System.out.println("Kode barang (BK)");
                    System.out.print("Masukkan Jumlah Buku = ");
                    jumlahbarang = a.nextInt();
                    harga = 15000 * jumlahbarang;
                    System.out.println("Harga Buku = Rp. " + harga);
                    
                    total = total + harga;
                    System.out.print("Pesan Barang Lagi? (Y/N) ");
                    perintah = a.next();
                    break;
                case 2:
                    System.out.println("Kode barang (PS)");
                    System.out.print("Masukkan Jumlah Pensil = ");
                    jumlahbarang = a.nextInt();
                    harga = 5000 * jumlahbarang;
                    System.out.println("Harga Pensil = Rp. " + harga);
                    
                    total = total + harga;
                    System.out.print("Pesan barang Lagi? (Y/N) ");
                    perintah = a.next();
                    break;
                case 3:
                    System.out.println("Kode Barang (BP)");
                    System.out.print("Masukkan Jumlah Bolpoin = ");
                    jumlahbarang = a.nextInt();
                    harga = 5000 * jumlahbarang;
                    System.out.println("Harga Bolpoin = Rp. " + harga);
                   
                    total = total + harga;
                    System.out.print("Pesan Barang Lagi? (Y/N) ");
                    perintah = a.next();
                    break;
                case 4:
                    System.out.println("Kode barang (PG)");
                    System.out.print("Masukkan Jumlah Penggaris = ");
                    jumlahbarang = a.nextInt();
                    harga = 10000 * jumlahbarang;
                    System.out.println("Harga Penggaris = Rp. " + harga);
                   
                    total = total + harga;
                    System.out.print("Pesan Barang Lagi? (Y/N) ");
                    perintah = a.next();
                    break;
                case 5:
                    System.out.println("Kode barang (PH)");
                    System.out.print("Masukkan Jumlah Penghapus = ");
                    jumlahbarang = a.nextInt();
                    harga = 4000 * jumlahbarang;
                    System.out.println("Harga Penghapus = Rp. " + harga);
                    
                    total = total + harga;
                    System.out.print("Pesan Barang Lagi? (Y/N) ");
                    perintah = a.next();
            }
        } while (perintah.equalsIgnoreCase("Y"));

        return;
    }

    static Double diskon() {

        if (total > 100000 && total < 200000) {
            diskon = total * 0.1;
            totalharga = total - diskon;
        }

        if (total > 200000 || total < 500000) {
            diskon = total * 0.2;
            totalharga = total - diskon;
        }
        if (total > 500000) {
            diskon = total * 0.5;
            totalharga = total - diskon;
        }

        return (totalharga);
    }

}