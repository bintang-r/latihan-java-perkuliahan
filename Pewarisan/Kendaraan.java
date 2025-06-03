public class Kendaraan {
     String nama;
     String merek;

     public Kendaraan(String merek, String nama){
          this.nama = nama;
          this.merek = merek;
     }

     public void berjalan(){
          System.out.println(this.nama + " Sedang Berjalan");
     }

     public void isiBahanBakar(){
          System.out.println(this.nama + " Mengisi Bahan Bakar");
     }

     public void berhenti(){
          System.out.println(this.nama + " Sedang Berhenti");
     }
}
