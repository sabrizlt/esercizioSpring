package Esercizio2;

public class Topping extends MenuItem {
    public Topping(String name, double price) {
        super(name, price);
    }

    @Override
    public String getDescription() {
        return "(" + name + ")";
    }

    @Override
    public double getPrice() {
        return price;
    }
}

