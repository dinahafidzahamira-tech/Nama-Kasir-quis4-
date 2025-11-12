package com.mycompany.kasirsederhana;

import java.util.Scanner;

public class KasirSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalBelanja = 0;
        String struk = "\n=== STRUK KASIR AMIRA BAKERY ===\n";

        System.out.println("=== SELAMAT DATANG DI AMIRA BAKERY ===");

        System.out.print("Masukkan Nama Pemesan: ");
        String namaPemesan = input.nextLine();

        System.out.println("\n Kue yang Tersedia hari ini :");
        System.out.println("1. chesee cake");
        System.out.println("2. rainbow cake");
        System.out.println("3. tiramisu cake");
        System.out.println("4. bolu pisang");

        System.out.print("Pilih kue yang ingin di pesan : ");
        int pilih = input.nextInt();

        String nama = "Nama";
        int harga = 0;

        if (pilih == 1) { nama = "chesee cake"; harga = 50000; }
        else if (pilih == 2) { nama = "Rainbow cake"; harga = 50000; }
        else if (pilih == 3) { nama = "tiramisu cake"; harga = 50000; }
        else if (pilih == 4) { nama = "bolu pisang"; harga = 50000; }
        else { 
            System.out.println("stok kosong"); 
            return; 
        }

        System.out.print(" Masukan Jumlah kue yang ingin dipesan : ");
        int jumlah = input.nextInt();
        
        double diskon = 0; // dikasih nilai awal biar gak error
        int total = harga * jumlah;

        if (total >= 80000) {
            diskon = 0.10;
        } else if (total >= 40000) {
            diskon = 0.05;
        }

        struk += "Nama Pemesan : " + namaPemesan + "\n";
        struk += nama + " x " + jumlah + " = Rp " + total + "\n";
        
        totalBelanja += total;

        System.out.println("\n=== METODE PEMBAYARAN ===");
        System.out.println("1. Tunai");
        System.out.println("2. Qris");
        System.out.println("3. Gopay");

        System.out.print("Pilih Metode pembayaran: ");
        int pilihBayar = input.nextInt();

        String metode = "";

        if (pilihBayar == 1) { metode = "Tunai"; }
        else if (pilihBayar == 2) { metode = "Qris"; }
        else if (pilihBayar == 3) { metode = "Gopay"; }
        else { 
            System.out.println("Pembayaran Tidak tersedia"); 
            return; 
        }

        double totalBayar = total - (total * diskon);

        System.out.println("\nMetode Pembayaran : " + metode);
        System.out.println(struk);
        System.out.println("Total Belanja : Rp " + total);
        System.out.println("Diskon  : " + (diskon * 100) + "%");
        System.out.println("Total Bayar : Rp " + totalBayar);

        System.out.print("Uang bayar: ");
        int bayar = input.nextInt();

        double kembalian = bayar - totalBayar;
        System.out.println("Kembalian: Rp " + kembalian);

        System.out.println("\n=== Terima Kasih sudah berbelanja di Amira Bakery! ===");
        System.out.println("=== DAPATKAN PROMO SPESIAL!!! BELI 5 KUE GRATIS 1 UNTUK MINGGU DEPAN. ===");

        input.close();
    }
}