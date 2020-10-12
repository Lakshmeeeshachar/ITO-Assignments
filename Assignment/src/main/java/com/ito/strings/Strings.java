package com.ito.strings;
/**
 * This class contains all programs of strings
 * @author Lakshmeesh Achar
 * @version 1.0.0
 */
import java.util.Scanner;

import org.springframework.stereotype.Service;

@Service
public class Strings {
	
	Scanner scanner = new Scanner(System.in);
//	Java Program to count the total number of characters in a string
	public void noOfCharacters() {
		int count = 0;
		System.out.println("Enter your string");
		String result=scanner.nextLine();
		
		for (int i = 0; i < result.length(); i++) {
			if(result.charAt(i) != ' ') {
				count++;
				}
		}
		System.out.println("The number of characters of a strings are" + count);
	}
//	 Java Program to count the total number of vowels and consonants in a string
	public void noOfVowels() {
		int vowelcount = 0;
		int consonatcount = 0;
	    System.out.println("enter the sentence to check vowels and consonats");
	    String string = scanner.nextLine();
	   
	    for (int i = 0; i < string.length(); i++) {
		  char c = string.charAt(i);
		   if (c=='a' || c=='A' ||c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' || c=='u' || c=='U'     ) {
			   vowelcount++;
			   }
		   else {
			consonatcount++;
			}
		   }
	   System.out.println(vowelcount);
	   System.out.println(consonatcount);
		
	   }
	// Java Program to divide a string in 'N' equal parts.
    public void divideString() {
    	System.out.println("Enter the String");
	    String string	=scanner.nextLine();
	    
	    int length = string.length();
	    int size;
	    
	    System.out.println("enter the number of times to be divided");
	   int number = scanner.nextInt();
	   if (length % number!= 0) {
		   System.out.println("given string cant divisable by"+ number);
		}
	   else {
		size= length/number;
		for (int i = 0; i < length; i++) {
			if (i+1 % size == 0) {
	            System.out.print( string.charAt(i));
				 }
			}
		}
	   }
  //Java Program to remove all the white spaces from a string
    public void removeWhiteSpaces() {
    	System.out.println("Enter the string");
	    String string  =	scanner.nextLine();
        String result  = " ";
        for (int i = 0; i < string.length(); i++) {
        	if (!(string.charAt(i)==' ' && string.charAt(i+1)==' ')) {
        		result = result + string.charAt(i);
				}
			}
        System.out.println(result);
        }
//    Java Program to replace lower-case characters with upper-case and vice-versa
    public void conversionOfCase() {
    	System.out.println("Enter the string");
		String strings = scanner.nextLine();
		String result  = " ";
		for (int i = 0; i < strings.length(); i++) {
			if (strings.charAt(i) >= 65 && strings.charAt(i)<90) {
              result = result+ (char)(strings.charAt(i)+32);
              }
			else {
				result = result+ (char)(strings.charAt(i) - 32);
				}
			}
		System.out.println(result);
		}
//    Java Program to replace the spaces of a string with a specific character
    public void replaceWithSpecficCharacter() {
    	System.out.println("Enter the string");
		String string = scanner.nextLine();
		System.out.println("Enter the special character to be replaced ");
		String specialcharater = scanner.nextLine();
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i)==' ') {
				 string = string.replace(" ", specialcharater);
				}
			}
		System.out.println(string);
		}
//     Java Program to find maximum and minimum occurring character in a string
    public void maxMinOccurance() {
    	System.out.println("Enter the String");
		String string = scanner.nextLine();
		int[] array     = new int[127];
		for (int i = 0; i < string.length(); i++) {
			array[string.charAt(i)] =  array[string.charAt(i)] + 1;
			}
        int maximum = -1;
        int minimum = 127;
        char maximumcharacter = ' ';
        char minimumcharater = ' ';
        for (int i = 0; i < string.length(); i++) {
        	if (maximum < array[string.charAt(i)]) {
        		maximum = array[string.charAt(i)];
        		maximumcharacter = string.charAt(i) ;
        		}
        	if (minimum > array[string.charAt(i)]) {
        		minimum = array[string.charAt(i)];
        		minimumcharater = string.charAt(i) ;
			}
       	}
        System.out.println(maximumcharacter);
        System.out.println(minimumcharater);
        }
//     Java Program to find Reverse of the string
    public void reverseOfString() {
    	 System.out.println("Enter the string");
         String string = scanner.nextLine();
                  int size = string.length();
       String reverse = "";
     for (int i = size-1; i >= 0; i--) {
   	  reverse = reverse + string.charAt(i);
   	  }
     System.out.println("Reverse of   " +" "+ string +"  "+"  is   " + reverse);
     }
//     Java program to find the duplicate characters in a string
    public void findDuplicateCharacter() {
    	System.out.println("Enter the strings");
        String string  = scanner.nextLine();
        int count;
        char charater [] = string.toCharArray();
        
        for (int i = 0; i < charater.length; i++) {
               count = 1;
               for (int j = i+1; j < charater.length; j++) {
                  
               if (charater[i] == charater[j] && charater[i]!=' ') {
					count++;
					charater[j]='0';
				}
		 }
               if (count > 1 && charater[i]!='0') {
					System.out.println(charater[i]);
				}
               }
        }
