package correct;

public class MallardDuck extends Duck implements CanFly{

	
	public void Quack() {
		
		System.out.println("Quack :)");
		
	}

	
	public void Swim() {
		System.out.println("Swimming :)");
		
	}

	@Override
	public void Fly() {
		System.out.println("Flying");
		
	}

}
