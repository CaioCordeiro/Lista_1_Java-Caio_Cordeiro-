package ComparadorDeStrings;

import java.util.Scanner;

public class ComparadorDeStrings {
	public ComparadorDeStrings() {
	}

	public boolean isReverse(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}
		for (int i = 0; i < str1.length(); i++) {
			if ((str1.toCharArray()[i]) == ((str2.toCharArray())[((str2.length() - i) - 1)])) {
				continue;
			} else {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str1;
		String str2;
		ComparadorDeStrings comp = new ComparadorDeStrings();
		System.out.print("String 1: ");
		str1 = input.nextLine();
		System.out.println();
		System.out.print("String 2: ");
		str2 = input.nextLine();
		System.out.println(comp.isReverse(str1, str2));
		input.close();

	}
}
