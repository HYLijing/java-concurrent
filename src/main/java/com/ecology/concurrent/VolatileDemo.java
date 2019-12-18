package com.ecology.concurrent;

public class VolatileDemo {

    private static volatile int i = 0;

    public static void main(String[] args) {

        System.out.println(i);
    }
}
