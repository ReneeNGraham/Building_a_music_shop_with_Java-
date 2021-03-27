package stock.miscItems;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MusicStandTest {

    MusicStand musicStand;

    @Before
    public void before() {
        musicStand = new MusicStand("sound accessory", "Casio", 10, 15);
    }

    @Test
    public void canCalculateMarkUp() {
        assertEquals(5, musicStand.calculateMarkup(musicStand), 0.0);

    }
}
