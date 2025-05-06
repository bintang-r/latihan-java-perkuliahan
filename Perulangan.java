public class Perulangan {
     public static void WhileDo(){
          int i = 1;

          System.out.println("================= PERULANGAN WHILE DO ================");
          while(i <= 10){
               System.out.println("Perulangan yang ke_" + i);
               i++;
          }
     }

     public static void DoWhile(){
          int i = 10;

          System.out.println("================= PERULANGAN DO WHILE ================");
          do{
               System.out.println("Perulangan yang ke_" + i);
               i--;
          }while(i >= 1);
     }
}
