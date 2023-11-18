import java.util.Scanner;

public class VolumeTabung {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final double PI = 3.14159;

        System.out.print("Masukan jari jari tabung: ");
        double jarijari = scanner.nextDouble();

        System.out.println("Masukan tinggi tabung: ");
        double tinggi = scanner.nextDouble();

        double volume = PI * jarijari * tinggi;

        System.out.println("Volume tabung adalah: " + volume);

        scanner.close();
    }
}
