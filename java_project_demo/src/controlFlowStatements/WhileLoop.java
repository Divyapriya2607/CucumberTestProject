package controlFlowStatements;

public class WhileLoop {

	public static void main(String[] args) {
		int i = 10;
		while (i >= 10) {
			System.out.println(i);
			i++;
			if (i == 50) {
				break;
			}
		}
	}

}