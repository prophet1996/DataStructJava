import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by PROPHET on 25-09-2016.
 */
public class ListADT {
    public static void main(String[] args) {

      /*  ArraySimpleList aList= new ArraySimpleList();
        int[] a=aList.makeList(4);
        */

      /*  ArrayList<Integer> li = new ArrayList<Integer>();
        li.add(2);
        li.add(11);
        li.add(3);
        li.add(90);
        ListADT.removeEven(li);
        Iterator<Integer> it=li.listIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }*/

        MyArrayList<Integer> mal= new MyArrayList<Integer>();
        mal.add(5);
        mal.add(6);
        mal.add(3);
        mal.add(3);
        boolean b=mal.add(4);

        MyArrayList.ArrayListIterator it=(MyArrayList.ArrayListIterator) mal.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

    public static void removeEven(List<Integer> li)  {
        Iterator<Integer> it=li.listIterator();
        while(it.hasNext())
        {
            if( it.next( ) % 2 == 0 ){
                it.remove();

            }
        }
    }

}




/*
* COLLECTION THAT IMPLEMENTS ITERABLE INTERFACE MUST PROVIDE A FUNCTION "ITERATOR" THAT RETURNS AN ITERATOR OBJECT
*
*
*
*
*
* */

class ArraySimpleList {
    //CONSTRUCTOR
    ArraySimpleList() {

    }

    //DATA MEMBER
    private int[] arr;


    //MEMBER FUNCTIONS
    public int[] makeList(int a) {
        arr = new int[a];
        return arr;
    }

    public int[] incList(int[] a, int b) {
        int[] arr = new int[b];
        for (int i = 0; i < a.length; i++) {
            arr[i] = a[i];
        }
        return arr;
    }
}
/*

THIS HOW COLLECTION INTERFACE LOOKS LIKE
THIS IS A SUBSET OF IT


 interface Collection<EXAMPLE> extends Iterable<EXAMPLE>
 {
 int size( );
 boolean isEmpty( );
 void clear( );
 boolean contains( EXAMPLE x );
 boolean add( EXAMPLE x );
 boolean remove( EXAMPLE x );
  Iterator<EXAMPLE> iterator( );
 }
 */
