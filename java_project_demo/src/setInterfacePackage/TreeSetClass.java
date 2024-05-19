package setInterfacePackage;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetClass {

	public static void main(String[] args) {
//		TreeSet<String> set = new TreeSet<String>();
		Set<String> set = new TreeSet<String>();
		set.add("Selenium");
		set.add("Java");
//		set.add(null);
		set.add("Selenium");
//		set.add(null);
		set.add("Maven");
		set.add("TestNG");
		System.out.println(set);
	}

}