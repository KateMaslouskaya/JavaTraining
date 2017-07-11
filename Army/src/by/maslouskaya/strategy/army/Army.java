package by.maslouskaya.strategy.army;

import java.util.ArrayList;

public class Army {
	private final static int MIN_NAME_LENGHT = 4;
	private final static int MAX_NAME_LENGHT = 20;
	private int armyId;
	private String armyName;
	private ArrayList<Division> composition;
	
	public Army(String name) {
		armyId = armyIdGenerator.nextId();
		armyName = checkName(name);
		composition = new ArrayList<Division>();
	}
	
	private String checkName(String name) {
		String res = "Army #" + armyId;
		if(!name.isEmpty()) {
			if(name.length() >= MIN_NAME_LENGHT && name.length() <= MAX_NAME_LENGHT) {
				res = name;
			}
		}
		return res;
	}
	
	public int getArmyId() {
		return armyId;
	}
	
	public String getArmyName() {
		return armyName;
	}
	
	public ArrayList<Division> getComposition() {
		return composition;
	}
	
	public boolean newDetachment(String divisionName) {
		Division d = null;
		try {
			d = Enum.valueOf(Division.class, divisionName.toUpperCase());
		} catch(IllegalArgumentException e) {
			System.out.println("Division \"" + divisionName + "\" does not exist!");
			return false;
		} catch(NullPointerException e) {
			System.out.println("No division was specified!");
			return false;
		}
		boolean res = false;
		if(composition.indexOf(d) == -1) {
			composition.add(d);
			res = true;
		} else {
			System.out.println("Division \"" + d.name() + "\" is already added to the army \"" + armyName + "\"!");
		}
		return res;
	}
	
	private static class armyIdGenerator {
		private static int id = 10000;
		
		public static int nextId() {
			return id++;
		}
	}
}
