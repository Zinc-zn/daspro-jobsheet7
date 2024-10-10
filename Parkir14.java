
import java.util.Scanner;

public class Parkir14 {
    public static void main(String[] args) {
        int jenis, durasi, total=0, total_motor=0, total_mobil=0, total_bayar=0, total_kendaraan=0;
        // String jenisStr="";
        Scanner input = new Scanner(System.in);

        while (true){
            System.out.print("\nMasukkan jenis kendaraan (1=Mobil 2=Motor 0=Keluar): ");
            jenis = input.nextInt();

            if (jenis == 0) {
                break;
            }

            if(jenis < 0 || jenis > 2){
                System.out.println("Tidak valid, silahkan ketik ulang");
                continue;
            }

            System.out.print("Masukkan durasi (satuan jam): ");
            durasi = input.nextInt();
            if (durasi > 5) {
                total = 12500;
                // jenisStr = (jenis == 1) ? "Mobil" : "Motor";
            }else {
                if (jenis == 1){
                    total=durasi*3000;
                    // jenisStr="Mobil";
                    total_mobil++;
                }else if(jenis == 2){
                    total=durasi*2000;
                    // jenisStr="Motor";
                    total_motor++;
                }
            }
            total_bayar+=total;
            total_kendaraan=total_mobil+total_motor;

            System.out.println("\nDurasi: "+durasi+" jam");
            // System.out.println("Jenis kendaraan: "+jenisStr);
            System.out.println("Bayar: Rp "+total);
        }
            System.out.println("\nTotal kendaraan: "+total_kendaraan);
            System.out.println("Total pembayaran: Rp "+total_bayar);
    }
}