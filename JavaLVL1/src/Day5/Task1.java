package Day5;

public class Task1 {
    public static void main(String[] args){
        Car car = new Car();
        car.setColor("red");
        car.setModel("renault");
        car.setYear(2007);

        System.out.println("Out car: " + car.getModel() + " model " + car.getYear() + " year " + car.getColor() + " color ");


    }
}
