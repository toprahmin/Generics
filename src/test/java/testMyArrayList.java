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
        myArrayList = new MyArrayList<E>();
  }

    @Test
    public void testAdd(){
        //:
        MyArrayList<Integer> myArrayList = new MyArrayList<Integer>();
        Integer integer3 = new Integer(3);
        Integer integer4 = new Integer(4);

//        int expected = 3;
        //:
        myArrayList.add(integer3);
        myArrayList.add(integer4);
        //:
        Assert.assertEquals("", integer3, myArrayList.get(0));
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

