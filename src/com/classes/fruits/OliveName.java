package com.classes.fruits;

public enum OliveName {
    KALAMATA("Kalamata"), LIGURIAN("Ligurian");

    private String name;

    OliveName(String name) {
        this.name = name;
    }

    public void info(){
        switch (this) {
            case KALAMATA:
                System.out.println("This is " + name);
                break;
            case LIGURIAN:
                System.out.println("This is " + name);
                break;
            default:
                System.out.println("There are no olives");
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
