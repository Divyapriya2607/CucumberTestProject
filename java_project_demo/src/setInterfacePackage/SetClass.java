package setInterfacePackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetClass {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("Selenium");
		set.add("Java");
		set.add(null);
		set.add("Selenium");
		set.add(null);
		set.add("Maven");
		set.add("TestNG");
		System.out.println(set);

		Iterator itr = set.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}