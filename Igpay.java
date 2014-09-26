/**
 * A translator that accepts an English word and prints to the console 
 * the equivalent word that results from transformation under the rules
 * of Pig Latin.  Words are transformed according to one of three patterns:
 * 
 * for initial consonants, move the leading consonant to the end and add "ay"
 * for initial blends, move the blend to the end and add "ay"
 * for initial vowels, simply add "way" to the end of the word
 * 
 * Ex. 
 * 		"happy" should print "appyhay"
 * 		"trap" should print "aptray"
 * 		"egg" should print "eggway"
 * 
 * @author Kent Collins
 * @version 26 September 2014
 */

import java.util.Scanner;

public class Igpay {
	public static void main(String[] args) {
		// TODO Prompt the user for input and assign to a variable
		// TODO Determine whether word starts with a single consonant, vowel, or blend
		// TODO Transform the word into a new String
		// TODO Print the result to the console
	}
	
	/*
	 * Locates the position in a string of the first vowel
	 * 
	 * @param s The string to be analyzed.  
	 * 
	 * @return 	The position (index) of the first vowel or -1 if no vowels present.
	 */
	public static int findFirstVowel(String s) {
		for (int i = 0; i<s.length(); i++) {
			char letter = s.charAt(i);
			if (letter=='a' || letter=='e' || letter=='i' || letter =='o' || letter =='u') {
				return i;
			}
		
		}	return -1;
		
	}
}
