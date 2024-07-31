package javaprepare;

import java.util.Scanner;

public class JavaStdinAndStdoutI {

	public static void main(String[] args) {

//		Most HackerRank challenges require you to read input from stdin (standard input) and write output to stdout (standard output).
//		One popular way to read input from stdin is by using the Scanner class and specifying the Input Stream as System.in.

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		scan.close();

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}

}
