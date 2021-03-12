package com.test;

public class Main {

    public static void main(String[] args) {
        String all = String.valueOf(System.getProperties());
        System.out.println(all.replace("=", " - ").replace(",", "\n"));
    }
}
