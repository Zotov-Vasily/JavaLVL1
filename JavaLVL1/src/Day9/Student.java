package Day9;

public class Student extends Human{

    private String nameGroup;

    public Student(String name, String nameGroup) {
        super(name);
        this.nameGroup = nameGroup;
    }

    public String getNameGroup() {
        return nameGroup;
    }

    public void setNameGroup() {
        this.nameGroup = nameGroup;
    }
    public void printInfo(){
        super.printInfo();
        System.out.println("Этот студент с именем " + super.getName());
    }
}
