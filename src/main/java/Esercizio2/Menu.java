package Esercizio2;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<MenuItem> items;

    public Menu() {
        items = new ArrayList<>();
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public List<MenuItem> getItems() {
        return items;
    }

    public void printMenu() {
        System.out.println("Menu:");
        for (int i = 0; i < items.size(); i++) {
            MenuItem item = items.get(i);
            if (item instanceof Drink) {
                System.out.println((i + 1) + "- Drink: " + item.getDescription() + " - $" + item.getPrice());
            } else if (item instanceof Pizza) {
                System.out.println((i + 1) + "- Pizza: " + item.getDescription() + " - $" + item.getPrice());
            } else if (item instanceof Merchandise) {
                System.out.println((i + 1) + "- Merchandise: " + item.getDescription() + " - $" + item.getPrice());
            }
        }
        System.out.println();
    }

}
