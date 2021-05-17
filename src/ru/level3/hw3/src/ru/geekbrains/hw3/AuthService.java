package ru.geekbrains.hw3;



public interface AuthService {

    void start();
    String getNickByLoginPass(String login, String pass);
    void stop();
}



