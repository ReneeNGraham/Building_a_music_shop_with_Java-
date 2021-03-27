package stock.instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HarpTest {

    Harp harp;

    @Before
    public void before() {
        harp = new Harp("harp", "Clive Morley Harps", 500, 600, "wood",
                "brown", "string instrument");
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(500, harp.getBuyingPrice(), 00.1);
    }

    @Test
    public void canSetBuyingPrice () {
        harp.setBuyingPrice(400);
        assertEquals(400, harp.getBuyingPrice(), 00.1);


    }
    @Test
    public void hasSellingPrice() {
        assertEquals(600, harp.getSellingPrice(), 00.1);
    }

    @Test
    public void canChangeSellingPrice() {
        harp.setSellingPrice(800);
        assertEquals(800, harp.getSellingPrice(), 00.1);
    }

    @Test
    public void canCalculateMarkup () {
        assertEquals(100, harp.calculateMarkup(harp), 00.1);

    }

    @Test
    public void canPlay() {
        assertEquals("laaaalaaaleeeeleeeloolooo", harp.Play());
    }
}
