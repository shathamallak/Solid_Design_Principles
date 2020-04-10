package wrong;

public class ElectricPowerSwitch {
	private boolean on=false;
	private LightBulb lighBulb;

	
	public boolean isOn() {
		return on;
	}
	public void setOn(boolean on) {
		this.on = on;
	}
	public LightBulb getLighBulb() {
		return lighBulb;
	}
	public void setLighBulb(LightBulb lighBulb) {
		this.lighBulb = lighBulb;
	}
	
	public void press() {
		if(on)
		{
			lighBulb.turnOff();
			on=false;
		}
		else
		{
			lighBulb.turnOn();
			on=true;
		}
	}
	
	

}
