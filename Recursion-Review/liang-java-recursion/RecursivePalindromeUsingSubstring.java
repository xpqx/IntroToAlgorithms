package recursion.liang;

import java.util.Scanner;

public class RecursivePalindromeUsingSubstring {
	public static boolean isPalindrome(String s) {
		if (s.length() <= 1) {
			return true;
		}
		else if (s.charAt(0) != s.charAt(s.length() - 1)){//base case
			return false;
		}
		else {
			return isPalindrome(s.substring(1, s.length() - 1));
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a palindrome: ");
		String s1 = input.next();
		System.out.println(isPalindrome(s1));
	}

}
