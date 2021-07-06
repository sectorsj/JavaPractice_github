package java_beginers.using_private_members_demo_107;

public class UsingPrivateMembersDemo {
	
	public static void main(String[] args) {
		
		MyClass objA = new MyClass("Alpha");
		MyClass objB = new MyClass("Bravo");
		MyClass objC = new MyClass("Charlie");
		
		objA.show();
		objB.show();
		objC.show();
		
		objB.set("Второй Объект");
		objB.show();
	}
}
