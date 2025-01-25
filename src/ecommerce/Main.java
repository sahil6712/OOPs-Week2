package ecommerce;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Create instance of Electronic class
        Electronics washingMachine = new Electronics("pid123","Washing Machine", 30000);

        // Create instance of Clothing class
        Clothing jacket = new Clothing("pid324","Jacket",6000);

        // Create instance of Groceries class
        Groceries proteinShake = new Groceries("pid423","Protein shake",600);

        // ArrayList to store all these objects
        ArrayList<Product> products = new ArrayList<>(3);

        // Add elements to products
        products.add(washingMachine);
        products.add(jacket);
        products.add(proteinShake);

        //Get final price for all products
        for(Product ele:products) {
            ele.finalPrice();
        }
    }
}
