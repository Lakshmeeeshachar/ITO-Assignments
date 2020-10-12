package com.ito.arrayas;

import java.util.ArrayList;
/**
 * This class contains all programs of Arrays
 * @author Lakshmeesh Achar
 * @version 1.0.0
 */
import java.util.Arrays;
import java.util.Scanner;

import org.springframework.stereotype.Service;

@Service
public class arraysaassignment {
	
	Scanner scanner = new Scanner(System.in);
//	Write a Java program to sort a numeric array and a string array.
	public void toSortNumericAndStringArray() {
		
		System.out.println("enter the size of the numeric array");
		int numeric = scanner.nextInt();
		
		int [] integer = new int[numeric];
		
		System.out.println("Enter all the elements:");
		 for(int i = 0; i < numeric; i++) {
			 integer[i]= scanner.nextInt();
			 }

          System.out.println(" numeric array : "+Arrays.toString(integer));
		  Arrays.sort(integer);
		  System.out.println("Sorted numeric array : "+Arrays.toString(integer));
		 
		  scanner.nextLine();
		 
		  System.out.println("Enter the size of string array");
		  int size= scanner.nextInt();
		 
		  String [] strings =  new String [size];
		 System.out.println("enter the strings");
		 for (int i = 0; i < size ; i++) {
			strings[i] =  scanner.nextLine();
			}
		 
		 System.out.println(" String array : "+Arrays.toString(strings));
		 Arrays.sort(strings);
		  System.out.println("Sorted String array : "+Arrays.toString(strings));
		  }
//	 Write a Java program to sum values of an array. 
	public void toSumValues() {
		
		int sum = 0;
		System.out.println("Enter the size of array");
		
		int intsize = scanner.nextInt();
		int[] integer = new int [intsize];
		
		System.out.println("Enter the elements of arrray");
		
		for (int i = 0; i < integer.length; i++) {
			integer[i] = scanner.nextInt();
			}
		for (int i : integer) {
			sum += i;
			}
		System.out.println("The sum is " + sum);
		}
	
//  Write a Java program to print the following grid.  
	public void toPrintGrid() {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(" - ");
				}
			System.out.println();
			}
		}
//	Write a Java program to calculate the average value of array elements.  
	public void toCalculateAverage() {
		int sum = 0;
		System.out.println("Enter the size of array");
		
		int intsize = scanner.nextInt();
		int[] integer = new int [intsize];
		
		System.out.println("Enter the elements of arrray");
		for (int i = 0; i < integer.length; i++) {
		   integer[i] = scanner.nextInt();
			}
		 for(int i=0; i < integer.length ; i++) {
		     sum = sum + integer[i];
		     }
		  
		 double average = sum / integer.length;
		 
		 System.out.println("Average value of the array elements is : " + average);
		 }
//  Write a Java program to test if an array contains a specific value. 
	public void toTestArray() {
		
		System.out.println("Enter the size of array");
		
		int intsize = scanner.nextInt();
		int[] integer = new int [intsize];
		
		System.out.println("Enter the elements of arrray");
		for (int i = 0; i < integer.length; i++) {
		
			 integer[i] = scanner.nextInt();
			}
		System.out.println("Enter to search for specific element");
		int number = scanner.nextInt();

	      for(int i = 0; i<integer.length; i++){
	         if(number == integer[i]){
	            System.out.println("Array contains the given element" + number);
	            }
	         }	
	      }
//	Write a Java program to find the index of an array element.  
	public void toFingIndex() {
		
		System.out.println("Enter the size of array");
		
		int intsize = scanner.nextInt();
		int[] integer = new int [intsize];
		
		System.out.println("Enter the elements of arrray");
		for (int i = 0; i < integer.length; i++) {
		integer[i] = scanner.nextInt();
			}
		System.out.println("Enter the element to find the index");
		int element= scanner.nextInt();
		int  index;
		for (int i = 0; i < integer.length; i++){
		     if (element == integer[i]) {
		    	 index = i;
		    	 System.out.println(index);
		    	 }
		     }
		}
