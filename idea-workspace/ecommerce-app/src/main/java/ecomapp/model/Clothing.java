package ecomapp.model;

import java.util.StringJoiner;

public class Clothing extends Product{

    private Size size;
    private String material;

    public Clothing() {
    }

    public Clothing(int productId, String productName, double price, int quantityInStock, Size size, String material) {
        super(productId, productName, price, quantityInStock);
        this.size = size;
        this.material = material;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Size : " + size);
        System.out.println("Material : " + material);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Clothing.class.getSimpleName() + "[", "]")
                .add(super.toString())
                .add("size=" + size)
                .add("material='" + material + "'")
                .toString();
    }
}
