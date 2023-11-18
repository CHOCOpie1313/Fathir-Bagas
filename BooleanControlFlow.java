public class BooleanControlFlow {
    public static void main(String[] args) {

        int bilangan = 10;

        boolean kondisi1 = bilangan > 40;
        boolean kondisi2 = bilangan < 60;

        if (kondisi1 && kondisi2) {
            System.out.println("angka berada diantara 40 dan 60");
        } else if (!kondisi1) {
            System.out.println("angka kurang dari atau sama dengan 10");
        } else {
            System.out.println("angka lebih besar dari atau sama dengan 60");
        }
    }
}
