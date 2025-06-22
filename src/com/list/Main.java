// Java program to demonstrate LinkedList

package com.list;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

// Main class
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Creating instances of class Supermarket
        Supermarket supermarket = new Supermarket("Netto");
        Supermarket supermarket1 = new Supermarket("Lidl");
        Supermarket supermarket2 = new Supermarket("Aldi");
        Supermarket supermarket3 = new Supermarket("Spar");
        Supermarket supermarket4 = new Supermarket("Quickly");
        Supermarket supermarket5 = new Supermarket("Basket");
        Supermarket supermarket6 = new Supermarket("ATB");
        Supermarket supermarket7 = new Supermarket("Target");
        Supermarket supermarket8 = new Supermarket("Klass");
        Supermarket supermarket9 = new Supermarket("Provincia");
        Supermarket supermarket10 = new Supermarket("Pzatorochka");
        Supermarket supermarket11 = new Supermarket("Sedmoy Kontinent");
        Supermarket supermarket12 = new Supermarket("REWE");
        Supermarket supermarket13 = new Supermarket();
        supermarket13.setName("EDEKA");
        Supermarket supermarket14 = new Supermarket("Penny");

        // Creating list of supermarkets
        List<Supermarket> list = new LinkedList<>();

        // Adding supermarkets to list
        list.add(supermarket);
        list.add(supermarket1);
        list.add(supermarket2);
        list.add(supermarket3);
        list.add(supermarket4);
        list.add(supermarket5);
        list.add(supermarket6);
        list.add(supermarket7);
        list.add(supermarket8);
        list.add(supermarket9);
        list.add(supermarket10);
        list.add(supermarket11);
        list.add(supermarket12);
        list.add(supermarket13);

        // Printing list to console
        System.out.println(list);

        // Checking if Aldi and Netto are the same
        System.out.println("Aldi and Netto the same: " + list.get(2).equals(list.get(0)));

        // Checking if Aldi and Lidl are the same
        System.out.println("Aldi and Lidl the same: " + list.get(2).equals(list.get(1)));

    }
}

// Supermarket class
class Supermarket {

    // Field name
    String name;

    // Default constructor of the class Supermarket
    public Supermarket() {
    }

    // Constructor of the class Supermarket
    public Supermarket(String name) {
        this.name = name;
    }

    // SetName() method to set value of field name
    public void setName(String name) {
        this.name = name;
    }

    // GetName() method to get value of field name
    public String getName() {
        return name;
    }

    // Equals() method to compare instances correct
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Supermarket that = (Supermarket) o;
        return Objects.equals(name, that.name);
    }

    // HashCode() method to compare instances correct
    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    // ToString() method to print instances beautifully
    @Override
    public String toString() {
        return "Supermarket " +
                name;
    }
}
