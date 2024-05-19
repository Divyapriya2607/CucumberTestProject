package queueInterfacePackage;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ArrayDequeClass {

	public static void main(String[] args) {
		Deque<Integer> dque = new ArrayDeque<Integer>();
		dque.add(200);
		dque.add(300);

		System.out.println(dque);
//		Adds first and last element
		dque.addFirst(100);
		dque.addLast(400);
//		System.out.println(dque);

//		Removes first and last element
//		dque.removeFirst();
//		dque.removeLast();
//		System.out.println(dque);

		Iterator itr = dque.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println();

		itr = dque.descendingIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}