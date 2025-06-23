package Pewarisan2;

public class Manusia {
     protected String nama, gayaRambut, bentukWajah, warnaKulit, jenisKelamin, warnaMata, warnaRambut;
     protected int tinggiBadan, umur;

     public Manusia(
          String nama,
          String bentukWajah, 
          String warnaKulit, 
          int tinggiBadan, 
          int umur
     ){
          this.nama = nama;
          this.bentukWajah = bentukWajah;
          this.warnaKulit = warnaKulit;
          this.tinggiBadan = tinggiBadan;
          this.umur = umur;
     }

     public void infoIdentitas(){
          System.out.println("========================== IDENTITAS ==========================");
          System.out.println("");
          System.out.println("Nama : " + this.nama);
          System.out.println("Jenis Kelamin : " + this.getJenisKelamin());
          System.out.println("Tinggi Badan : " + this.tinggiBadan);
          System.out.println("Umur : " + this.umur);
          System.out.println("Bentuk Wajah : " + this.bentukWajah);
          System.out.println("Gaya Rambut : " + this.getGayaRambut());
          System.out.println("Warna Mata : " + this.getWarnaMata());
          System.out.println("Warna Rambut : " + this.getWarnaRambut());
          System.out.println("");
     }

     // setter / getter

     protected void setJenisKelamin(String jenisKelamin){
          this.jenisKelamin = jenisKelamin;
     }

     protected String getJenisKelamin(){
          return this.jenisKelamin;
     }
     
     public void setGayaRambut(String gayaRambut){
          this.gayaRambut = gayaRambut;
     }

     public void setWarnaMata(String warnaMata){
          this.warnaMata = warnaMata;
     }

     public String getWarnaMata(){
          return this.warnaMata;
     }

     public  void setWarnaRambut(String warnaRambut){
          this.warnaRambut = warnaRambut;
     }

     public String getWarnaRambut(){
          return "warna rambut nya adalah " + this.warnaRambut;
     }

     public String getGayaRambut(){
          if(this.gayaRambut != ""){
               return " memiliki gaya rambut " + this.gayaRambut;
          }else{
               if(jenisKelamin == "Laki-laki"){
                    return " tidak memiliki gaya rambut";
               }else{
                    return " menggunakan jilbab";
               }
          }
     }

     // clasic method
     
     public void berjalan(){
          System.out.println(this.nama + " sedang berjalan");
     }

     public void berlari(){
          System.out.println(this.nama + " sedang berlari");
     }

     public void makan(String namaMakanan){
          System.out.println(this.nama + " sedang makan " + namaMakanan);
     }

     public void minum(String minuman){
          System.out.println(this.nama + " sedang minum " + minuman);
     }

     public void tidur(){
          System.out.println(this.nama + " sedang tidur");
     }

     public void bangun(){
          System.out.println(this.nama + " sedang tidur");
     }

     public void mati(){
          System.out.println(this.nama + " telah meninggal dunia");
     }
}
