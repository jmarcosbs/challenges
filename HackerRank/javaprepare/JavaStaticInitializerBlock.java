package javaprepare;

import java.util.Scanner;

public class JavaStaticInitializerBlock {

	static int B;
	static int H;
	static boolean flag = true;

	static {
	    
	    Scanner sc = new Scanner(System.in);
	    B = sc.nextInt();
	    H = sc.nextInt();
	    sc.close();
	    
	    try {
	        if (B <= 0 || H <= 0) {
	            flag = false;
	            throw new Exception("Breadth and height must be positive");
	        }
	        } catch (Exception e) {
	            System.out.println(e);
	        }
	    
	}
	
	public static void main(String[] args) {


//		Static initialization blocks are executed when the class is loaded, and you can
//		initialize static variables in those blocks.
//
//		It's time to test your knowledge of Static initialization blocks.
//		You can read about it here.
//
//		You are given a class Solution with a main method. Complete the given code so
//		that it outputs the area of a parallelogram with breadth  and height . You should read the variables from the standard input.
		
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
		

	}

}
