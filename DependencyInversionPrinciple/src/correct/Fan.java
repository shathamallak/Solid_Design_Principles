package correct;

public class Fan implements Switchable{

	@Override
	public void turnOn() {
		System.out.println("the Fan is on");
		
	}

	@Override
	public void turnOff() {
		
		System.out.println("the Fan is off");
		
	}

}
