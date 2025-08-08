package week04;

import java.util.Arrays;

public class Week04CodingProject {

	public static void main(String[] args) {

	//1 This method create an array of int called ages using the provided date
	
	int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
	
	//a This method subtracts the value of the first element in the ages array from the last value
	
	int result = ages[ages.length - 1] - ages[0];
    System.out.println(result);
    
    //b 
   
    int[] ages2 = {33, 14, 97, 55, 43, 39, 12, 2, 82};
    int result1 = ages2[ages2.length - 1] - ages2[0];
    System.out.println(result1);
    
    //c
    
    double sum = 0;
    for (int age : ages2) {
     sum += age;
      }
    
    double average = sum / ages2.length;
    System.out.println(average);
    
    //2
    
    String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		sum = 0;
		for (int i = 0; i < names.length; i++) {
			sum += names[i].length();
		}
	
	//a
		
	average = sum / names.length;
 	System.out.println("The average number of letters per name in names[] = " + average );
 	
 	//b
 	
 	String allNames = "";
		for (int i = 0; i < names.length; i++) {
			allNames += names[i] + " ";
		}
		System.out.println(allNames);
	
	//3 array[array.length - 1]
	
	//4 array[0]
	
	//5
		
	int[] nameLengths = new int[names.length];
 	for (int i = 0; i < names.length; i++) {
 		nameLengths[i] = names[i].length(); 
 	}
 	
 	//6
 	
 	sum = 0;
	for (int i = 0; i < nameLengths.length; i++) {
		sum += nameLengths[i];
	}
		System.out.println("The sum of all the names is " + sum);
 	
	//7
		String triple = multiplyString("Hi", 3);
		System.out.println(triple);
	
	//8
	
		System.out.println(fullName("Obi-Wan", "Kenobi"));
	
	//9
	
	System.out.println(isSumGreaterThan(ages));
	
	//10
	
	double[] doubleArr = {0.1, 1.0, 236.4592, 1000.1};
	double[] emptyDoubleArr = {};
		System.out.println(averageOfAllElements(doubleArr));
		System.out.println(averageOfAllElements(emptyDoubleArr));
	
	//11
	
		double[] anotherDoubleArr = {2.2, 3.3, 4.4, 5.5};
 		System.out.println("isFirstArrAvgGreater returns => " + isFirstArrAvgGreater(doubleArr, anotherDoubleArr));
	
	//12
 		boolean isHotOutside = true;
 		double moneyInPocket = 15.00;
 		System.out.println("Will buy drink: " + willBuyDrink(isHotOutside, moneyInPocket));
	
	//13
 		System.out.println(songLyric("Where are you?", "And I'm so sorry."));
	}
	
	private static String songLyric(String lyric1, String lyric2) {
 		return lyric1 + " " + lyric2;
 	}
	
	public static String multiplyString(String str, int num) {
		String result = "";
		for (int i = 0; i < num; i++) {
			result += str;
		}
		return result;
	}

	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
        return isHotOutside && (moneyInPocket > 10.50);
    }
	
	private static boolean isFirstArrAvgGreater(double[] doubleArr, double[] secondArr) {
 		return getAverageOfDoubleArr(doubleArr) > getAverageOfDoubleArr(secondArr); 
 	}
	
	private static int getAverageOfDoubleArr(double[] doubleArr) {
		return 0;
	}

	private static double averageOfAllElements(double[] arr) {
 		return Arrays.stream(arr).average().orElse(Double.NaN);
 	}
	
	private static Boolean isSumGreaterThan(int[] ages) {
 		return Arrays.stream(ages).sum() > 100;
	}
	
	private static String fullName(String firstName, String lastName) {
 		return firstName + " " + lastName;
 	}
}