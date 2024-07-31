package javaprepare;

import java.util.Scanner;

public class JavaEndOfFile {

	public static void main(String[] args) {

//		The challenge here is to read n lines of input until you reach EOF, then number and print all  lines of content.

		Scanner sc = new Scanner(System.in);

		int count = 1;
		while (sc.hasNext()) {

			System.out.println(count + " " + sc.nextLine());
			count++;

		}

		sc.close();

	}

}
