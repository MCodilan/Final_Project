//adds a scanner to read user input
import java.util.Scanner;
/**
 *Name: Mihailo Codilan
 *Teacher: Mr.Hardman
 *Assignment Final, Scientific Calculator
 *\January 25th, 2017
 */
public class ScientificCalculator {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		double answer = 0;
		double firstNum = 0;
		double secondNum = 0;
		String firstChoice;
		String secondChoice;
		
		String userOpChoice;
		String[] name = {"Addition","Subtraction","Multiplication","Division","Factorial", "Permutation" ,"Combination", "Logarithm (Base 10)", "Logarithm (Base e)", "Roots", "Powers", "Sine", "Cosine", "Tangent", "Sine-1", "Cosine-1", "Tangent-1", "Pi" };
		String[] operation = {"+","-","x","÷","!", "P", "C", "Log", "Ln", "rt", "pwr", "sin", "cos", "tan", "sin-1", "cos-1", "tan-1", "pi" };
		
		//this loop, allows the calculator basic function-while the condition(answe=OFF) is not met
		do {
			//Prompts the user to enter a numerical value
			System.out.println("Please enter a numerical value.");
			firstChoice = userInput.next();
			
			//if the user choice is not equal to off-run following code
			if( !firstChoice.equalsIgnoreCase("OFF")){
				
				if( firstChoice.equalsIgnoreCase("Pi")){
					
					firstNum = Math.PI;
					
				}else if(firstChoice.equalsIgnoreCase("ANS")){
					
					firstNum = answer;
				
				}else{
					//Conversion from string to double
					firstNum = Double.parseDouble(firstChoice);
				
				}
			
				//Prompts the user to select an operation
				System.out.println("Please select an operation.");
				
				// d=int - f=decimal - s=string
				for ( int i = 0; i < name.length; i++){
									
					System.out.println(String.format("%-20s %-20s", name[i], operation[i]));
				
				}
				
				//Prompts the user to select an operation
				userOpChoice = userInput.next();
				
				//If the user selects addition, calls upon addition method to calculate a sum
				if(userOpChoice.equals("+")){
					
					System.out.println( "Please enter a second numerical value");
					secondChoice = userInput.next();
	
					if( secondChoice.equalsIgnoreCase("Pi")){
						
						secondNum = Math.PI;
					
					}else if(secondChoice.equalsIgnoreCase("ANS")){
						
						secondNum = answer;
					
					}else{
					
						secondNum = Double.parseDouble(secondChoice);
					
					}
					
					answer = numberAddition(firstNum, secondNum);
					System.out.println(firstNum + " + " + secondNum + " = " + answer);
					
				}
				
				//If the user selects subtraction, calls upon subtraction method to calculate a difference
				if(userOpChoice.equals("-")){
					
					System.out.println( "Please enter a second numerical value");
					secondChoice = userInput.next();
	
					if( secondChoice.equalsIgnoreCase("Pi")){
						
						secondNum = Math.PI;
					
					}else if(secondChoice.equalsIgnoreCase("ANS")){
					
						secondNum = answer;
					
					}else{
						//Conversion from string to double
						secondNum = Double.parseDouble(secondChoice);
					
					}
					
					answer = numberSubtraction(firstNum, secondNum);
					System.out.println(firstNum + " - " + secondNum + " = " + answer);
					
				}
				
				//If the user selects multiplication, calls upon multiplication method to calculate a product
				if(userOpChoice.equalsIgnoreCase("x")){
					
					System.out.println( "Please enter a second numerical value");
					secondChoice = userInput.next();
	
					if( secondChoice.equalsIgnoreCase("Pi")){
						
						secondNum = Math.PI;
					
					}else if(secondChoice.equalsIgnoreCase("ANS")){
					
						secondNum = answer;
					
					}else{
						
						secondNum = Double.parseDouble(secondChoice);
					
					}
					
					answer = numberMultiplication(firstNum, secondNum);
					System.out.println(firstNum + " x " + secondNum + " = " + answer);
					
				}
				
				//If the user selects division, calls upon division method to calculate a quotient
				if(userOpChoice.equals("/")){
					
					System.out.println( "Please enter a second numerical value");
					secondChoice = userInput.next();
	
					if( secondChoice.equalsIgnoreCase("Pi")){
						
						secondNum = Math.PI;
					
					}else if(secondChoice.equalsIgnoreCase("ANS")){
						
						secondNum = answer;
					
					}else{
						
						secondNum = Double.parseDouble(secondChoice);
					
					}
					
					answer = numberDivision(firstNum, secondNum);
					System.out.println(firstNum + " ÷ " + secondNum + " = " + answer);
					
				}
				
				//If the user selects factorial, calls upon factorial method to calculate a factorial
				if(userOpChoice.equals("!")){
					
					answer = numberFactorial(firstNum);
					System.out.println(firstNum + "! = " + answer);
					
				}
				
				//If the user selects root, calls upon root class to calculate a root
				if(userOpChoice.equalsIgnoreCase("rt")){
					
					answer = numberRoot(firstNum);
					System.out.println(firstNum + "rt = " + answer);
					
				}
				
				//If the user selects power, calls upon power method to calculate a power
				if(userOpChoice.equalsIgnoreCase("pwr")){
					
					System.out.println( "Please enter a second numerical value");
					secondChoice = userInput.next();
	
					if( secondChoice.equalsIgnoreCase("Pi")){
						
						secondNum = Math.PI;
					
					}else if(secondChoice.equalsIgnoreCase("ANS")){
						
						secondNum = answer;
					
					}else{
						
						secondNum = Double.parseDouble(secondChoice);
					
					}
					
					answer = numberPower(firstNum, secondNum);
					System.out.println(firstNum + "^" + secondNum +" = " + answer);
				}
				
				//If the user selects permutation, calls upon permutation method to calculate the permutation of two numbers
				if(userOpChoice.equalsIgnoreCase("P")){
					
					System.out.println( "Please enter a second numerical value");
					secondChoice = userInput.next();
	
					if(secondChoice.equalsIgnoreCase("ANS")){
					
						secondNum = answer;
					
					}else{
					
						secondNum = Double.parseDouble(secondChoice);
					
					}
					
					answer = numberPermutation(firstNum, secondNum);
					System.out.println(firstNum + "P" + secondNum + " = " + answer);
					
				}
				
				
				//If the user selects combination, calls upon combination method to calculate the combination of two numbers
				if(userOpChoice.equalsIgnoreCase("C")){
					
					System.out.println( "Please enter a second numerical value");
					secondChoice = userInput.next();
	
					if(secondChoice.equalsIgnoreCase("ANS")){
					
						secondNum = answer;
					
					}else{
					
						secondNum = Double.parseDouble(secondChoice);
					
					}
					
					answer = numberCombination(firstNum, secondNum);
					System.out.println(firstNum + " C " + secondNum + " = " + answer);
					
				}
				
				//If the user selects Logarithm Base 10, calls upon Logarithm Base 10 method to calculate the Logarithm of a number
				if(userOpChoice.equalsIgnoreCase("Log")){
	
					answer = numberLogarithmBaseTen(firstNum);
					System.out.println(" Log10 (" + firstNum + ")" + " = " + answer);
					
				}
				
				//If the user selects Logarithm Base e, calls upon Logarithm Base e method to calculate the natural Logarithm of a number
				if(userOpChoice.equalsIgnoreCase("Ln")){
	
					answer = numberLogarithmBaseE(firstNum);
					System.out.println(" Log-e (" + firstNum + ")" + " = " + answer);
					
				}
				
				//If the user selects Sine-1 trigonometry ratio, calls upon inverse sine trigonometry ratio method to calculate the sine value of an radian
				if(userOpChoice.equalsIgnoreCase("sin-1")){
	
					answer = numberSineInverse(firstNum);
					System.out.println("sin-1(" + firstNum + ") = " + answer);
							
				}
				
				//If the user selects Cosine-1 trigonometry ratio, calls upon inverse cosine trigonometry ratio method to calculate the sine value of a radian
				if(userOpChoice.equalsIgnoreCase("cos-1")){
	
					answer = numberCosineInverse(firstNum);
					System.out.println("cos-1(" + firstNum + ") = " + answer);
									
				}
						
				//If the user selects Tangent-1 trigonometry ratio, calls upon inverse tan trigonometry ratio method to calculate the sine value of a radian
				if(userOpChoice.equalsIgnoreCase("tan-1")){
	
					answer = numberTangentInverse(firstNum);
					System.out.println("tan-1(" + firstNum + ") = " + answer);
									
				}
				
				//If the user selects Sine trigonometry ratio, calls upon sine trigonometry ratio method to calculate the sine value of an radian
				if(userOpChoice.equalsIgnoreCase("sin")){
	
					answer = numberSine(firstNum);
					System.out.println("sin(" + firstNum + ") = " + answer);
									
				}
						
				//If the user selects Cosine trigonometry ratio, calls upon cosine trigonometry ratio method to calculate the sine value of a radian
				if(userOpChoice.equalsIgnoreCase("cos")){
	
					answer = numberCosine(firstNum);
					System.out.println("cos(" + firstNum + ") = " + answer);
											
				}
								
				//If the user selects Tangent trigonometry ratio, calls upon tan trigonometry ratio method to calculate the sine value of a radian
				if(userOpChoice.equalsIgnoreCase("tan")){
	
					answer = numberTangent(firstNum);
					System.out.println("tan(" + firstNum + ") = " + answer);
											
				}
			
			}

		}while(!firstChoice.equalsIgnoreCase("OFF"));
		userInput.close();
		
	}
	/**
	 * numberSineInverse calculates the inverse sine value of the radian entered by a user
	 * 
	 * @param initial are the number the user enters
	 * 
	 * @return calculated inverse sine value for the entered radian
	 */
	public static double numberSineInverse(double initial) {
		
		double answer = 1;
		
		answer = Math.asin(initial);
		
		return answer;
		
	}
	/**
	 * numberCosineInverse calculates the inverse Cosine value of the radian entered by a user
	 * 
	 * @param initial are the number the user enters
	 * 
	 * @return calculated inverse cosine value for the entered radian
	 */
	public static double numberCosineInverse(double initial) {
		
		double answer = 1;
		
		answer = Math.acos(initial);
		
		return answer;
		
	}
	/**
	 * numberTangentInverse calculates the inverse tangent value of the radian entered by a user
	 * 
	 * @param initial are the number the user enters
	 * 
	 * @return calculated inverse tangent value for the entered radian
	 */
	public static double numberTangentInverse(double initial) {
		
		double answer = 1;
		
		answer = Math.atan(initial);
		
		return answer;
		
	}
	/**
	 * numberTangent calculates the tangent value of the radian entered by a user
	 * 
	 * @param initial are the number the user enters
	 * 
	 * @return calculated tangent value for the entered radian
	 */
	public static double numberTangent(double initial) {
		
		double answer = 1;
		
		answer = Math.tan(initial);
		
		return answer;
		
	}
	/**
	 * numberCosine calculates the Cosine value of the radian entered by a user
	 * 
	 * @param initial are the number the user enters
	 * 
	 * @return calculated cosine value for the entered radian
	 */
	public static double numberCosine(double initial) {
		
		double answer = 1;
		
		answer = Math.cos(initial);
		
		return answer;
		
	}
	/**
	 * numberSine calculates the sine value of the radian entered by a user
	 * 
	 * @param initial are the number the user enters
	 * 
	 * @return calculated sine value for the entered radian
	 */
	public static double numberSine(double initial) {
		
		double answer = 1;
		
		answer = Math.sin(initial);
		
		return answer;
		
	}
	/**
	 * numberCombination calculates the Combination of the numbers entered by a user
	 * 
	 * @param initial and initial2 are the number the user enters
	 * 
	 * @return calculated combination for the entered numbers
	 */
	public static double numberCombination(double initial, double initial2) {
		
		double answer = 1;
		
		answer = numberPermutation(initial, initial2) / numberFactorial(initial - initial2);
		
		return answer;
		
	}
	/**
	 * numberPermutation calculates the Permutation of the numbers entered by a user
	 * 
	 * @param initial and initial2 are the numbers the user enters
	 * 
	 * @return calculated permutation of the entered numbers
	 */
	public static double numberPermutation(double initial, double initial2) {
		
		double answer = 1;
		double permNum = 1;
		double permNum2 = 1;
		
		for (double i = initial; i > 0; i--){
			
			permNum = permNum * i;
			
		}
		
		for (double i = initial2; i > 0; i--){
			
			permNum2 = permNum2 * i;
			
		}
		
		answer = permNum / permNum2;
		
		return answer;
		
	}
	/**
	 * numberLogarithmBaseE calculates the natural logarithm of the number entered by a user
	 * 
	 * @param initial is the number the user enters
	 * 
	 * @return calculated natural logarithm value for the entered number
	 */
	public static double numberLogarithmBaseE(double initial) {
		
		double answer = 1;
		
		answer = Math.log(initial);

		return answer;
		
	}
	/**
	 * numberLogarithmBaseTen calculates the base 10 logarithm of the number entered by a user
	 * 
	 * @param initial is the number the user enters
	 * 
	 * @return calculated logarithm base 10 value for the entered number
	 */
	public static double numberLogarithmBaseTen(double initial) {
		
		double answer = 1;
		
		answer = Math.log10(initial);

		return answer;
		
	}
	/**
	 * numberFactorial calculates the factorial of the number entered by a user
	 * 
	 * @param initial is the number the user enters
	 * 
	 * @return calculated factorial for the entered number
	 */
	public static double numberFactorial(double initial) {
		
		double answer = 1;
		
		for (double i = initial; i > 0; i--){
			
			answer = answer * i;
			
		}
		
		return answer;
		
	}
	/**
	 * numberSubtraction calculates the difference of the numbers entered by a user
	 * 
	 * @param initial and initial2 are the numbers the user enters
	 * 
	 * @return calculated difference for the entered numbers
	 */
	public static double numberSubtraction(double initial, double initial2) {
		
		double answer = 1;
		
		answer = initial - initial2;
		
		return answer;
	}
	/**
	 * numberMultiplication calculates the product of the numbers entered by a user
	 * 
	 * @param initial and initial2 are the numbers the user enters
	 * 
	 * @return calculated product for the entered numbers
	 */
	public static double numberMultiplication(double initial, double initial2) {
		
		double answer = 1;
		
		answer = initial * initial2;
		
		return answer;
	}
	/**
	 * numberDivision calculates the quotient of the numbers entered by a user
	 * 
	 * @param initial and initial2 are the numbers the user enters
	 * 
	 * @return calculated quotient for the entered numbers
	 */
	public static double numberDivision(double initial, double initial2) {
		
		double answer = 1;
		
		answer = initial / initial2;
		
		return answer;
	}
	/**
	 * numberAddition calculates the sum of the numbers entered by a user
	 * 
	 * @param initial and initial2 are the numbers the user enters
	 * 
	 * @return calculated sum for the entered numbers
	 */
	public static double numberAddition(double initial, double initial2) {
		
		double answer = 1;
		
		answer = initial + initial2;
		
		return answer;
	}
	/**
	 * numberRoot calculates the root of the number entered by a user
	 * 
	 * @param initial is the number the user enters
	 * 
	 * @return calculated root for the entered number
	 */
	public static double numberRoot(double initial) {
		
		double answer = 1;
		
		answer = Math.sqrt(initial);
		
		return answer;
	}
	/**
	 * numberPower calculates the answer of the first number entered, raised to the power of the second number entered by a user
	 * 
	 * @param initial and initial2 are the numbers the user enters
	 * 
	 * @return calculated power for the entered number
	 */
	public static double numberPower(double initial, double initial2) {
		
		double answer = 1;
		
		for (double i = 0; i < initial2; i++){
			
			answer = answer * initial;
			
		}
		
		return answer;
	
	}

}