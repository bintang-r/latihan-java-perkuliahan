package Abstract;

public class Segitiga extends BangunDatar {
     private double alas;
     private double tinggi;
     private double sisiA;
     private double sisiB;
     private double sisiC;

     // abstract implementation
          public double getLuas() {
          return hitungLuas();
     }

     public double getKeliling() {
          return  hitungKeliling();
     }

     //  setter getter
     public void setAlas(double alas) {
          this.alas = alas;
     }

          public double getAlas() {
               return alas;
          }

     public void setTinggi(double tinggi) {
          this.tinggi = tinggi;
     }

          public double getTinggi() {
               return tinggi;
          }

     public void setSisi(double sisiA, double sisiB, double sisiC) {
          this.sisiA = sisiA;
          this.sisiB = sisiB;
          this.sisiC = sisiC;
     }

     // logic bagundatar
     private double hitungLuas() {
          return 0.5 * this.alas * this.tinggi;
     }

     private double hitungKeliling() {
          return this.sisiA + this.sisiB + this.sisiC;
     }
}