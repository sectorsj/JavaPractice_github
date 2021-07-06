package java_beginers.using_object_with_methods_demo_88;

import javax.swing.*;

public class UsingObjectWithMethodsDemo {
	public static void main(String[] args) {
		
		MyClass objA = new MyClass();
		MyClass objB = new MyClass();
		
		objA.set(100, 'A');
		objB.set(200, 'B');
		
		JOptionPane.showMessageDialog(null, objA.getInfo(), "Первый объект", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, objB.getInfo(), "Второй объект", JOptionPane.INFORMATION_MESSAGE);
	}
}
