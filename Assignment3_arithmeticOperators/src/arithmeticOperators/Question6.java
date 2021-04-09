package arithmeticOperators;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 Scientists estimate that roughly 10 grams of caffeine consumed at one time is a lethal overdose.
		 
		 Write a program with a variable that holds the number of milligrams of caffeine in a 
		 drink and outputs how many drinks it takes to kill a person.
		 
		 Sample Output:
		 
		 Number of milligrams in drink:500
		 It would take about 20 drinks for a lethal overdose.
		 
		 */
		
		int milligramsDrink=500;
		int gramsOfCaffeine=10;
		int oneGram=1000;
		int num_drink , milligramsOfCaffeine;
		int drinks=20;
		
		
		milligramsOfCaffeine=gramsOfCaffeine*oneGram/drinks;
		num_drink=(gramsOfCaffeine*oneGram)/milligramsDrink;
		
		
		
	
		
		System.out.println("Number of milligrams in drink:" + milligramsOfCaffeine );
		System.out.println("It would take about " + num_drink + " drinks for a lethal overdose" );
		

	}

}
