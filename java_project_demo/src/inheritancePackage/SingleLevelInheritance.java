package inheritancePackage;

class ParentClass {

	public void parentMethod() {
		System.out.println("Parent Class");
	}

}

class ChildClass extends ParentClass {

	public void childMethod() {
		System.out.println("Child Class");
	}

}

public class SingleLevelInheritance {

	public static void main(String[] args) {
		ChildClass cc = new ChildClass();
		cc.childMethod();
		cc.parentMethod();
	}

}