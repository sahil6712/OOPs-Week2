package ecommerce;

interface Taxable {

    // Method to calculate tax
    int calculateTax();

    // Method to get tax details only on applicable products
    void getTaxDetails();
}
