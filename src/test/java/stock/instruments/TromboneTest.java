package stock.instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TromboneTest {


    Trombone trombone;

    @Before
    public void before() {
        trombone = new Trombone("trombone", "Courtois Trombones", 400, 480, "brass",
                "gold", "air instrument");
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(400, trombone.getBuyingPrice(), 00.1);
    }

    @Test
    public void canSetBuyingPrice () {
        trombone.setBuyingPrice(350);
        assertEquals(350, trombone.getBuyingPrice(), 00.1);


    }
    @Test
    public void hasSellingPrice() {
        assertEquals(480, trombone.getSellingPrice(), 00.1);
    }

    @Test
    public void canChangeSellingPrice() {
        trombone.setSellingPrice(900);
        assertEquals(900, trombone.getSellingPrice(), 00.1);
    }

    @Test
    public void canCalculateMarkup () {
        assertEquals(80, trombone.calculateMarkup(trombone), 00.1);

    }

    @Test
    public void canPlay() {
        assertEquals("Buuuumbooobuuumooooohoooo", trombone.Play());
    }
}