//	 Write a Java program to remove a specific element from an array. 
	public void toRemoveSpecificElement() {
		
		System.out.println("Enter the size of array");
	
		int intsize = scanner.nextInt();
		int[] integer = new int [intsize];
		System.out.println("Enter the elements of arrray");
		
		for (int i = 0; i < integer.length; i++) {
		 integer[i] = scanner.nextInt();
		 }
		  
		System.out.println(" Array : "+Arrays.toString(integer));
		   
		System.out.println("Enter the index of the array to be removed");
		int index = scanner.nextInt();
		   for(int i = index; i < integer.length -1; i++){
			   integer[i] = integer[i + 1];
		      }
		   System.out.println("the array : "+Arrays.toString(integer));
		   }
//	Write a Java program to copy an array by iterating the array. 
	public void toCopyArray() {
		System.out.println("Enter the size of array");
		
		int intsize = scanner.nextInt();
		int[] integer = new int [intsize];
		System.out.println("Enter the elements of arrray");
		
		for (int i = 0; i < integer.length; i++) {
			integer[i] = scanner.nextInt();
			}
		  System.out.println("Given array : "+Arrays.toString(integer)); 
       
		  int [] newinterger = new int[intsize];
         
		  for(int i=0; i < integer.length; i++) {
    	   newinterger[i] = integer[i];
    	   }
       
		  System.out.println("New Array: "+Arrays.toString(newinterger));
	}
//	 Write a Java program to insert an element (specific position) into an array. 
	public void toInsertElement() {
		System.out.println("Enter the size of array");
		
		int intsize = scanner.nextInt();
		int[] integer = new int [intsize];
		System.out.println("Enter the elements of arrray");
		
		for (int i = 0; i < integer.length; i++) {
			integer[i] = scanner.nextInt();
			}
		
		System.out.println("Enter the index of array");
		
		int index = scanner.nextInt();
		
		System.out.println("Enter the element to be inserted");
		int newelement = scanner.nextInt();
		 
		System.out.println(" Array : "+Arrays.toString(integer)); 
		 
		for(int i=integer.length-1; i > index; i--){
			 integer[i] = integer[i-1];
			   }
		 integer[index] = newelement;
		   
		 System.out.println("New Array: "+Arrays.toString(integer));
	}
//	Write a Java program to find the maximum and minimum value of an array. 
	public void toFindMaxAndMin() {
		System.out.println("Enter the size of array");
		
		int intsize = scanner.nextInt();
		int[] integer = new int [intsize];
		
		System.out.println("Enter the elements of arrray");
		
		for (int i = 0; i < integer.length; i++) {
			integer[i] = scanner.nextInt();
			}
		
		int maximum = integer[0];
		int  minimum = integer[0];
		
		for (int i = 1; i < integer.length; i++) {
			if(maximum < integer[i]) {
				maximum = integer[i];
			}
			if (minimum > integer[i]) {
				minimum = integer[i];
				}
			}
		
		System.out.println("maximum element is  "+ maximum);
		System.out.println("minimum element is  " + minimum);
	}
// Write a Java program to reverse an array of integer values.
	public void toReverseArray(){
		
		System.out.println("Enter the size of array");
		
		int intsize = scanner.nextInt();
		int[] integer = new int [intsize];
		
		System.out.println("Enter the elements of arrray");
		
		for (int i = 0; i < integer.length; i++) {
			integer[i] = scanner.nextInt();
			}
		int temp;
		int begining = 0;
		int ending = intsize - 1;
		
		while(begining < ending) {
			temp = integer[begining];
			integer[begining] = integer[ending];
			integer[ending] = temp;
			begining++;
			ending --;
			}
	      
		for (int j = 0; j < intsize; j++) {
	    	   System.out.print(integer[j]);
			}
		}
//	Write a Java program to find the duplicate values of an array of integer values.
	public void toFindDupicateArray() {
		System.out.println("Enter the size of array");
		
		int intsize = scanner.nextInt();
		int[] integer = new int [intsize];
		
		System.out.println("Enter the elements of arrray");
		
		for (int i = 0; i < integer.length; i++) {
			integer[i] = scanner.nextInt();
			}
		
		for (int i = 0; i < integer.length-1; i++) {
			for (int j = i+1; j < integer.length; j++) {
                   if (integer[i] == integer[j]) {
                	   System.out.println("The duplicate elements are " + integer[j]);
                	   }				
                   }
			}
		}
//	Write a Java program to find the duplicate values of an array of string values.
	public void toFindDuplicateValues() {
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
					System.out.print( charater[i]);
				}
               }
		}
