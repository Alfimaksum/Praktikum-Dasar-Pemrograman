import java.util.Scanner;

public class PemilihanHari {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama hari (dalam bahasa Inggris): ");
        String hari = scanner.nextLine().toLowerCase(); // Mengubah input menjadi huruf kecil untuk memudahkan perbandingan

        String jenisHari;

        switch (hari) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                jenisHari = "weekday";
                break;
            case "saturday":
            case "sunday":
                jenisHari = "weekend";
                break;
            default:
                jenisHari = "invalid day name";
        }

        System.out.println(hari + " is a " + jenisHari);
    }
}