//   Java program to find the duplicate words in a string
    public void findDuplicateWords() {
    	System.out.println("Enter the string ");
		String string = scanner.nextLine();
        int count;
        string = string.toLowerCase();
        String words[] = string.split(" ");  
       
        for(int i = 0; i < words.length; i++) {  
            count = 1;  
            for(int j = i+1; j < words.length; j++) {  
                if(words[i].equals(words[j])) {  
                    count++;  
                    words[j] = "0";  
                    }  
                }  
               if(count > 1 && words[i] != "0")  
                System.out.println(words[i]);  
               }
        }
//     Java Program to find the frequency of characters
    public void toFindFrequency() {
    	  System.out.println("Enter the string to find the frequency of the charater");
	        String string =   scanner.nextLine();
	        int [] upper   = new int [26];
	        int [] lower = new int[26];
	         
	        for (int i = 0; i < string.length(); i++) {
	        	if (string.charAt(i) >= 65 && string.charAt(i) <= 90) {
					 int j = string.charAt(i) - 65;
					 upper[j] = upper[j] + 1;
				}
	        	else {
					int j = string.charAt(i) - 97;
					lower[j] = lower[j] + 1;
					}
				}
	         for (int i = 0; i < upper.length; i++) {
	        	 if (upper[i] > 0) {
				System.out.println((char)(65 + i) + " = " + upper[i]);
				}
	        	 }
	    for (int i = 0; i < lower.length; i++) {
			if (lower[i] > 0) {
				System.out.println((char)(97 + i) + " = " + lower[i]);
				}
			}
	    }
//    Java Program to find the largest and smallest word in a string
    public void toFindLargestSmallestWord() {
    	System.out.println("Enter the String ");
        String string = scanner.nextLine();
        String[] word = string.split(" ");
        String shortest = word[0];
        String longest = "";
        
        for (String words : word) {
       	 if (words.length() < shortest.length()) {
       		 shortest = words;
       		 }
       	 else if (words.length() > longest.length()) {
       		 longest = words;
       		 }
   		}	
        System.out.println("shortest word = " + shortest );
   	    System.out.println("shortest word = " + longest );
   	    }
//     Java Program to find the most repeated word in a text fileS
    public void toFindRepeatedWordInTxt() {
    	
    }
//    Java Program to find the number of the words in the given text file
    public void noOfWordsInTxt() {
    	
    }
//    Java Program to separate the Individual Characters from a String
    public void separateIndividualChar() {
    	System.out.println("Enter the string");
		String string = scanner.nextLine();
		  for(int i = 0; i < string.length(); i++){  
	            System.out.print(string.charAt(i) + "  ");  
	            } 
		  }
//    Java Program to Convert char to String and String to Char
    public void charStringConversion() {
    	  System.out.println("enter the character to convert into string");
	      char character = scanner.next().charAt(0);
	      String string = Character.toString(character);
	      System.out.println("String is: "+string);
	      scanner.nextLine();
	      System.out.println("Enter the string to convert to character");
	      String string1 = scanner.nextLine();
	      for(int i=0; i<string1.length();i++){
	       char ch = string1.charAt(i);
	       System.out.println("Character at "+i+" Position: "+ch);
	          } 
	      }
//    Java Program to find duplicate characters in a String
    public void tofindDuplictaeChars() {
    	System.out.println("Enter the strings");
        String string  = scanner.nextLine();
        int count;
        char charater [] = string.toCharArray();
        
        for (int i = 0; i < charater.length; i++) {
               count = 1;
               for (int j = i+1; j < charater.length; j++) {
                  
               if (charater[i] == charater[j] && charater[i]!=' ') {
					count++;
					charater[j]='0';
					}
               }
               if (count > 1 && charater[i]!='0') {
					System.out.println( charater[i]);
					}
               }
        }
//    Java Program to sort strings in alphabetical order
    public void sortingStringsInAlpa() {
    	int number;
	    String temp;
	    System.out.print("Enter number of names :");
		number = scanner.nextInt();
		String names[] = new String[number];
		System.out.println("Enter all the names:");
		for(int i = 0; i < number; i++) {
			names[i] = scanner.nextLine();
			}
		for (int i = 0; i < number; i++) {
			for (int j = i + 1; j < number; j++) {
				if (names[i].compareTo(names[j])>0) {
					temp = names[i];
					names[i] = names[j];
					names[j] = temp;
					}
				}
			}
		System.out.print("Names in Sorted Order:");
		for (int i = 0; i < number - 1; i++) {
			System.out.print(names[i] + ",");
			}
		System.out.print(names[number - 1]);
		}
//    How to remove characters from the first String which are present in the second String?
    public void howToRemoveFirstString() {
    	
    }
    }





	


