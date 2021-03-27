package stock.miscItems;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void before() {
        sheetMusic = new SheetMusic("sound accessory", "Tom Play", 10, 15);
    }

    @Test
    public void canCalculateMarkUp() {
        assertEquals(5, sheetMusic.calculateMarkup(sheetMusic), 0.0);

    }


}
