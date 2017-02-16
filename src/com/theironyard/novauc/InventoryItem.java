package com.theironyard.novauc;

import java.util.ArrayList;

/**
 * Created by jerieshasmith on 2/14/17.
 */
public class InventoryItem {
    String name;
    int quantity;
    String category;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}