//	Write a Java program to find the common elements between two arrays (string values). 
	public void toFindCommonElements() {
		System.out.println("Enter the size of the  string array");
        int arraySize	= scanner.nextInt();
       
        String[] string1 = new String[arraySize];
        String[] string2 = new String[arraySize];
        
        scanner.nextLine();
    	
        System.out.println(" Enter the strings for array1 ");
        for (int i = 0; i < arraySize; i++) {
        	  string1[i] = scanner.nextLine();
			}
        System.out.println(" Enter the stringsv for array2 ");
        for (int i = 0; i < arraySize; i++) {
        	 string2[i] = scanner.nextLine();
			}
        System.out.println("Array1 : "+Arrays.toString(string1));
        System.out.println("Array2 : "+Arrays.toString(string2));
        
        for (int i = 0; i < string1.length; i++){
            for (int j = 0; j < string2.length; j++){
                if(string1[i].equals(string2[j])){
                    System.out.print(string1[i]);
                    }
                }
            }
	}
//	Write a Java program to find the common elements between two arrays of integers.
	public void toFindCommonIntegers() {
		System.out.println("Enter the size of type array");
	     int size = scanner.nextInt();
	     
	     int[] integer1 = new int[size];
	     int[] interger2 = new int[size];
	     
	     scanner.nextLine();
	     
	     System.out.println("Enter the element  for interger array 1");
	     for (int i = 0; i < integer1.length; i++) {
	    	integer1[i] = scanner.nextInt();
			}
	
	     System.out.println("Enter the elements for interger array2");
	     for (int i = 0; i < interger2.length; i++) {
	    	interger2[i] = scanner.nextInt();
			}
	     
	       System.out.println("Array1 : "+Arrays.toString(integer1));
	       System.out.println("Array2 : "+Arrays.toString(interger2));
	       System.out.println("The repeated elememts are: ");
	       
	            for (int i = 0; i < integer1.length; i++){
	            for (int j = 0; j < interger2.length; j++){
	             if(integer1[i] == (interger2[j])){
	                System.out.print(integer1[i]);
	                	}
	             }
	            }
	            }
// Write a Java program to remove duplicate elements from an array.  
	public void toRemoveDupicateElements() {
		System.out.println("enter the size of the numeric array");
		
		int numeric = scanner.nextInt();
		int [] integer = new int[numeric];
		
		System.out.println("Enter all the elements:");
		 for(int i = 0; i < numeric; i++) {
			 integer[i]= scanner.nextInt();
			 }
		 
		 System.out.println(" numeric array : "+Arrays.toString(integer));
		 
		 Arrays.sort(integer);
	     int  length = integer.length;
	     int temp [] = new int [integer.length];
	     int j = 0;
	     
	     for (int i = 0; i < length - 1; i++) {
	    	 if (integer[i]!= integer[i + 1]) {
	    		 temp[ j++ ] = integer [i];
				}
			}
	     temp[ j++ ] = integer[ length - 1 ];
	     
	     for (int k = 0; k < j; k++) {
	    	 System.out.print(temp[k]);
			}
	     }
// Write a Java program to find the second largest element in an array.
	public void toFindLargestElements() {
		 int temp;
			System.out.println("enter the size of the numeric array");
			int numeric = scanner.nextInt();
			
			int [] integer = new int[numeric];
			
			System.out.println("Enter all the elements:");
			 for(int i = 0; i < numeric; i++) {
				 integer[i]= scanner.nextInt();
				 }
			  for(int i = 0; i<numeric; i++ ){
				  for(int j = i+1; j<numeric; j++){
					  if(integer[i]>integer[j]){
						  temp = integer[i];
						  integer[i] = integer[j];
						  integer[j] = temp;
						  }
					  }
				  }
			  System.out.println(" second largest number is:: "+integer[numeric-2]);
	}
//	 Write a Java program to find the second smallest element in an array.
	public void toFindSecondSmallestEle() {

		 int temp;
			System.out.println("enter the size of the numeric array");
			int numeric = scanner.nextInt();
			
			int [] integer = new int[numeric];
			
			System.out.println("Enter all the elements:");
			 for(int i = 0; i < numeric; i++) {
				 integer[i]= scanner.nextInt();
				 }
			  for(int i = 0; i>numeric; i++ ){
				  for(int j = i+1; j>numeric; j++){
					  if(integer[i] < integer[j]){
						  temp = integer[i];
						  integer[i] = integer[j];
						  integer[j] = temp;
						  }
					  }
				  }
			  System.out.println(" second smallest number is:: "+integer[numeric - 2]);
	}
