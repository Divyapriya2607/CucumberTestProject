package polymorphismPackage;

class Menu {

	public void display() {
		System.out.println("Displaying Menu options......");
	}

}

class NewMenu extends Menu {

	public void display() {
		System.out.println("Displaying New Menu options......");
	}

}

public class MethodOverriding {

	public static void main(String[] args) {
		NewMenu nm = new NewMenu();
		nm.display();
	}

}