package variablesPackage;

class VarExample {

	String name = "Test";

	static char j = 'A';

	public void display(int n) {
		int number = 300;
		number = n;
		System.out.println("Local Variable: " + number);
		System.out.println("Instance Variable: " + name);
		System.out.println(j);
	}

	void read() {
		System.out.println(name);
	}

}

class StaticExample{
	
	void write() {
		System.out.println(VarExample.j);
	}
	
}

public class VariablesClass {

	public static void main(String[] args) {
		VarExample exm = new VarExample();
		exm.display(500);
		exm.read();
		System.out.println(exm.name);
		System.out.println(VarExample.j);
		System.out.println(exm.j);
		
	}

}