package Pewarisan2;

public class Main {
     public static void main(String[] args){
          Pria arma = new Pria("Arma Wijaya", "Oval", "Kuning Langsat", 160, 22);

          arma.setGayaRambut("Lurus");
          arma.setJenjangPendidikan("S1 Teknik Informatika");
          arma.perkenalanDiri();
          arma.infoIdentitas();
          arma.getJenjangPendidikan();
          arma.getPekerjaan();
          arma.setWarnaRambut("hitam");
          arma.setWarnaMata("coklat");
          arma.makan("Nasi Padang");
          arma.berjalan();
          arma.berlari();
          arma.minum("Aqua Mineral");
          arma.tidur();
          arma.mati();

          System.out.println("");
          System.out.println("---------------------------------------------------------------");
          System.out.println("");
          System.out.println("");
          
          Wanita fatimah = new Wanita("Fatimah", "Oval", "Putih", 155, 21);
          
          fatimah.pakaiJilbab();
          fatimah.setJenjangPendidikan("S1 Sistem Informasi");
          fatimah.perkenalanDiri();
          fatimah.infoIdentitas();
          fatimah.setWarnaMata("hitam");
          fatimah.setWarnaRambut("coklat");
          fatimah.getJenjangPendidikan();
          fatimah.getPekerjaan();
          fatimah.makan("nasi kuning");
          fatimah.minum("jus jeruk");
          fatimah.berjalan();
          fatimah.berlari();
          fatimah.tidur();
          fatimah.mati();

          System.out.println("");
          System.out.println("---------------------------------------------------------------");
          System.out.println("");
          System.out.println("");
          
          Wanita olivia = new Wanita("Olivia", "Oval", "Kuning langsat", 163, 22);
          
          olivia.setGayaRambut("Lurus");
          olivia.setJenjangPendidikan("S2 Ilmu Ekonomi");
          olivia.setPekerjaan("Pegawai Negeri Sipil");
          olivia.setWarnaMata("coklat");
          olivia.setWarnaRambut("coklat terang");
          olivia.perkenalanDiri();
          olivia.infoIdentitas();
          olivia.infoIdentitas();
          olivia.getJenjangPendidikan();
          olivia.getPekerjaan();
          olivia.makan("bubur ayam");
          olivia.minum("air mineral");
          olivia.berjalan();
          olivia.berlari();
          olivia.tidur();
          olivia.mati();
          
          System.out.println("");
          System.out.println("---------------------------------------------------------------");
          System.out.println("");
     }
}