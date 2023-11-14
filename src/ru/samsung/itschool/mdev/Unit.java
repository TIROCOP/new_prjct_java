package ru.samsung.itschool.mdev;

import java.util.Scanner;

public class Unit {
    String name;
    int health;


    public Unit(String name, int i) {
        this.name = name;
        this.health = i;
    }

    public Unit (Unit unit) {
        this.name = unit.name;
        this.health = unit.health;
    }

    void out() {
        System.out.println("Имя: " + name);
        System.out.println("Здоровье: " + health);
    }
}
