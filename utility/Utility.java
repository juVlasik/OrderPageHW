package utility;

import java.util.Random;

public class Utility {
	
	  public static void containsText(String expected, String actual) {
			
			if (actual.contains(expected)) {
				System.out.println("PASSED\n" + "Expected text: " + expected + "\n" + " Actual: "+ actual);}
				else {
					System.out.println(" FAILED\n" + "Expected: " + expected + "\n" + " Actual: "+ actual );
				}
			}

	      public static String randomNum(int a) {
			
	    	  //will generate a random number containing "a" random numbers
	    	  
			Random random = new Random();
			String myNum="";
			
			for (int i=0; i<a; i++) {
				int randNum = random.nextInt(9);
				myNum += randNum;
			     }
			return myNum;
			}
			
		
		public static int randomQuantity(int a) {
			
			//will generate one random number in a range of "a"
			
			Random random = new Random();
			int randQuantity = random.nextInt(a);
			return randQuantity;
		}
		
		public static String randomName(int a) {
			
			//Will generate "a" number of lower case letters plus 1 random UPPERCASE
			
			Random random = new Random();
	        char rand1stLetter = (char)(65 + random.nextInt(27));
			
	        String genString="";
			
				for (int i=0; i<a; i++) {
					char randLetter = (char)(97 + random.nextInt(26));
					genString += randLetter;}
				
			return rand1stLetter+genString;
		}

}
