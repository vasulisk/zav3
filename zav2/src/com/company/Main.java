package com.company;

public class Main {

    public static void main(String[] args) {
        One on = new One();
        on.mn();
        Two tw = new Two();
        tw.suma();
        double h = on.c / tw.d;

        System.out.println(h);
    }
}
