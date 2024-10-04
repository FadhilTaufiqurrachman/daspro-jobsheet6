import java.util.Scanner;

public class PertanyaanPercobaan3 {
    public static void main(String[] args) {
        Scanner input08 = new Scanner (System.in);
        //Deklarasi
        String kategori;
        int penghasilan, gajiBersih;
        double pajak = 0;

        System.out.print("Masukkan Kategori : ");
        kategori = input08.nextLine();
        System.out.print("Masukkan Besarnya Penghasilan : Rp.");
        penghasilan = input08.nextInt();

        if (kategori.equals("Pekerja")) {
            if (penghasilan <= 2000000) {
                pajak = 0.1;
            } else if (penghasilan <= 3000000) {
                pajak = 0.15;
            } else {
                pajak = 0.2;
            }
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.println("Penghasilan Bersih : Rp." + gajiBersih);
        } else if (kategori.equals("Pebisnis")) {
            if (penghasilan <= 2500000) {
                pajak = 0.15;
            } else if (penghasilan <= 3500000) {
                pajak = 0.2;
            } else { 
                pajak = 0.25;
            }
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.println("Penghasilan Bersih : Rp." + gajiBersih);
        } else {
            System.out.println("Kategori Tidak Tersedia");
        }

        input08.close();
    }
}