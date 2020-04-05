package ocp.correct;

public class Cylinder extends Shape {
	private double radius;
	private double height;
	private double area=0.0;
	
	
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	@Override
	public void calaculateArea() {
		area=2*Math.PI*height*radius + 2*Math.PI*radius*radius;
		
	}
	
	
	

}
