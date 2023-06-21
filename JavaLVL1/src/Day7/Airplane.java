package Day7;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;
    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public int getLength() {
        return length;
    }

    public void info() {
        System.out.println("������������: " + producer + ", ��� �������: " + year + ", �����: " + length + ", ���: "+
                weight + ", ����� ������� � ����: " + fuel);
    }
    public void fillUp(int inputFuel) {
        fuel += inputFuel;
    }
    public void setProducer(String producer) {
        this.producer = producer;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public static void compareAirplanes(Airplane airplane1, Airplane airplane2) {
        if (airplane1.getLength() > airplane2.getLength()) {
            System.out.println("������ ������� �������");
        } else if (airplane1.getLength() < airplane2.getLength()) {
            System.out.println("������ ������� �������");
        } else {
            System.out.println("����� ��������� �����");
        }
    }
}
