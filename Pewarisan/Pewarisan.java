class Pewarisan{
     public static void main(String[] args){

          Mobil mobil = new Mobil("Raize", "Toyota", "Merah", 4);
          mobil.berjalan();
          mobil.isiBahanBakar();
          mobil.suara();
          mobil.info();
          
          System.out.println("-----------------------------------------------------------------");

          Motor motor = new Motor("Mio", "Yamaha", "Kuning Hijau", 2);
          motor.berjalan();
          motor.isiBahanBakar();
          motor.suara();
          motor.info();
          
          System.out.println("-----------------------------------------------------------------");
          
          Sepeda sepeda = new Sepeda("Adrenaline", "Bike Works", "Hitam", 2);
          sepeda.berjalan();
          sepeda.isiBahanBakar();
          sepeda.suara();
          sepeda.info();
     }
}