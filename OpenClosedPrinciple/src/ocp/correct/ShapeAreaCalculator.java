package ocp.correct;

import java.security.InvalidParameterException;

public class ShapeAreaCalculator {
	public void calculate(Shape shape) {
		if(shape == null) {
            throw new InvalidParameterException("Oops !!  give an appropriate argument ");
        }
		else
			shape.calaculateArea();
	}
	
	
	

}
