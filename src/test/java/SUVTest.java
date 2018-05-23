import org.junit.Before;
import org.junit.Test;
import vehicle.Engine;
import vehicle.SUV;
import vehicle.Tyre;
import vehicle.VehicleComponent;

import static org.junit.Assert.assertEquals;

public class SUVTest {
    SUV suv;
    Tyre tyre1, tyre2;
    VehicleComponent engine;

    @Before
    public void before(){
        tyre1 = new Tyre("Michellin", "abc", 15);
        tyre2 = new Tyre("Michellin", "abc", 15);
        engine = new Engine("Ford", "abc", 150);
        suv = new SUV(500, "Red", engine);
    }

    @Test
    public void hasPrice(){
        assertEquals(500, suv.getPrice());
    }
    @Test
    public void hasColour(){
        assertEquals("Red", suv.getColour());
    }
    @Test
    public void hasEngine(){
        assertEquals(engine.getClass(), suv.getEngine().getClass());
    }
    @Test
    public void hasWheels(){
        assertEquals( 0, suv.getTyres().size());
    }
    @Test
    public void canAddTyres(){
        suv.addTyre(tyre1);
        suv.addTyre(tyre2);
        assertEquals(2, suv.getTyres().size());
    }
}
