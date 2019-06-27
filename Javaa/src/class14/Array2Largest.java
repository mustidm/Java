package class14;

public class Array2Largest {

	public static void main(String[] args) {
		int arr[] = {144, 46, 0, 86, 292,-1};
        
        int largest = arr[0];
        int secondLargest = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i] > secondLargest && arr[i]!=largest) {
                secondLargest = arr[i];
            }
        }
       System.out.println("2nd largest number is:" + secondLargest);
       System.out.println("largest number is:" + largest);

	}
}
