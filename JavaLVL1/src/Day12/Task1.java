package Day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        List<String> cars = new ArrayList<>();
        cars.add("Lada");
        cars.add("Volvo");
        cars.add("Renault");
        cars.add("Mercedes");
        cars.add("Audi");
        System.out.println(cars);

        cars.add(2, "Honda");
        cars.remove(0);
        System.out.println(cars);
    }
}
