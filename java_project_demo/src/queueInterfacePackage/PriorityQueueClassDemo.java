package queueInterfacePackage;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueClassDemo {

	public static void main(String[] args) {
		Queue<String> que = new PriorityQueue<String>();
		que.add("Java");
		que.add("C#");
		que.add("Selenium WebDriver");
		que.add("Selenium IDE");
		que.add("Selenium Grid");
//		que.add(null);
		que.add("Java");

		System.out.println(que);

		que.remove();

		System.out.println(que);

		Iterator itr = que.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

//		ASCII Values
//		char ch1 = 'J';
//		char ch2 = 'C';
//		char ch3 = 'S';
//		char ch4 = 'W';
//		char ch5 = 'I';
//		char ch6 = 'G';
//		int asciiKey1 = ch1;
//		int asciiKey2 = ch2;
//		int asciiKey3 = ch3;
//		int asciiKey4 = ch4;
//		int asciiKey5 = ch5;
//		int asciiKey6 = ch6;
//		System.out.println("J: " + asciiKey1);
//		System.out.println("C: " + asciiKey2);
//		System.out.println("S: " + asciiKey3);
//		System.out.println("W: " + asciiKey4);
//		System.out.println("I: " + asciiKey5);
//		System.out.println("G: " + asciiKey6);
	}

}