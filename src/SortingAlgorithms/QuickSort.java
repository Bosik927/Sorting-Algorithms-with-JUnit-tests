package SortingAlgorithms;

public class QuickSort {

    protected Number[] list;
    protected int length;

    public void sort(Number[] list) {

        this.list = list;
        this.length = list.length;

        quickSort(0, length - 1);

    }

    protected void quickSort(int lowerIndex, int highterIndex) {

        if (lowerIndex == highterIndex || lowerIndex > highterIndex) return;

        int min, max, piriod;

        min = lowerIndex;
        max = highterIndex;
        piriod = lowerIndex;

        int minPartly = 0, maxPartly = highterIndex - lowerIndex;
        Number[] partlySortedList = new Number[highterIndex - lowerIndex + 1];

        for (int i = lowerIndex + 1; i <= highterIndex; i++) {
            if (list[piriod].doubleValue() < list[i].doubleValue()) {
                partlySortedList[maxPartly] = list[i];
                max--;
                maxPartly--;
            } else {
                partlySortedList[minPartly] = list[i];
                min++;
                minPartly++;
            }
        }
        partlySortedList[minPartly] = list[piriod];

        int sizePartlySortedList = 0;
        for (int i = lowerIndex; i <= highterIndex; i++) {
            list[i] = partlySortedList[sizePartlySortedList];
            sizePartlySortedList++;
        }
        quickSort(lowerIndex, max - 1);
        quickSort(max + 1, highterIndex);
    }

    protected void swap(int i, int j) {

        Number pom = list[i];

        list[i] = list[j];
        list[j] = pom;

    }

    public void display() {
        for (Number num : list) {
            System.out.print(num + ", ");
        }

        System.out.printf("\n");
    }
}
