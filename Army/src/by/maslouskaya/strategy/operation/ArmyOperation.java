package by.maslouskaya.strategy.operation;

import by.maslouskaya.strategy.army.Army;
import by.maslouskaya.strategy.army.Division;

public class ArmyOperation {
	public static int calcArmyPrice(Army army) {
		int total = 0;
		for(Division d : army.getComposition()) {
			total += d.getCost();
		}
		return total;
	}
	
	public static void printArmyComposition(Army army) {
		for(Division d : army.getComposition()) {
			System.out.printf("%-20s %,5d units%n", d.name(), d.getCost());
		}
	}
	
	public static void printArmyInfo(Army army) {
		System.out.printf("[ %5d : %20s : %d ]%n", army.getArmyId(), army.getArmyName(), army.getComposition().size());
	}
}
