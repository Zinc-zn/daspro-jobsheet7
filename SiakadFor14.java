import java.util.Scanner;
public class SiakadFor14{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nilai, tertinggi = 0, terendah = 100, lulus=0, tidak_lulus=0;
        for (int i = 1; i <= 10; i++){
            System.out.print("Masukkan nilai mahasiswa ke-"+ i + ": ");
            nilai = input.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai >= 60){
                lulus++;
            }else{
                tidak_lulus++;
            }
        }
        System.out.println("Nilai tertinggi: "+tertinggi);
        System.out.println("Nilai terendah: "+terendah);

        System.out.println("Jumlah mahasiswa yang lulus: "+lulus);
        System.out.println("Jumlah mahasiswa yanng tidak lulus: "+tidak_lulus);
        
    }
}