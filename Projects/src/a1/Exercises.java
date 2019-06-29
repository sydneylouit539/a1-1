package a1;

import java.util.Arrays;
import java.util.regex.*;

public class Exercises {
	
	//String and Array Exercises
	/** Returns true if s is the same backwards and forwards */
	public boolean isPalindrome(String s) {
		assert s != null;
		//Recursive method, but ends if there is one character left OR if there are two characters that are the same
		if (s.length() == 1 || (s.length() == 2 && (s.charAt(0) == s.charAt(1)))) {
			return true;
		}
		//End the method once the front and back characters do not match
		if (s.charAt(0) != s.charAt(-1)) {
			return false;
		}
		//Recursive return statement
		return isPalindrome(s.substring(1, s.length()));
	}
	
	public static String normalize(String s) {

		return s.split("[\\s\\p{Punct}]").toString();
	}

	/** Returns the median of the values */
	public static int median(int[] values) {
		assert values != null;
		int[] sorted = values;
		Arrays.sort(sorted);
		if (values.length % 2 == 1) {
			return sorted[(sorted.length -1)/ 2];
		} else {
			return (sorted[(sorted.length)/2] + sorted[sorted.length/2-1])/2;
		}
	}

	/** Returns the number of 0's in values */
	public static int numZeros(int[] values) {
		
		assert values != null;
		int sum = 0;
		for(int r: values) {
			if (r == 0) {
				sum +=1;
			}
		}
		return sum;
	}

	/** Returns the mean of the values */
	public static double mean(int[] values) {
		assert values != null;
		int sum = 0;
		for (int t : values) {
			sum += t;
		}
		double mean = sum / values.length;
		return mean;
	}

	/** Returns true if s is the same backwards and forwards */
	public static boolean hasConstDiagonal(int[][] values) {
		
		assert values != null;
		int len = values.length;
		int ref = values[0][0];
		for (int k = 0; k < values.length; k++) {
			assert values[k].length == len;
			if (values[k][k] != ref) {
				return false;
			}
		}
		return true;

	}

}