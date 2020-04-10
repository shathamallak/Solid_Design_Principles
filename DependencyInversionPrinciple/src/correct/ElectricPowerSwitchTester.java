package correct;

public class ElectricPowerSwitchTester {
	public static void main(String [] args) {
		
		Switchable fan=new Fan();
		Switchable lightBulb =new LightBulb();
		
		ElectricPowerSwitch eSwitch =new ElectricPowerSwitch();
		eSwitch.setDevice(lightBulb);
		eSwitch.press();
		eSwitch.press();
		
		System.out.println("\n\ndisconnect the lightBulb and connect the fan \n\n");
		
		
		eSwitch.setDevice(fan);
		eSwitch.press();
		eSwitch.press();
		
		
		
		
	}

}
