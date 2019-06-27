package class10;

public class ArrayTask {
	public static void main(String[] args) {
/*
 * Create an array of chars and store grades into it: A,B,C,D,E,F. 
 * Then print a grade B (use 2 different ways of creating an array).
 */
		char[] grades= {'A', 'B', 'C', 'D', 'E', 'F'};
		
		System.out.println(grades[1]);
		/*
		 * Create an array of words: Java, Saturday, day, coding, is. 
		 * Print the following sentence using element of array: 
		 * â€œSaturday is Java coding Dayâ€�. 
		 */
		
		String[] words= {"Java", "Saturday", "day", "coding", "is"};
		
		String sentence=words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2];
		System.out.println(sentence);
		// saturday   is  java cding day
		int size=words.length;
		
		System.out.println("The size of an array is "+size);
		
		
		
	}
}
