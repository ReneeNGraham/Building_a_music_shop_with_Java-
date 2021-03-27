package stock.instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before() {
        piano = new Piano("piano", "Steinway & Sons", 8000, 9600, "wood",
                "brown", "string instrument");
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(8000, piano.getBuyingPrice(), 00.1);
    }

    @Test
    public void canSetBuyingPrice () {
        piano.setBuyingPrice(8500);
        assertEquals(8500, piano.getBuyingPrice(), 00.1);


    }
    @Test
    public void hasSellingPrice() {
        assertEquals(9600, piano.getSellingPrice(), 00.1);
    }

    @Test
    public void canChangeSellingPrice() {
        piano.setSellingPrice(800);
        assertEquals(800, piano.getSellingPrice(), 00.1);
    }

    @Test
    public void canCalculateMarkup () {
        assertEquals(1600, piano.calculateMarkup(piano), 00.1);

    }

    @Test
    public void canPlay() {
        assertEquals("dingdongdongdongdong", piano.Play());
    }
}
