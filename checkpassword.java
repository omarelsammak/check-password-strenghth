/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkpassword;
import java.io.*;
import java.util.*;

/**
 *
 * @author omar_
 */
public class Checkpassword {
    // Java implementation for the above approach





	public static void printStrongNess(String input)
	{
		// Checking lower alphabet in string
		int n = input.length();
		boolean hasLower = false, hasUpper = false, hasDigit = false, specialChar = false;
		Set<Character> set = new HashSet<Character>(Arrays.asList('!', '@', '#', '$', '%', '^', '&',
						'*', '(', ')', '-', '+'));
		for (char i : input.toCharArray())
		{
			if (Character.isLowerCase(i))
				hasLower = true;
			if (Character.isUpperCase(i))
				hasUpper = true;
			if (Character.isDigit(i))
				hasDigit = true;
			if (set.contains(i))
				specialChar = true;
		}
	
		// Strength of password
		System.out.print("Strength of password:- ");
		if (hasDigit && hasLower && hasUpper && specialChar
			&& (n >= 8))
			System.out.print(" Strong");
		else if ((hasLower || hasUpper || specialChar)
				&& (n >= 6))
			System.out.print(" Moderate");
		else
			System.out.print(" Weak");
	}

	// Driver Code


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner stringScanner = new Scanner(System.in); 
// Process each Java Scanner String input
         String age = stringScanner.nextLine(); 

//        	String input = " ";
		printStrongNess(age);
        // TODO code application logic here
    }
    
}
