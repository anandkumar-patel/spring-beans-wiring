package anand.learn.beans;

public class Line implements Shape{
	Point pointOne;
	Point pointTwo;

	public Point getPointOne() {
		return pointOne;
	}

	public void setPointOne(Point pointOne) {
		this.pointOne = pointOne;
	}

	public Point getPointTwo() {
		return pointTwo;
	}

	public void setPointTwo(Point pointTwo) {
		this.pointTwo = pointTwo;
	}
	
	@Override
	public void draw() {
		System.out.println("Line draw------started");
		System.out.println("Point One is :("+getPointOne().getX()+","+getPointOne().getY()+")");
		System.out.println("Point Two is :("+getPointTwo().getX()+","+getPointTwo().getY()+")");
		System.out.println("Line draw------end");
	}

}
