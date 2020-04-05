package ocp.correct;

public class Rectangle  extends Shape{

	private double length;
	private double width;
	private double area=0.0;
	
	
	public double getLength() {
		return length;
	}


	public void setLength(double length) {
		this.length = length;
	}


	public double getWidth() {
		return width;
	}


	public void setWidth(double width) {
		this.width = width;
	}


	public double getArea() {
		return area;
	}


	public void setArea(double area) {
		this.area = area;
	}


	@Override
	public void calaculateArea() {
		area=width*length;
		
	}

}
