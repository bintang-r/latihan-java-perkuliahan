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
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan nama anda : ");
        String nama = input.nextLine();
        
        System.out.println("Masukkan nim anda : ");
        String nim = input.nextLine();

        System.out.println("Masukkan status anda : ");
        String status = input.nextLine();
        
        System.out.println("----------------Data Anda------------------");
        System.out.println("Nama   : " + nama);
        System.out.println("NIM    : " + nim);
        System.out.println("Status : " + status);
        
        input.close();
    }

    public static void operator(){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nilai Pertama : ");
        int angka1 = input.nextInt();
        System.out.println("Masukkan Nilai Kedua : ");
        int angka2 = input.nextInt();

        // Operator Aritmatika
        System.out.println("\nHasil Operasi Aritmatika ");
        System.out.println("Hasil Penjumlahan : " + (angka1 + angka2));
        System.out.println("Hasil Pengurangan : " + (angka1 - angka2));
        System.out.println("Hasil Perkalian   : " + (angka1 * angka2));
        System.out.println("Hasil Pembagian   : " + (angka1 / angka2));
        System.out.println("Hasil Modulus     : " + (angka1 % angka2));

        // Operator Relational
        System.out.println("\nHasil Operasi Relasional ");
        System.out.println("Apakah angka1 lebih besar dari angka2  : " + (angka1 > angka2));
        System.out.println("Apakah angka1 lebih kecil dari angka2  : " + (angka1 < angka2));
        System.out.println("Apakah angka1 sama dengan angka2       : " + (angka1 == angka2));
        System.out.println("Apakah angka1 tidak sama dengan angka2 : " + (angka1 != angka2));

        boolean kondisi1 = angka1 > 0;
        boolean kondisi2 = angka2 > 0;
          // Operator Logika
        System.out.println("\nHasil Operasi Logika ");
        System.out.println("Apakah kedua angka positif? " + (kondisi1 && kondisi2));
        System.out.println("Apakah salah satu angka positif? " + (kondisi1 || kondisi2));
        System.out.println("Apakah angka1 bukan positif? " + (!kondisi1));

        input.close();
    }

    public static void grade_sc(){
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan nilai anda : ");
        int bulan = input.nextInt();

        switch (bulan) {
            case 1:
                System.out.println("Bulan pertama adalah bulan Januari");
                break;
            case 2:
                System.out.println("Bulan pertama adalah bulan Februari");
                break;
            case 3:
                System.out.println("Bulan pertama adalah bulan Maret");
                break;
            case 4:
                System.out.println("Bulan pertama adalah bulan April");
                break;
            case 5:
                System.out.println("Bulan pertama adalah bulan Mei");
                break;
            case 6:
                System.out.println("Bulan pertama adalah bulan Juni");
                break;
            case 7:
                System.out.println("Bulan pertama adalah bulan Juli");
                break;
            case 8:
                System.out.println("Bulan pertama adalah bulan Agustus");
                break;
            case 9:
                System.out.println("Bulan pertama adalah bulan September");
                break;
            case 10:
                System.out.println("Bulan pertama adalah bulan Oktober");
                break;
            case 11:
                System.out.println("Bulan pertama adalah bulan November");
                break;
            case 12:
                System.out.println("Bulan pertama adalah bulan Desember");
                break;
            default:
                System.out.println("Tidak ada bulan 13");
                break;
        }
    }
}
