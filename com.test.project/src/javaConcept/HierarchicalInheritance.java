package javaConcept;

class Animal {

	public void categoryDomestic() {
		System.out.println("Category: Domestic Animal");
	}

	public void categoryWild() {
		System.out.println("Category: Wild Animal");
	}

}

class Dog extends Animal {

	public void breedOfDog() {
		System.out.println("Dog breed: German Sheperd");
	}

}

class Cat extends Animal {

	public void breedOfCat() {
		System.out.println("Cat breed: Persian");
	}

}

class Tiger extends Animal {

	public void breedOfTiger() {
		System.out.println("Tiger breed: Asian");
	}

}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		tiger.categoryWild();
		tiger.breedOfTiger();
	}

}