import org.junit.Before;
import org.junit.Test;
import vehicle.Tyre;

import static org.junit.Assert.assertEquals;

public class TyreTest {
    Tyre tyre;

    @Before
    public void before(){
        tyre = new Tyre("Michellin", "ABC", 15);
    }

    @Test
    public void hasMake(){
        assertEquals("Michellin", tyre.getMake());
    }
    @Test
    public void hasModel(){
        assertEquals("ABC", tyre.getModel());
    }
    @Test
    public void hasSize(){
        assertEquals(15, tyre.getSize());
    }
}
