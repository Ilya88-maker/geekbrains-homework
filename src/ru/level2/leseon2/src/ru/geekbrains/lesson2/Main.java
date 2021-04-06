package ru.geekbrains.lesson2;

public class Main {

    public static void main(String[] args) {
        int counter = 1;
        int[][] table = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                table[i][j] = counter;


            }
        }
    }
}