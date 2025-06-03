public class Mobil extends Kendaraan{
     String warna;
     int jmlBan;

     public Mobil(String nama, String merek, String warna, int jmlBan){
          super(merek, nama);

          this.warna = warna;
          this.jmlBan = jmlBan;
     }

     public void suara(){
          System.out.println(this.nama + "...brum...brum..brum");
          System.out.println("Mobil " + this.merek + " suaranya sangat mulus");
     }

     public void info(){
          System.out.println("Nama : " + this.nama);
          System.out.println("Merk : " + this.merek);
          System.out.println("Warna : " + this.warna);
          System.out.println("Jumlah Ban : " + this.jmlBan);
     }
}
