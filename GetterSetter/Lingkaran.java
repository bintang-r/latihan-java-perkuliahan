package GetterSetter;

class Lingkaran{
     double jariJari;

     public double getLuas(){
          return 3.14 * this.jariJari * this.jariJari;
     }

     public double getKeliling(){
          return 2 * 3.14 * this.jariJari;
     }

     public void setJariJari(int jariJari){
          this.jariJari = jariJari;
     }
}