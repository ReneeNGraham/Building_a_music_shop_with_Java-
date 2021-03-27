package stock.miscItems;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MicrophoneTest {

    Microphone microphone;

    @Before
    public void before() {
        microphone = new Microphone("sound accessory", "Sennheisser", 60, 70 );
    }

    @Test
    public void canCalculateMarkUp() {
        assertEquals(10, microphone.calculateMarkup(microphone), 0.0);

    }
}
