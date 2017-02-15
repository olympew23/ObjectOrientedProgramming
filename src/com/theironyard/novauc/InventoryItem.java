package com.theironyard.novauc;

import java.util.ArrayList;

/**
 * Created by jerieshasmith on 2/14/17.
 */
public class InventoryItem {
    String name;
    int quantity;
    String category;



    public static InventoryItem createItem(String name, int quantity, String category) {
        if (category.equalsIgnoreCase("Scissors"));
        return new Scissors(name, quantity, category);


    }


    }