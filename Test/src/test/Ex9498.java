package test;

import java.util.Scanner;

public class Ex9498 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();

		if (x >= 90 && x <= 100) {
			System.out.println("A");
		} else if (x >= 80 && x <= 89) {
			System.out.println("B");
		} else if (x >= 70 && x <= 79) {
			System.out.println("C");
		} else if (x >= 60 && x <= 69) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
		scan.close();
	}//main
}//class
