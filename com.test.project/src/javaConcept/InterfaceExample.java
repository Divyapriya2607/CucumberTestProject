package javaConcept;

interface TestInterface1 {

	int i = 100;
	
	static final int k=200;

	public void write();

	abstract void read();

}

interface TestInterface2{
	
	void display();
	
}

class Execute implements TestInterface1, TestInterface2{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void write() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void read() {
		// TODO Auto-generated method stub
		
	}
	
}

public class InterfaceExample {

	public static void main(String[] args) {
	}

}