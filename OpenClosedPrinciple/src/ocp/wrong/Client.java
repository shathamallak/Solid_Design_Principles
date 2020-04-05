package ocp.wrong;

public class Client {
	
	public static void main (String []args) {
		Circle circle=new Circle ();
		circle.setRadius(0.5);
		
		Triangle triangle=new Triangle();
		triangle.setBase(2.0);
		triangle.setHeight(3.5);
		
		Rectangle rectangle=new Rectangle();
		rectangle.setLength(5.2);
		rectangle.setWidth(6.03);
		
		Cylinder cylinder=new Cylinder();
		cylinder.setHeight(2.9);
		cylinder.setRadius(0.75);
		
		
		ShapeAreaCalculator shapeAreaCalculator =new ShapeAreaCalculator();
		
		shapeAreaCalculator.calculate(circle);
		System.out.println("the area of the circle is "+circle.getArea());
		
		
		shapeAreaCalculator.calculate(triangle);
		System.out.println("the area of the triangle is "+triangle.getArea());
		
		
		shapeAreaCalculator.calculate(rectangle);
		System.out.println("the area of the rectangle is "+rectangle.getArea());
		
		
		shapeAreaCalculator.calculate(cylinder);
		System.out.println("the area of the cylinder is "+cylinder.getArea());
		
		
		
		
	}

}
