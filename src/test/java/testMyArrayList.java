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
        MyArrayList<String>myArrayList = new MyArrayList<String>();
        myArrayList.add("why");
        myArrayList.add("do");
        myArrayList.add("cats");
        myArrayList.add("drink");
        myArrayList.add("milk");
        myArrayList.set(4,"leche");
        String expectedValue = "leche";
        String actualValue = myArrayList.get(4);
        Assert.assertEquals("The expected return value of myArrayList[3] is leche", expectedValue,actualValue);
    }

    @Test
    public void testClear(){
        MyArrayList<String>myArrayList = new MyArrayList<String>();
        myArrayList.add("one");
        myArrayList.add("two");
        myArrayList.add("three");
        myArrayList.add("four");
        int expectedValue = 0;
        myArrayList.clear();
        Assert.assertEquals("This arrayList should return 0",expectedValue, myArrayList.size());
    }

    @Test
    public void testIsEmpty(){
        MyArrayList<Integer> myArrayList = new MyArrayList<Integer>();
        myArrayList.clear();
        boolean expectedReturnValue = true;
        boolean actualReturnValue =myArrayList.isEmpty();
        Assert.assertTrue("The expected return value of the isEmpty method is true",actualReturnValue == expectedReturnValue);
    }

    @Test
    public void testContains(){
        MyArrayList<String> myArrayList = new MyArrayList<String>();
        myArrayList.add("the");
        myArrayList.add("work");
        myArrayList.add("cray");
        boolean expectedValueReturn = true;
        boolean actualValueReturn = myArrayList.contains("work");
        Assert.assertEquals("MyArrayList should return true", expectedValueReturn ,actualValueReturn);
    }

    @Test
    public void testSize(){
        MyArrayList<String>myArrayList = new MyArrayList<String>();
        myArrayList.add("blue");
        myArrayList.add("white");
        myArrayList.add("red");
        myArrayList.remove(2);
        int expectedArrayListSize = 2;
        int actualArrayListSize = myArrayList.size();
        Assert.assertEquals("The expected arraylist size should be 3", expectedArrayListSize,actualArrayListSize);
    }


}

