package Tests;

import SortingAlgorithms.MergeSort;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {
    private MergeSort mergeSort= new MergeSort();
    private Number [] list1 = {0,1,2,3,4,5,6,7,8,9,10};
    private Number [] list2 = {10,9,8,7,6,5,4,3,2,1,0};
    private Number [] list3 = {0,0,0,0,0,0,0,0,0,0};

    @Test
    void sort() {

            mergeSort.sort(list1);
            for(int i = 0 ; i <  list1.length - 1 ; i++){
                assertTrue( list1[i].doubleValue()<= list1[i+1].doubleValue());
            }
            mergeSort.sort(list2);
            for(int i = 0 ; i <  list2.length - 1 ; i++){
                assertTrue( list2[i].doubleValue()<= list2[i+1].doubleValue());
            }
        mergeSort.sort(list3);
            for(int i = 0 ; i <  list3.length - 1 ; i++){
                assertTrue( list3[i].doubleValue()<= list3[i+1].doubleValue());
            }


            Throwable exception = assertThrows(NullPointerException.class, () -> {
                Number [] list5 = new Number[10];
                mergeSort.sort(list5);
            });
            assertEquals("Array content value null", exception.getMessage());


    }

}