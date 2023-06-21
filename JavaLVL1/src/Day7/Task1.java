package Day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Airbus", 2015, 55, 40000);
        Airplane airplane2 = new Airplane("Airbus", 2012, 45, 50000);

        Airplane.compareAirplanes(airplane1, airplane2);

    }
}
