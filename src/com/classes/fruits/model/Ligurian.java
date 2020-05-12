package com.classes.fruits.model;

import com.classes.fruits.Olive;
import com.classes.fruits.OliveColor;
import com.classes.fruits.OliveName;

public class Ligurian extends Olive {

    public Ligurian() {
        super(OliveName.LIGURIAN, OliveColor.BLACK, 5);
    }

    @Override
    public String getOrigin() {
        return "Italy";
    }
}
