package Esercizio2;

public class Drink extends MenuItem {
    public Drink(String name, double price) {
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