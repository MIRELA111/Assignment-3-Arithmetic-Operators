package arithmeticOperators;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 Write a program that outputs the number of hours, minutes, and seconds that
		 corresponds to input total seconds.
		 
		 Declare and initialise variables inputSeconds, hours, minutes, seconds
		 Initialise the inputSeconds
		 
		 Using % (remainder) and / operators, find out how many whole hours, minutes and
		 seconds are in inputSeconds.
		 
		 Assign values to the hours, minutes, seconds variables
		 
		 Display the result:
		 
		 Sample Output:
		 inputSecond is 3695
		 
		 1 hours, 1 minutes, and 35 seconds
		 */
		int totalSeconds;
		int inputSeconds;
		
		
		
		int seconds = 3695;
		int hours= (seconds /3600)%24;
		seconds=seconds%3600;
		int minutes = seconds/60;
		seconds = seconds%60;
		
	
		

		
		
		System.out.println( hours + " hours," + minutes + " minutes " + seconds + " seconds");
		
		
		
		
		

	}

}
