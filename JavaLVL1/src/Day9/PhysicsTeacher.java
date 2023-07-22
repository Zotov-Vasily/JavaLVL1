package Day9;

public class PhysicsTeacher extends Human{
    private String nameLesson;

    public PhysicsTeacher(String name, String nameLesson) {
        super(name);
        this.nameLesson = nameLesson;
    }

    public String getNameLesson() {
        return nameLesson;
    }

    public void setNameLesson(String nameLesson) {
        this.nameLesson = nameLesson;
    }
    public void printInfo(){
        super.printInfo();
        System.out.println("Этот преподаватель с именем " + super.getName());
    }
}
