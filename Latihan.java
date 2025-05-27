import java.util.Scanner;

public class Latihan{
    public static void Latihan10(){
        Scanner input = new Scanner(System.in);
        int[] nilai = new int[10];
        int jumlahLulus = 0, 
            max = 0, 
            total = 0;
        double rataRata;

        for(int i = 0; i < nilai.length; i++){
            System.out.print("Masukkan nilai siswa yang ke-" + (i + 1) + " : ");
            nilai[i] = input.nextInt();
            total += nilai[i];

            if(nilai[i] >= 60){
                jumlahLulus++;
            }
        }

        max = nilai[0];
        for(int i = 1; i < nilai.length; i++){
            if(nilai[i] > max){
                max = nilai[i];
            }
        }

        rataRata = (double) total / nilai.length;

        System.out.println("======================== HASIL OUTPUT APLIKASI ========================");
        System.out.println("Rata-rata nilai : " + rataRata);
        System.out.println("Nilai Tertinggi : " + max);
        System.out.println("Jumlah siswa yang lulus : " + jumlahLulus);
        System.out.println("Jumlah siswa yang tidak lulus : " + (nilai.length - jumlahLulus));
        input.close();
    }
}