package interfacePackage;

interface TestInterface1 {

	int number = 100;

	abstract void methodTest();

	void test();
	
	static void methodStatic() {
		System.out.println("Static method");
	}
	
}

interface TestInterface2 {

	void test1();

}

class ClassAB implements TestInterface1, TestInterface2 {

	public void test1() {
		System.out.println("Interface 2");
	}

	public void methodTest() {
		System.out.println("Interface 1");
	}

	public void test() {
		System.out.println("Interface 1");
	}

}

public class InterfaceExample {

	public static void main(String[] args) {
		TestInterface1 tf = new ClassAB();
		TestInterface2 tf1 = new ClassAB();
		tf.methodTest();
		tf.test();
		tf1.test1();
	}

}
