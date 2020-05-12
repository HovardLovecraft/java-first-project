package com.example.java;

import com.classes.fruits.OliveList;
import com.classes.tools.Squizer;

public class PressRunner {
    public static void main(String[] args) {
        OliveList oliveList = new OliveList();
        Press squizer = new Squizer();

        oliveList.addKalamata();
        oliveList.addKalamata();
        oliveList.addLigurian();
        oliveList.addLigurian();

        System.out.println(squizer.getOil(oliveList.getList()));
    }
}
