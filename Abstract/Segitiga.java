package Abstract;

public class Segitiga extends BangunDatar {
     private double alas;
     private double tinggi;
     private double sisiA;
     private double sisiB;
     private double sisiC;

     // abstract implementation
     public double getLuas() {
          return 0.5 * this.alas * this.tinggi;
     }

     public double getKeliling() {
          return  this.sisiA + this.sisiB + this.sisiC;
     }

     //  setter getter
     public void setAlas(double alas) {
          this.alas = alas;
     }
     
     public void setTinggi(double tinggi) {
          this.tinggi = tinggi;
     }

     public void setSisi(double sisiA, double sisiB, double sisiC) {
          this.sisiA = sisiA;
          this.sisiB = sisiB;
          this.sisiC = sisiC;
     }

     public double getAlas() {
          return alas;
     }

     public double getTinggi() {
          return tinggi;
     }

     public double getSisiA(){
          return this.sisiA;
     }

     public double getSisiB(){
          return this.sisiB;
     }

     public double getSisiC(){
          return this.sisiC;
     }
}