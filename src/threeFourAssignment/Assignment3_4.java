package threeFourAssignment;

public class Assignment3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 /*
  * 1.	Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
  * a.	Programmatically subtract the value of the first element in the array from the value in the 
  * last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
  * b.	Add a new age to your array and repeat the step above to ensure it is dynamic 
  * (works for arrays of different lengths).
  * c.	Use a loop to iterate through the array and calculate the average age. Print the result to the console.
  */
	//1.	
		System.out.println("The Elements in My Array are:");
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 40};
		
		for (int i = 0; i < ages.length; i++)
		System.out.println(ages[i]);
	//a.
		int firstElementMinusLastElement = ages[0] - ages[ages.length - 1];
		System.out.println(firstElementMinusLastElement + " " + "First Element Minus Last Element");
	//b.
		//ages[ages.length - 1] = 41;
		//int firstElementMinusLastElementB = ages[0] - ages[ages.length - 1];
		System.out.println(ages[ages.length -1] - ages[0] + " " + "First Element Minus Additional Last Element");
	//c.	
		int sum = 0;
			for (int age : ages) {
				sum += age;
			}
		System.out.println(sum + " " + "is the total of their ages");
		int average = sum / ages.length;
		System.out.println(average + " " + "is their average age");

	/*
	 * 2.	Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, 
	 * “Buck”, “Bob”.
	 * a.	Use a loop to iterate through the array and calculate the average number of letters per name. 
	 * Print the result to the console.
	 * b.	Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, 
	 * and print the result to the console.
	 */

	//2.
	String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
	
	
	System.out.println("******Names for Exercise******");
	
	for (int i = 0; i < names.length; i++) {
	 System.out.println(names[i]);	
	}
	
	//a.
	
	System.out.println("Question 2a.");
	
	
		int sumOfLetters = 0;
		for (int i = 0; i < names.length; i++) {
			sumOfLetters += names[i].length();
		}
	System.out.println(sumOfLetters / names.length);	
	
	//b.
		
	System.out.println("Qestion 2b.");
	

		String sumOfNames = "";
		
		for (String str : names) {
		sumOfNames += str + " ";
	}
		System.out.println(sumOfNames + " " + "Everybody Together");
		
	/*
	 * 3.	How do you access the last element of any array?
	 */ 
		System.out.println(ages[ages.length - 1]);
		
	 /* 4.	How do you access the first element of any array? 
	  * THIS IS MY CODE
	 */
	System.out.println(ages[0]);
	
	 /* 5.	Create a new array of int called nameLengths. 
	  * Write a loop to iterate over the previously created names array and 
	  * add the length of each name to the nameLengths array.
	 */ 
	int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		for (int i : nameLengths) {
			System.out.println(i);
		}
		
		
	 /* 6. Write a loop to iterate over the nameLengths array and 
	  * calculate the sum of all the elements in the array. Print the result to the console.
	 */
		int sumOfElements = 0;
		for (int i = 0; i < nameLengths.length; i++) {
			sumOfElements += nameLengths[i];
		}
		System.out.println(sumOfElements);
		
	 /* 7.Write a method that takes a String, word, and an int, n, as arguments 
	  * and returns the word concatenated to itself n number of times. 
	  * (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
	 */ 
		System.out.println(multipiedString("Forever", 8));
	
	 /* 8.Write a method that takes two Strings, firstName and lastName, and returns a full name 
	  * (the full name should be the first and the last name as a String separated by a space).
	 */ 
		String firstName = "Travis";
		String lastName = "Stokes";
		String fullName =  createFullName(firstName, lastName);
		System.out.println(fullName + " " + "is my name.");
	
	 /* 9.Write a method that takes an array of int and returns true if the sum of all the ints 
	  * in the array is greater than 100.
	 */ 
		
		System.out.println(isArraySumGreaterThan100(ages));
		
	 /* 10.Write a method that takes an array of double and returns the 
	  * average of all the elements in the array.
	 */
	double[] fun = {34.2, 67.99, 47.34, 88.2, 91.6};
	System.out.println(calculateAverage(fun) + "is the average for the created double array.");
	
	 /* 11.Write a method that takes two arrays of double and 
	  * returns true if the average of the elements in the first array is 
	  * greater than the average of the elements in the second array.
	 */ 
	double[] firstOne = {14, 23, 18, 26};
	double[] secondOne = {56, 89, 23, 72};
	System.out.println(isFirstAverageGreater(firstOne, secondOne));
	
	 /* 12.	Write a method called willBuyDrink that takes a boolean isHotOutside, and 
	  * a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
	 */ 
	boolean isHotOutside = true;
	double moneyInPocket = 11;
	System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
	
	 /* 13.	Create a method of your own that solves a problem. 
	  * In comments, write what the method does and why you created it.
	  * Should I mow the lawn? If lawn is greater than 7 inches I mow, if I have gasoline I mow.
	  * If neither is true I do not mow the lawn.
	 */
	
	boolean heigthOfLawnGreaterThanSeven = true;
	boolean haveFuel = true;
	System.out.println(mowTheLawn(heigthOfLawnGreaterThanSeven, haveFuel));
	}
	
	//7.
		public static String multipiedString(String str, int num) {
			String result = "";
			for (int i = 0; i < num; i++) {
				result += str;
			}
			return result;
		}
	//8.
		public static String createFullName(String x, String y) {
			return x + " " + y;
		}
			
	public static void greet(String name) {
		System.out.println("Hello, " + name);
	}
	//9. 
		public static boolean isArraySumGreaterThan100(int[] array) {
			int sum = 0;	
			for (int number : array ) {
				sum += number;		
		}
	return sum > 100;
	}
			
	//10.	
	public static double calculateAverage(double[] array) {
			double sum = 0;
			for (double number : array) {
				sum += number;
			}
			return sum / array.length;
		}
		
	//11.
	public static boolean isFirstAverageGreater(double[] firstarray, double[] secondarray) {
		 double sum1 = 0;
		 double sum2 = 0;
		for (double number : firstarray) {
			sum1 += number;
		}
		for (double number : secondarray) {
			sum2 += number;
		}
		return sum1 / firstarray.length > sum2 / secondarray.length;
	}
	
	//12.
	
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside = true && moneyInPocket > 10.50) {
			return true;
		}else {
			return false;
		}
	}
		
	//13. Should I mow the lawn? If lawn is greater than 7 inches I mow, if I have gasoline I mow.
	//If neither is true I do not mow the lawn.
	
	public static boolean mowTheLawn(boolean heigthOfLawnGreaterThanSeven, boolean haveFuel) {
		if ((heigthOfLawnGreaterThanSeven = true) && (haveFuel = true)) {
			return true;
		}else {
			return false;
		}
	}//End of Main Method
	
		
}//end of class
	

