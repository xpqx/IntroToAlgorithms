package stackDataStructure;

import java.util.Arrays;

//--this test listing 5.1 in Schaum's Outline Chapter 5 Softcover book
public class TestStack5_1 {
	public static void main(String[] args) {
		Stack stack = new ArrayStack(6);
		stack.push(new Character('A'));
		stack.push(new Character('B'));
		stack.push(new Character('C'));
		System.out.println("crates.size(): " + stack.size() + "\tcrates.peek():" + stack.peek());
		stack.pop();
		stack.pop();
		stack.push(new Character('D'));
		stack.push(new Character('E'));
		stack.push(new Character('F'));
		stack.pop();
		stack.push(new Character('G'));
		stack.pop();
		stack.pop();
		stack.pop();
	}
}
