package ex407;

import java.util.Scanner;
import java.util.function.Function;

public class bai2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		Function<String, Boolean> function = new Function<>() {

			@Override
			public Boolean apply(String t) {
				return isPalindrome(t);
			}
		};

		System.out.println(function.apply(s));
	}

	public static boolean isPalindrome(String s) {
		int j = s.length() - 1;
		int i = 0;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	
}
