import java.util.ArrayList;
import java.util.Scanner;

class BusRoute {
    private String departureCity;
    private String destinationCity;
    private double baseFare;

    public BusRoute(String departureCity, String destinationCity, double baseFare) {
        this.departureCity = departureCity;
        this.destinationCity = destinationCity;
        this.baseFare = baseFare;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public double getBaseFare() {
        return baseFare;
    }
}

public class BusTicketCalculator {
    private static final double DISCOUNT_PERCENTAGE = 0.05;
    private static final double MILITARY_DISCOUNT = 0.10;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<BusRoute> routes = initializeRoutes();

            System.out.print("Masukkan kota keberangkatan: ");
            String departureCity = scanner.nextLine();

            // Validasi Kota Keberangkatan
            if (!isValidCity(departureCity)) {
                System.out.println("Kota keberangkatan tidak valid.");
                return;
            }

            System.out.print("Masukkan kota tujuan: ");
            String destinationCity = scanner.nextLine();

            // Validasi Kota Tujuan
            if (!isValidCity(destinationCity)) {
                System.out.println("Kota tujuan tidak valid.");
                return;
            }

            double totalFare = calculateFare(routes, departureCity, destinationCity);

            // Diskon 5% jika keberangkatan dari Sukabumi ke Banjar atau sebaliknya
            if ((departureCity.equalsIgnoreCase("Sukabumi") && destinationCity.equalsIgnoreCase("Banjar")) ||
                    (departureCity.equalsIgnoreCase("Banjar") && destinationCity.equalsIgnoreCase("Sukabumi"))) {
                totalFare -= totalFare * DISCOUNT_PERCENTAGE;
            }

            System.out.print("Apakah penumpang anggota TNI/POLRI? (ya/tidak): ");
            String militaryStatus = scanner.nextLine();

            // Diskon 10% untuk anggota TNI/POLRI
            if (militaryStatus.equalsIgnoreCase("ya")) {
                totalFare -= totalFare * MILITARY_DISCOUNT;
            }

            System.out.println("Total tarif yang harus dibayar: " + totalFare);
        }
    }

    private static ArrayList<BusRoute> initializeRoutes() {
        ArrayList<BusRoute> routes = new ArrayList<>();
        routes.add(new BusRoute("Sukabumi", "Cianjur", 10000));
        routes.add(new BusRoute("Cianjur", "Bandung", 15000));
        routes.add(new BusRoute("Bandung", "Garut", 7500));
        routes.add(new BusRoute("Garut", "Tasik", 5000));
        routes.add(new BusRoute("Tasik", "Ciamis", 7500));
        routes.add(new BusRoute("Ciamis", "Banjar", 6000));
        return routes;
    }

    private static boolean isValidCity(String city) {
        String[] validCities = { "Sukabumi", "Cianjur", "Bandung", "Garut", "Tasik", "Ciamis", "Banjar" };
        for (String validCity : validCities) {
            if (city.equalsIgnoreCase(validCity)) {
                return true;
            }
        }
        return false;
    }

    private static double calculateFare(ArrayList<BusRoute> routes, String departureCity, String destinationCity) {
        for (BusRoute route : routes) {
            if (route.getDepartureCity().equalsIgnoreCase(departureCity) &&
                    route.getDestinationCity().equalsIgnoreCase(destinationCity)) {
                return route.getBaseFare();
            }
        }
        return 0; // Jika rute tidak ditemukan, kembalikan nilai 0
    }
}