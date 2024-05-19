package listInterfacePackage;

import java.util.Vector;

public class VectorClass {

	public static void main(String[] args) {
		Vector<Integer> vecList = new Vector<Integer>();
		vecList.add(100);
		vecList.add(200);
		vecList.add(300);
		vecList.add(400);
		vecList.add(500);
		vecList.add(600);
		System.out.println("Size of list: " + vecList.size());
		System.out.println("Capacity of list: " + vecList.capacity());
		System.out.println(vecList.firstElement());

		Integer num[] = new Integer[vecList.size()];
		vecList.copyInto(num);
		for (int copiedValues : num) {
			System.out.println(copiedValues);
		}
	}

}