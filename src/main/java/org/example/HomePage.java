package org.example;
import java.util.Scanner;
public class HomePage {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String first_name;
		System.out.print("Enter your first name:");
		first_name = scanner.next();

		String family_name;
		System.out.print("Enter your family name:");
		family_name = scanner.next();

		String full_name;
		full_name=first_name + " " + family_name;
		System.out.print("Hello" + " " + full_name);
	}
}

