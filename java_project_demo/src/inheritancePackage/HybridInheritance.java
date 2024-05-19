package inheritancePackage;

class ClassParent {

	public void method1() {
		System.out.println("Parent class");
	}

}

class SubClass1 extends ClassParent {

	public void method2() {
		System.out.println("Sub Class1");
	}

}

class SubClass2 extends SubClass1 {

	public void method3() {
		System.out.println("Sub Class2");
	}

}

class SubClass3 extends ClassParent {

	public void method4() {
		System.out.println("Sub Class3");
	}

}

public class HybridInheritance {

	public static void main(String[] args) {
	}

}