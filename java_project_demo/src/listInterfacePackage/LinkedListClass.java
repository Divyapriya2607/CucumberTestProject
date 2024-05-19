package listInterfacePackage;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListClass {

	public static void main(String[] args) {
		LinkedList<String> veg = new LinkedList<String>();
		veg.add("Capsicum");
		veg.add("Potatoes");
		veg.add("Cabbages");
		veg.add("Carrots");
		Iterator itr = veg.iterator();
		while (itr.hasNext()) {
			System.out.println("List 1 values: " + itr.next());
		}

		LinkedList<String> vegList = new LinkedList<String>();
		vegList.addAll(veg);
		itr = vegList.iterator();
		while (itr.hasNext()) {
			System.out.println("List 2 values: " + itr.next());
		}
	}

}