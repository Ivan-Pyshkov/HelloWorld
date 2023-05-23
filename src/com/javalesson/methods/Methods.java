package com.javalesson.methods;

public class Methods {
    public static void main(String[] args) {
        printMessage("Ivan");
        printMessage("Alina");
        printMessage("Shalfei");
    }

    static void printMessage(String name) {
        System.out.println("Hello " + name + "!!!");
    }
}
