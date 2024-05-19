package controlFlowStatements;

public class ElseIfLadder {

	public static void main(String[] args) {
		int index = 10;
		if (index > 20) {
			System.out.println("If Condition Passed");
		} else if (index >= 20) {
			System.out.println("Else If condition 1 Passed");
		} else if (index <= 20 && index > 20) {
			System.out.println("Else If condition 2 Passed");
		} else {
			System.out.println("None of the Condition is Passed");
		}
	}

}