package test;

import java.util.Scanner;

public class Ex2884 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int m = scan.nextInt();

		if (h > 0) {
			if (m < 45) {
				h = h - 1;
				m = m + 15;
				System.out.println(h + " " + m);
			} else if (m >= 45) {
				m = m - 45;
				System.out.println(h + " " + m);
			}
		} else if (h == 0) {
			if (m < 45) {
				h = 23;
				m = m + 15;
				System.out.println(h + " " + m);
			} else if (m >= 45) {
				m = m - 45;
				System.out.println(h + " " + m);
			}
		}
		scan.close();
	}
}
