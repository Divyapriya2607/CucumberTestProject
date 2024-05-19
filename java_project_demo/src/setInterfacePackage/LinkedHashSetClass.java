package setInterfacePackage;

import java.util.LinkedHashSet;

public class LinkedHashSetClass {

	public static void main(String[] args) {
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add("Selenium");
		set.add("Java");
		set.add(null);
		set.add("Selenium");
		set.add(null);
		set.add("Maven");
		set.add("TestNG");
		System.out.println(set);
	}

}