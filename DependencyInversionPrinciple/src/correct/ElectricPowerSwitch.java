package correct;

public class ElectricPowerSwitch {
	private boolean on=false;
	private Switchable device;
	
	
	public boolean isOn() {
		return on;
	}
	public void setOn(boolean on) {
		this.on = on;
	}
	public Switchable getDevice() {
		return device;
	}
	public void setDevice(Switchable device) {
		this.device = device;
	}
	
	public void press() {
		if(on) {
			device.turnOff();
			on=false;
		}
		else
		{
			device.turnOn();
			on=true;
		}
	}
	
	

}
