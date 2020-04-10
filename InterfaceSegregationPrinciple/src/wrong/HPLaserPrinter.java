package wrong;

public class HPLaserPrinter extends Printer{

	@Override
	public void print() {
		System.out.println("HPLaser-print");
		
	}

	@Override
	public void scan() {
		System.out.println("HPLaser-scan");
		
	}

	@Override
	public void fax() {
		System.out.println("HPLaser-fax");
		
	}

	@Override
	public void printDublex() {
		System.out.println("HPLaser-dublex");
		
	}

}
