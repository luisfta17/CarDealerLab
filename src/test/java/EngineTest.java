import org.junit.Before;
import org.junit.Test;
import vehicle.Engine;
import vehicle.Tyre;

import static org.junit.Assert.assertEquals;

public class EngineTest {
    
    Engine engine;
    @Before
    public void before(){
        engine = new Engine("Ford", "ABC", 150);
    }

    @Test
    public void hasMake(){
        assertEquals("Ford", engine.getMake());
    }
    @Test
    public void hasModel(){
        assertEquals("ABC", engine.getModel());
    }
    @Test
    public void hasSize(){
        assertEquals(150, engine.getPower());
    }
}
