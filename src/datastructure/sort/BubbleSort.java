package datastructure.sort;

/**
 * Created by carl on 2016/4/22.
 */


class ArrayBub
{
    private long[] a;                 // ref to array a
    private int nElems;               // number of data items
    //--------------------------------------------------------------
    public ArrayBub(int max)          // constructor
    {
        a = new long[max];                 // create the array
        nElems = 0;                        // no items yet
    }
    //--------------------------------------------------------------
    public void insert(long value)    // put element into array
    {
        a[nElems] = value;             // insert it
        nElems++;                      // increment size
    }
    //--------------------------------------------------------------
    public void display()             // displays array contents
    {
        for(int j=0; j<nElems; j++)       // for each element,
            System.out.print(a[j] + " ");  // display it
        System.out.println("");
    }
    //--------------------------------------------------------------
    public void bubbleSort()
    {
        int out, in;


    }  // end bubbleSort()
    //--------------------------------------------------------------
    private void swap(int one, int two)
    {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
//--------------------------------------------------------------
}  // end class ArrayBub
////////////////////////////////////////////////////////////////
public class BubbleSort
{
    public static void main(String[] args)
    {
        int maxSize = 100;            // array size
        ArrayBub arr;                 // reference to array
        arr = new ArrayBub(maxSize);  // create the array

        arr.insert(77);               // insert 10 items
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);

        arr.display();                // display items

        arr.bubbleSort();             // bubble sort them

        arr.display();                // display them again
    }  // end main()
}  // end class BubbleSortApp
////////////////////////////////////////////////////////////////
