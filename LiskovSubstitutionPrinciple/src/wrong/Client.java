package wrong;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
	List<Duck> ducks = new ArrayList<Duck>();

	
	
	ducks.add(new MarbledDuck());
	ducks.add(new MallardDuck());
	ducks.add(new RubberDuck());
	
	for (Duck duck : ducks) {
		duck.Fly();
	}
}
}