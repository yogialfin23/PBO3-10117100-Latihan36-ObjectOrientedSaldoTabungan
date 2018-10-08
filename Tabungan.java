package com.company;

public class Tabungan {
    public int saldo;
    public int bunga;

    public double hitungBunga(int parSaldo, int parBunga) {
        return parSaldo * parBunga / 100;
    }

    public void hitungLamaSaldoTarget(int parSaldo, int parSaldoTarget) {
        int i = 1;
        while (parSaldo <= parSaldoTarget) {
            hitungBunga(parSaldo, bunga);
            parSaldo += hitungBunga(parSaldo, bunga);

            //format dan tampilkan output
            String mataUang = String.format("Rp.%,3d", parSaldo).
                    replaceAll(",", ".");
            System.out.printf("Saldo di bulan ke-" + i + " %s%n", mataUang);
            i++;
        }
    }
}
