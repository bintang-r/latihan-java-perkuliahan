package GetterSetter;

public class Main {
     public static void main(String[] args){
          System.out.println("=============================== PROGRAM LINGKARAN =============================");
          Lingkaran l = new Lingkaran();
          l.setJariJari(14);
          System.out.println("LUAS : " + l.getLuas());
          System.out.println("KELILING : " + l.getKeliling());
          System.out.println("===============================================================================");
          
          System.out.println("=============================== PROGRAM MAHASISWA =============================");
          Mahasiswa mhs = new Mahasiswa();
          mhs.setNama("Muhammad Bintang");
          mhs.setUmur(21);
          System.out.println("NAMA MAHASISWA : " + mhs.getNama());
          System.out.println("UMUR MAHASISWA : " + mhs.getUmur());
          System.out.println("===============================================================================");
     }
}
