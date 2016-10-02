import static org.junit.Assert.assertEquals;

/**
 * Created by PROPHET on 02-10-2016.
 */
public class MyArrayListTest {
MyArrayList<Integer> mi= new MyArrayList<Integer>();
    @org.junit.Test
    public void testAdd() throws Exception {


        assertEquals(true,mi.add(1));
    }

    @org.junit.Test
    public void testAdd1() throws Exception {

    }
}