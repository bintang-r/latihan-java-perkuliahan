package Abstract;

public class Main{
public static void main(String[] args) {
          Segitiga segitiga = new Segitiga();
          PersegiPanjang persegiPanjang = new PersegiPanjang();

          segitiga.setAlas(2);
          segitiga.setTinggi(4);
          segitiga.setSisi(4.0, 4.0, 4.0);

          System.out.println("====================== SEGITIGA ==========================");
          System.out.println("Alas : " + segitiga.getAlas());
          System.out.println("Tinggi : " + segitiga.getTinggi());
          System.out.println("Sisi A : " + segitiga.getSisiA() + " Sisi B : " + segitiga.getSisiB() + " Sisi C : " + segitiga.getSisiC());

          System.out.println("Luas : " + segitiga.getLuas());
          System.out.println("Keliling : " + segitiga.getKeliling());

          System.out.println("===================== PERSEGI PANJANG ====================");
          persegiPanjang.setPanjang(20);
          persegiPanjang.setLebar(20);

          System.out.println("Panjang : " + persegiPanjang.getPanjang());
          System.out.println("Lebar : " + persegiPanjang.getLebar());

          System.out.println("Luas : " + persegiPanjang.getLuas());
          System.out.println("Keliling : " + persegiPanjang.getKeliling());
     }    
}