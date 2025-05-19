import java.util.Scanner;

public class LatihanArray {
     public static void array1Dimensi(){
          int[] angka = {11,22,33,44,55};

          for(int i = 0; i < angka.length; i++){
               System.out.println("Element ke-" + i + " adalah " + angka[i]);
          }
     }

     public static void array1DimensiKasus1(){
          Scanner input = new Scanner(System.in);
          int nilai[] = new int[5];

          int total = 0;

          for(int i = 0; i < nilai.length; i++){
               System.out.print("Masukkan Nilai siswa yang ke-" + (i + 1) + " : ");
               nilai[i] = input.nextInt();
               total += nilai[i];
          }
          
          double rataRata = (double) total / nilai.length;
          input.close();
          System.out.println("Rata-rata nilai : " + rataRata);
     }

     public static void array1DimensiKasus2(){
          Scanner input = new Scanner(System.in);
          int[] nilai = new int[7];
          int max;
          
          for(int i = 0; i < nilai.length; i++){
               System.out.print("Masukkan Nilai siswa yang ke-" + (i + 1) + " : ");
               nilai[i] = input.nextInt();
          }
          
          max = nilai[0];
          for(int i = 1; i < nilai.length; i++){
               if(nilai[i] > max){
                    max = nilai[i];
               }
          }
          
          input.close();
          System.out.println("Nilai tertinggi adalah : " + max);
     }
     
     public static void array1DimensiKasus3(){
          Scanner input = new Scanner(System.in);
          int[] nilai = new int[10];
          int jumlahLulus = 0;

          for(int i = 0; i < nilai.length; i++){
               System.out.print("Masukkan Nilai siswa yang ke-" + (i + 1) + " : ");
               nilai[i] = input.nextInt();

               if(nilai[i] >= 60){
                    jumlahLulus++;
               }
          }

          input.close();
          System.out.println("Jumlah siswa yang lulus : " + jumlahLulus);
          System.out.println("Jumlah siswa yang tidak lulus : " + (nilai.length - jumlahLulus));
     }
}
