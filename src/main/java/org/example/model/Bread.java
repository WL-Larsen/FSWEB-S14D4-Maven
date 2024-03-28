package org.example.model;

public class Bread extends ProductForSale{
  private boolean isWholeWheat;


    public Bread(String type, double price, String description) {
        super(type, price, description);
    }

    public Bread(String type, double price, String description, boolean isWholeWheat) {
        super(type, price, description);
        this.isWholeWheat = isWholeWheat;
    }

    @Override
    public void showDetails() {
        System.out.println("Type: " + getType() + ", Price: " + getPrice() + ", Description: " + getDescription() + ", Is Whole Wheat : " + isWholeWheat);
    }
}
