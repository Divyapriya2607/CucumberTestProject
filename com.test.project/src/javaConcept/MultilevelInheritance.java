package javaConcept;

class Search {

	public void searchItem() {
		System.out.println("Expected product found");
	}

}

class Select extends Search {

	public void selectItem() {
		System.out.println("Searched product is selected");
	}

}

class Order extends Select {

	public void orderItem() {
		System.out.println("Product order is completed!");
	}

}

public class MultilevelInheritance {

	public static void main(String[] args) {
		Order o = new Order();
		o.searchItem();
		o.selectItem();
		o.orderItem();
	}

}