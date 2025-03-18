package Latihan2;
import java.util.Scanner;

public class BasicJava {
    public static void tampil(){
        System.out.println("Muhammad Bintang");
        System.out.println("20232205029");
    }

    public static void variable(){
        String nim = "20232205029";
        double tinggi = 157;
        boolean status = true;
        char NA = 'A';
        String nama = "Muhammad Bintang";

        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Tinggi Badan : " + tinggi);
        System.out.println("Status Mahasiswa : " + status);
        System.out.println("Grade : " + NA);
    }

    public static void var_input(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan nama anda : ");
        String nama = scanner.nextLine();
        
        System.out.println("Masukkan nim anda : ");
        String nim = scanner.nextLine();

        System.out.println("Masukkan status anda : ");
        String status = scanner.nextLine();

        System.out.println("----------------Data Anda------------------");
        System.out.println("Nama   : " + nama);
        System.out.println("NIM    : " + nim);
        System.out.println("Status : " + status);
    }

    public static void operator(){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nilai Pertama : ");
        int angka1 = input.nextInt();
        System.out.println("Masukkan Nilai Kedua : ");
        int angka2 = input.nextInt();

        System.out.println("\t Hasil Operasi Aritmatika ");
        System.out.println("Hasil Penjumlahan : " + (angka1 + angka2));
        System.out.println("Hasil Pengurangan : " + (angka1 - angka2));
        System.out.println("Hasil Perkalian : " + (angka1 * angka2));
        System.out.println("Hasil Pembagian : " + (angka1 / angka2));
        System.out.println("Hasil Modulus : " + (angka1 % angka2));
    }
}
