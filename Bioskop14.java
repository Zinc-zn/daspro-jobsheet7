import java.util.Scanner;

public class Bioskop14 {
    public static void main(String[] args) {
        double diskon, jml_tiket, 
        //jangan lupa memberikan nilai total dengan nilai 0
        total_penjualan=0, total_tiket=0, 
        harga, tiket=50000;
        String stop;
        Scanner input = new Scanner(System.in);

        while (true){
            System.out.print("\nMasukkan jumlah tiket (ketik '-' jika selesai): ");
            stop = input.nextLine();

            if (stop.equals("-")){
                break;
            }
            jml_tiket = Double.parseDouble(stop);

            if (jml_tiket < 0){
                System.out.println("Tidak valid. Silahkan ketik ulang");
                continue;
            }
            harga = tiket * jml_tiket;
            diskon=0;
            if (jml_tiket > 10){
                diskon = (tiket*jml_tiket)*0.15;
            } else if (jml_tiket > 4){
                diskon = (tiket*jml_tiket)*0.1;
            }
            harga = (tiket * jml_tiket) - diskon;
            total_tiket+=jml_tiket;
            total_penjualan+=harga;


            System.out.println("\nJumlah tiket: "+jml_tiket);
            System.out.println("Diskon: "+diskon);
            System.out.println("Total Harga: Rp "+harga);
        }
            System.out.println("\nTotal tiket yang terjual :"+total_tiket);
            System.out.println("Total Penjualan : Rp "+total_penjualan);
    }
}
