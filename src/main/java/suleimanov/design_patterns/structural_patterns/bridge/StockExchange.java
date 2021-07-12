package suleimanov.design_patterns.structural_patterns.bridge;

public class StockExchange extends Program {
	
	protected StockExchange(Developer developer) {
		super(developer);
	}
	
	@Override
	public void developProgram() {
		System.out.println("Stock exchange development in progress...");
		developer.writeCode();
	}
}
