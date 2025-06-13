package Pewarisan2;

public class Pria extends Manusia{
     String pekerjaan = "", jenjangPendidikan = "";

     public Pria(String nama, String bentukWajah, String warnaKulit, int tinggiBadan, int umur){
          super(nama, bentukWajah, warnaKulit, tinggiBadan, umur);
          setJenisKelamin("Laki-laki");
     }

     public void setPekerjaan(String pekerjaan){
          this.pekerjaan = pekerjaan;
     }

     public void getPekerjaan(){
          if(this.pekerjaan != ""){
               System.out.println(this.nama + " sendang bekerja sebagai " + this.pekerjaan);
          }else{
               System.out.println(this.nama + " tidak memiliki pekerjaan");
          }
     }

     public void setJenjangPendidikan(String jenjangPendidikan){
          this.jenjangPendidikan = jenjangPendidikan;
     }

     public void getJenjangPendidikan(){
          if(this.jenjangPendidikan != ""){
               System.out.println(this.nama + " memiliki jenjang pendidikan " + this.jenjangPendidikan);
          }else{
               System.out.println(this.nama + " tidak memiliki jenjang pendidikan ");
          }
     }

     public void perkenalanDiri(){
          System.out.println("======================= PERKENALAN DIRI =======================");
          System.out.println("");
          System.out.println("Hai bro perkenalkan nama saya " + this.nama);
          System.out.println("");
     }
}  
