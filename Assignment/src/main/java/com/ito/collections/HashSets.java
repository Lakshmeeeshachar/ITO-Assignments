package com.ito.collections;
/**
 * This class contains all programs of HashSet
 * @author Lakshmeesh Achar
 * @version 1.0.0
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

import org.springframework.stereotype.Service;

@Service
public class HashSets {
	Scanner scanner = new Scanner(System.in);
	
	public void toAddName() {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Rio");
		hs.add("Monica");
		hs.add("Helsinki");
		System.out.println("The names of hash set are: " + hs);
		System.out.print("Add student names in a hash set: ");
		String name = scanner.nextLine();
		hs.add(name);
		System.out.println("Result after adding name: " + hs);
	}
	
	
	public void toIterateHashSet() {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Jhon");
		hs.add("Jonas");
		hs.add("Peter");
		System.out.println("The names of hash set are: " + hs);
		System.out.print("Add student names in a hash set: ");
		String name = scanner.nextLine();
		hs.add(name);
		System.out.println("Result after adding name: " + hs);
	}
	
	
	public void toCountAndEmptyHashSet() {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Lakshmeesh");
		hs.add("Sharat");
		hs.add("Pavan");
		System.out.println("The names of hash set are: " + hs);
		System.out.println("Get the number of elements in a hash set");
		int count = 0;
		for (int i = 0; i < hs.size(); i++) {
			count++;
		}
		System.out.println("The number of elements in the hash set are: " + count);
		System.out.println("Empty an hash set");
		hs.clear();
		System.out.println("Result after emptying: " + hs);
	}
	
	
	public void toConvertToArrayList() {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Raj");
		hs.add("Rani");
		hs.add("Mantri");
		System.out.println("The names of hash set are: " + hs);
		System.out.println("Convert a hash set to a List/ArrayList");
		ArrayList<String> al = new ArrayList<String>(hs);
		System.out.println("The names of array list are: " + al);
	}
	
	
	public void toCompare() {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Denver");
		hs.add("Rio");
		hs.add("Tokyo");
		System.out.println("The names of hash set are: " + hs);
		System.out.println("Compare two hash sets");
		HashSet<String> hs2 = new HashSet<String>();
		hs2.add("Denver");
		hs2.add("Rio");
		hs2.add("Mikel");
		System.out.println("The names of hash set 2 are: " + hs2);
		boolean result = hs.containsAll(hs2);
		if (result) {
			System.out.println("Two hash sets are same ");
		} else {
			System.out.println("Two hash sets are not same ");
		}
	}
	
	
	public void toCompareAndRetain() {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Jhoan");
		hs.add("Jonas");
		hs.add("Martha");
		System.out.println("The names of hash set are: " + hs);
		System.out.println("Compare two sets and retain elements which are same on both sets");
		HashSet<String> hs2 = new HashSet<String>();
		hs2.add("Ulrik");
		hs2.add("Jhoan");
		hs2.add("Martha");
		System.out.println("The names of the 2nd hash sets are: " +hs2);
		hs.retainAll(hs2);
		System.out.println("names common to both hash set are: " + hs);
	}
	
	
	public void toRemoveAllElements() {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Jhon");
		hs.add("Jonas");
		hs.add("Martha");
		System.out.println("The names of hash set are: " + hs);
		System.out.println("Remove all of the elements from a hash set");
		hs.clear();
		System.out.println("Result after removing all elemets from hash set is; " + hs);
	}
	
	
	
	
}
