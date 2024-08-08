package abstractionPackage;

abstract class TestFunc {
	
	static final int number=100;

	abstract void abstractMethod();
	
	abstract void abstractMethod2();
	
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

class ClassT extends TestFunc{

	void abstractMethod() {
		System.out.println("Abstract method1");
	}
	
	void abstractMethod2() {
		System.out.println("Abstract method2");
	}
	
}

class TestClass extends TestFunc {

	void abstractMethod() {
		System.out.println("Abstract method");
	}
	
	void abstractMethod2() {
		System.out.println("Abstract method2");
	}

//	void methodFinal() {
//		Cannot override final method
//	}

}

public class AbstractClass {

	public static void main(String[] args) {
		TestFunc tf = new TestClass();
		TestClass tc=new TestClass();
//		tf.abstractMethod();
		tc.abstractMethod();
		tf.abstractMethod();
//		tf.testResult();
//		TestFunc.methodStatic();
//		tf.methodStatic();
//		tf.methodFinal();
	}

}