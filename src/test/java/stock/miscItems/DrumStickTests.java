package stock.miscItems;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumStickTests {

    DrumSticks drumSticks;

    @Before
    public void before() {
        drumSticks = new DrumSticks("drum accessory", "Yamaha", 10, 12);
    }

    @Test
    public void canCalculateMarkUp() {
        assertEquals(2, drumSticks.calculateMarkup(drumSticks), 0.0);

    }

}


