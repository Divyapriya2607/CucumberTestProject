package arraysPackage;

public class MatchArrayValues {

	public static void main(String[] args) {
		String FruitList1[] = { "Apple", "Banana", "Cherry" };
		String FruitList2[] = new String[4];
		FruitList2[0] = "Strawberry";
		FruitList2[1] = "Watermelon";
		FruitList2[2] = "Banana";
		FruitList2[3] = "Apple";
		fruitList1: for (int i = 0; i < FruitList1.length; i++) {
			String storeFruit1 = FruitList1[i];
			fruitList2: for (int j = 0; j < FruitList2.length; j++) {
				String storeFruit2 = FruitList2[j];
				if (storeFruit1.equals(storeFruit2)) {
					System.out.println("Fruit [" + storeFruit2 + "] matched");
					//break fruitList1;
				}
			}
		}
	}

}