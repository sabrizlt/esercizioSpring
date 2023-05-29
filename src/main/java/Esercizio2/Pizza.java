package Esercizio2;

import java.util.List;
import java.util.ArrayList;


public class Pizza extends MenuItem {
    private List<MenuItem> toppings;

    public Pizza(String name, double price) {
        super(name, price);
        toppings = new ArrayList<>();
    }

    public void addTopping(MenuItem topping) {
        toppings.add(topping);
    }

    public void removeTopping(MenuItem topping) {
        toppings.remove(topping);
    }

    @Override
    public String getDescription() {
        StringBuilder description = new StringBuilder(name);
        for (MenuItem topping : toppings) {
            description.append(", ").append(topping.getDescription());
        }
        return description.toString();
    }

    @Override
    public double getPrice() {
        double total = price;
        for (MenuItem topping : toppings) {
            total += topping.getPrice();
        }
        return total;
    }

    public List<MenuItem> getToppings() {
        return toppings;
    }

}
