package ru.samsung.itschool.mdev;

public class Mage extends Unit {

    int mana;


    public Mage(String name, int health, int mana) {
        super(name, health);
        this.mana = mana;
    }

    void out() {
        super.out();
        System.out.println("Мана: " + mana);

    }
}
