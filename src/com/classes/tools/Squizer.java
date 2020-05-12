package com.classes.tools;

import com.classes.fruits.Olive;
import com.example.java.Press;

import java.util.List;

public class Squizer implements Press {

    private int currentOil;

    public int getOil(List<Olive> olives) {

        int totalOil = currentOil;
        for (Olive o : olives) {
            System.out.println(o.getName());
            totalOil += o.crush();
        }

        return totalOil;

    }

    @Override
    public void setOil(int oil) {
        currentOil = oil;
    }

}
