package Tests;

import SortingAlgorithms.Sorting;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SortingTest {

    private Number [] list1 = {0,1,2,3,4,5,6,7,8,9,10};
    private Number [] list2 = {10,9,8,7,6,5,4,3,2,1,0};
    private Number [] list3 = {0,0,0,0,0,0,0,0,0,0};
    private Number [] list4 = new Number[10];
    private Number [] list5 ;

    private Sorting sorting = new Sorting();

    @org.junit.jupiter.api.Test
    void bubbleSort() {
        Number[] testingArray;

        testingArray=sorting.bubbleSort(list1);
        for(int i = 0 ; i <  testingArray.length - 1 ; i++){
            assertTrue( testingArray[i].doubleValue()<= testingArray[i+1].doubleValue());
        }
        testingArray=sorting.bubbleSort(list2);
        for(int i = 0 ; i <  testingArray.length - 1 ; i++){
            assertTrue( testingArray[i].doubleValue()<= testingArray[i+1].doubleValue());
        }
        testingArray=sorting.bubbleSort(list3);
        for(int i = 0 ; i <  testingArray.length - 1 ; i++){
            assertTrue( testingArray[i].doubleValue()<= testingArray[i+1].doubleValue());
        }
        testingArray = sorting.bubbleSort(list4);
        assertTrue(testingArray==null);

        testingArray = sorting.bubbleSort(list5);
        assertTrue(testingArray==null);
    }

    @org.junit.jupiter.api.Test
    void selectionSort() {
        Number[] testingArray;

        testingArray=sorting.selectionSort(list1);
        for(int i = 0 ; i <  testingArray.length - 1 ; i++){
            assertTrue( testingArray[i].doubleValue()<= testingArray[i+1].doubleValue());
        }
        testingArray=sorting.selectionSort(list2);
        for(int i = 0 ; i <  testingArray.length - 1 ; i++){
            assertTrue( testingArray[i].doubleValue()<= testingArray[i+1].doubleValue());
        }
        testingArray=sorting.selectionSort(list3);
        for(int i = 0 ; i <  testingArray.length - 1 ; i++){
            assertTrue( testingArray[i].doubleValue()<= testingArray[i+1].doubleValue());
        }
        testingArray = sorting.selectionSort(list4);
        assertTrue(testingArray==null);

        testingArray = sorting.selectionSort(list5);
        assertTrue(testingArray==null);
    }

    @org.junit.jupiter.api.Test
    void insertionSort() {
        Number[] testingArray;

        testingArray=sorting.insertionSort(list1);
        for(int i = 0 ; i <  testingArray.length - 1 ; i++){
            assertTrue( testingArray[i].doubleValue()<= testingArray[i+1].doubleValue());
        }
        testingArray=sorting.insertionSort(list2);
        for(int i = 0 ; i <  testingArray.length - 1 ; i++){
            assertTrue( testingArray[i].doubleValue()<= testingArray[i+1].doubleValue());
        }
        testingArray=sorting.insertionSort(list3);
        for(int i = 0 ; i <  testingArray.length - 1 ; i++){
            assertTrue( testingArray[i].doubleValue()<= testingArray[i+1].doubleValue());
        }
        testingArray = sorting.insertionSort(list4);
        assertTrue(testingArray==null);

        testingArray = sorting.insertionSort(list5);
        assertTrue(testingArray==null);
    }
}