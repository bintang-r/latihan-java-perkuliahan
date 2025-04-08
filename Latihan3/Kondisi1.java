package Latihan3;
import java.util.Scanner;

public class Kondisi1{
     public static void grade(){
          Scanner input = new Scanner(System.in);
          System.out.println("Masukkan Nilai Anda : ");
          int nilai = input.nextInt();

          if(nilai >= 80 || nilai >= 100){
               System.out.println("Grade anda adalah A");
          }else if(nilai >= 70 || nilai >= 89){
               System.out.println("Grade anda adalah B");
          }else if(nilai >= 50 || nilai >= 69){
               System.out.println("Grade anda adalah C");     
          }else if(nilai < 50){
               System.out.println("Grade anda adalah E");
          }else{
               System.out.println("Anda Wajib Memasukkan Angka...");
          }

          input.close();
     }
}