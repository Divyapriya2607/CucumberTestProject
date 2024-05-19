package controlFlowStatements;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
//		String day = "Test";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the day:");
		String day = scan.nextLine();
		switch (day) {
		case "Monday":
			System.out.println("Case 1 Passed");
			break;
		case "Tuesday":
			System.out.println("Case 2 Passed");
			break;
		case "Wednesday":
			System.out.println("Case 3 Passed");
			break;
		case "Thursday":
			System.out.println("Case 4 Passed");
			break;
		case "Friday":
			System.out.println("Case 5 Passed");
			break;
		case "Saturday":
			System.out.println("Case 6 Passed");
			break;
		case "Sunday":
			System.out.println("Case 7 Passed");
			break;
		default:
			System.out.println("Day is Invalid!");
		}

		int num = 100;
		switch (num) {
		case 100:
			System.out.println("Price value is: " + num);
			break;
		case 200:
			System.out.println("Price value is: " + num);
			break;
		default:
			System.out.println("Price value doesn't match with none of the cases");
		}

		String productName = "Smartphones";
		switch (Products.valueOf(productName)) {
		case Smartphones:
			System.out.println("Smartphones");
			break;
		case Smart_TV:
			System.out.println("Smart_TV");
			break;
		case Refrigerators:
			System.out.println("Refrigerators");
			break;
		}

	}

	enum Products {
		Smartphones, Smart_TV, Refrigerators;
	}

}