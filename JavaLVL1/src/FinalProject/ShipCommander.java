package FinalProject;

import java.io.IOException;
import java.net.PortUnreachableException;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ShipCommander {
    private Board board1;
    private Board board2;
    private String name;

    public ShipCommander(Board board1, Board board2, String name) {
        this.board1 = board1;
        this.board2 = board2;
        this.name = name;
    }

    public Board getBoard1() {
        return board1;
    }

    public Board getBoard2() {
        return board2;
    }

    public String getName() {
        return name;
    }

    public void print(){
        System.out.println(getName() + " " + "Ваша доска");
        getBoard1().print();
        System.out.println(getName() + " " + "Доска противника");
        getBoard2().print();
    }
    public void map(){
        System.out.println("Доска противника");
        getBoard2().print();
    }
    public  int[] moveCoord(){
        System.out.println(getName() + " " + "Ваш ход");
        boolean bool = true;
        int a = 0;
        int b = 0;
        do {
            Scanner scanner1 = new Scanner(System.in);
            Scanner scanner2 = new Scanner(System.in);
            try {
                a = scanner1.nextInt();
                b = scanner2.nextInt();
                if (a > 9 || a < 0 || b > 9 || b < 0)
                    throw new PortUnreachableException();
                Ships [][] shipsArrayA1 = getBoard2().getShipArray();

                if (shipsArrayA1[a][b] != Ships.EMPTY)
                    throw new IOException();
                bool = false;

            } catch (PortUnreachableException e) {
                System.out.println("Число должно быть от 0 до 9");
            } catch (IOException e) {
                System.out.println("Такой ход уже был, попробуй снова");
            } catch (InputMismatchException e){
                System.out.println("Введите целочисленное значение!");
            }
        }
        while (bool);
        int[] moveCoord = {a,b};
        return moveCoord;
    }
    int count = 0;
    int count1 = 0;
    int count2 = 0;

    public void move(ShipCommander commander1) {
        int[] moveCoord = moveCoord();
        Ships[][] shipArray1 = getBoard2().getShipArray();
        Ships[][] shipArray2 = commander1.getBoard1().getShipArray();


        if (shipArray2[moveCoord[0]][moveCoord[1]] == Ships.SHIPS_4DECK && count < 3){
            shipArray1[moveCoord[0]][moveCoord[1]] = Ships.HIT;
            shipArray2[moveCoord[0]][moveCoord[1]] = Ships.SOS;
            System.out.println("Ранил");
            count++;
        }
        if (shipArray2[moveCoord[0]][moveCoord[1]] == Ships.SHIPS_4DECK && count == 3){
            shipArray1[moveCoord[0]][moveCoord[1]] = Ships.HIT;
            shipArray2[moveCoord[0]][moveCoord[1]] = Ships.SOS;
            System.out.println("Убил");
        }
        if (shipArray2[moveCoord[0]][moveCoord[1]] == Ships.SHIPS_3DECK && count1 < 2){
            shipArray1[moveCoord[0]][moveCoord[1]] = Ships.HIT;
            shipArray2[moveCoord[0]][moveCoord[1]] = Ships.SOS;
            System.out.println("Ранил");
            count1++;
        }
        if (shipArray2[moveCoord[0]][moveCoord[1]] == Ships.SHIPS_3DECK && count1 == 2) {
            shipArray1[moveCoord[0]][moveCoord[1]] = Ships.HIT;
            shipArray2[moveCoord[0]][moveCoord[1]] = Ships.SOS;
            System.out.println("Убил");
            count1 = 0;
        }
        if (shipArray2[moveCoord[0]][moveCoord[1]] == Ships.SHIPS_2DECK && count2 < 1) {
            shipArray1[moveCoord[0]][moveCoord[1]] = Ships.HIT;
            shipArray2[moveCoord[0]][moveCoord[1]] = Ships.SOS;
            System.out.println("Ранил");
            count2++;
        }
        if (shipArray2[moveCoord[0]][moveCoord[1]] == Ships.SHIPS_2DECK && count2 == 1) {
            shipArray1[moveCoord[0]][moveCoord[1]] = Ships.HIT;
            shipArray2[moveCoord[0]][moveCoord[1]] = Ships.SOS;
            System.out.println("Убил");
            count2 = 0;
        }
        if (shipArray2[moveCoord[0]][moveCoord[1]] == Ships.SHIPS_1DECK) {
            shipArray1[moveCoord[0]][moveCoord[1]] = Ships.HIT;
            shipArray2[moveCoord[0]][moveCoord[1]] = Ships.SOS;
            System.out.println("Убил");
        }
        if (shipArray2[moveCoord[0]][moveCoord[1]] == Ships.EMPTY || shipArray2[moveCoord[0]][moveCoord[1]] == Ships.OREOL){
            shipArray1[moveCoord[0]][moveCoord[1]] = Ships.MISSED;
            System.out.println("Промах!");
            map();
            commander1.move(this);
        }
        map();
        winner(commander1);
        move(commander1);
    }
    public static void random(ShipCommander commander1, ShipCommander commander2){
        Random random = new Random();
        int min = 1;
        int max = 2;
        int diff = max - min;
        int x = random.nextInt((diff + 1) + min);
        switch (x){
            case 1: commander1.move(commander2);
            case 2: commander2.move(commander1);
        }
    }

    private void winner(ShipCommander commander1) {
        Ships[][] shipArray = commander1.getBoard1().getShipArray();
        int c = 0;
        for (int i = 0; i < shipArray.length; i++){
            for (int j = 0; j < shipArray[i].length; j++){
                if (shipArray[i][j] == Ships.SOS){
                    c++;
                }
            }
        }
        if (c == 20){
            System.out.println(getName() + " " + "Вы победили!");
            System.exit(1);
        }
    }
}