//	Write a Java program to add two matrices of the same size. 
	public void toAddTwoMatrics() {
		  int rowNum, columnNum, c, d;
	      Scanner in = new Scanner(System.in);
	 
	      System.out.println("Input number of rows of matrix");
	      rowNum = in.nextInt();
	      System.out.println("Input number of columns of matrix");
	      columnNum  = in.nextInt();
	 
	      int array1[][] = new int[rowNum][columnNum];
	      int array2[][] = new int[rowNum][columnNum];
	      int sum[][] = new int[rowNum][columnNum];
	 
	      System.out.println("Input elements of first matrix");
	 
	      for (  c = 0 ; c < rowNum ; c++ )
	         for ( d = 0 ; d < columnNum ; d++ )
	            array1[c][d] = in.nextInt();
	 
	      System.out.println("Input the elements of second matrix");
	 
	      for ( c = 0 ; c < rowNum ; c++ )
	         for ( d = 0 ; d < columnNum ; d++ )
	            array2[c][d] = in.nextInt();
	 
	      for ( c = 0 ; c < rowNum ; c++ )
	         for ( d = 0 ; d < columnNum ; d++ )
	             sum[c][d] = array1[c][d] + array2[c][d]; 
	 
	      System.out.println("Sum of the matrices:-");
	 
	      for ( c = 0 ; c < rowNum ; c++ ) {
	         for ( d = 0 ; d < columnNum ; d++ )
	            System.out.print(sum[c][d]+"\t");
	 
	         System.out.println();
	      }
	}
//	Write a Java program to convert an array to ArrayList. 
	public void convertArrayToArrayList() {
		
	}
//	 Write a Java program to convert an ArrayList to an array.
	public void toarrayListToArray() {
		System.out.println("Java program to convert an ArrayList to an array");
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("bangaluru");
		arrayList.add("chennai");
		arrayList.add("mumbai");
		arrayList.add("pune");
		System.out.println("The elements of the array list are: " + arrayList);
		String [] array = new String[arrayList.size()];
		arrayList.toArray(array);
		System.out.print("The elemets of array are: " );
		for (String element : array) {
			System.out.print(element + ",");
		}
	}
//	 Write a Java program to find all pairs of elements in an array whose sum is equal to a specified number. 
	public void toFindPairOfElements() {
		System.out.println("Java program to find all pairs of elements in an array whose sum is equal to a specified number");
		System.out.print("Enter the size of array: ");
		int size = scanner.nextInt();
		int [] array =new int [size]; 
		for (int i = 0; i < size; i++) {
			System.out.print("Enter " + i + " element: ");
			array[i] = scanner.nextInt();
		}
		System.out.print("Enter the specified number: ");
		int number = scanner.nextInt();
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] + array[j] == number) {
					System.out.println(array[i] + " + " + array[j] +  " = " + number);
				}
			}
		}
	}
//	Write a Java program to test the equality of two arrays.
	public void toTestEquality() {
		System.out.println("Java program to test the equality of two arrays");
		boolean result = true;
		System.out.print("Enter the size of 1st array: ");
		int size = scanner.nextInt();
		int [] array =new int [size]; 
		for (int i = 0; i < size; i++) {
			System.out.print("Enter " + i + " element: ");
			array[i] = scanner.nextInt();
		}
		System.out.print("Enter the size of 2nd array: ");
		int size2 = scanner.nextInt();
		int [] array2 =new int [size2]; 
		for (int i = 0; i < size2; i++) {
			System.out.print("Enter " + i + " element: ");
			array2[i] = scanner.nextInt();
		}
		if (size == size2) {
			for (int i = 0; i < array.length; i++) {
				if (array[i] != array2[i]) {
					result = false;
				}
			}
		} else {
			System.out.println("Two arrays are not equal");
			return;
		}
		if (result) {
			System.out.println("Two  arrays are equal");
		} else {
			System.out.println("Two arrays are not equal");
		}
	}
