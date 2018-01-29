package com.example;

public class Item {

    private String name;
    private String ISBN;
    private int weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Item(String name, String ISBN, int weight) {
        this.name = name;
        this.ISBN = ISBN;
        this.weight = weight;
    }
    public Item() {
    }
}
