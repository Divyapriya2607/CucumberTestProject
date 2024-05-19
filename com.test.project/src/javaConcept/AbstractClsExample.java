package javaConcept;

abstract class TestCls1 {

	int i = 100;
	static int j = 200;
	final int k = 300;
	static final int l = 400;

	public void display() {
		System.out.println("Non-abstract method");
	}

	abstract void run();

	public void read() {

	}

}

class ABS extends TestCls1 {

	void run() {
		System.out.println("Abstract method");
	}

}

public class AbstractClsExample {

	public static void main(String[] args) {
//		ABS abs=new ABS();
		TestCls1 t = new ABS();
//		abs.read();
		t.run();
	}

}