package accessModifier1;

class Class1 {

	private void testMethod1() {
		System.out.println("Private Access Modifier");
	}

	void testMethod2() {
		testMethod1();
	}

	public void testMethod3() {
		System.out.println("Public Access Modifier");
	}

}

public class TestClass1 {

	protected static void testMethod5() {
		System.out.println("Protected Access Modifier");
	}

	public void testMethod4() {
		System.out.println("Public Access Modifier");
	}

	public static void main(String[] args) {
		Class1 cls1 = new Class1();
		cls1.testMethod2();
		cls1.testMethod3();
	}

}
