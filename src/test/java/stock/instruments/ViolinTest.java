package stock.instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolinTest {

    Violin violin;

    @Before
    public void before() {
        violin = new Violin ("violin", "Stentor", 600, 720, "wood",
                "brown", "string instrument");
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(600, violin.getBuyingPrice(), 00.1);
    }

    @Test
    public void canSetBuyingPrice () {
        violin.setBuyingPrice(460);
        assertEquals(460, violin.getBuyingPrice(), 00.1);


    }
    @Test
    public void hasSellingPrice() {
        assertEquals(720, violin.getSellingPrice(), 00.1);
    }

    @Test
    public void canChangeSellingPrice() {
        violin.setSellingPrice(720);
        assertEquals(720, violin.getSellingPrice(), 00.1);
    }

    @Test
    public void canCalculateMarkup () {
        assertEquals(120, violin.calculateMarkup(violin), 00.1);

    }

    @Test
    public void canPlay() {
        assertEquals("teeeeleeeedeeeleeee", violin.Play());

    }
}
