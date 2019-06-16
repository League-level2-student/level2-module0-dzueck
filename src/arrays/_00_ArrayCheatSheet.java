package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	
	public static void main(String[] args) {
		Random random = new Random();
		//1. make an array of 5 Strings
		String[] array = {"this", "is", "not", "an", "array"};
		//2. print the third element in the array
		System.out.println(array[2]);
		//3. set the third element to a different value
		array[2] = "defenetly";
		//4. print the third element again
		System.out.println(array[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		//6. make an array of 50 integers
		int[] useless = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		for(int i = 0; i < 50; i++) {
			useless[i] = random.nextInt(20);
		}
		//8. without printing the entire array, print only the smallest number in the array
		int smallest = useless[0];
		for(int i = 1; i < 50; i++) {
			if(smallest > useless[i]) {
				smallest = useless[i];
			}
		}
		System.out.println(smallest);
		//9 print the entire array to see if step 8 was correct
		
		for(int i = 0; i < 50; i++) {
			System.out.println(useless[i]);
		}
		//10. print the largest number in the array.
		int largest = useless[0];
		for(int i = 1; i < 50; i++) {
			if(largest < useless[i]) {
				largest = useless[i];
			}
		}
		System.out.println(largest);
	}
}
