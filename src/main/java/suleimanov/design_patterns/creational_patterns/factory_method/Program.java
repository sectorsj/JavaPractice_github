package suleimanov.design_patterns.creational_patterns.factory_method;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String specialty;
		
		System.out.println("Input specialty: ");
		specialty = scanner.nextLine();
		
		DeveloperFactory developerFactory = createDeveloperBySpecialty(specialty);
		Developer developer = developerFactory.createDeveloper();
		
		developer.writeCode();
	}
	
	static DeveloperFactory createDeveloperBySpecialty(String specialty) {
		if (specialty.equalsIgnoreCase("java")) {
			return new JavaDeveloperFactory();
		} else if (specialty.equalsIgnoreCase("c++")) {
			return new CppDeveloperFactory();
		} else if (specialty.equalsIgnoreCase("php")) {
			return new PhpDeveloperFactory();
		} else {
			throw new RuntimeException(specialty + " is unsupported specialty");
		}
	}
}
