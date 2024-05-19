package controlFlowStatements;

public class NestedIf {

	public static void main(String[] args) {
		int i = 10;
		if (i > 20) {
			System.out.println("Entered If Condition 1");
			if (i > 20) {
				System.out.println("Entered If Condition 2");
			} else {
				System.out.println("Else Condition 2 Failed!");
			}
		} else {
			System.out.println("Else Condition 1 Failed!");
		}
	}

}