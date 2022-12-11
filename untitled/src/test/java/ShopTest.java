import items.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    private Shop shop;
    private Piano piano;
    private MusicSheet musicSheet;
    private Drum drum;

    @Before
    public void before() {
        piano = new Piano("piano", InstrumentType.KEYBOARD,
                Manufacturer.KAWAII, 550.00, 800.00);
        drum = new Drum("drum", InstrumentType.DRUMS,
                Manufacturer.ROLAND, 450.00, 800.00);
        musicSheet = new MusicSheet("Star Wars Theme", 2.50, 4.50);
        shop = new Shop("CC Music Shop");
        shop.addItem(piano);
        shop.addItem(drum);
        shop.addItem(musicSheet);
    }

    @Test
    public void getName() {
        assertEquals("CC Music Shop", shop.getName());
    }

    @Test
    public void shopHasNumOfItems() {
        assertEquals(3, shop.getNumOfItems());
    }

    @Test
    public void shopCanAddItems() {
        Violin violin = new Violin("violin", InstrumentType.STRING, Manufacturer.BACH,
                14.50,25.00);
        shop.addItem(violin);
        assertEquals(4, shop.getNumOfItems());
    }

    @Test
    public void shopCanRemoveItems() {
        shop.removeItem(drum);
        assertEquals(2, shop.getNumOfItems());
    }

}