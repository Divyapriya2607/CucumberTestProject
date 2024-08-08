package controlFlowStatements;

public class NestedForLoop {

	public static void main(String[] args) {

		loop1: for (int i = 1; i <= 3; i++) {

			System.out.println("i= " + i);

			loop2: for (int j = 1; j <= 3; j++) {
				
				System.out.println("j= " + j);
				
			}

		}

	}

}