//	 Write a Java program to find a missing number in an array.
	public void toFindMissingNumber() {
		System.out.println("Java program to find a missing number in an array");
		System.out.print("Enter the size of  array: ");
		int size = scanner.nextInt();
		int sum = 0;
		int [] array =new int [size]; 
		for (int i = 0; i < size; i++) {
			System.out.print("Enter " + i + " element: ");
			array[i] = scanner.nextInt();
		}
		int exp_sum = size * ((size + 1) / 2);
		for( int i : array) {
			sum = sum + i;
		}
		int result = sum - exp_sum;
		System.out.println("Missing number is: " + result);
	}
//	 Write a Java program to find common elements from three sorted (in non-decreasing order) arrays.
	public void toFindCommonElementsFromArrays() {
		System.out.println("Find common elements from three sorted  arrays");
		System.out.print("Enter the size of 1st array: ");
		int [] array1 =new int [scanner.nextInt()]; 
		for (int i = 0; i < array1.length; i++) {
			System.out.print("Enter " + i + " element: ");
			array1[i] = scanner.nextInt();
		}
		System.out.print("Enter the size of 2nd array: ");
		int [] array2 =new int [scanner.nextInt()]; 
		for (int i = 0; i < array2.length; i++) {
			System.out.print("Enter " + i + " element: ");
			array2[i] = scanner.nextInt();
		}
		System.out.print("Enter the size of 3rd array: ");
		int [] array3 =new int [scanner.nextInt()]; 
		for (int i = 0; i < array3.length; i++) {
			System.out.print("Enter " + i + " element: ");
			array3[i] = scanner.nextInt();
		}
		int x = 0, y = 0, z = 0;
		ArrayList<Integer> al = new ArrayList<Integer>();
		while (x < array1.length && y < array2.length && z < array3.length) 
		{
			if (array1[x] == array2[y] && array2[y] == array3[z]) {
				al.add(array1[x]);
				x++; y++; z++;
			} else if (array1[x] < array2[y]){
				x++;
			} else if (array2[x] < array3[y]){
				y++;
			} else {
				z++;
			}
		}
		System.out.println("Common elemets are: " + al);
	}
//	 Write a Java program to move all 0's to the end of an array. Maintain the relative order of the other (non-zero) array elements
	public void toMoveZeroToEnd() {
		System.out.println("Java program to move all 0's to the end of an array");
		System.out.print("Enter the size of  array: ");
		int count = 0;
		int [] ar1 =new int [scanner.nextInt()]; 
		for (int i = 0; i < ar1.length; i++) {
			System.out.print("Enter " + i + " element: ");
			ar1[i] = scanner.nextInt();
		}
		//move all non-zeroes element to the front
        for(int i = 0; i < ar1.length; i++) {
            if(ar1[i] != 0) {
               ar1[count++] = ar1[i];
             }
         }
      //remaining elements are zero.
        while(count < ar1.length) {
            ar1[count++] = 0;
         }
        System.out.println("Desired output is: ");
        for(int j = 0; j < ar1.length; j++) {
            System.out.print(ar1[j] + " ");
         }
	}
//	Write a Java program to find the number of even and odd integers in a given array of integers.  
	public void noOfEvenAndOdd() {
		System.out.println("Java program to find the number of even and odd integers in a given array of integers");
		System.out.print("Enter the size of  array: ");
		int count = 0;
		int [] ar1 =new int [scanner.nextInt()]; 
		for (int i = 0; i < ar1.length; i++) {
			System.out.print("Enter " + i + " element: ");
			ar1[i] = scanner.nextInt();
		}
		for (int i = 0; i < ar1.length; i++) {
			if (ar1[i] % 2 == 0) {
				count++ ;
			}
		}
		System.out.println("The number of even integer count is: " + count);
		System.out.println("The number of odd integer count is: " + (ar1.length - count));
	}
//	Write a Java program to get the difference between the largest and smallest values in an array of integers. The length of the array must be 1 and above.
	public void getDifferenceBetweenLargeAndSmall() {
		System.out.println("Java program to get the difference between the largest and smallest values in an array of integers");
		System.out.print("Enter the size of  array: ");
		int [] ar1 =new int [scanner.nextInt()]; 
		for (int i = 0; i < ar1.length; i++) {
			System.out.print("Enter " + i + " element: ");
			ar1[i] = scanner.nextInt();
		}
		int min_number = ar1[0];
		int max_number = ar1[0];
		for (int i = 1; i < ar1.length; i++) {
			if (ar1[i] > max_number) {
				max_number = ar1[i];
			}
			else if (ar1[i] < min_number) {
				min_number = ar1[i];
			}
		}
		System.out.println("The difference b/n max and min value is: " + (max_number-min_number));
	}
