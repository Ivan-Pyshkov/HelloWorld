package com.javalesson.methods;

public class Methods {
    public static void main(String[] args) {
        printMessage("Ivan");

        int a = 5;
        int b = 10;
//        calcRectangleSquare(5,10);
        int square = calcRectangleSquare(a, b);

        System.out.println("Rectangle square = " + square);
    }

    static void printMessage(String name) {
        System.out.println("Hello " + name + "!!!");
    }


    static int calcRectangleSquare(int x, int y) {
        int square = x * y;
        return square;
    }
}
