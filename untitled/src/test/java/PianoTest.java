import items.InstrumentType;
import items.Manufacturer;
import items.Piano;
import items.Violin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano("piano", InstrumentType.KEYBOARD,
                Manufacturer.KAWAII, 550.00,800.00);
    }

    @Test
    public void hasName(){
        assertEquals("piano", piano.getName());
    }

    @Test
    public void hasType(){
        assertEquals(InstrumentType.KEYBOARD, piano.getInstrumentType());
    }

    @Test
    public void hasManufacturer() {
        assertEquals(Manufacturer.KAWAII, piano.getManufacturer());
    }

    @Test
    public void hasBuyingCost() {
        assertEquals(550.00, piano.getBuyingCost(), 0);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(800.00, piano.getSellingPrice(), 0);
    }
    @Test
    public void canPlaySound() {
        assertEquals("do-re-mi", piano.playSound());
    }

    @Test
    public void canCalcMarkup() {
        assertEquals(250.00, piano.calcMarkup(), 0);
    }

}
