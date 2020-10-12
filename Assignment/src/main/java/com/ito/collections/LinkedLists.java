package com.ito.collections;
/**
 * This class contains all programs of LinkedList
 * @author Lakshmeesh Achar
 * @version 1.0.0
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

import org.springframework.stereotype.Service;

@Service
public class LinkedLists {

	Scanner scanner = new Scanner(System.in);

	public void addToEndOfList() {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("Jhon");
		linkedList.add("Joans");
		linkedList.add("Martha");
		linkedList.add("Ulrich");
		linkedList.add("Hannha");
		System.out.println("The names of linked lists are: " + linkedList);
		System.out.print("Enter the element at end of a linked list: ");
		String endName = scanner.nextLine();
		linkedList.addLast(endName);
		System.out.println("The names of linked lists after appending: " + linkedList);
	}



	public void toIterateList() {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("Jhon");
		linkedList.add("Martha");
		linkedList.add("Ulrich");
		linkedList.add("Hannaha");
		linkedList.add("Adam");
		System.out.println("The names of linked lists are: " + linkedList);
		System.out.println("Iterate through all elements in a linked list");
		Iterator< String> iterator = linkedList.listIterator();
		while (iterator.hasNext()) {
			String value = (String) iterator.next();
			System.out.println(value);
		}
		System.out.println("Iterate a linked list in reverse order");
		for (int i = linkedList.size() - 1; i >= 0; i--) {
			System.out.println(linkedList.get(i));
		}
		System.out.println("Iterate through all elements in a linked list starting at the specified position");
		System.out.print("Enter the index value to start iteration: ");
		int index = scanner.nextInt();
		for(ListIterator<String> iter = linkedList.listIterator(index);iter.hasNext();) {
			String value = (String)iter.next();
			System.out.println(value);
		}
	}


	public void toInserAtSpecifiedPlace() {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("peter");
		linkedList.add("harry");
		linkedList.add("sim");
		linkedList.add("kim");
		linkedList.add("khan");
		System.out.println("The names of linked lists are: " + linkedList);
		System.out.println("Insert the specified element at the specified position in the linked list");
		System.out.print("Enter the specified position: ");
		int index = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter the name toS insert: ");
		String name = scanner.nextLine();
		linkedList.add(index, name);
		System.out.println("Result after adding name: " + linkedList);
	}


	public void toInsertAtFrontAndEnd() {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("Jhon");
		linkedList.add("rio");
		linkedList.add("Tokyo");
		linkedList.add("Heksiki");
		linkedList.add("Ulrik");
		System.out.println(" Linked lists are: " + linkedList);
		System.out.print("Insert the specified element at the front of a linked list: ");
		String name = scanner.nextLine();
		linkedList.addFirst(name);
		System.out.println("Result after adding name at the beginning: " + linkedList);
		System.out.print("Insert the specified element at the end of a linked list: ");
		String name1 = scanner.nextLine();
		linkedList.addLast(name1);
		System.out.println("Result after adding name at the end: " + linkedList);
	}



	public void toDisplayAndRemove() {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("Johan");
		linkedList.add("Jonas");
		linkedList.add("Martha");
		linkedList.add("elven");
		linkedList.add("will");
		System.out.println("The names of linked lists are: " + linkedList);
		System.out.println("Display the elements and their positions in a linked list:");
		for (int i = 0; i < linkedList.size(); i++) {
			System.out.println(linkedList.get(i) + " is present at " + i + " position");
		}
		System.out.println("Remove first and last element from a linked list");
		linkedList.removeFirst();
		linkedList.removeLast();
		System.out.println("The names of linked lists after removing first and last elements:" + linkedList);
		System.out.println("Remove all the elements from a linked list");
		linkedList.clear();
		System.out.println("Result after removing :" + linkedList);
	}


	public void toJoinTwoLinkedList() {
		System.out.println("Join two linked lists");
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("Darshan");
		linkedList.add("Sudeep");
		linkedList.add("Sharuk");
		linkedList.add("Salman");
		linkedList.add("Abhi");
		System.out.println("The names of linked list1 are: " + linkedList);
		LinkedList<String> linkedList2 = new LinkedList<String>();
		linkedList2.add("Bus");
		linkedList2.add("Car");
		linkedList2.add("Airoplane");
		linkedList2.add("Riksha");
		linkedList2.add("Bike");
		System.out.println("The names of linked list2 are: " + linkedList2);
		linkedList.addAll(linkedList2);
		System.out.println("Result after joining: " + linkedList);
	}
	
	
	
	public void toCloneList() {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("Kim");
		linkedList.add("Arien");
		linkedList.add("Katherina");
		linkedList.add("Bob");
		linkedList.add("Britain");
		System.out.println("The names of linked lists are: " + linkedList);
		System.out.println("Clone an linked list to another linked list");
		LinkedList<String> linkedList2 = new LinkedList<String>();
		System.out.println("Elements in new linked list are: " + linkedList2);
		linkedList2 = (LinkedList<String>) linkedList.clone();
		System.out.println("Result after cloning "+ linkedList2);
	}
	
	
	public void toRemoveAndRetreive() {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("Jhon");
		linkedList.add("jim");
		linkedList.add("Kim");
		linkedList.add("Tom");
		linkedList.add("Sim");
		System.out.println("The names of linked lists are: " + linkedList);
		System.out.println("Remove and return the first element of a linked list");
		System.out.println("Removing ! " + linkedList.removeFirst());
		System.out.println("Result after removing: " + linkedList);
		System.out.println("Retrieve but does not remove, the first element of a linked list");
		System.out.println("Retreiving ! ! ! " + linkedList.getFirst());
		System.out.println("Result after retreiving: " + linkedList);
	}
	
	
	
	public void toCheckElementExistance() {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("Danny");
		linkedList.add("Areian");
		linkedList.add("Katherina");
		linkedList.add("Martha");
		linkedList.add("Sham");
		System.out.println("The names of linked lists are: " + linkedList);
		System.out.println("Check if a particular element exists in a linked list");
		System.out.print("Enter the element you want to check: ");
		String name =scanner.nextLine();
		if (linkedList.contains(name)) {
			System.out.println(name + " is present in the list");
		} else {
			System.out.println(name + " is not present in the list");
		}
	}
	
	
	public void toConvertToArrayList() {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("kareena");
		linkedList.add("kajal");
		linkedList.add("kathrina");
		linkedList.add("deepika");
		linkedList.add("aiswarya");
		System.out.println("The names of linked lists are: " + linkedList);
		System.out.println("Convert a linked list to array list");
		ArrayList<String> al = new ArrayList<String>(linkedList);
		System.out.println( "The names of array list are: "  + al);
	}
	
	
	

}
