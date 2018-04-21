import Shapes.*;
import SortingAlgorithms.QuickSort;
import SortingAlgorithms.Sorting;

public class App {

    public static void inheritance(){

        // abstract class
        //Shape sp = new Shape("ss");
        Circle circle = new Circle("Circle", 3);
        Triangle triangle = new Triangle("Triangle",1,2,3);
        Rectangle rectangle = new Rectangle("Rectangle",3,3);
        Square square = new Square("Square", 2);

        ShapeContainer shapes = new ShapeContainer();

        shapes.addShape(circle);
        shapes.addShape(triangle);
        shapes.addShape(rectangle);
        shapes.addShape(square);

        shapes.display();
        System.out.print("\n");
        shapes.display("Square");
        shapes.display("ss");
    }

    public static void simpleSortingAlgorithms(){

        Integer list[] = new Integer[5];
        list[0]= 12;
        list[1]= 15;
        list[2]= 11;
        list[3]= 13;
        list[4]= 4;

        Double list2[] = new Double [5];
        list2[0]= 12.123d;
        list2[1]= 1.1312d;
        list2[2]= 0d;
        list2[3]= 8d;
        list2[4]= 5.123d;

        Float list3[] = new Float [10];
        list3[0]= 12.123f;
        list3[1]= 1.1312f;
        list3[2]= 9.1f;
        list3[3]= 8.123f;
        list3[4]= 24.123f;
        list3[5]= 18.123f;
        list3[6]= 4.1312f;
        list3[7]= 0f;
        list3[8]= 3f;
        list3[9]= 2.3f;


       Sorting sorting = new Sorting();

       Number sortedList[] =sorting.bubbleSort(list);
       sorting.display(sortedList);
       Number sortedList2[] = sorting.bubbleSort(list2);
       sorting.display(sortedList2);

        Number sortedList3[] =sorting.selectionSort(list);
        sorting.display(sortedList3);
        Number sortedList4[] = sorting.selectionSort(list2);
        sorting.display(sortedList4);

        Number sortedList5[] =sorting.insertionSort(list);
        sorting.display(sortedList5);
        Number sortedList6[] = sorting.insertionSort(list2);
        sorting.display(sortedList6);

    }

    public static void quickSort(){
        Integer list[] = new Integer[5];
        list[0]= 12;
        list[1]= 15;
        list[2]= 11;
        list[3]= 13;
        list[4]= 4;

        Double list2[] = new Double [5];
        list2[0]= 12.123d;
        list2[1]= 1.1312d;
        list2[2]= 0d;
        list2[3]= 8d;
        list2[4]= 5.123d;

        Float list3[] = new Float [10];
        list3[0]= 12.123f;
        list3[1]= 1.1312f;
        list3[2]= 9.1f;
        list3[3]= 8.123f;
        list3[4]= 24.123f;
        list3[5]= 18.123f;
        list3[6]= 4.1312f;
        list3[7]= 0f;
        list3[8]= 3f;
        list3[9]= 2.3f;

        Sorting sorting = new Sorting();
        QuickSort quick = new QuickSort();

        sorting.display(list);
        quick.sort(list);
        sorting.display(list);

        sorting.display(list2);
        quick.sort(list2);
        sorting.display(list2);

        sorting.display(list3);
        quick.sort(list3);
        sorting.display(list3);
    }

    public static void mergeSort(){

    }

    public static void main(String[] args){

        /*inheritance();*/
        /*simpleSortingAlgorithms();*/
       /* quickSort();*/
       mergeSort();
    }

}
