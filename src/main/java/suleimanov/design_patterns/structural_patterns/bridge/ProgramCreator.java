package suleimanov.design_patterns.structural_patterns.bridge;

public class ProgramCreator {
	public static void main(String[] args) {
		Program[] programs = {
				new BankSystem(new JavaDeveloper()),
				new StockExchange(new CppDeveloper())
		};
		
		for (Program program : programs) {
			program.developProgram();
		}
	}
}
