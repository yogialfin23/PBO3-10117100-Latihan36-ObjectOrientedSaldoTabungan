package com.company;

/**
 * Yogie Alfin Salim
 * 10117100
 * IF - 3
 * Deskripsi Program : program ini berisi program untuk menampilkan perhitungan
 * lama tabungan sampai mencapai saldo target dengan konsep oop
 */
public class Main {

    public static void main(String[] args) {
        Tabungan tabung = new Tabungan();

        tabung.saldo = 3500000;
        tabung.bunga = 8;
        int saldoTarget = 6000000;

        tabung.hitungLamaSaldoTarget(tabung.saldo,saldoTarget);
    }
}
