package javaConcept;

class Shape {

	public void draw() {
		System.out.println("Draw a shape");
	}

}

class Rectangle extends Shape {

	public void rectangle() {
		System.out.println("Draw a rectangle......");
	}

}

public class singleInheritance {

	public static void main(String[] args) {

		Rectangle rec = new Rectangle();
		rec.draw();
		rec.rectangle();

	}

}