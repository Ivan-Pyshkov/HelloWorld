package com.javalesson.controlstatement;

public class SwitchCase {
    public static void main(String[] args) {
        int choice = 5;
        switch (choice) {
            case 1:
                System.out.println("You chose one");
                break;
            case 2:
                System.out.println("You chose two");
                break;
            case 3:
                System.out.println("You chose three");
                break;
            case 4:
                System.out.println("You chose four");
                break;
            default:
                System.out.println("Unsupported option");
        }
        System.out.println("Final string");
    }
}
