package com.ito.collections;
/**
 * This class contains all programs of ArrayList
 * @author Lakshmeesh Achar
 * @version 1.0.0
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

import org.springframework.stereotype.Service;

@Service
public class ArrayLists {
	
	Scanner scanner = new Scanner(System.in);
	
//	to create a new array list containing student names, add some student (string) and print out the collection.
	public void addToArrayList() {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("banglore");
		arrayList.add("pune");
		arrayList.add("delhi");
		arrayList.add("kolkota");
		arrayList.add("chennai");
		
		System.out.println("The names of  array list are: " + arrayList);
        System.out.print("Enter name to add into the array list: ");
		
        String name = scanner.nextLine();
		
        arrayList.add(name);
		
        System.out.println("Updated array list is:" + arrayList);

		Iterator<String> itr = arrayList.iterator();
		
		System.out.println("Printing array list using iterator:");
		while (itr.hasNext()) {
			String value = (String) itr.next();
			System.out.println(value);
		}
	}

//     to insert an element into the array list at the first position.
    	public void toInsertAtFirstPosition() {
		ArrayList<String> arrayList = new ArrayList<String>();
		
		arrayList.add("banglore");
		arrayList.add("mumbai");
		arrayList.add("pune");
		arrayList.add("delhi");
		arrayList.add("chennai");
		
		System.out.println(" Array list are: " + arrayList);
		System.out.print("Insert an element into the array list at the first position: ");
		String nameAtFirst = scanner.nextLine();
		
		arrayList.add(0, nameAtFirst);
		
		System.out.println(" Result after insertion  " + arrayList);
	}
	 
	 
	public void indexToShowName() {
		ArrayList<String> arrayList = new ArrayList<String>();
		
		arrayList.add("sachin");
		arrayList.add("dhoni");
		arrayList.add("kholi");
		arrayList.add("shewag");
		arrayList.add("raina");
		
		System.out.println("Array list are: " + arrayList);
		System.out.print("Enter the index value to show the name: ");
		
		int index = scanner.nextInt();
		
		System.out.println("The name at " + index + " th index is: " + arrayList.get(index));
	}
	
	public void updateArrayElement() {
		ArrayList<String> arrayList = new ArrayList<String>();
		
		arrayList.add("bangaluru");
		arrayList.add("mangaluru");
		arrayList.add("mysore");
		arrayList.add("mumbai");
		arrayList.add("pune");
		
		System.out.println("Array list are: " + arrayList);
		System.out.print("Enter the index value you want to replace: ");
		
		int replaceIndex = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("Enter new name you want to insert: ");
		String replaceName = scanner.nextLine();
		arrayList.set(replaceIndex, replaceName);
		System.out.println("Updated array list: " + arrayList );
	}
	
	
	public void removeThirdElement() {
		ArrayList<String> arrayList = new ArrayList<String>();
		
		arrayList.add("Mysore");
		arrayList.add("Davangere");
		arrayList.add("Bellary");
		arrayList.add("Bangaluru");
		arrayList.add("Mangaluru");
		
		System.out.println("Array list are: " + arrayList);
		System.out.println("Remove the third element from a array list");
		arrayList.remove(3);
		System.out.println("Result after removing third element: " + arrayList);
	}
	
	
	public void copyElementsToOtherArrayList() {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		
		arrayList.add("Bangaluru");
		arrayList.add("Mumbai");
		arrayList.add("Chennai");
		arrayList.add("Mysore");
		arrayList.add("Delhi");
		
		System.out.println("Array list are: " + arrayList);
		System.out.println("Create another array lsit");
		ArrayList<String> arrayList1 = new ArrayList<String>();
		
		arrayList1.add("Bangaluru");
		arrayList1.add("Mumbai");
		arrayList1.add("Chennai");
		arrayList1.add("Delhi");
		
		System.out.println("First array list values are: " + arrayList);
		System.out.println("Second array list values are: " + arrayList1);
		System.out.println("Copy names of second array list into first array list");
		
		Collections.copy(arrayList, arrayList1);
		
		System.out.println("First array list values are: " + arrayList);
		System.out.println("Second array list values are: " + arrayList1);
	}
	
	
	public void reverseJoinClone() {
		ArrayList<String> arrayList = new ArrayList<String>();
		
		arrayList.add("banglore");
		arrayList.add("chennai");
		arrayList.add("mumbai");
		arrayList.add("delhi");
		arrayList.add("pune");
		
		System.out.println("The names of  array list are: " + arrayList);
		Collections.reverse(arrayList);
		
		System.out.println("Array list after Reversing the elements:" + arrayList);
		System.out.println("Join two array lists");
		
		ArrayList<String> arrayList1 = new ArrayList<String>();
		
		arrayList1.add("Ravi");
		arrayList1.add("Rahu");
		arrayList1.add("Kethu");
		arrayList1.add("Shani");
		arrayList1.add("Bhuda");
		System.out.println("The names of  first array list are: " + arrayList1);
		
		ArrayList<String> arrayList2 = new ArrayList<String>();
		arrayList2.add("Vijaynagara");
		arrayList2.add("BTM");
		arrayList2.add("Rajajinagar");
		arrayList2.add("Whitefield");
		System.out.println("The names of  second array list are: " + arrayList2);
		arrayList1.addAll(arrayList2);
		System.out.println("Result after joining " + arrayList1);
		System.out.println("Clone an array list to another array list");
	
		ArrayList<String> arrayList3 = new ArrayList<String>();
		arrayList3.add("banglore");
		arrayList3.add("mumbai");
		arrayList3.add("chennai");
		arrayList3.add("delhi");
		arrayList3.add("pune");
		System.out.println("The names of  first array list are: " + arrayList3);
		ArrayList<String> arrayList4 = new ArrayList<String>();
		System.out.println("The names of second array list are: " +arrayList4);
		arrayList4 = (ArrayList<String>) arrayList3.clone();
		System.err.println("The names of second array list after cloning: " +arrayList4);
	}
	
	
	
	public void checkArrayEmptyOrNot() {
		ArrayList<String> arrayList5 = new ArrayList<String>();
		arrayList5.add("banglore");
		arrayList5.add("mumbai");
		arrayList5.add("chennai");
		arrayList5.add("pune");
		arrayList5.add("hydrabad");
		System.out.println("The array list before emptying: " + arrayList5);
		System.out.println("Check whether the array list is empty or not");
		boolean res = arrayList5.isEmpty();
		if (res) {
			System.out.println("The array list is empty");
		} else {
			System.out.println("The array list is not empty");
		}
		System.out.println("Empty an array list.");

		arrayList5.clear();
		System.out.println("The array list after emptying: " + arrayList5);
		System.out.println("Check whether the array list is empty or not");
		boolean res1 = arrayList5.isEmpty();
		if (res1) {
			System.out.println("The array list is empty");
		} else {
			System.out.println("The array list is not empty");
		}
	}
	
	
	public void searchAndSortArray() {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("banglore");
		arrayList.add("mumbai");
		arrayList.add("chennai");
		arrayList.add("hydrabad");
		arrayList.add("delhi");
		
		System.out.println("The names of  array list are: " + arrayList);
		System.out.println("Array list elements are " + arrayList);
		
		System.out.print("Search an element in a array list: ");
		String searchName = scanner.nextLine();
		
		Collections.sort(arrayList);
		
		int result = Collections.binarySearch(arrayList, searchName);
		if (result >= 0) {
			System.out.println(searchName + " is present in the array list");
		} else {
			System.out.println("Searching failed!!! ");
		}
		
		System.out.println("Array list after sorting based on alphabetical order: " +arrayList);
		scanner.close();
	}
}
