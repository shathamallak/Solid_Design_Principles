package wrong;

public class RubberDuck extends Duck{

	
	public void Quack() {
		
		System.out.println("Quack :)");
		
	}

	
	public void Swim() {
		
		System.out.println("Swimming :)");
		
	}


	@Override
	public void Fly() {
		throw new UnsupportedOperationException ("I am a Rubber Duck I can not Fly :( "); 
		
	}	

}
