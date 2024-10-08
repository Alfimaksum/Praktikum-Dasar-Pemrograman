package praktikum06;

import java.util.Scanner;
public class Pemilihan2Percobaan301 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        String kategori;
        int penghasilah, gajiBersih;
        double pajak = 0;

        System.out.print("Masukan Kategori : ");{
        kategori = sc.nextLine();
        System.out.print("Masukan Berdasarkan Penghasilan :");
        penghasilah = sc.nextInt();

        if (kategori.equalsIgnoreCase("pekerjaan")) {
            if (penghasilah <= 2000000)
                pajak = 0.1;
            else if (penghasilah <= 3000000)
                pajak = 0.15;
            else
                pajak = 0.2;
            System.out.print("penghas bersih: " + penghasilah);
        } else if (kategori.equalsIgnoreCase("Pebisnis")) {
            if (penghasilah <= 2500000)
                pajak = 0.15;
            else if (penghasilah <= 3500000)
                pajak = 0.2;
            else
                pajak = 0.25;
            System.out.print("penghas bersih: " + penghasilah);
        } else 
        System.out.println("Masukkan Kategori Salah.");
    }

}
}