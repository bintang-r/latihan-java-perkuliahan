package GetterSetter;

public class Mahasiswa {
     String nama;
     int umur;

     public void setNama(String nama){
          this.nama = nama;
     }

     public void setUmur(int umur){
          this.umur = umur;
     }

     public String getNama(){
          return this.nama;
     }

     public int getUmur(){
          return this.umur;
     }
}
