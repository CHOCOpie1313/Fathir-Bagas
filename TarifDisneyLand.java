import java.util.Scanner;

public class TarifDisneyLand {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Masukan umur anak (dalam tahun): ");
            int umur = input.nextInt();

            if (umur < 1) {
                System.out.println("Dilarang masuk");
            } else {
                int tarif = 0;
                System.out.println("Masukan tinggi anak (dalam cm): ");
                int tinggi = input.nextInt();
                if (umur < 3) {
                    tarif = 30000;
                    if (umur == 2 && tinggi > 70) {
                        tarif += 1000000;

                    }
                } else if (umur < 7) {
                    tarif = 40000;
                    if (umur >= 4 && tinggi > 120) {
                        tarif += 15000;
                    }
                } else if (umur < 10) {
                    tarif = 50000;
                    if (umur >= 8 && tinggi > 150) {
                        tarif += 20000;

                    }
                } else {
                    tarif = 80000;
                }
                System.out.println("Tarif harga untuk anak: " + umur + "tahun dengan tinggi: " + tinggi
                        + "cm adalah: Rp: " + tarif);
            }
        }
    }
}
