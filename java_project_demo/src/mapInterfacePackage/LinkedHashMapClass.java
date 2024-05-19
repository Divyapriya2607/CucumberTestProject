package mapInterfacePackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LinkedHashMapClass {

	public static void main(String[] args) {
		Map<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(100, "cName");
		map.put(200, "bName");
		map.put(300, "aName");

		System.out.println(map);

		Scanner scn = new Scanner(System.in);
		int i = 0;
		while (i < 2) {
			System.out.println("Enter the key & value for storing in map: ");
			int key = scn.nextInt();
			String value = scn.nextLine();
			map.put(key, value);
			System.out.println();
			i++;
		}

		System.out.println(map);

		scn.close();

	}

}