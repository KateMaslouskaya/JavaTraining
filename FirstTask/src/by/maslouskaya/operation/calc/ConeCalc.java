package by.maslouskaya.operation.calc;

public class ConeCalc {
	public static double surfaceArea(int radius, int height) {
		return Math.PI * radius * (radius + Math.hypot(radius, height)) ;
	}
	
	public static double volume(int radius, int height) {
		return Math.PI * Math.pow(radius, 2) * height / 3;
	}
}
