package com.company;


import java.lang.reflect.Array;
import java.util.Arrays;

public class Main<addMassiv, name> {

    public static void main(String[] args) {

        String[] names = {"Joy", "Mark", "Justin"};
        System.out.println("Привет " + names[0]);
        System.out.println("Привет " + names[1]);
        System.out.println("Привет " + names[2]);

        name = Arrays.copyOf(names, names.length + 1);
        name[3] = "Adam";
        names = name;

        System.out.println("-------------------");

        for (String temp : names) {

        switch (temp) {

                case "Joy":
                    System.out.println("Доброе утро " + names[0]);
                    break;

                case "Mark":
                    System.out.println("Добрый день " + names[1]);
                    break;

                case "Justin":
                    System.out.println("Добрый вечер " + names[2]);
                    break;

                case "Adam":
                    System.out.println("Доброй ночи " + names[3]);
            }
        }


    } // Дополнительное задание

    static String[] name;

}
