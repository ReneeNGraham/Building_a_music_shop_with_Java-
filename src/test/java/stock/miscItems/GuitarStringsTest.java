package stock.miscItems;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {

    GuitarStrings guitarStrings;

    @Before
    public void before() {
        guitarStrings = new GuitarStrings("guitar accessory", "Yamaha", 20, 24);
    }

    @Test
    public void canCalculateMarkUp() {
        assertEquals(4, guitarStrings.calculateMarkup(guitarStrings), 0.0);

    }
}
