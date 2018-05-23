import org.junit.Before;
import org.junit.Test;
import vehicle.*;

import static org.junit.Assert.assertEquals;

public class SedanTest {
    Sedan sedan;
    Tyre tyre1, tyre2;
    VehicleComponent engine;

    @Before
    public void before(){
        tyre1 = new Tyre("Michellin", "abc", 15);
        tyre2 = new Tyre("Michellin", "abc", 15);
        engine = new Engine("Ford", "abc", 150);
        sedan = new Sedan(500, "Red", engine);
    }

    @Test
    public void hasPrice(){
        assertEquals(500, sedan.getPrice());
    }
    @Test
    public void hasColour(){
        assertEquals("Red", sedan.getColour());
    }
    @Test
    public void hasEngine(){
        assertEquals(engine.getClass(), sedan.getEngine().getClass());
    }
    @Test
    public void hasWheels(){
        assertEquals( 0, sedan.getTyres().size());
    }
    @Test
    public void canAddTyres(){
        sedan.addTyre(tyre1);
        sedan.addTyre(tyre2);
        assertEquals(2, sedan.getTyres().size());
    }
}
