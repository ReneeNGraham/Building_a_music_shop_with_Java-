import org.junit.Before;
import org.junit.Test;
import stock.instruments.Guitar;
import stock.instruments.Violin;
import stock.miscItems.DrumSticks;
import stock.miscItems.Microphone;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    Violin violin;
    DrumSticks drumsticks;
    Microphone microphone;

    @Before
    public void setUp( ) throws Exception {
        shop = new Shop ();
        guitar = new Guitar("guitar", "Yamaha", 50, 75, "wood",
                "brown", "string instrument");
        violin = new Violin ("violin", "Stentor", 600, 720, "wood",
                "brown", "string instrument");
        drumsticks = new DrumSticks ("drum accessory", "Yamaha", 10, 12);
        microphone = new Microphone ("sound accessory", "Sennheisser", 60, 70 );
        shop.addItemsInStock(guitar);
        shop.addItemsInStock(drumsticks);
        shop.addItemsInStock(violin);
        shop.addItemsInStock(microphone);
    }

    @Test
    public void canAddStock() {
        shop.addItemsInStock(guitar);
        assertEquals(5, shop.getStockCount());
    }

    @Test
    public void canRemoveStock() {
        shop.removeItemsInStock(guitar);
        assertEquals(3, shop.getStockCount());
        System.out.println(shop.getStockCount());

    }
}
