package SortingAlgorithms;

public class MergeSort {

    private Number[] numbers;
    private int length;
    private Number[] helper;

    private void sort(Number[] list) {

        this.numbers = list;
        this.length = list.length;
        helper = new Number[list.length];

        mergeSort(0, length - 1);

    }

    private void mergeSort(int lowerIndex, int highterIndex) {

        if (lowerIndex < highterIndex) {

            int middleIndex = lowerIndex + (highterIndex - lowerIndex) / 2;

            mergeSort(lowerIndex, middleIndex);
            mergeSort(middleIndex + 1, highterIndex);

            merge(lowerIndex, middleIndex, highterIndex);
        }
    }

    private void merge(int low, int middle, int high) {

        // Copy values from number to helping array helper
        System.arraycopy( numbers, 0, helper, 0, numbers.length );

        //helping variables
        int min = low;
        int mid = middle + 1;
        int max = low;

        // Sorting values by range
        while (min <= middle && mid <= high) {
            if (helper[min].doubleValue() <= helper[mid].doubleValue()) {
                numbers[max] = helper[min];
                min++;
            } else {
                numbers[max] = helper[mid];
                mid++;
            }
            max++;
        }

        // Copy rest of values ( using features that both of arrays are sorted
        while (min <= middle) {
            numbers[max] = helper[min];
            max++;
            min++;
        }
    }

    private void display(Number[] numbers) {
        for (Number num : numbers) {
            System.out.print(num + ", ");
        }

        System.out.printf("\n");
    }

    public void sortAndDisplay(Number[] list) {
        display(list);
        sort(list);
        display(list);
    }
}


