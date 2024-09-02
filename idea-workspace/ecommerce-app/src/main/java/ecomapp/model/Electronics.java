package ecomapp.model;

import java.util.StringJoiner;

public class Electronics extends Product{

    private int warrantyPeriod;
    private String brand;

    public Electronics() {
    }

    public Electronics(int productId, String productName, double price, int quantityInStock, int warrantyPeriod, String brand) {
        super(productId, productName, price, quantityInStock);
        this.warrantyPeriod = warrantyPeriod;
        this.brand = brand;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Brand : "+brand);
        System.out.println("Warranty Period : "+warrantyPeriod);
    }

    public String toString() {
        return new StringJoiner(", ", Electronics.class.getSimpleName() + "[", "]")
                .add(super.toString())
                .add("warrantyPeriod=" + warrantyPeriod)
                .add("brand='" + brand + "'")
                .toString();
    }
}
