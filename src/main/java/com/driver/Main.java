package com.driver;

public class Main {

    public static void main(String args[]){
        RWOnly obj = new RWOnly();
        obj.setName("Sanket");

        String value = obj.getName();
        System.out.println(value);
    }


}