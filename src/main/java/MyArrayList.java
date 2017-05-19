/**
 * Created by rahmirford on 5/19/17.
 */
public class MyArrayList<E> {
   private E arrayIndexValue;
   private E[] myArray;
   private int arrayIndexCounter;


    public MyArrayList(){
        myArray = (E[]) new Object[10];
        arrayIndexCounter = 0;
    }

    public void add(E e){
        myArray[arrayIndexCounter] = e;
        arrayIndexCounter++;

    }

    public E get(int i){
        arrayIndexValue = myArray[i];
        return arrayIndexValue;
    }

    public void remove(E e){}

    public void set(E e) {}

    public void clear(){}

    public boolean isEmpty(){return true;}

    public boolean contains(){return true;}


}
