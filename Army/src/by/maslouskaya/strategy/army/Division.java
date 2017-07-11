package by.maslouskaya.strategy.army;

public enum Division {
	SWORDSMEN(300), ARCHERS(200), CAVALRY(500), DRAGONS(1000), SCOUTS(400), MAGICIANS(800);
	private int cost;
	Division(int value) {
		cost = value;
	}
	public int getCost() {
		return cost;
	}
	
	@Override
	public String toString() {
		return this.name() + " " + this.cost;
	}
}
