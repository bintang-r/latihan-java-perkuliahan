package Lingkaran;

class Lingkaran{
     double luas, jariJari;

     public double getLuas(){
          return this.luas;
     }

     public double getKeliling(){
          return 3.14 * this.jariJari * this.jariJari;
     }

     public void setJariJari(int jariJari){
          this.jariJari = jariJari;
     }
}