//	Write a Java program to compute the average value of an array of integers except the largest and smallest values.
	public void avgOfIntegers() {
		System.out.println("Java program to compute the average value of an array of integers except the largest and smallest values");
		System.out.print("Enter the size of  array: ");
		
		int [] ar1 =new int [scanner.nextInt()]; 
		
		for (int i = 0; i < ar1.length; i++) {
			System.out.print("Enter " + i + " element: ");
			ar1[i] = scanner.nextInt();
		}
		int min_number = ar1[0];
		int max_number = ar1[0];
		int sum = ar1[0];
		
		for (int i = 1; i < ar1.length; i++) {
			sum = sum + ar1[i];
			if (ar1[i] > max_number)
				max_number = ar1[i];
			else if (ar1[i] < min_number)
				min_number = ar1[i];
		}
		
		float numerator = sum - max_number - min_number ;
		float denaminator = ar1.length - 2;
		
		System.out.println("average value of an array of integers except the largest and smallest values: " + numerator / denaminator);
	}
//	 Write a Java program to check if an array of integers without 0 and -1.  
public void toCheckArray() {
	
}
//   Write a Java program to check if the sum of all the 10's in the array is exactly 
      public void toCheckSum() {
    	  
      }
//       Write a Java program to check if an array of integers contains two specified elements 65 and 77.
      public void toCheckSpecifiedElement() {
  		System.out.println("Java program to check if an array of integers contains two specified elements 65 and 77");
  		System.out.print("Enter the size of  array: ");
  		
  		int [] ar1 =new int [scanner.nextInt()]; 
  		
  		for (int i = 0; i < ar1.length; i++) {
  			System.out.print("Enter " + i + " element: ");
  			ar1[i] = scanner.nextInt();
  		}
  		
  		for (int i = 0; i < ar1.length; i++) {
  			if (ar1[i] == 65) {
  				for (int j = 0; j < ar1.length; j++) {
  					if (ar1[j] == 77) {
  						System.out.println("array of integers contains two specified elements 65 and 77");
  						return ;
  					}
  				}
  			}
  		}
  		System.out.println("array of integers doesnot contains two specified elements 65 and 77");
  	}
//      Write a Java program to remove the duplicate elements of a given array and return the new length of the array Sample array: [20, 20, 30, 40, 50, 50, 50] 
      public void removeDuplicate() {
  		System.out.println("Java program to remove the duplicate elements of a given array and return the new length of the array");
  		System.out.print("Enter the size of  array: ");
  		int [] ar1 =new int [scanner.nextInt()]; 
  		for (int i = 0; i < ar1.length; i++) {
  			System.out.print("Enter " + i + " element: ");
  			ar1[i] = scanner.nextInt();
  		}
  		System.out.print("The array elements are: ");
  		for (int i = 0; i < ar1.length; i++) {
  			System.out.print(ar1[i] + ",");
  		}
  		int index = 1;
  		for (int i = 1; i < ar1.length; i++) {
  			if (ar1[i] != ar1[index-1])
  				ar1[index++] = ar1[i];
  		}
  		System.out.println();
  		System.out.println("The new length of the array after removing duplicates: " + index);
  	}
  	
//   Write a Java program to find the sum of the two elements of a given array which is equal to a given integerSample array: [1,2,4,5,6] Target value: 6.  
  	  	public void sumOfElementsOfArray() {
  		System.out.println("Write a Java program to find the sum of the two elements of a given array which is equal to a given integer");
  		System.out.print("Enter the size of  array: ");
  		
  		int [] ar1 =new int [scanner.nextInt()]; 
  		
  		for (int i = 0; i < ar1.length; i++) {
  			System.out.print("Enter " + i + " element: ");
  			ar1[i] = scanner.nextInt();
  		}
  		System.out.print("Enter the number: ");
  		
  		int number = scanner.nextInt();
  		
  		System.out.println("The index of the elements whose sum is: "+number);
  		for(int i=0; i<ar1.length; i++){
  			for (int j=i + 1; j<ar1.length; j++){
  				if((ar1[i]+ar1[j])== number){
  					System.out.println(i+", "+j);
  				}
  			}
  		}
  	} 
