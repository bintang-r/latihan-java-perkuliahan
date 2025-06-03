public class Sepeda extends Kendaraan {
     String warna;
     int jmlBan;

     public Sepeda(String nama, String merek, String warna, int jmlBan){
          super(merek, nama);

          this.warna = warna;
          this.jmlBan = jmlBan;
     }

     public void suara(){
          System.out.println(this.nama + "suaranya tidak ada");
          System.out.println("Sepeda " + this.merek + " tidak terlalu bersuara");
     }

     public void info(){
          System.out.println("Nama : " + this.nama);
          System.out.println("Merk : " + this.merek);
          System.out.println("Warna : " + this.warna);
          System.out.println("Jumlah Ban : " + this.jmlBan);
     }
}
