package stock.miscItems;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTunerTest {


    GuitarTuner guitarTuner;

    @Before
    public void before() {
        guitarTuner = new GuitarTuner("guitar accessory", "Yamaha", 4, 5.0 );
    }

    @Test
    public void canCalculateMarkUp() {
        assertEquals(1, guitarTuner.calculateMarkup(guitarTuner), 0.0);

    }
}

