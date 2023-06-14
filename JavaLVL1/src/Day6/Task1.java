package Day6;


public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("red");
        car.setModel("renault");
        car.setYear(2021);
        //System.out.println("Out car: " + car.getModel() + " model " + car.getYear() + " year " + car.getColor() + " color ");

        Motorbike motorbike = new Motorbike(2022, "ducati", "black");

        car.info();
        motorbike.info();

        System.out.println(car.yearDifference(2000));
        System.out.println(motorbike.yearDifference(2006));





    }
}
