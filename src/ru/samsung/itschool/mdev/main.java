package ru.samsung.itschool.mdev;

import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Mage mage = new Mage("NIre", 100, 100);
        mage.print_all();
        System.out.println();
        Unit unit = new Unit("NIre", 100);
        unit.print_all();

    }

}
