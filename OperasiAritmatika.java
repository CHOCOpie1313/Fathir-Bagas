public class OperasiAritmatika {
    public static void main(String[] args) {

        // Operator aritmatika

        int bilangan1 = 170;
        int bilangan2 = 130;

        int hasilpertambahan = bilangan1 + bilangan2;
        int hasilpengurangan = bilangan1 - bilangan2;
        int hasilperkalian = bilangan1 * bilangan2;
        int hasilpembagian = bilangan1 / bilangan2;
        int hasilmodulus = bilangan1 % bilangan2;

        // Menampilkan hasil operasi aritmatika diatas

        System.out.println("hasil pertambahan dari " + bilangan1 + " dan " + bilangan2 + " adalah " + hasilpertambahan);
        System.out.println("hasil pengurangan dari " + bilangan1 + " dan " + bilangan2 + " adalah " + hasilpengurangan);
        System.out.println("hasil perkalian dari " + bilangan1 + " dan " + bilangan2 + " adalah " + hasilperkalian);
        System.out.println("hasil pembagian dari " + bilangan1 + " dan " + bilangan2 + " adalah " + hasilpembagian);
        System.out.println("hasil modulus dari " + bilangan1 + " dan " + bilangan2 + " adalah" + hasilmodulus);
    }
}
