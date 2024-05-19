package controlFlowStatements;

public class ForEachLoop {

	public static void main(String[] args) {
		String products[] = new String[3];
		products[0] = "Mobiles";
		products[1] = "Laptops";
		products[2] = "Computer accessories";
		for (String items : products) {
			System.out.println(items);
		}
	}

}