package SortingAlgorithms;

public class MergeSort {

    protected Number[] list;
    protected int length;

    public void sort(Number[] list) {

        this.list = list;
        this.length = list.length;

        mergeSort(0, length - 1);

    }

    protected void mergeSort(int lowerIndex, int highterIndex){


    }
}
