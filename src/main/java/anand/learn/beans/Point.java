package anand.learn.beans;

public class Point {
	private int x;
	private int y;
	
	public Point() {
		super();
		System.out.println("Point object's hashcode : "+this.hashCode());
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	

}
