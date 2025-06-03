public class Motor extends Kendaraan{
     String warna;
     int jmlBan;

     public Motor(String nama, String merek, String warna, int jmlBan){
          super(merek, nama);

          this.warna = warna;
          this.jmlBan = jmlBan;
     }

     public void suara(){
          System.out.println(this.nama + "ngeng... ngeng... ngeng...");
          System.out.println("Motor " + this.merek + " suaranya sangat keras");
     }

     public void info(){
          System.out.println("Nama : " + this.nama);
          System.out.println("Merk : " + this.merek);
          System.out.println("Warna : " + this.warna);
          System.out.println("Jumlah Ban : " + this.jmlBan);
     }
}
