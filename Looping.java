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

          int a,b;
          b = input.nextInt();
          System.out.println("Perulangan Sebanyak " + b);

          for(a = 1; a <= b; a++){
               System.out.println("Perulangan ke-" + a);
          }
     }
}

