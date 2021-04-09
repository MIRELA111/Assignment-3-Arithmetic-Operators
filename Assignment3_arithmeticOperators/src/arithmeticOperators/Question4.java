package arithmeticOperators;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 Declare 2 variables (Num1,Num2)
		 Swap values between Num1 and Num2
		 Display new values of Num1 and Num2
		 
		 sample output:
		 
		 n1=10
		 n2=20
		 
		 ---------
		 
		 n1=20
		 n2=10
		 */
		
		int n1, n2;
		n1=10;
		n2=20;
		
		System.out.println("Before swapping : n1, n2 = "+n1+" , "+ + n2 );
		
		n1 = n1 + n2;
		n2 = n1 - n2;
		n1 = n1 - n2;
		 
		 
		 System.out.println("After swapping :  n1 , n2 = " +n1+" , "+ + n2);
				

	}

}
