package ArrayCalculator;

public class ArrayCalulations {

	    public static void main(String[] args) {
	    	
	        // Initialize an array of integers
	        int[] numbers = {1, 2, 3, 4, 5};
	        
	        // Variable to hold the sum of the array elements
	        int sum = 0;
	        
	        // For Loop to get each element of the array and add it to the sum
	        for(int i = 0; i < numbers.length; i++) {
	            sum += numbers[i];
	        }
	        
	        // Print the sum of the array elements
	        System.out.println("The sum of the array values is: " + sum);
	    }
	}

