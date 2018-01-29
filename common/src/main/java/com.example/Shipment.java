package com.example;

import java.util.ArrayList;
import java.util.List;


public class Shipment {

    private List<Item> items = new ArrayList();

    public Shipment() {
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public void add(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }
}