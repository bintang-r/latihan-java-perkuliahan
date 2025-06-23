package Abstract;

public class PersegiPanjang extends BangunDatar {
     private double panjang;
     private double lebar;

     // abstract implementation
     public double getLuas(){
          return hitungLuas();
     }

     public double getKeliling(){
          return hitungKeliling();
     }
     
     // setter getter
     public double getPanjang() {
          return panjang;
     }
     
     public void setPanjang(double panjang) {
          this.panjang = panjang;
     }
     
     public double getLebar() {
          return lebar;
     }
     
     public void setLebar(double lebar) {
          this.lebar = lebar;
     }
     
     // logic bagundatar
     private double hitungLuas() {
          return this.panjang * this.lebar;
     }

     private double hitungKeliling() {
          return 2 * (this.panjang + this.lebar);
     }
}