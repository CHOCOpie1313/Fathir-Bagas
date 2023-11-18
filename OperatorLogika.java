public class OperatorLogika {
    public static void main(String[] args) {

        int umur = 17;
        boolean izinDariOrangTua = false;

        izinDariOrangTua = (umur < 18) || (umur >= 18 && umur < 21);

        if (izinDariOrangTua) {
            System.out.println("menapatkan izin dari orang tua.");
        } else {
            System.out.println("tidak mendapatkan izin dari orang tua.");
        }
    }
}
