import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by rahmirford on 5/19/17.
 */
public class testMyArrayList<E> {

MyArrayList<E> myArrayList;

    @Before
    public void setup(){
        MyArrayList myArrayList = new MyArrayList();
    }

    @Test
    public void testAdd(){
        //:
        MyArrayList<E> myArrayList = new MyArrayList<E>();
        //:
        myArrayList.add(1);
        myArrayList.add(3);
        //:
        Assert.assertTrue(myArrayList != null);
    }

    @Test
    public void testGet(){

    }

    @Test
    public void testRemove(){

    }

    @Test
    public void testSet(){

    }

    @Test
    public void testClear(){

    }

    @Test
    public void testIsEmpty(){

    }

    @Test
    public void testContains(){

    }


}

