package javaprepare;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaLoopsI {

	public static void main(String[] args) throws NumberFormatException, IOException {

//		In this challenge, we're going to use loops to help us do some simple math.
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        for(int i = 1; i <= 10; i++) {
            
            System.out.printf("%d x %d = %d\n", N, i, N*i);
            
            
        }

        bufferedReader.close();

	}

}
