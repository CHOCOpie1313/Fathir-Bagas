import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class BusTicketCalculator2 {
    public static void main(String[] args) {
        ArrayList<String> kota = new ArrayList<>();
        kota.add("Sukabumi");
        kota.add("Cianjur");
        kota.add("Bandung");
        kota.add("Garut");
        kota.add("Tasik");
        kota.add("Ciamis");
        kota.add("Banjar");

        HashMap<String, Integer> tarif = new HashMap<>();
        tarif.put("Sukabumi-Cianjur", 10000);
        tarif.put("Cianjur-Bandung", 15000);
        tarif.put("Bandung-Garut", 75000);
        tarif.put("Garut-Tasik", 50000);
        tarif.put("Tasik-Ciamis", 75000);
        tarif.put("Ciamis-Banjar", 60000);

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan kota keberangkatan: ");
            String keberangkatan = scanner.nextLine();
            System.out.print("Masukkan kota tujuan: ");
            String tujuan = scanner.nextLine();

            if (!kota.contains(keberangkatan) || !kota.contains(tujuan)) {
                System.out.println("Kota keberangkatan atau tujuan tidak valid.");
                return;
            }

            int indexKeberangkatan = kota.indexOf(keberangkatan);
            int indexTujuan = kota.indexOf(tujuan);
            int totalTarif = 0;
            int step = indexKeberangkatan < indexTujuan ? 1 : -1;

            while (indexKeberangkatan != indexTujuan) {
                int indexNext = indexKeberangkatan + step;
                String rute = kota.get(indexKeberangkatan) + "-" + kota.get(indexNext);
                if (!tarif.containsKey(rute)) {
                    rute = kota.get(indexNext) + "-" + kota.get(indexKeberangkatan);
                }
                totalTarif += tarif.get(rute);
                indexKeberangkatan = indexNext;
            }

            System.out.print("Apakah penumpang anggota TNI/POLRI? (ya/tidak): ");
            boolean isTniPolri = scanner.nextLine().equalsIgnoreCase("ya");
            if ((keberangkatan.equals("Sukabumi") && tujuan.equals("Banjar"))
                    || (keberangkatan.equals("Banjar") && tujuan.equals("Sukabumi"))) {
                totalTarif *= 0.95; // Diskon 5%
            }
            if (isTniPolri) {
                totalTarif *= 0.9; // Diskon 10%
            }

            System.out.println("Total tarif: Rp " + totalTarif);
        }
    }
}