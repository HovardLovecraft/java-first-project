package com.classes.fruits;

import com.classes.fruits.model.Kalamata;
import com.classes.fruits.model.Ligurian;

import java.util.ArrayList;
import java.util.List;

public class OliveList {

    private List<Olive> list = new ArrayList<>();


    public void addKalamata() {
        Olive kalamata = new Kalamata();
        list.add(kalamata);
    }

    public void addLigurian() {
        Olive ligurian = new Ligurian();
        list.add(ligurian);
    }

    public List<Olive> getList()  {
        return new ArrayList<>(list);
    }
}
