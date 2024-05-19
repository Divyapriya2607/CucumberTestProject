package listInterfacePackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
//		List<String> list = new ArrayList<String>();
		ArrayList<String> programList = new ArrayList<String>();

		ArrayList<Integer> numberList = new ArrayList<Integer>();

		programList.add("Java");
		programList.add("Selenium");
		programList.add("Python");
		programList.add("C#");
		programList.add("C++");
		programList.add("Selenium");
		programList.add(null);

		numberList.add(100);
		numberList.add(200);
		numberList.add(300);
		numberList.add(400);

//		System.out.println(programList);

		programList.remove(5);

//		System.out.println(programList.get(2));

		System.out.println("Size of program list: " + programList.size());

		System.out.println("Size of number list: " + numberList.size());

		Iterator itr = programList.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		int i = 0;
//		while (i < programList.size()) {
//			String name = "Python";
//			if (name.equals(programList.get(i))) {
//				System.out.println(programList.get(i));
//			}
//			i++;
//		}

//		for (int i = 0; itr.hasNext(); i++) {
//			System.out.println(itr.next());
//		}
	}

}