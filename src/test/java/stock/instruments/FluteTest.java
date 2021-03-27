package stock.instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FluteTest {

    Flute flute;

    @Before
    public void before() {
        flute = new Flute("silver", "Altus",60 , 72, "wood",
                "brown", "string instrument");
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(60, flute.getBuyingPrice(), 00.1);
    }

    @Test
    public void canSetBuyingPrice () {
        flute.setBuyingPrice(80);
        assertEquals(80, flute.getBuyingPrice(), 00.1);


    }
    @Test
    public void hasSellingPrice() {
        assertEquals(72, flute.getSellingPrice(), 00.1);
    }

    @Test
    public void canChangeSellingPrice() {
        flute.setSellingPrice(100);
        assertEquals(100, flute.getSellingPrice(), 00.1);
    }

    @Test
    public void canCalculateMarkup () {
        assertEquals(12, flute.calculateMarkup(flute), 00.1);

    }

    @Test
    public void canPlay() {
        assertEquals("toootooooteeeetooooteeetooo", flute.Play());
    }

}
