import java.util.Scanner;

public class Looping {
     public static void Forr(){
          int a;

          for(a = 1; a <= 10; a++){
               System.out.println("Perulangan Ke-" + a);
          }
     }

     public static void ForInput(){
          Scanner input = new Scanner(System.in);
          System.out.print("Masukkan angka : ");
          int angka = input.nextInt();
          System.out.println("Perulangan Sebanyak " + angka);

          for(int i = 1; i <= angka; i++){
               System.out.println("Perulangan ke-" + i);
          }
     }
}

