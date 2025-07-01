package Overloading;

public class Main {
    public static void main(String[] args) {
        BangunDatar bangunDatar = new BangunDatar();

        double luasPersegi = bangunDatar.hitungLuas(12.0);
        double luasPersegiPanjang = bangunDatar.hitungLuas(10, 5);
        double luasLingkaran = bangunDatar.hitungLuas(14);

        System.out.println("Luas Persegi : " + luasPersegi);
        System.out.println("Luas Persegi Panjang : " + luasPersegiPanjang);
        System.out.println("Luas Lingkaran : " + luasLingkaran);
    }
}
