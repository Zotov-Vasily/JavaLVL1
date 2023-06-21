package Day6;

import java.util.Random;

public class Teacher {
    private String fio;
    private String subject;

    public Teacher(String fio, String subject) {
        this.fio = fio;
        this.subject = subject;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    public void evaluate(Student student){
        Random random = new Random();
        int randomValue = random.nextInt(4) + 2;

        String evaluation = "";
        switch (randomValue){
            case 2:evaluation = "�������������������";
                break;
            case 3:evaluation = "�����������������";
                break;
            case 4:evaluation = "������";
                break;
            case 5:evaluation = "�������";
                break;
        }

        System.out.println("������������� " + this.fio + " ������ �������� � ������ " + student.getFio() +
                " �� �������� " + this.subject + " �� ������ " + evaluation);
    }
}
