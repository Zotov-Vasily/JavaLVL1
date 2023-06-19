package Day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Airbus", 2015, 35, 40000);
        airplane.setYear(2012);
        airplane.setLength(32);

        airplane.fillUp(1200);
        airplane.fillUp(3600);

        airplane.info();

    }
}
