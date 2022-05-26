package com.example.androidtv;

public class Model {
    private int img;
    private String name;

    //Конструктор класса
    public Model(int img, String name){
        this.img = img;
        this.name = name;
    }

    public int getImg() {return img;}

    public String getName() {return name;}
}

