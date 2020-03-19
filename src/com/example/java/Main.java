package com.example.java;

import com.classes.Person;
import com.classes.Rectangle;
import com.google.gson.Gson;

/**
 * this is a Main class, all logic is here
 */

public class Main {

    public static void main (String [ ] args){

        /**
         * This is a main method it calls other classes
         */

        Rectangle square = new Rectangle(5.5, 5.5);
        System.out.println(square.getArea());

        Person person = new Person("Ivan", "Kuznetsov", 31);
        System.out.println(person.getAge());
        Gson gson = new Gson();
        String personJson = gson.toJson(person);
        System.out.println(personJson);

        String[] colors = new String[]{"Red", "Green", "Blue"};
        for (int i = 0; i < colors.length; i++){
            System.out.println("the color is " + colors[i]);
        }

        String colorsJson = gson.toJson(colors);
        System.out.println(colorsJson);

    }

}
