package by.maslouskaya.strategy.order;

import by.maslouskaya.strategy.army.Army;

public class Order {
	private final static int MAX_ARMY_COUNT = 5;
	private int orderId;
	private String userName;
	private Army armyType;
	private int armyCount;
	private boolean hasArtillery;

	public Order(String name, Army army, int count, boolean artillery) {
		if(count <= MAX_ARMY_COUNT) {
			orderId = orderIdGenerator.nextId();
			userName = name;
			armyType = army;
			armyCount = count;
			hasArtillery = artillery;
		} else {
			System.out.println("You cannot buy more than " + MAX_ARMY_COUNT + " same armies!");
		}
	}
	
	public int getOrderId() {
		return orderId;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public Army getArmyType() {
		return armyType;
	}
	
	public int getArmyCount() {
		return armyCount;
	}
	
	public boolean hasArtillery() {
		return hasArtillery;
	}
	
	private static class orderIdGenerator {
		private static int id = 10000;
		
		public static int nextId() {
			return id++;
		}
	}
}
