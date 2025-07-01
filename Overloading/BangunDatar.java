package Overloading;

public class BangunDatar {
     double hitungLuas(double sisi){
          return sisi * sisi;
     }

     double hitungLuas(double panjang, double lebar){
          return panjang * lebar;  
     }

     double hitungLuas(int jariJari){
          return 3.14 * jariJari * jariJari;
     }
}
