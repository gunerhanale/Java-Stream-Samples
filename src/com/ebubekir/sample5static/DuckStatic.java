package com.ebubekir.sample5static;

public class DuckStatic {

    //That is the difference between static and non-static

    //Static can be referenced at any time
    private static int numberOfDucks = 0;

    //Non-static can only be referenced if you have an instance of the class created
    private int size;

    public static void main(String[] args) {

        DuckStatic duckStatic = new DuckStatic();
        duckStatic.size = 3;

        numberOfDucks = 12;

        System.out.println(duckStatic.size);
        System.out.println(numberOfDucks);
    }
}
