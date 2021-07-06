package java_beginers.method_overloading_demo_93;

public class MyClass {
	int number;
	char symbol;
	
	void set(int n) {
		number = n;
	}
	
	void set(char s) {
		symbol = s;
	}
	
	void set( int n, char s) {
		set(n);
		set(s);
	}
	
	void set() {
		set(0,'Z');
	}
	
	void show() {
		System.out.println("Значения полей " + number + " и " + symbol);
	}
	
	void show(String txt) {
		System.out.println(txt + ": значения полей " + number + " и " + symbol);
	}
	
	void show(String txt1, String txt2) {
		System.out.println(txt1 + ": " + number);
		System.out.println(txt2 + ": " + symbol);
	}
	
	
}
