import java.io.PrintStream;
import java.util.Scanner;

public class MafiaDetection {
    private static PrintStream out = System.out;

    /**
     * @param args
     */
    /*
     * Nama: Muhammad Fathir Bagas
     * Kelas: TI23A
     * NIM: 20230040126
     */
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Nama: ");
            String nama = input.nextLine();
            System.out.print("Umur: ");
            int umur = input.nextInt();
            input.nextLine(); // besihkan newline
            System.out.print("Tempat Tinggal: ");
            String TempatTinggal = input.nextLine();
            out.print("Uang Tabungan Dalam $: ");
            double uangTabungan = input.nextDouble();

            String pangkat = "";

            input.close();

            if ((umur >= 40) && (TempatTinggal.equals("Nevada")) || (TempatTinggal.equals("New York"))
                    || (TempatTinggal.equals("Havana")) && (uangTabungan <= 10_000_000)) {
                pangkat = "Don";
            } else if ((umur >= 25 && umur <= 40) && (TempatTinggal.equals("New Jersey"))
                    || (TempatTinggal.equals("Manhattan"))
                    || (TempatTinggal.equals("Nevada")) && (uangTabungan >= 1_000_000 && uangTabungan <= 2_000_000)) {
                pangkat = "Underboss";
            } else if ((umur >= 18 && umur <= 24) && (TempatTinggal.equals("California"))
                    || (TempatTinggal.equals("Detroit"))
                    || (TempatTinggal.equals("Boston")) && (uangTabungan < (1_000_000))) {
                pangkat = "Capo";
            }
            if (!pangkat.isEmpty()) {
                System.out.println(nama + " kemungkinan adalah seorang anggota mafia dengan pangkat " + pangkat + ".");
            } else {
                System.out.println(nama + " tidak mencurigakan.");

            }
        }
    }
}
