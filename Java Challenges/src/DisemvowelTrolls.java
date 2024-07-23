
public class DisemvowelTrolls {

	public static void main(String[] args) {

//		Trolls are attacking your comment section!
//
//		A common way to deal with this situation is to remove all of the vowels from the trolls' comments, neutralizing the threat.
//
//		Your task is to write a function that takes a string and return a new string with all vowels removed.
//
//		For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".
//
//		Note: for this kata y isn't considered a vowel.
		
		System.out.println(Troll1( "This website is for losers LOL!"));
		System.out.println(Troll2( "This website is for losers LOL!"));

	}
	
	public static String Troll1(String str) {
	        
	      return str.replaceAll("[aAeEiIoOuU]", "");
	      
	    }

	public static String Troll2(String str) {
	        
	        String text = "";  
	      
	        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
	        
	        char[] splitStr = str.toCharArray();
	      
	        for(char letter : splitStr) {
	          
	          boolean isVowel = false;
	          
	          for(char vowel : vowels) {
	            
	            if(letter == vowel || letter == Character.toUpperCase(vowel)) {
	              
	              // Compares if the letter is equal to an uppercase vowel or a lowercase vowel
	              
	              isVowel = true;
	              
	            }
	            
	          }
	          
	          if(!isVowel) {
	            
	            text = text + letter;
	            
	          }
	          
	        } 
	        
	      return text;
	    }

}
