package by.maslouskaya.entity;

public class Point {
	private int x;
	private int y;
	private int z;
	
	public Point(){
		this.x = 0;
		this.y = 0;
		this.z = 0;
	}
	
	public Point(int x, int y, int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public void setX(int x){
		this.x = x;
	}
	
	public int getX(){
		return this.x;
	}
	
	public void setY(int y){
		this.y = y;
	}
	
	public int getY(){
		return this.y;
	}
	
	public void setZ(int z){
		this.z = z;
	}
	
	public int getZ(){
		return this.z;
	}
	
	@Override
	public String toString(){
		return "(" + this.x + "," + this.y + "," + this.z + ")";
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
		Point other = (Point) obj;
		return x == other.x && y == other.y && z == other.z ? true : false; 
	}
	
	@Override
	public int hashCode() {
		return x*100 + y*10 + z;
	}
}