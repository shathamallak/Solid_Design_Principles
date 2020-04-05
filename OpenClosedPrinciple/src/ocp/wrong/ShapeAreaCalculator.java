package ocp.wrong;

import java.security.InvalidParameterException;

public class ShapeAreaCalculator {
	public void calculate(Shape shape) {
		if(shape == null) {
            throw new InvalidParameterException("Oops !!  give an appropriate argument ");
        }
		else
			if(shape instanceof Circle)
			{	
				Circle circle=(Circle) shape;
				double r=circle.getRadius();
				circle.setArea(Math.PI * Math.pow(r, 2));
		
			}
			else if (shape instanceof Triangle) {
				Triangle triangle =(Triangle) shape;
				double b=triangle.getBase();
				double h=triangle.getHeight();
				triangle.setArea(0.5*h*b);
			}
			else if (shape instanceof Rectangle) {
				Rectangle rectangle =(Rectangle) shape;
				double l=rectangle.getLength();
				double w=rectangle.getWidth();
				rectangle.setArea(l*w);
			}
			else if (shape instanceof Cylinder) {
				Cylinder cylinder =(Cylinder) shape;
				double h=cylinder.getHeight();
				double r=cylinder.getRadius();
				cylinder.setArea(2*Math.PI*h*r + 2*Math.PI*r*r);
				
			}
	}
	
	
	

}
