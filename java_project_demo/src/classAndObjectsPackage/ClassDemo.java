package classAndObjectsPackage;

class Sample {

	public void demo() {
		System.out.println("To print the statement");
	}

}

public class ClassDemo {

	public static void main(String[] args) {
		Sample sample1 = new Sample();
		sample1.demo();
		Sample sample2 = new Sample();
		sample2.demo();
		Sample sample3 = new Sample();
		sample3.demo();
	}

}