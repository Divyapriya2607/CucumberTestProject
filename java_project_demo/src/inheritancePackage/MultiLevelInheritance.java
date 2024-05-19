package inheritancePackage;

class Shape {

	public void draw() {
		System.out.println("Drawing a shape");
	}

}

class Circle extends Shape {

	public void drawCircle() {
		System.out.println("Drawing a Circle");
	}

}

class Rectangle extends Circle {

	public void drawRectangle() {
		System.out.println("Drawing a Rectangle");
	}

}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		rect.draw();
		rect.drawCircle();
		rect.drawRectangle();
	}

}