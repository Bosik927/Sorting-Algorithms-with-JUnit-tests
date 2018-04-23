package SortingAlgorithms;
import java.lang.NullPointerException;

public class QuickSort  {

    private Number[] list;
    private int length;

    public QuickSort(){}

    public void sort(Number[] list) throws NullPointerException{

        boolean isNull = isNull(list);
        if(isNull) throw new NullPointerException("Array content value null");

        this.list = list;
        this.length = list.length;

        quickSort(0, length - 1);

    }

    private boolean isNull(final Number list[]){

        if(list == null)return true;

        for (Number num : list)
        {
            if(num == null) return true;
        }
        return false;
    }

    private void quickSort(int lowerIndex, int highterIndex) {

        if (lowerIndex == highterIndex || lowerIndex > highterIndex) return;

        int max, pivot;

        //Helping variables
        //Pivot always first value
        max = highterIndex;
        pivot = lowerIndex;

        int minPartly = 0, maxPartly = highterIndex - lowerIndex;
        Number[] partlySortedList = new Number[highterIndex - lowerIndex + 1];

        //Swap bigger values to right and lower to left
        for (int i = lowerIndex + 1; i <= highterIndex; i++) {
            if (list[pivot].doubleValue() < list[i].doubleValue()) {
                partlySortedList[maxPartly] = list[i];
                max--;
                maxPartly--;
            } else {
                partlySortedList[minPartly] = list[i];
                minPartly++;
            }
        }

        //Insert pivot to right place
        partlySortedList[minPartly] = list[pivot];

        //Copy values from helping array to original array
        int sizePartlySortedList = 0;
        for (int i = lowerIndex; i <= highterIndex; i++) {
            list[i] = partlySortedList[sizePartlySortedList];
            sizePartlySortedList++;
        }

        //QuickSort to arrays without pivot
        quickSort(lowerIndex, max - 1);
        quickSort(max + 1, highterIndex);
    }

    private void display(Number[] numbers) {
        for (Number num : numbers) {
            System.out.print(num + ", ");
        }

        System.out.printf("\n");
    }

    public void sortAndDisplay(Number[] list) throws NullPointerException{
        display(list);
        sort(list);
        display(list);
    }

}
