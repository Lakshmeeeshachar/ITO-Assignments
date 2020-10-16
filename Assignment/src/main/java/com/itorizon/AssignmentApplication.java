package com.itorizon;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ito.arrayas.arraysaassignment;
import com.ito.collections.ArrayLists;
import com.ito.collections.HashMaps;
import com.ito.collections.HashSets;
import com.ito.collections.LinkedLists;
import com.ito.collections.MyComparators;
import com.ito.collections.TreeMaps;
import com.ito.collections.TreeSets;
import com.ito.strings.Strings;
/**
 * This class is the starting point of Spring boot application
 * @author Lakshmeesh Achar
 *
 */

@SpringBootApplication
public class AssignmentApplication implements CommandLineRunner {
	
	@Autowired
	private Strings strings;
	@Autowired
	private arraysaassignment arrays;
	@Autowired
	private ArrayLists arrayLists;
	@Autowired
	private HashMaps hashMaps;
	@Autowired
	private HashSets hashSets;
	@Autowired
	private LinkedLists linkedLists;
	
	@Autowired
	private TreeMaps treeMaps;
	@Autowired
	private TreeSets treeSets;
	

	public static void main(String[] args) {
		SpringApplication.run(AssignmentApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		/**
		 * The programs based on strings
		 */
		strings.noOfCharacters();
		strings.noOfVowels();
                strings.divideString();		
         	strings.removeWhiteSpaces();
	        strings.conversionOfCase();
                strings.replaceWithSpecficCharacter();		
	        strings.maxMinOccurance();
		strings.reverseOfString();
	        strings.findDuplicateCharacter();
		strings.findDuplicateWords();
		strings.toFindFrequency();
		strings.toFindLargestSmallestWord();
		strings.toFindRepeatedWordInTxt();
 		strings.noOfWordsInTxt();
		strings.separateIndividualChar();
		strings.charStringConversion();
		strings.sortingStringsInAlpa();
    	        strings.howToRemoveFirstString();
	
       /**
        * The Programs Based on Arrays
        */
		
		arrays.toSortNumericAndStringArray();
                arrays.toSumValues();
                arrays.toPrintGrid();
		arrays.toCalculateAverage();
		arrays.toTestArray();
		arrays.toFingIndex();
		arrays. toRemoveSpecificElement();
		arrays.toCopyArray();
		arrays.toInsertElement();
		arrays.toFindMaxAndMin();
		arrays.toReverseArray();
		arrays.toFindDupicateArray();
		arrays.toFindDuplicateValues();
		arrays.toFindCommonElements();
		arrays.toFindCommonIntegers();
		arrays.toRemoveDupicateElements();
		arrays.toFindLargestElements();
		arrays.toFindSecondSmallestEle();
		arrays.toAddTwoMatrics();
		arrays. toTestEquality();
		arrays.toFindMissingNumber();
		arrays.toFindCommonElementsFromArrays();
		arrays.toMoveZeroToEnd();
		arrays.noOfEvenAndOdd();
		arrays.getDifferenceBetweenLargeAndSmall();
		arrays.avgOfIntegers();
		arrays.toCheckArray();
		arrays.toCheckSum(); 
		arrays.toCheckSpecifiedElement();
		arrays.removeDuplicate();
		arrays.sumOfElementsOfArray();
		arrays. toFindPositiveAndNegative();
		arrays.toFindSmallestAndSecondSmallest();
		arrays. zeroOnLeftOneOnRight() ;
		arrays.negativeBeforePositiveElements();
		arrays. positiveBeforeNegativeElements();
		arrays.seperateEvenAndOdd();
		
     	/**
     	 * The Programs Based On Collections ArrayList
     	 */
		
		arrayLists.addToArrayList();
		arrayLists.toInsertAtFirstPosition();
		arrayLists.indexToShowName();
		arrayLists.updateArrayElement();
		arrayLists.removeThirdElement() ;
		arrayLists.copyElementsToOtherArrayList();
		arrayLists.reverseJoinClone();
		arrayLists. checkArrayEmptyOrNot();
		arrayLists.searchAndSortArray();
		
		/**
		 * The Programs based on collections HashMaps
		 */
		hashMaps.addStudent();
		hashMaps.iterateHashMap();
		hashMaps.getAndCountEntries();
		hashMaps.copyAndRemove();
		hashMaps.containsSpecificStudent();
		hashMaps.setAndCollectionView();
		
	/**
	 * The Programs Based on Collections HashSets
	 */
		hashSets.toAddName();
		hashSets.toIterateHashSet();
		hashSets.toCountAndEmptyHashSet();
		hashSets.toConvertToArrayList();
		hashSets. toCompare();
		hashSets.toCompareAndRetain();
		hashSets.toRemoveAllElements();
		
		/**
		 * The Programs Based on Collection LinkedLists
		 */
		linkedLists.addToEndOfList();
		linkedLists.toIterateList();
		linkedLists.toInserAtSpecifiedPlace();
		linkedLists.toInsertAtFrontAndEnd();
		linkedLists.toDisplayAndRemove() ;
		linkedLists.toJoinTwoLinkedList();
		linkedLists.toCloneList();
		linkedLists.toRemoveAndRetreive();
		linkedLists.toCheckElementExistance();
		linkedLists.toConvertToArrayList();
		
		/**
		 * The Programs Based on Collections TreeMaps
		 */
		treeMaps.toGetAndDeleteAll();
		treeMaps.toSortKeysInDescendingOrder() ;
		treeMaps.toGetFirstAndLastKey();
		treeMaps.toReverseTreeSet() ;

		/**
		 * The Programs Based on Collections TreeSet
		 */
		treeSets.toIterateTreeSet();
		treeSets.toAddElement();
		treeSets.toReverseCountGetFirstAndLastElement();
		treeSets. toNumberLessThan7();
		treeSets.toGetSpecificElement();
		treeSets.toRetreiveAndRemove();
		treeSets.toRemoveParticularElement();
		 }
	}
