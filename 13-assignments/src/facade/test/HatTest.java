package facade.test;

import java.util.Scanner;

import facade.model.GoldenHat;
import facade.model.IHat;
import facade.model.PremiumHat;
import facade.model.RibbonedHat;
import facade.model.StandardHat;

public class HatTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		IHat hat = baseType(scanner);
		
		System.out.println("Do you want to add additional accessories?");
		System.out.print("Yes/No : ");
		String ifAdditional = scanner.next();
		if(ifAdditional.equalsIgnoreCase("no")) {
			System.out.println(hat.getDescription()); 
			return;
		}
		
		IHat addedHat = additionalRequirement(scanner, hat);
		System.out.println(addedHat.getDescription());
		
	}
	
	public static IHat baseType(Scanner scanner) {
		System.out.println("Select Type of Hat:");
		System.out.println("1. Standard Hat");
		System.out.println("2. Premium Hat");
		System.out.print("Enter your choice(1/2): " );
		int choice = scanner.nextInt();
		if(choice == 1) {
			return new StandardHat();
		}
		return new PremiumHat();
	}
	
	
	public static IHat additionalRequirement(Scanner scanner, IHat hat) {
		boolean hasGoldenHat = false;
		boolean hasRibbonedHat = false;
		IHat decoratedHat = null;
		
		while (true) {
			System.out.println("Available AddOns:");
		    System.out.println("1. Golden Color");
		    System.out.println("2. Ribbon");
		    System.out.println("3. Exit");
		    System.out.print("Enter your choice: ");

		    int choice = scanner.nextInt();

		    switch (choice) {
		    	case 1:
		    		if (hasGoldenHat) {
		    			System.out.println("You have already selected golden color");
		    			break;
		            } 	
		            decoratedHat = new GoldenHat(hat);
		            hat = decoratedHat;
		            hasGoldenHat = true;
		    		break;
		    	case 2:
		    		if (hasRibbonedHat) {
		    			System.out.println("Ribbons have already added!");
		    			break;
		    		}
		    		decoratedHat = new RibbonedHat(hat);
		    		hat = decoratedHat;
		    		hasRibbonedHat = true;
		    		break;
		    	case 3:
		    		return decoratedHat != null ? decoratedHat : hat;
		    	default:
		    		System.out.println("Invalid choice. Please try again.");
		        }  
		    }
		}

}
