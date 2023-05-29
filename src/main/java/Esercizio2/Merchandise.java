package Esercizio2;

public class Merchandise extends MenuItem {
    public Merchandise(String name, double price) {
        super(name, price);
    }

    @Override
    public String getDescription() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
