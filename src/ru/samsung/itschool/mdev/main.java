package ru.samsung.itschool.mdev;

public class main {
    public static void main(String[] args) {

        Unit unit = new Unit("Воин", 120);
        Mage mage = new Mage("Маг", 120, 100);
        unit.out();
        mage.out();


    }
}
