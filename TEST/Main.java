public class Main{
     public static void main(String[] args) {
          System.out.println("========================== TEST ================================");
          System.out.println("-------------------------- BAGIAN PERTAMA ----------------------");
          
          System.out.println("Bunga Mawar");
          Mawar mawar = new Mawar();
          mawar.tumbuh();
          mawar.berbunga();
          mawar.mati();
          mawar.layu();
          
          System.out.println("Bunga Mawar");
          Melati melati = new Melati();
          melati.tumbuh();
          melati.berbunga();
          melati.mati();
          
          System.out.println("Bunga Kamboja");
          Kamboja kamboja = new Kamboja();
          kamboja.tumbuh();
          kamboja.berbunga();
          
          System.out.println("-------------------------- BAGIAN KEDUA ----------------------");
          System.out.println("Bangun Ruang");
          BangunRuang bangunRuang = new BangunRuang();
          
          bangunRuang.setSisi(4);
          bangunRuang.setJari(7.0);
          bangunRuang.setTinggi(5.0);

          System.out.println("Sisi : " + bangunRuang.sisi);
          System.out.println("Jari : " + bangunRuang.jari);
          System.out.println("Tinggi : " + bangunRuang.tinggi);

          System.out.println("LUAS SEGITIGA : " + bangunRuang.getLuas(4));
          System.out.println("LUAS LINGKARAN : " + bangunRuang.getLuas(7.0, 5.0));
     }
}