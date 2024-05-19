package inheritancePackage;

class ClassAB {

	public void methodRead() {
		System.out.println("Reading.....");
	}

}

class ClassBC extends ClassAB {

	public void methodWrite() {
		System.out.println("Writing.....");
	}

}

class ClassCD extends ClassAB {

	public void methodSpeak() {
		System.out.println("Speaking.....");
	}

}

public class HierarchicalInheritance {

	public static void main(String[] args) {
//		ClassBC cls1 = new ClassBC();
//		cls1.methodRead();
//		cls1.methodWrite();
		ClassCD cls2 = new ClassCD();
		cls2.methodRead();
		cls2.methodSpeak();
	}

}