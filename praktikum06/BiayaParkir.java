import java.util.Scanner;

public class BiayaParkir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jenis kendaraan (mobil/motor): ");
        String jenisKendaraan = input.nextLine();

        int biayaPerJam;
        if (jenisKendaraan.equalsIgnoreCase("mobil")) {
            biayaPerJam = 5000;
        } else if (jenisKendaraan.equalsIgnoreCase("motor")) {
            biayaPerJam = 3000;
        } else {
            System.out.println("Jenis kendaraan tidak valid!");
            return;
        }

        System.out.println("Total biaya parkir selama 1 jam: Rp" + biayaPerJam);
    }
}