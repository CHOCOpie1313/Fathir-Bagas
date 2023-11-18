import java.util.Scanner;

public class ByteExampel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan nilai byte: ");

        byte inputByte = scanner.nextByte();

        System.out.println("nilai byte yang dimasukan: " + inputByte);

        scanner.close();
    }
}
