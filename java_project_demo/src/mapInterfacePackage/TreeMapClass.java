package mapInterfacePackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapClass {

	public static void main(String[] args) {
		Map<Integer, String> map = new TreeMap<Integer, String>();
		map.put(200, "cName");
		map.put(300, "bName");
		map.put(100, "aName");

		System.out.println(map);
	}

}