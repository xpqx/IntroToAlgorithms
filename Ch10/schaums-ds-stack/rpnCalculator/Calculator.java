<<<<<<< HEAD
//package stackDataStructure.rpnCalculator;
||||||| merged common ancestors
package stackDataStructure.rpnCalculator;
=======
package stackDataStructure.rpnCalculator.schaums;
>>>>>>> c14c9f661c71fdbbef56ed2ce3bae1925d684e08

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Deque<String> stack = new ArrayDeque<String>();
		Scanner in = new Scanner(System.in);
		System.out.println("RPN Calculator Program, Enter a postfix expression: " );
		System.out.println();
		System.out.println("Enter 'q' or 'Q' to terminate the program:");
		while(true) {
			String input = in.nextLine();
			char ch = input.charAt(0);
			if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
				double y = Double.parseDouble(stack.pop());
				double x = Double.parseDouble(stack.pop());
				double z = 0;
				switch (ch) {
				case '+': z = x + y; break;
				case '-': z = x - y; break;
				case '*': z = x * y; break;
				case '/': z = x/y;
				}
				System.out.printf("\t%.2f %c %.2f = %.2f%n", x, ch, y, z);
				stack.push(new Double(z).toString());
			} else if (ch =='q' || ch == 'Q') {
				System.out.println("Program quits!");
				return;
			} else {
				stack.push(input);
			}
		}
	}
}

/*
 * SAMPLE OUTPUT
 * RPN Calculator Program, Enter a postfix expression: 
3
4
5
+
	4.00 + 5.00 = 9.00
*
	3.00 * 9.00 = 27.00
10
/
	27.00 / 10.00 = 2.70
1
-
	2.70 - 1.00 = 1.70
q
Program quits!

 * 
 * 
 * 
 * 
 */
