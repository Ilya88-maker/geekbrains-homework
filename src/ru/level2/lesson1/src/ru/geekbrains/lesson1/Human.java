package ru.geekbrains.lesson1;

public class Human extends Animate implements Runnable, Jumpable {

    public Human(String name){
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Вася бежит");
    }

    @Override
    public void jump() {
        System.out.println("Вася прыгает");
    }

}
