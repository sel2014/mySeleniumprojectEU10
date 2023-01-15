package com.cydeo.test.day9_javafaker_testbase_driverUtil;

public class Singleton {

    //#1- create private constructor

    public Singleton() {

    }



    //#2- create private static String
    // prevent access and provide a getter method
    private static String word;


    //This utility method will return the "word" in the way we want to return
    public static String getWord() {

        if (word == null){
            System.out.println("First time call. Words is null. Assigning value it now");
            word = "something";
        }else {

            System.out.println("Word already has value.");
        }
        return word;
    }
}



