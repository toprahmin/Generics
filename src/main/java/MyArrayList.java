import java.util.Arrays;

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

    // refactor to account for instances of removal where i is less than arrayLength -1
    // (i in the middle of the array)
    public void remove(int i){
        myArray[i] = null;
        int tempIndexCounter = 0;
        E[] temp =(E[]) new Object[arrayIndexCounter];
        for(E index: myArray){
            if(myArray[tempIndexCounter] != null){
                temp[tempIndexCounter] = index;
            }
            tempIndexCounter++;
        }
       myArray = temp;

    }

    public void set(int i,E e) {
        myArray[i] = e;
    }

    public void clear(){}

    public boolean isEmpty(){return true;}

    public boolean contains(){return true;}


}
