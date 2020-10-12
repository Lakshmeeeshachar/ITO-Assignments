package com.ito.collections;
/**
 * This class contains all programs of TreeMap
 * @author Lakshmeesh Achar
 * @version 1.0.0
 */
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import org.springframework.stereotype.Service;

@Service
public class TreeMaps {

	Scanner scanner = new Scanner(System.in);
	
	public void toGetAndDeleteAll() {
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		treeMap.put(3, "Jhon");
		treeMap.put(8, "Joans");
		treeMap.put(6, "Martha");
		treeMap.put(1, "will");
		System.out.println("The elements in the tree map are: " + treeMap);
		System.out.println("Get all keys from the given a Tree Map");
		Set s1 = treeMap.keySet();
		System.out.println("The list of keys are: " + s1);
		System.out.println("Delete all elements from a given Tree Map");
		treeMap.clear();
		System.out.println("Tree set after deleting all the elemets: " + treeMap);
	}
	
	
	public void toSortKeysInDescendingOrder() {
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		treeMap.put(3, "Jhoan");
		treeMap.put(8, "Joans");
		treeMap.put(6, "Martha");
		treeMap.put(1, "Will");
		System.out.println("The elements in the tree map are: " + treeMap);
		System.out.println("Sort keys in descending order by using comparator");
		TreeMap<Integer, String> treeMap2 = new TreeMap<Integer, String>(new MyComparators());
		treeMap2.put(3, "Jhoan");
		treeMap2.put(8, "Joans");
		treeMap2.put(6, "Martha");
		treeMap2.put(1, "Will");
		System.out.println("Tree map in descending order: " + treeMap2);
	}
	
	
	public void toGetFirstAndLastKey() {
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		treeMap.put(3, "Jhoan");
		treeMap.put(8, "Joans");
		treeMap.put(6, "Martha");
		treeMap.put(1, "Will");
		System.out.println("The elements in the tree map are: " + treeMap);
		System.out.println("get the first (lowest) key and the last (highest) key currently in a map");
		System.out.println("The lowest key is: " + treeMap.firstKey());
		System.out.println("The highest key is: " + treeMap.lastKey());
	}
	
	public void toReverseTreeSet() {
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(3, "Jhoan");
		tm.put(8, "Joans");
		tm.put(6, "Martha");
		tm.put(1, "Will");
		System.out.println("The elements in the tree map are: " + tm);
		System.out.println("Get a reverse order view of the keys contained in a given map");
		System.out.println("Reverse order  the keys: " + tm.descendingKeySet());
	}
	
	
}
