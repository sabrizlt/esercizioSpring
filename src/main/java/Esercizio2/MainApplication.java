package Esercizio2;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MainApplication.class, args);

		System.out.println("----------------------------");
		System.out.println("WELCOME IN GODFATHER'S PIZZA");
		System.out.println("----------------------------");

		Menu menu = context.getBean(Menu.class);
		menu.printMenu();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Seleziona il numero dell'elemento del menu: ");
		int choice = scanner.nextInt();

		switch (choice) {
		case 1:
			Pizza margherita = new Pizza("Margherita", 9.99);
			margherita.addTopping(new Topping("Extra Cheese", 0.69));
			margherita.addTopping(new Topping("Ham", 0.99));
			menu.addItem(margherita);
			System.out.println("Hai aggiunto la Margherita al tuo ordine.");
			break;
		case 2:
			Pizza salami = new Pizza("Margherita", 9.99);
			salami.addTopping(new Topping("Extra Cheese", 0.69));
			salami.addTopping(new Topping("Ham", 0.99));
			menu.addItem(salami);
			System.out.println("Hai aggiunto la Salami al tuo ordine.");
			break;
		case 3:
			Pizza hawaiian = new Pizza("Margherita", 9.99);
			hawaiian.addTopping(new Topping("Extra Cheese", 0.69));
			hawaiian.addTopping(new Topping("Ham", 0.99));
			menu.addItem(hawaiian);
			System.out.println("Hai aggiunto la Hawaiian al tuo ordine.");
			break;
		default:
			System.out.println("Scelta non valida.");
			break;
		}
		if (choice >= 1 && choice <= 3) {
		    System.out.println("Vuoi aggiungere dei topping alla pizza? (S/N)");
		    String addToppings = scanner.next();

		    if (addToppings.equalsIgnoreCase("S")) {
		        System.out.println("Topping disponibili:");
		        System.out.println("1. Extra Cheese");
		        System.out.println("2. Ham");
		        System.out.println("3. Pineapple");
		        System.out.println("4. Onions");

		        System.out.println("Inserisci il numero del topping da aggiungere (0 per uscire):");
		        int toppingChoice = scanner.nextInt();

		        while (toppingChoice != 0) {
		            switch (toppingChoice) {
		                case 1:
		                    MenuItem extraCheese = new Topping("Extra Cheese", 0.6);
		                    Pizza selectedPizza = (Pizza) menu.getItems().get(choice - 1);
		                    selectedPizza.addTopping(extraCheese);
		                    System.out.println(
		                            "Hai aggiunto il topping Extra Cheese alla pizza " + selectedPizza.getDescription());
		                    break;
		                case 2:
		                    MenuItem ham = new Topping("Ham", 0.9);
		                    Pizza selectedPizza2 = (Pizza) menu.getItems().get(choice - 1);
		                    selectedPizza2.addTopping(ham);
		                    System.out.println("Hai aggiunto il topping Ham alla pizza " + selectedPizza2.getDescription());
		                    break;
		                case 3:
		                    MenuItem pineapple = new Topping("Pineapple", 0.7);
		                    Pizza selectedPizza3 = (Pizza) menu.getItems().get(choice - 1);
		                    selectedPizza3.addTopping(pineapple);
		                    System.out.println(
		                            "Hai aggiunto il topping Pineapple alla pizza " + selectedPizza3.getDescription());
		                    break;
		                case 4:
		                    MenuItem onions = new Topping("Onions", 0.5);
		                    Pizza selectedPizza4 = (Pizza) menu.getItems().get(choice - 1);
		                    selectedPizza4.addTopping(onions);
		                    System.out.println(
		                            "Hai aggiunto il topping Onions alla pizza " + selectedPizza4.getDescription());
		                    break;
		                default:
		                    System.out.println("Scelta non valida.");
		                    break;
		            }

		            System.out.println("Inserisci il numero del topping da aggiungere (0 per uscire):");
		            toppingChoice = scanner.nextInt();


		                }
		            }

				}
			
		

		scanner.close();
	}
}
