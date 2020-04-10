package correct;

public class LightBulb implements Switchable{

	@Override
	public void turnOn() {
		
		System.out.println("the LightBulb is on ");
	}
	
	@Override
	public void turnOff() {
		
		System.out.println("the LightBulb is off ");
		
	}

}
