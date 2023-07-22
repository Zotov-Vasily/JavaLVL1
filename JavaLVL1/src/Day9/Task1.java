package Day9;


public class Task1 {
    public static void main(String[] args) {

        Student student = new Student("Андрюха", "Физико-математическая");
        PhysicsTeacher teacher = new PhysicsTeacher("Богдан Васильевич", "Физика");

        System.out.println(student.getNameGroup());
        System.out.println(teacher.getName());
        System.out.println();
        student.printInfo();
        teacher.printInfo();


    }
}
