package wrong;

public class LiquidInkPrinter extends Printer{

	@Override
	public void print() {
		System.out.println("LiquidInk-print");
	}

	@Override
	public void scan() {
		System.out.println("LiquidInk-scan");
		
	}

	

	@Override
	public void printDublex() {
		throw new UnsupportedOperationException("printDublex method is not implemented in LiquidInk");
		
	}

	@Override
	public void fax() {
		throw new UnsupportedOperationException("fax method is not implemented in LiquidInk");
		
	}

}
