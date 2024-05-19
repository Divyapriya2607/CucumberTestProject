package arraysPackage;

public class SingleDimArray {

	public static void main(String[] args) {
		int num[] = new int[6];
		num[0] = 100;
		num[1] = 200;
		num[2] = 300;
		num[3] = 400;
		num[4] = 500;
		num[5] = 600;
//		for (int i = 0; i < num.length; i++) {
//			System.out.println(num[i]);
//		}
//		for (int number : num) {
//			System.out.println(number);
//		}
		int i = 0;
		while (i < num.length) {
			System.out.println(num[i]);
			i++;
		}
	}

}