package javaprepare;

import java.util.Scanner;

public class JavaOutputFormatting {

	public static void main(String[] args) {
		
//		Java's System.out.printf function can be used to print formatted output.
//		The purpose of this exercise is to test your understanding of formatting output using printf.

		Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            
            System.out.printf("%-15s%03d\n", s1, x);
            
        }
        System.out.println("================================");

        sc.close();
	}

}
