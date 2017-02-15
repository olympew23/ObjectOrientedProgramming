package com.theironyard.novauc;

import java.util.ArrayList;

/**
 * Created by jerieshasmith on 2/14/17.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<InventoryItem> items = new ArrayList<>();
        {
            items.add(createItem("Ballpoint", 6, "Pens"));
            items.add(createItem("Edgecraft", 10, "Scissors"));
            items.add(createItem("Texas Instrument", 15, "Calculator"));
            items.add(createItem("Notemaker", 20, "Ruler"));
            items.add(createItem("Papermate", 25, "Paper"));
        }

    }


    public static InventoryItem createItem(String name, int quantity, String category) {

        if (category.equalsIgnoreCase("Pens")) {
            return new Pens(name, quantity, category);
        } else if (category.equalsIgnoreCase("Scissors")) {
            return new Scissors(name, quantity, category);

        } else if (category.equalsIgnoreCase("Calculator")) {
            return new Calculator(name, quantity, category);
        } else if (category.equalsIgnoreCase("Ruler")) {
            return new Ruler(name, quantity, category);
        } else if (category.equalsIgnoreCase("Paper")) {
            return new Paper(name, quantity, category);
        }


        return createItem(name,quantity,category);
    }
}





