package javaConcept;

import java.util.ArrayList;

public class WrapperClassExample {

	public static void main(String[] args) {

//		int - Integer
//		short - Short
//		byte - Byte
//		long - Long
//		char - Character
//		float - Float
//		double - Double

		int i = 100;
		Integer j = 200;

		String product1 = "35000";
		String product2 = "40000";
		String totalProductPrice = product1 + product2;
		System.out.println(totalProductPrice);

		int price1 = Integer.parseInt(product1);
		int price2 = Integer.parseInt(product2);
		int priceTotal = price1 + price2;
		System.out.println(priceTotal);

		float price_1 = Float.parseFloat(product1);

	}

}