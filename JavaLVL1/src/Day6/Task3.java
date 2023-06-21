package Day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Гусев Геннадий Анатольевич", "Информационные упровляющие технологии");
        Student student = new Student("Ховрин Андрей Юрьевич");

        teacher.evaluate(student);
    }
}
