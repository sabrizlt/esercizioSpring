package Esercizio2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public Menu menu() {
		Menu menu = new Menu();

		// PIZZE
		Pizza margherita = new Pizza("Margherita", 9.99);
		Pizza salami = new Pizza("Salami Pizza", 11.99);
		Pizza hawaiian = new Pizza("Hawaiian Pizza", 12.99);
		Pizza margherita2 = new Pizza("Margherita", 9.99);
		Pizza ham_cheese = new Pizza("Ham&Cheese", 9.99);

		// TOPPING
		MenuItem extraCheese = new Topping("Extra Cheese", 0.6);
		MenuItem ham = new Topping("ham", 0.9);
		MenuItem pineapple = new Topping("pineapple", 0.7);
		MenuItem onions = new Topping("Onions", 0.5);

		// BEVANDE
		MenuItem coke = new Drink("Coke", 2.00);
		MenuItem sprite = new Drink("Sprite", 2.00);
		MenuItem orangeJuice = new Drink("Orange Juice", 3.00);

		// MERCH
		MenuItem tShirt = new Merchandise("T-Shirt", 15.99);
		MenuItem cap = new Merchandise("Cap", 12.99);

		// PIZZE CON TOPPING
		margherita2.addTopping(onions);
		margherita2.addTopping(pineapple);
		ham_cheese.addTopping(ham);
		ham_cheese.addTopping(extraCheese);


		menu.addItem(margherita);
		menu.addItem(margherita2);
		menu.addItem(salami);
		menu.addItem(hawaiian);
		menu.addItem(ham_cheese);
		menu.addItem(coke);
		menu.addItem(sprite);
		menu.addItem(orangeJuice);
		menu.addItem(tShirt);
		menu.addItem(cap);

		return menu;
	}
}
