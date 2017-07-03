package by.maslouskaya.entity;

import by.maslouskaya.exception.ConeException;

public class Cone {
	private Point center;
	private int radius;
	private int height;
	
	public Cone (Point point, int radius, int height){
		this.center = point;
		this.radius = radius;
		this.height = height;
	}
	
	public void setCenter (Point point) {
		this.center = point;
	}
	
	public Point getCenter() {
		return this.center;
	}
	
	public void setRadius (int radius) throws ConeException{
		if(radius > 0) {
			this.radius = radius;
		} else {
			throw new ConeException("Invalid radius!");
		}
	}
	
	public int getRadius() {
		return this.radius;
	}
	
	public void setHeight(int height) throws ConeException {
		if(height > 0) {
			this.height = height;
		} else {
			throw new ConeException("Invalid height!");
		}
	}
	
	public int getHeight() {
		return this.height;
	}
	
	@Override
	public String toString() {
		return "Cone:\n" +
				"Center - " + this.center + "\n" +
				"Radius - " + this.radius + "\n" +
				"Height - " + this.height;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj == null) {
			return false;
		}
		if(getClass() != obj.getClass()) {
			return false;
		}
		Cone other = (Cone) obj;
		return center.equals(other.center) && radius == other.radius && height == other.height ? true : false; 
	}
	
	@Override
	public int hashCode() {
		return center.hashCode() + radius - height;
	}
}
