package org.example.model;

public class Store {
    public static void main(String[] args) {

        ProductForSale[] products = new ProductForSale[3];
        products[0] = new Chocolate("Chocolate", 2.5, "Delicious chocolate bar", "Milk");
        products[1] = new Coke("Coke", 10.0, "Refreshing cola drink", false );
        products[2] = new Bread("Berad", 8.00,"Freshly baked bread", true);

        Store store = new Store();
        store.listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for(ProductForSale product : products){
            product.showDetails();
        }
    }
}