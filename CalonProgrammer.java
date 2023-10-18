import java.util.Scanner;

public class CalonProgrammer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input nilai coding
        System.out.print("Masukan nilai coding (0-100):");
        int NilaiCoding = input.nextInt();
        // Input nilai interview
        System.out.print("Masukan nilai interview (A/B):");
        String NilaiInterview = input.next();
        // Penilaian nilai coding
        String HasilCoding;
        if (NilaiCoding > 80) {
            HasilCoding = "LULUS";
        } else if (NilaiCoding > 60) {
            HasilCoding = "DIPERTIMBANGKAN";
        } else {
            HasilCoding = "GAGAL";
        }
        // Penilaian nilai interview
        String HasilInterview;
        if (NilaiInterview.equals("A") || NilaiInterview.equals("B")) {
            HasilInterview = "LULUS";
        } else {
            HasilInterview = "GAGAL";

        }
        // Output hasil penilaian
        if (HasilCoding.equals("LULUS") && HasilInterview.equals("LULUS")) {
            System.out.println("Selamat anda berhasil menjadi calon programmer");
        } else {
            System.out.println("Maaf anda belum bisa menjadi calon programmer");
        }
        input.close();
    }
}
