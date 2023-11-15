package FinalProject;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Ships[][] shipArrayEmpty1 = shipArrayEmpty();
        Ships[][] shipArrayEmpty2 = shipArrayEmpty();
        Ships[][] shipArrayEmpty3 = shipArrayEmpty();
        Ships[][] shipArrayEmpty4 = shipArrayEmpty();

        Board board1 = new Board(shipArrayEmpty1);
        Board board2 = new Board(shipArrayEmpty2);
        ShipCommander commander1 = new ShipCommander(board1, board2, "Командир №1");

        Board board3 = new Board(shipArrayEmpty3);
        Board board4 = new Board(shipArrayEmpty4);
        ShipCommander commander2 = new ShipCommander(board3, board4, "Командир №2");


        int[] array = getCoord_4deck(commander1);
        addShip4deck(array, shipArrayEmpty1);
        addOreol(array, shipArrayEmpty1);

        for (int i = 0; i < 2; i++){
            int[] array1 = getCoord_3deck(commander1);
            int[] array2 = addShip3deck(array1, shipArrayEmpty1, commander1);
            addOreol(array2, shipArrayEmpty1);
        }

        for (int i = 0; i < 3; i++){
            int[] array1 = getCoord_2deck(commander1);
            int[] array2 = addShip2deck(array1, shipArrayEmpty1, commander1);
            addOreol(array2, shipArrayEmpty1);
        }

        for (int i = 0; i < 4; i++){
            int[] array1 = getCoord_1deck(commander1);
            int[] array2 = addShip1deck(array1, shipArrayEmpty1, commander1);
            addOreol(array2, shipArrayEmpty1);
        }

        commander1.print();

        int[] arrayS = getCoord_4deck(commander2);
        addShip4deck(array, shipArrayEmpty3);
        addOreol(array, shipArrayEmpty3);

        for (int i = 0; i < 2; i++){
            int[] array1 = getCoord_3deck(commander2);
            int[] array2 = addShip3deck(array1, shipArrayEmpty3, commander2);
            addOreol(array2, shipArrayEmpty3);
        }

        for (int i = 0; i < 3; i++){
            int[] array1 = getCoord_2deck(commander2);
            int[] array2 = addShip2deck(array1, shipArrayEmpty3, commander2);
            addOreol(array2, shipArrayEmpty3);
        }

        for (int i = 0; i < 4; i++){
            int[] array1 = getCoord_1deck(commander2);
            int[] array2 = addShip1deck(array1, shipArrayEmpty3, commander2);
            addOreol(array2, shipArrayEmpty3);
        }

        commander1.print();

        ShipCommander.random(commander1, commander2);

    }

    private static Ships[][] shipArrayEmpty() {
        Ships[][] shipArrayEmpty = new Ships[10][10];
        for (int i = 0; i < shipArrayEmpty.length; i++){
            for (int j = 0; j < shipArrayEmpty[i].length; j++){
                shipArrayEmpty[i][j] = Ships.EMPTY;
            }
        }
        return shipArrayEmpty;
    }

    public static int[] getCoord_4deck(ShipCommander commander) {
        boolean bool = true;
        int[] array = new int[8];
        do {
            try {
                System.out.println(commander.getName() + " введите координаты 4-палубного корабля в формате x1,y1;x2,y2;x3,y3;x4,y4");
                Scanner scanner = new Scanner(System.in);
                String line = scanner.nextLine();
                String[] mas = line.split(";");
                if (mas.length != 4) {
                    throw new RuntimeException();
                }
                int count = 0;
                for (int i = 0; i < mas.length; i++) {
                    String[] mas2 = mas[i].split(",");
                    if (mas2.length != 2)
                        throw new ExceptionValid1();
                    for (int j = 0; j < mas2.length; j++)
                        if (Integer.parseInt(mas2[j]) >= 0 && Integer.parseInt(mas2[j]) <= 9)
                            array[count++] = Integer.parseInt(mas2[j]);
                        else throw new IOException();
                }

                int valid = 0;
                boolean vertical;
                for (int i = 0; i < array.length; i++) {
                    if (array[1] == array[3] && array[3] == array[5] && array[5] == array[7])
                        vertical = true;
                    else vertical = false;
                    if (vertical) {
                        int a = array[0] + array[1];
                        int b = array[6] + array[7];
                        if (b - a == 3) {
                            valid = 1;
                        } else valid = 2;
                    }
                }
                boolean horizontal;
                for (int i = 0; i < array.length; i++) {
                    if (array[0] == array[2] && array[2] == array[4] && array[4] == array[6])
                        horizontal = true;
                    else horizontal = false;
                    if (horizontal = true) {
                        int a = array[0] + array[1];
                        int b = array[6] + array[7];
                        if ((b - a) == 3) {
                            valid = 1;
                        } else valid = 2;
                    }
                }
                if (valid == 2) {
                    throw new ExceptionValid2();
                }
                bool = false;
            }
            catch (RuntimeException e) {
            System.out.println("Некорректный разделитель между парами координат или их количество");
            }
            catch (ExceptionValid1 e) {
            System.out.println("Некорректный разделитель между значениями координат или их количество");
            }
            catch (IOException e) {
            System.out.println("Некорректные значения координат (значения могут быть от 0 до 9)");
            }
            catch (ExceptionValid2 e) {
            System.out.println("Некорректный корабль, координаты идут непоследовательно");
            }
        } while (bool);

        return array;
    }

    public static void addShip4deck(int[] array, Ships[][] shipArrayEmpty){
        for (int i = 0; i < array.length - 1; i += 2){
            for (int j = i + 1; j < i + 2; j++){
                shipArrayEmpty[array[i]][array[j]] = Ships.SHIPS_4DECK;
            }
        }
    }

    public static void addOreol(int[] array, Ships[][] shipArrayEmpty){
        for (int i = 0; i < array.length - 1; i += 2){
            for (int j = i + 1; j < i + 2; j++){
                if (array[i] - 1 >= 0 && array[i] - 1 < 10 && array[j] - 1 >= 0 && array[j] - 1 < 10 &&
                shipArrayEmpty[array[i] - 1][array[j] - 1] == Ships.EMPTY)
                    shipArrayEmpty[array[i] - 1][array[j] - 1] = Ships.OREOL;
                else continue;
            }
        }
        for (int i = 0; i < array.length - 1; i += 2){
            for (int j = i + 1; j < i + 2; j++){
                if (array[i] - 1 >= 0 && array[i] - 1 < 10 && array[j] >= 0 && array[j] < 10 &&
                        shipArrayEmpty[array[i] - 1][array[j]] == Ships.EMPTY)
                    shipArrayEmpty[array[i] - 1][array[j]] = Ships.OREOL;
                else continue;
            }
        }
        for (int i = 0; i < array.length - 1; i += 2){
            for (int j = i + 1; j < i + 2; j++){
                if (array[i] - 1 >= 0 && array[i] - 1 < 10 && array[j] + 1 >= 0 && array[j] + 1 < 10 &&
                        shipArrayEmpty[array[i] - 1][array[j] + 1] == Ships.EMPTY)
                    shipArrayEmpty[array[i] - 1][array[j] + 1] = Ships.OREOL;
                else continue;
            }
        }
        for (int i = 0; i < array.length - 1; i += 2){
            for (int j = i + 1; j < i + 2; j++){
                if (array[i] >= 0 && array[i] < 10 && array[j] + 1 >= 0 && array[j] + 1 < 10 &&
                        shipArrayEmpty[array[i]][array[j] + 1] == Ships.EMPTY)
                    shipArrayEmpty[array[i]][array[j] + 1] = Ships.OREOL;
                else continue;
            }
        }
        for (int i = 0; i < array.length - 1; i += 2){
            for (int j = i + 1; j < i + 2; j++){
                if (array[i] >= 0 && array[i] < 10 && array[j] - 1 >= 0 && array[j] - 1 < 10 &&
                        shipArrayEmpty[array[i]][array[j] - 1] == Ships.EMPTY)
                    shipArrayEmpty[array[i]][array[j] - 1] = Ships.OREOL;
                else continue;
            }
        }
        for (int i = 0; i < array.length - 1; i += 2){
            for (int j = i + 1; j < i + 2; j++){
                if (array[i] + 1 >= 0 && array[i] + 1 < 10 && array[j] >= 0 && array[j] < 10 &&
                        shipArrayEmpty[array[i] + 1][array[j]] == Ships.EMPTY)
                    shipArrayEmpty[array[i] + 1][array[j]] = Ships.OREOL;
                else continue;
            }
        }
        for (int i = 0; i < array.length - 1; i += 2){
            for (int j = i + 1; j < i + 2; j++){
                if (array[i] + 1 >= 0 && array[i] + 1 < 10 && array[j] - 1 >= 0 && array[j] - 1 < 10 &&
                        shipArrayEmpty[array[i] + 1][array[j] - 1] == Ships.EMPTY)
                    shipArrayEmpty[array[i] + 1][array[j] - 1] = Ships.OREOL;
                else continue;
            }
        }
        for (int i = 0; i < array.length - 1; i += 2){
            for (int j = i + 1; j < i + 2; j++){
                if (array[i] + 1 >= 0 && array[i] + 1 < 10 && array[j] + 1 >= 0 && array[j] + 1 < 10 &&
                        shipArrayEmpty[array[i] + 1][array[j] + 1] == Ships.EMPTY)
                    shipArrayEmpty[array[i] + 1][array[j] + 1] = Ships.OREOL;
                else continue;
            }
        }
    }

    public static int[] getCoord_3deck(ShipCommander commander) {
        boolean bool = true;
        int[] array = new int[6];
        do {
            try {
                System.out.println(commander.getName() + " введите координаты 3-палубного корабля в формате x1,y1;x2,y2;x3,y3");
                Scanner scanner = new Scanner(System.in);
                String line = scanner.nextLine();
                String[] mas = line.split(";");
                if (mas.length != 3) {
                    throw new RuntimeException();
                }
                int count = 0;
                for (int i = 0; i < mas.length; i++) {
                    String[] mas2 = mas[i].split(",");
                    if (mas2.length != 2)
                        throw new ExceptionValid1();
                    for (int j = 0; j < mas2.length; j++)
                        if (Integer.parseInt(mas2[j]) >= 0 && Integer.parseInt(mas2[j]) <= 9)
                            array[count++] = Integer.parseInt(mas2[j]);
                        else throw new IOException();
                }

                int valid = 0;
                boolean vertical;
                for (int i = 0; i < array.length; i++) {
                    if (array[1] == array[3] && array[3] == array[5])
                        vertical = true;
                    else vertical = false;
                    if (vertical) {
                        int a = array[0] + array[1];
                        int b = array[4] + array[5];
                        if (b - a == 2) {
                            valid = 1;
                        } else valid = 2;
                    }
                }
                boolean horizontal;
                for (int i = 0; i < array.length; i++) {
                    if (array[0] == array[2] && array[2] == array[4])
                        horizontal = true;
                    else horizontal = false;
                    if (horizontal = true) {
                        int a = array[0] + array[1];
                        int b = array[4] + array[5];
                        if ((b - a) == 2) {
                            valid = 1;
                        } else valid = 2;
                    }
                }
                if (valid == 2) {
                    throw new ExceptionValid2();
                }bool = false;
            }
            catch (RuntimeException e) {
                System.out.println("Некорректный разделитель между парами координат или их количество");
            }
            catch (ExceptionValid1 e) {
                System.out.println("Некорректный разделитель между значениями координат или их количество");
            }
            catch (IOException e) {
                System.out.println("Некорректные значения координат (значения могут быть от 0 до 9)");
            }
            catch (ExceptionValid2 e) {
                System.out.println("Некорректный корабль, координаты идут непоследовательно");
            }} while (bool);
        return array;
    }

    public static int[] addShip3deck(int[] array, Ships[][] shipArrayEmpty, ShipCommander commander){
        boolean bool = true;
        do {
            try {
                for (int i = 0; i < array.length - 1; i += 2) {
                    for (int j = i + 1; j < i + 2; j++) {
                        if (shipArrayEmpty[array[i]][array[j]] == Ships.EMPTY)
                            shipArrayEmpty[array[i]][array[j]] = Ships.SHIPS_3DECK;
                        else throw new RuntimeException();
                    }
                }
                bool = false;
            } catch (RuntimeException e) {
                System.out.println("Координаты заняты, попробуйте снова");
                array = getCoord_3deck(commander);
            }
            }while (bool);
            return array;
    }

    public static int[] getCoord_2deck(ShipCommander commander) {
        boolean bool = true;
        int[] array = new int[4];
        do {
            try {
                System.out.println(commander.getName() + " введите координаты 2-палубного корабля в формате x1,y1;x2,y2");
                Scanner scanner = new Scanner(System.in);
                String line = scanner.nextLine();
                String[] mas = line.split(";");
                if (mas.length != 2) {
                    throw new RuntimeException();
                }
                int count = 0;
                for (int i = 0; i < mas.length; i++) {
                    String[] mas2 = mas[i].split(",");
                    if (mas2.length != 2)
                        throw new ExceptionValid1();
                    for (int j = 0; j < mas2.length; j++)
                        if (Integer.parseInt(mas2[j]) >= 0 && Integer.parseInt(mas2[j]) <= 9)
                            array[count++] = Integer.parseInt(mas2[j]);
                        else throw new IOException();
                }

                int valid = 0;
                boolean vertical;
                for (int i = 0; i < array.length; i++) {
                    if (array[1] == array[3])
                        vertical = true;
                    else vertical = false;
                    if (vertical) {
                        int a = array[0] + array[1];
                        int b = array[2] + array[3];
                        if (b - a == 1) {
                            valid = 1;
                        } else valid = 2;
                    }
                }
                boolean horizontal;
                for (int i = 0; i < array.length; i++) {
                    if (array[0] == array[2])
                        horizontal = true;
                    else horizontal = false;
                    if (horizontal = true) {
                        int a = array[0] + array[1];
                        int b = array[2] + array[1];
                        if ((b - a) == 1) {
                            valid = 1;
                        } else valid = 2;
                    }
                }
                if (valid == 2) {
                    throw new ExceptionValid2();
                }bool = false;

            }
            catch (RuntimeException e) {
                System.out.println("Некорректный разделитель между парами координат или их количество");
            }
            catch (ExceptionValid1 e) {
                System.out.println("Некорректный разделитель между значениями координат или их количество");
            }
            catch (IOException e) {
                System.out.println("Некорректные значения координат (значения могут быть от 0 до 9)");
            }
            catch (ExceptionValid2 e) {
                System.out.println("Некорректный корабль, координаты идут непоследовательно");
            }} while (bool);

        return array;
    }

    public static int[] addShip2deck(int[] array, Ships[][] shipArrayEmpty, ShipCommander commander){
        boolean bool = true;
        do {
            try {
                for (int i = 0; i < array.length - 1; i += 2) {
                    for (int j = i + 1; j < i + 2; j++) {
                        if (shipArrayEmpty[array[i]][array[j]] == Ships.EMPTY)
                            shipArrayEmpty[array[i]][array[j]] = Ships.SHIPS_2DECK;
                        else throw new RuntimeException();
                    }
                }
                bool = false;
            } catch (RuntimeException e) {
                System.out.println("Координаты заняты, попробуйте снова");
                array = getCoord_2deck(commander);
            }
        }while (bool);
        return array;
    }

    public static int[] getCoord_1deck(ShipCommander commander){
        boolean bool = true;
        int[] array = new int[2];
        do {
            try {
                System.out.println(commander.getName() + " введите координаты 1-палубного корабля в формате x1,y1");
                Scanner scanner = new Scanner(System.in);
                String line = scanner.nextLine();
                String[] mas = line.split(",");
                if (mas.length != 2)
                    throw new RuntimeException("");
                int count = 0;
                for (int i = 0; i < array.length; i++) {
                    if (Integer.parseInt(mas[i]) >= 0 && Integer.parseInt(mas[i]) <= 9)
                        array[count++] = Integer.parseInt(mas[i]);
                    else throw new IOException();
                    bool = false;
                }
            } catch (RuntimeException e) {
                System.out.println("Некорректный разделитель между координатами или их количество");
            } catch (IOException e) {
                System.out.println("Некорректные значения координат (значения могут быть от 0 до 9)");
            }
            }while (bool);
        return array;
        }

    public static int[] addShip1deck(int[] array, Ships[][] shipArrayEmpty, ShipCommander commander){
        boolean bool = true;
        do {
            try {
                for (int i = 0; i < array.length - 1; i += 2) {
                    for (int j = i + 1; j < i + 2; j++) {
                        if (shipArrayEmpty[array[i]][array[j]] == Ships.EMPTY)
                            shipArrayEmpty[array[i]][array[j]] = Ships.SHIPS_1DECK;
                        else throw new RuntimeException();
                    }
                }
                bool = false;
            } catch (RuntimeException e) {
                System.out.println("Координаты заняты, попробуйте снова");
                array = getCoord_1deck(commander);
            }
        }while (bool);
        return array;
    }
}

