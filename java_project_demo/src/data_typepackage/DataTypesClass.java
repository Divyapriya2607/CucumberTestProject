package data_typepackage;

public class DataTypesClass {

	public static void main(String[] args) {
//		Primitive Data Types
		boolean status = false;
		byte t = 120;
		short s = 200;
		int i = 420;
		long l = 500L;
		float f = 42.10f;
		double d = 32.50;
		char c = 'A';
		System.out.println("Boolean value: " + status);
		System.out.println("Byte value: " + t);
		System.out.println("Short value: " + s);
		System.out.println("Int value: " + i);
		System.out.println("Long value: " + l);
		System.out.println("Float value: " + f);
		System.out.println("Double value: " + d);
		System.out.println("Char value: " + c);
		System.out.println("Stored values: " + status + " " + t + s + i + l + f + d + c);
		
//		Non-primitive Data Types
		String name = "name of your application";
		System.out.println(name);
		System.out.println("abc");
	     String cde = "cde";
	     System.out.println("abc" + cde);
	     String ca = "abc".substring(2, 3);
	     String da = cde.substring(1, 2);
	     System.out.println("ca"+ca+"da"+da);
	}

}