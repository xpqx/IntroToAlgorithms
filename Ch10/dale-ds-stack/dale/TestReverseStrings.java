package stackDataStructure.dale;

import java.util.Scanner;



public class TestReverseStrings {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		BoundedStackInterface<String> stack;
		stack = new ArrayStack<String>(3);

		String line;

		for (int i = 1; i <= 3; i++) {
			System.out.print("Enter a line of text > ");
			line = input.nextLine();
			stack.push(line);
		}

		System.out.println("\nReverse is:\n");
		while(!stack.isEmpty()) {
			line = stack.top();
			stack.pop();
			System.out.println(line);
		}
	}
}


/*
 * OUTPUT
 * Enter a line of text > hello to my new car
Enter a line of text > my new truck is going to be awesome
Enter a line of text > running in the city is great

Reverse is:

running in the city is great
my new truck is going to be awesome
hello to my new car

 * 
 * 
 * 
 */
