public class BangunRuang {
     double jari, tinggi;
     int sisi;

     public void setJari(double jari){
          this.jari = jari;
     }

     public void setTinggi(double tinggi){
          this.tinggi = tinggi;
     }

     public void setSisi(int sisi){
          this.sisi = sisi;
     }

     public int getLuas(int sisi){
          return sisi * sisi * sisi;
     }

     public double getLuas(double jari, double tinggi){
          return 3.14 * (jari * jari) * tinggi;
     }
}
