package ru.geekbrains.lesson3;

import java.util.*;

public class Main {
    public static void main(String[] args){
        List<String> words = Arrays.asList(
                "Mercedes", "BMW", "Audi", "Bently", "Volkswagen",
                "Opel", "Subaru", "Volvo", "Bently", "Volkswagen",
                "BMW", "Audi", "Bently", "Subaru", "Subaru",
                "Audi", "Bently", "Subaru", "Subaru", "Bently"
        );

        Set<String> unique = new HashSet<String>(words);

        System.out.println("Первоначальный массив");
        System.out.println(words.toString());
        System.out.println("Уникальные слова");
        System.out.println(unique.toString());
        System.out.println("Частота встречаемости слов");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }
    }
}