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
        //:
        MyArrayList<String> myArrayList = new MyArrayList<String>();
        String expected = "foxtrot";
        myArrayList.add("foxtrot");
        String actual = myArrayList.get((0));
        Assert.assertEquals("This index should return foxtrot", expected,actual);

    }

    @Test
    public void testRemove(){
        MyArrayList<Integer> myArrayList = new MyArrayList<Integer>();
        myArrayList.add(4);
        myArrayList.add(6);
        myArrayList.add(2);
        myArrayList.remove(2);
        Integer expected = 6;
        Assert.assertEquals("index 2 of myArrayList should return null", expected,myArrayList.get(1));


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

