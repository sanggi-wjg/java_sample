package cheat.sheet.sample.records;

import java.util.List;
import java.util.Optional;

public class RecordSample {

    record Customer(String name, String band) {
    }

    record Product(String brand, String modelName) {
    }

    record Order(Customer customer, List<Product> products) {
    }

    public static void main(String[] args) {
        List<Order> orders = getOrders();

        String bands = orders.stream()
                .map(Order::customer)
                .map(Customer::band)
                .reduce((s, s2) -> String.join(", ", s, s2))
                .orElse(null);
        System.out.println("bands = " + bands);
    }

    private static List<Order> getOrders() {
        var band1 = new Customer("Snow", "Band-1");
        var band2 = new Customer("Linkin", "Band-2");
        var band3 = new Customer("Park", "Band-3");

        var piano = new Product("SamIk", "Piano");
        var guitar = new Product("Colt", "Guitar");
        var drum = new Product("Yamaha", "Drum");
        var base = new Product("MolRu", "Base");

        return List.of(
                new Order(band1, List.of(piano)),
                new Order(band2, List.of(guitar, base)),
                new Order(band3, List.of(guitar, drum, base))
        );
    }

}
