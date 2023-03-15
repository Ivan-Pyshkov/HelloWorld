package com.javalesson.hello;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello world!!!");


        byte b = 10;
        short c = 200;
        int a = b + 23;
        long myLongValue = 123_456_789_876L;

        float myFloatVal = 23.56F;
        double myDoubleVal = 56.45D;

        double sum = a + b + c + myLongValue + myDoubleVal + myFloatVal;
        System.out.println("SUM = " + sum);

        float floatResult = myFloatVal / 2;
        System.out.println("floatResult = " + floatResult);

        System.out.println("byte b = " + b);
        System.out.println("short c = " + c);
        System.out.println("int a = " + a);

    }
}
