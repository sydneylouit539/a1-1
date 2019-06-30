package a1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ExerciseTest {
	
	@Test
	void isPalindrometest() {
		//Palindrome with capital letters
		boolean a = Exercises.isPalindrome("STRAWNOTOSTUPIDAFADIPUTSOOTONWARTS");
		//Palindrome with spaces
		boolean b = Exercises.isPalindrome("a b a c a b a d a b a c a b a");
		//Non-palindrome
		boolean c = Exercises.isPalindrome("vierughnvoeirugvhneoiugvhneron");
		
		assert a == true && b == true && c == false;
	}
	
	void mediantest() {
		//Already ordered array
		int[] a = new int[] {1,2,3,4,5};
		//Non-ordered array
		int[] b = new int[] {3,2,5,4,9,6,0};
		//Array of even length and non-ordered
		int[] c = new int[] {-1,-2,-3,-4,5,6,7,8,9,10};
		
		assert Exercises.median(a) == 3 && Exercises.median(b) == 4 && Exercises.median(c) == 5;
	}
	
	void numZerostest() {
		//Array with no zero's
		int[] a = new int[] {1,2,3,4,5};
		//Array with exactly one zero
		int[] b = new int[] {3,2,5,4,9,6,0};
		//Array with multiple zero's
		int[] c = new int[] {-1,0,-3,0,5,0,0,0,0,10};
		
		assert Exercises.numZeros(a) == 0 && Exercises.numZeros(b) == 1 && Exercises.numZeros(c) == 6;
	}
	
	void meantest() {
		//Array with whole number mean
		int[] a = new int[] {1,2,3,4,5};
		//Array with mean containing infinite decimal places
		int[] b = new int[] {3,2,5,4,9,6,0};
		//Array with both positive and negative values
		int[] c = new int[] {-1,-2,-3,-4,5,6,7,8,9,10};
		
		assert Exercises.mean(a) == 3 && Exercises.mean(b) == 29/7 && Exercises.mean(c) == 3.5;	
	}
	
	void hasConstDiagonaltest() {
		//3x3 identity matrix (Constant diagonal)
		int[][] a = new int[][] {{1,0,0},{0,1,0},{0,0,1}};
		//1x1 matrix (Constant diagonal)
		int[][] b = new int[][] {{1}};
		//3x3 matrix (Non-constant diagonal)
		int[][] c = new int[][] {{1,8,-5},{5,10,-2},{11,-2,-8}};
		
		assert Exercises.hasConstDiagonal(a) == true && Exercises.hasConstDiagonal(b) == true && Exercises.hasConstDiagonal(c) == false;
	}
}



