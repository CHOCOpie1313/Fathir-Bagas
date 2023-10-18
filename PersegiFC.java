import java.util.Scanner;

public class PersegiFC {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Masukkan nomor punggung pemain: ");
            int NomorPunggung = input.nextInt();
            // bersihkan newline
            String Posisi = "";
            if (NomorPunggung % 2 == 0) {
                if (NomorPunggung >= 50 && NomorPunggung <= 100) {
                    Posisi = "Captain";
                } else {
                    Posisi = "Target Ataccker";
                }
            } else {
                if (NomorPunggung % 3 == 0 && NomorPunggung % 5 == 0) {
                    Posisi = "Keeper";
                } else if (NomorPunggung > 90) {
                    Posisi = "Playmaker";
                } else {
                    Posisi = "Defender";
                }
            }
            System.out.println("Posisi pemain: " + Posisi);
        }
    }
}
