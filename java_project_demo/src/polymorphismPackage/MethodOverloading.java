package polymorphismPackage;

class ClassTest {

	public int add(int a, int b) {
		return a + b;
	}

	public int add(int c, int d, int e) {
		return c + d + e;
	}

	public int add(int c, int d, int e, int f) {
		int x = c + d + e + f;
		return x;
	}

}

class ClassRead {

	public int add(int a, int b) {
		return a + b;
	}

	public float add(float a, float b) {
		return a + b;
	}

}

public class MethodOverloading {

	public static void main(String[] args) {
		ClassTest cls = new ClassTest();
		System.out.println(cls.add(10, 20, 30));
		System.out.println(cls.add(40, 50));

		ClassRead cls1 = new ClassRead();
		System.out.println(cls1.add(45.21f, 53.26f));
		System.out.println(cls1.add(100, 200));
	}

}