import java.util.Scanner;

public class PendakianGunung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah tenaga: ");
        int tenaga = scanner.nextInt();

        System.out.print("Masukkan jalur pendakian: ");
        String jalur = scanner.next();

        int sisaTenaga = tenaga;
        boolean istirahatTepat = true;
        boolean jalurBenar = true;

        for (int i = 0; i < jalur.length(); i++) {
            char langkah = jalur.charAt(i);

            if (langkah == 'L') {
                sisaTenaga--;
            } else if (langkah == 'R') {
                if (i == 0 || i == jalur.length() - 1) {
                    istirahatTepat = false;
                    break;
                } else {
                    sisaTenaga += 10;
                }
            } else if (langkah == 'U') {
                sisaTenaga--;
            } else if (langkah == 'D') {
                sisaTenaga--;
            } else {
                jalurBenar = false;
                break;
            }

            if (sisaTenaga < 0) {
                break;
            }
        }

        if (sisaTenaga >= 0 && istirahatTepat && jalurBenar) {
            System.out.println(
                    "Selamat Pendakian anda berhasil mencapai Puncak Mahameru, sisa tenaga anda " + sisaTenaga);
        } else if (!istirahatTepat) {
            System.out.println("Mohon maaf, istirahat hanya diperbolehkan di Pos-pos yang tersedia");
        } else if (!jalurBenar) {
            System.out.println("Jalur anda salah, anda masuk ke jurang/blank 45");
        } else {
            System.out.println(
                    "Jalur anda benar, tapi tenaga anda tidak akan kuat, coba jalur lain atau sempatkan istirahat terlebih dahulu");
        }

        scanner.close();
    }
}
