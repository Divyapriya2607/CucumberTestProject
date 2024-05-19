package mapInterfacePackage;

import java.util.HashMap;
import java.util.Map;

public class HashMapClass {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("A", 100);
		map.put("B", 200);
		map.put("A", 100);
		map.put("C", 300);
		map.put("D", null);
		map.put("E", 200);
		map.put("E", 600);
		map.put("F", 600);

		System.out.println(map);

		map.remove("D");

		System.out.println(map);

		for (Map.Entry<String, Integer> setMap : map.entrySet()) {
			System.out.print(setMap.getKey() + ": ");
			System.out.println(setMap.getValue());
		}
	}

}