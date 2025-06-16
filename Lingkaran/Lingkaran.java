package Lingkaran;

class Lingkaran{
     double jariJari;

     public double getLuas(){
          return 2 * 3.14 * this.jariJari;
     }

     public double getKeliling(){
          return 3.14 * this.jariJari * this.jariJari;
     }

     public void setJariJari(int jariJari){
          this.jariJari = jariJari;
     }
}