package SortingAlgorithms;

public class Sorting {

    private boolean isNull(final Number list[]){

        if(list == null)return true;

        for (Number num : list)
        {
            if(num == null) return true;
        }
        return false;
    }

    public Number[] bubbleSort(final Number list[]) {

        boolean isNull = isNull(list);
        if(isNull){ return null;}

        if (list.length == 0) {
            return null;
        }


        Number sortedList[] = list;

        for (int i = 0; i < sortedList.length - 1; i++) {
            for (int j = 0; j < sortedList.length - 1; j++) {

                if (sortedList[j].doubleValue() > sortedList[j + 1].doubleValue()) {
                    swap(sortedList, j, j + 1);
                }
            }
        }

        return sortedList;
    }

    public Number[] selectionSort(Number list[]) {

        boolean isNull = isNull(list);
        if(isNull){ return null;}

        if (list.length == 0) {
            return null;
        }

        Number sortedList[] = list;

        for (int i = 0; i < sortedList.length -1; i++) {
            Number min = sortedList[i];
            int index = i;
            for (int j = i + 1; j < sortedList.length ; j++) {

                if (min.doubleValue() > sortedList[j].doubleValue()) {
                    min = sortedList[j];
                    index = j;
                }
            }
            swap(sortedList, index, i);
        }

        return sortedList;
    }

    public Number[] insertionSort(Number list[]) {

        boolean isNull = isNull(list);
        if(isNull){ return null;}

        if (list.length == 0) {
            return null;
        }

        Number[] sortedList;
        sortedList = list;

        for (int i = 1; i < sortedList.length  ; i++) {
            Number number = sortedList[i];
            int index = i;
            for (int j = i-1; j >= 0; j--) {
                if (number.doubleValue() < sortedList[j].doubleValue()) {
                    index = j ;
                }
            }
            for (int k = i; k >index; k--) {
                swap(sortedList, k, k - 1);
            }
        }

        return sortedList;
    }

    private void swap(Number list[], int i, int j) {

        Number pom = list[i];

        list[i] = list[j];
        list[j] = pom;

    }

    public void display(Number[] numberList) {
        for (Number num : numberList) {
            System.out.print(num + ", ");
        }
        System.out.printf("\n");
    }

}