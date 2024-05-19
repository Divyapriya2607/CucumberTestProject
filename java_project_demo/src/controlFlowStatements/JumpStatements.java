package controlFlowStatements;

public class JumpStatements {

	public static void main(String[] args) {
		for (int i = 1; i <= 20; i++) {
			if (i == 11) {
//				break;
				continue;
			}
			System.out.println(i);
		}
	}

}