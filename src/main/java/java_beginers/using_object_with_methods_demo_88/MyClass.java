package java_beginers.using_object_with_methods_demo_88;

public class MyClass {
	int number;
	char symbol;
	
	void set(int n, char s) {
		number = n;
		symbol = s;
	}
	
	String getInfo() {
		String text = "Число: " + number + "\n";
		text += "Символ: " + symbol;
		return text;
	}
}
