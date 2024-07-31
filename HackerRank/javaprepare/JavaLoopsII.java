package javaprepare;

import java.util.Scanner;

public class JavaLoopsII {

	public static void main(String[] args) {


//		We use the integers , , and  to create the following series:
//		You are given  queries in the form of , , and . For each query,
//		print the series corresponding to the given , , and  values as a single line of  space-separated integers.
		
		Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int calc = a;
            String result = "";
            for(int j = 0; j < n; j++) {
                
                calc += (Math.pow(2, j) * b);
                result += String.valueOf(calc) + " ";
                
            }
            System.out.println(result);

        }
        in.close();
			

	}

}
