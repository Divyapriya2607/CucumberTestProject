package abstractionPackage;

abstract class TestFunc {
	
	static final int number=100;

	abstract void abstractMethod();

	void testResult() {
		System.out.println("Non-abstract method");
	}

	TestFunc() {
		System.out.println("Constructor");
	}

	static void methodStatic() {
		System.out.println("Static method");
	}

	final void methodFinal() {
		System.out.println("Final method");
	}

}

class TestClass extends TestFunc {

	void abstractMethod() {
		System.out.println("Abstract method");
	}

//	void methodFinal() {
//		Cannot override final method
//	}

}

public class AbstractClass {

	public static void main(String[] args) {
		TestFunc tf = new TestClass();
		tf.abstractMethod();
		tf.testResult();
		TestFunc.methodStatic();
//		tf.methodStatic();
		tf.methodFinal();
	}

}