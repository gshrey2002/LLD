package main;

import Items.LibraryItems;

public class library {

    private LibraryItems[] items;

    public library(LibraryItems[] items) {
        this.items = items;
    }

    public double calculateTotalValue(){
        double totalValue=0;
        for(LibraryItems item:items){
            totalValue +=item.getValue();

        }
        return totalValue;
    }
}
