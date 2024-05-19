package controlFlowStatements;

import java.util.Scanner;

public class StringMatcher {

	public static void main(String[] args) {
		String text = "Good day";

		Scanner scan = new Scanner(System.in);

		String enteredText = null;

		int tryCount = 5;

		int i = 1;

		while (i <= tryCount) {
			System.out.println("Enter the text: ");
			enteredText = scan.nextLine();
			if (enteredText.equals(text)) {
				System.out.println("Matched");
				break;
			} else {
				System.out.println(
						"Entered text doesn't match please re-enter[No. of tries left " + (tryCount - i) + "]");
			}
			i++;
		}

	}

}