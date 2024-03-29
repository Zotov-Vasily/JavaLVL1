package Day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        System.out.println(parseFileToObjList());
    }

    public static List<Person> parseFileToObjList(){


        File file = new File("People");
        List<Person> people = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();


                String[] person = line.split(" ");

                if (Integer.parseInt(person[1]) < 0)
                    throw new IllegalAccessException();

                Person curentPerson = new Person(person[0], Integer.parseInt(person[1]));
                people.add(curentPerson);

            }
            scanner.close();
            return people;
        }catch (FileNotFoundException e){
            throw new RuntimeException("Файл не найден");
        }catch (IllegalAccessException e){
            throw new RuntimeException("Некоректный входной файл");
        }
    }
}

