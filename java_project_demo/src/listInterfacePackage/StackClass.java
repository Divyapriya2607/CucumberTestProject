package listInterfacePackage;

import java.util.Stack;

public class StackClass {

	public static void main(String[] args) {
		Stack<String> stk = new Stack<String>();
		stk.push("Test 1");
		stk.push("Test 2");
		stk.push("Test 3");
		stk.push("Test 4");
		stk.push("Test 5");

		System.out.println("Stored values: " + stk);
//		stk.pop();
//		System.out.println("Modified values1: " + stk);
//		stk.pop();
//		System.out.println("Modified values2: " + stk);
		System.out.println("Head value: " + stk.peek());
	}

}