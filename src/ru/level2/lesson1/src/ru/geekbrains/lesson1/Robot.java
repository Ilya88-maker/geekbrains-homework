package ru.geekbrains.lesson1;

public  class Robot extends Animate implements Runnable, Jumpable {

    public Robot(String name) {
        super(name);

    }
        @Override
        public void run () {
            System.out.println("Бежит");
        }

        @Override
        public void jump () {
            System.out.println("Прыгает");
        }
    }
