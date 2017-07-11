package by.maslouskaya.strategy.operation;

import by.maslouskaya.strategy.army.Army;
import by.maslouskaya.strategy.order.Order;

public class OrderOperation {
	private final static String ARTILLERY_NAME ="ARTILLERY*";
	private final static int ARTILLERY_COST = 500;

	public static int fullPrice(Order order) {
		int total = ArmyOperation.calcArmyPrice(order.getArmyType());
		if(order.hasArtillery()) {
			total += ARTILLERY_COST;
		}
		return total;
	} 
	
	public static void printOrderInfo(Order order) {
		String army = "army";
		if(order.getArmyCount() > 1) {
			army = "armies";
		}
		String artillery = " without artillery";
		if(order.hasArtillery()) {
			artillery = " with artillery";
		}
		System.out.println("User \"" + order.getUserName() + "\" wants to buy " + order.getArmyCount() + " \"" + order.getArmyType().getArmyName() + "\" " + army + artillery + ".");
	}
	
	public static void printArtillery(boolean hasArtillery) {
		if(hasArtillery) {
			System.out.printf("%-20s %,5d units%n", ARTILLERY_NAME, ARTILLERY_COST);
		}
	}
	
	public static void printCheck(Order order) {
		Army army = order.getArmyType();
		int price = fullPrice(order);
		int count = order.getArmyCount();
		System.out.println("********************************");
		System.out.println("OrderId: " + order.getOrderId());
		System.out.println("User:    " + order.getUserName());
		System.out.println("Army:    " + army.getArmyName());
		System.out.println("--------------------------------");
		ArmyOperation.printArmyComposition(army);
		printArtillery(order.hasArtillery());
		System.out.println("--------------------------------");
		System.out.printf("%-20s %,5d units%n", "Full price:", price);
		System.out.printf("%-20s %,5d%n", "Count:", count);
		System.out.println("--------------------------------");
		System.out.printf("%-20s %,5d units%n", "Total:", price * count);
		System.out.println("********************************");
		System.out.println();
	}
}
