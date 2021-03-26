package stock.instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar("guitar", "Yamaha", 50, 75, "wood",
                "brown", "string instrument");
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(50, guitar.getBuyingPrice(), 00.1);
    }

    @Test
    public void canSetBuyingPrice () {
        guitar.setBuyingPrice(70);
        assertEquals(70, guitar.getBuyingPrice(), 00.1);


    }
    @Test
    public void hasSellingPrice() {
        assertEquals(75, guitar.getSellingPrice(), 00.1);
    }

    @Test
    public void canChangeSellingPrice() {
        guitar.setSellingPrice(100);
        assertEquals(100, guitar.getSellingPrice(), 00.1);
    }

    @Test
    public void canCalculateMarkup () {
        assertEquals(75, guitar.calculateMarkup(guitar), 00.1);

    }

    @Test
    public void canPlay() {
        assertEquals("tingtingtingcwingclaaaang", guitar.Play());
    }




}
