package com.ito.collections;
/**
 * This class contains all programs of TreeSet
 * @author Lakshmeesh Achar
 * @version 1.0.0
 */
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

import org.springframework.stereotype.Service;

@Service
public class TreeSets {
	
	Scanner scanner = new Scanner(System.in);
	
	
	public void toIterateTreeSet() {
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(5);
		treeSet.add(10);
		treeSet.add(21);
		treeSet.add(44);
		System.out.println("The elements of tree set are: " + treeSet);
		System.out.println("Iterate through all elements in a tree set");
		Iterator<Integer> iterator = treeSet.iterator();
		while (iterator.hasNext()) {
			int value = (int) iterator.next();
			System.out.println(value);
		}
	}
	
	
	public void toAddElement() {
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(7);
		treeSet.add(18);
		treeSet.add(24);
		treeSet.add(3);
		System.out.println("The elements of tree set are: " + treeSet);
		System.out.println("Add all the elements of a specified tree set to another tree set");
		TreeSet<Integer> treeSet2 = new TreeSet<Integer>();
		treeSet2.add(2);
		treeSet2.add(4);
		treeSet2.add(9);
		System.out.println("The elements of 2nd tree set are: " + treeSet2);
		treeSet.addAll(treeSet2);
		System.out.println("The elemets of the first tre set after adding elemets; " + treeSet);
	}
	
	
	public void toReverseCountGetFirstAndLastElement() {
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(7);
		treeSet.add(18);
		treeSet.add(24);
		treeSet.add(3);
		System.out.println("The elements of tree set are: " + treeSet);
		System.out.println("Reverse order view of the elements contained in a given tree set");
		Iterator<Integer> iterator = treeSet.descendingIterator();
		while (iterator.hasNext()) {
			int value = (int) iterator.next();
			System.out.println(value);
		}
		System.out.println("Get the first and last elements in a tree set");
		System.out.println("First element is: " + treeSet.first());
		System.out.println("Last element is: " + treeSet.last());
		System.out.println("get the number of elements in a tree set");
		int count = 0;
		for (int i = 0; i < treeSet.size(); i++) {
			count++ ;
		}
		System.out.println("The number of elements in tree set are: " +count);
	}
	
	
	
	public void toNumberLessThan7() {
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(7);
		treeSet.add(18);
		treeSet.add(24);
		treeSet.add(3);
		System.out.println("The elements of tree set are: " + treeSet);
		System.out.println("Find the numbers less than 7 in a tree set");
		Iterator<Integer> iterator = treeSet.iterator();
		while (iterator.hasNext()) {
			Integer value = (Integer) iterator.next();
			if (value < 7) {
				System.out.println(value);
			}
		}
	}
	
	
	public void toGetSpecificElement() {
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(7);
		treeSet.add(18);
		treeSet.add(24);
		treeSet.add(3);
		System.out.println("The elements of tree set are: " + treeSet);
		System.out.println("Get the element in a tree set ");
		System.out.print("Enter the element: ");
		int element = scanner.nextInt();
		Iterator<Integer> iterator = treeSet.iterator();
		System.out.print("The numbers which are greater than or equal to " + element + " are :");
		while (iterator.hasNext()) {
			Integer value = (Integer) iterator.next();
			if (value >= element) {
				System.out.print( value + " ");
			}
		}
	}
	
	
	
	public void toRetreiveAndRemove() {
		
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		
		treeSet.add(7);
		treeSet.add(18);
		treeSet.add(24);
		treeSet.add(3);
		
		System.out.println("The elements of tree set are: " + treeSet);
		System.out.println("Retrieve and remove the first element of a tree set");
		System.out.println("Before removing first element: " + treeSet);
		System.out.println("Retreiving ! ! ! " + treeSet.pollFirst());
		System.out.println("After removing first element: " + treeSet);
		System.out.println("Retrieve and remove the last element of a tree set");
		System.out.println("Before removing first element: " + treeSet);
		System.out.println("Retreiving ! ! ! " + treeSet.pollLast());
		System.out.println("After removing first element: " + treeSet);
	}
	
	
	
	public void toRemoveParticularElement() {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(10);
		ts.add(11);
		ts.add(12);
		ts.add(13);
		System.out.println("The elements of tree set are: " + ts);
		System.out.println("Remove a given element from a tree set");
		System.out.print("Enter the elemet to remove from the tree set: ");
		int element = scanner.nextInt();
		ts.remove(element);
		System.out.println("Tree set after removing: " + ts);
	}
	

}
