package debugging;

public class FindNextPerfectSquare {

	public static void main(String[] args) {


//		You might know some pretty large perfect squares. But what about the NEXT one?
//
//	  	Complete the findNextSquare method that finds the next integral perfect
//		square after the one passed as a parameter. Recall that an integral perfect square is an integer n such that sqrt(n) is also an integer.
//
//		If the argument is itself not a perfect square then return either -1 or an empty value like None or null, depending on your language.
//		You may assume the argument is non-negative.
//
//		Examples ( Input --> Output )
//		121 --> 144
//		625 --> 676
//		114 --> -1  #  because 114 is not a perfect square
		
		System.out.println(findNextSquare(625));
		

	}

	public static long findNextSquare(long sq) {
		
		
		if(Math.sqrt(sq) % 1 != 0) {
			
			return -1;
			
		} else {
			
			sq++;
			
			while(Math.sqrt(sq) % 1 != 0) {
				
				sq++;
				
			}
			
			return (long) sq; 
			
		}
		 
	    
	}
}
