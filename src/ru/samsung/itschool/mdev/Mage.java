package ru.samsung.itschool.mdev;

public class Mage {
    int hp_m;
    String name_m;
    int mana;

    public Mage(String name, int hp, int mana) {
        this.name_m = name;
        this.hp_m = hp;
        this.mana = mana;
    }

    public void print_all() {
        System.out.println("Name: " + name_m);
        System.out.println("Health: " + hp_m);
        System.out.println("Mana: " + mana);
    }

}
