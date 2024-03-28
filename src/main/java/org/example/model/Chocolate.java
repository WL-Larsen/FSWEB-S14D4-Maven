package org.example.model;

public class Chocolate extends ProductForSale{
    private String flavor;
    public Chocolate(String type, double price, String description) {
        super(type, price, description);
    }

    public Chocolate(String type, double price, String description, String flavor) {
        super(type, price, description);
        this.flavor = flavor;
    }

    @Override
    public void showDetails() {
        System.out.println("Type: " + getType() + ", Price: " + getPrice() +
                ", Description: " + getDescription() + ", Flavor: " + flavor);
    }
}
