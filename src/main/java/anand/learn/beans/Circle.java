package anand.learn.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Circle implements Shape {
	private int radius;
	@Autowired
	@Qualifier("point")
	private Point center;
	
	public Circle() {
		super();
	}
	public Circle(Point center) {
		super();
		this.center = center;
	}
	public Point getCenter() {
		return center;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	@Qualifier("center")
	public void setCenter(Point center) {
		this.center = center;
	}
	
	@Override
	public void draw() {
		System.out.println("center of Circle is :("+getCenter().getX()+","+getCenter().getY()+") and radius is"+getRadius());
		
	}

}
