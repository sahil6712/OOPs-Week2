package ecommerce;

class Groceries extends Product implements Taxable {
    // Attribute of Groceries class
    private int taxPercentage = 25;
    private int discountPercentage = 10;

    // Constructors
    Groceries(String productId, String name, int price) {
        super(productId, name, price);
    }

    // Method to calculate discount
    @Override
    public int calculateDiscount() {
        return (int)( price*(discountPercentage/100f)); // Return discount
    }

    // Method to calculate tax
    @Override
    public int calculateTax() {
        return price*taxPercentage/100;
    }

    // Method to get final Price
    public void finalPrice() {
        System.out.println("The final price of product is: "+(price-calculateDiscount()+calculateTax())+"\n");
    }

    // Method to get tax details
    @Override
    public void getTaxDetails() {
        System.out.println("Tax percentage for "+name+" is: "+taxPercentage);
        System.out.println("Tax paid: "+calculateTax());
    }

    // Getter for taxPercentage
    public int getTaxPercentage() {
        return taxPercentage;
    }

    // Getter for discountPercentage
    public int getDiscountPercentage() {
        return discountPercentage;
    }

    // Setter for taxPercentage
    public void setTaxPercentage(int taxPercentage){
        this.taxPercentage = taxPercentage;
    }

    // Setter for discountPercentage
    public void setDiscountPercentage(int discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

}
