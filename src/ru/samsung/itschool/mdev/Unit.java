package ru.samsung.itschool.mdev;

import java.util.Arrays;

public class Unit {
    int hp;
    String name;

    public Unit(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public void print_all() {
        System.out.println("Name: " + name);
        System.out.println("Health: " + hp);
    }
}