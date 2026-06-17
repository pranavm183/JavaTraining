package javaTraning;
import java.util.*;
public class hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          System.out.println("Hello World");
          Scanner scanner = new Scanner(System.in);
          System.out.print("Enter the starting number: ");
  		int start = scanner.nextInt();

  		System.out.print("Enter the ending number: ");
  		int end = scanner.nextInt();

  		System.out.println("\nPrime numbers between " + start + " and " + end + " are:");

  		// Loop through the entire range
  		for (int num4 = start; num4 <= end; num4++) {
  			if (isPrime(num4)) {
  				System.out.print(num4 + " ");
  			}
  		}
  		
  		scanner.close(); 
  	} // Closing brace of the main method

  	/**
  	 * Helper method to check if a number is prime.
  	 * Kept inside the hello class, but OUTSIDE the main method.
  	 */
  	public static boolean isPrime(int num) {
  		// Numbers less than or equal to 1 are not prime
  		if (num <= 1) {
  			return false;
  		}

  		// 2 is the only even prime number
  		if (num == 2) {
  			return true;
  		}

  		// Exclude all other even numbers
  		if (num % 2 == 0) {
  			return false;
  		}

  		// Check odd factors up to the square root of the number
  		for (int i = 3; i * i <= num; i += 2) {
  			if (num % i == 0) {
  				return false; // Found a factor, not prime
  			}
  		}

  		return true; // No factors found, it is prime
  	}

   // Closing 
}


