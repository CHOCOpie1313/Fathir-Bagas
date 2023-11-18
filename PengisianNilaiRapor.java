import java.util.Scanner;

public class PengisianNilaiRapor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double nilaiBiologi, nilaiFisika, nilaiBahasaInggris, nilaiMatematika;

        System.out.print("Masukan nilai Biologi: ");
        nilaiBiologi = scanner.nextDouble();
        System.out.print("Masukan nilai fisika: ");
        nilaiFisika = scanner.nextDouble();
        System.out.print("Masukan nilai Bahasa Inggris: ");
        nilaiBahasaInggris = scanner.nextDouble();
        System.out.print("Masukan nilai Matematika ");
        nilaiMatematika = scanner.nextDouble();

        // Menampilkan nilai

        System.out.println("nNilai Rapor: ");
        System.out.println("Biologi: " + nilaiBiologi);
        System.out.println("Fisika: " + nilaiFisika);
        System.out.println("Bahasa Inggris: " + nilaiBahasaInggris);
        System.out.println("Matematika: " + nilaiMatematika);

        scanner.close();
    }
}
