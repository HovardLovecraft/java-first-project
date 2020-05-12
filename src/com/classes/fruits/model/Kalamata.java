package com.classes.fruits.model;

import com.classes.fruits.Olive;
import com.classes.fruits.OliveColor;
import com.classes.fruits.OliveName;

public class Kalamata extends Olive {

    public Kalamata() {
        super(OliveName.KALAMATA, OliveColor.PURPLE, 3);
    }

    @Override
    public String getOrigin() {
        return "Greece";
    }
}