//  	 Write a Java program to find the two elements from a given array of positive and negative numbers such that their sum is closest to zero.
  	   public void toFindPositiveAndNegative() {
  		   
  	   }
//  	    Write a Java program to find smallest and second smallest elements of a given array. 
  	 public void toFindSmallestAndSecondSmallest() {
 		System.out.println("Java program to find smallest and second smallest elements of a given array");
 		System.out.print("Enter the size of  array: ");
 		int [] ar1 =new int [scanner.nextInt()]; 
 		for (int i = 0; i < ar1.length; i++) {
 			System.out.print("Enter " + i + " element: ");
 			ar1[i] = scanner.nextInt();
 		}
 		Arrays.sort(ar1);
 		for (int i = 0; i < ar1.length; i++) {
 			System.out.println("Smallest number of an array is: " + ar1[i]);
 			System.out.println("Second smallest number of an array is: " + ar1[i + 1]);
 			return ;
 		}
 	}
// 	Write a Java program to segregate all 0s on left side and all 1s on right side of a given array of 0s and 1s.   
  	public void zeroOnLeftOneOnRight() {
		System.out.println("Write a Java program to segregate all 0s on left side and all 1s on right side of a given array of 0s and 1s");
		System.out.print("Enter the size of  array: ");
		
		int [] ar1 =new int [scanner.nextInt()]; 
		
		for (int i = 0; i < ar1.length; i++) {
			System.out.print("Enter " + i + " element: ");
			ar1[i] = scanner.nextInt();
		}
		
		Arrays.sort(ar1);
		
		System.out.print("Result after segregation: ");
		
		for (int i = 0; i < ar1.length; i++) {
			System.out.print(ar1[i] + ",");
		}
	}
//	 Write a Java program to arrange the elements of a given array of integers where all negative integers appear before all the positive integers
  	public void negativeBeforePositiveElements() {
		
		System.out.print("Enter the size of  array: ");
		
		int [] ar1 =new int [scanner.nextInt()]; 
		
		for (int i = 0; i < ar1.length; i++) {
			System.out.print("Enter " + i + " element: ");
			ar1[i] = scanner.nextInt();
		}
		
		Arrays.sort(ar1);
		
		System.out.print("Result after segregation: ");
		
		for (int i = 0; i < ar1.length; i++) {
			System.out.print(ar1[i] + ",");
		}
	}
//  	Write a Java program to arrange the elements of a given array of integers where all positive integers appear before all the negative integers.

	public void positiveBeforeNegativeElements() {
		System.out.println("Java program to arrange the elements of a given array of integers where all positive integers appear before all the negative integers");
		System.out.print("Enter the size of  array: ");
		int [] ar1 =new int [scanner.nextInt()]; 
		for (int i = 0; i < ar1.length; i++) {
			System.out.print("Enter " + i + " element: ");
			ar1[i] = scanner.nextInt();
		}
		Arrays.sort(ar1);
		System.out.print("Result after segregation: ");
		for (int i = ar1.length - 1; i >= 0; i--) {
			System.out.print(ar1[i] + ",");
		}
	}
//	Write a Java program to separate even and odd numbers of a given array of integers. Put all even numbers first, and then odd numbers.
	public void seperateEvenAndOdd() {
		
		System.out.println("Java program to separate even and odd numbers of a given array of integers. Put all even numbers first, and then odd numbers");
		System.out.print("Enter the size of  array: ");
		
		int size = scanner.nextInt();
		int [] ar1 =new int [size]; 
		int [] ar2 = new int [size];
		int [] ar3 = new int [size];
		
		for (int i = 0; i < ar1.length; i++) {
			System.out.print("Enter " + i + " element: ");
			ar1[i] = scanner.nextInt();
		}
		int j = 0;
		int k = 0;
		
		for (int i = 0; i < ar1.length; i++) {
			if (ar1[i] % 2 ==0 ) {
				ar2[j] = ar1[i];
				j++;
			} else {
				ar3[k] = ar1[i];
				k++;
			}
		}
		
		System.out.println("Result after seperating even and odd number");
		
		for (int i = 0; i < ar2.length; i++) {
			if (ar2[i] != 0) {
				System.out.print(ar2[i] + ",");
			}
		}
		
		for (int i = 0; i < ar3.length; i++) {
			if (ar3[i] != 0) {
				System.out.print(ar3[i] + ",");
			}
		}
	}
	
	}


