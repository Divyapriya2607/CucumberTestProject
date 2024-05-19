package arraysPackage;

public class MultiDimArray {

	public static void main(String[] args) {
		int num[][] = new int[2][2];
		num[0][0] = 100;
		num[0][1] = 200;
		num[1][0] = 300;
		num[1][1] = 400;
		row: for (int i = 0; i < num.length; i++) {
			column: for (int j = 0; j < num.length; j++) {
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}
	}

}