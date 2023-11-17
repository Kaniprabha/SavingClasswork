package polymorphism;

public class SubClass extends MethodOverridding{
	public void method() {
		System.out.println("I am from SubClass");
	}

	public static void main(String[] args) {
		SubClass object= new SubClass();
		object.method();
		object.method1();
		object.method2();

	}

}
