import items.Drum;
import items.InstrumentType;
import items.Manufacturer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumTest {

    Drum drum;

    @Before
    public void before(){
        drum = new Drum("drum", InstrumentType.DRUMS,
                Manufacturer.ROLAND, 450.00,800.00);
    }

    @Test
    public void hasName(){
        assertEquals("drum", drum.getName());
    }

    @Test
    public void hasType(){
        assertEquals(InstrumentType.DRUMS, drum.getInstrumentType());
    }

    @Test
    public void hasManufacturer() {
        assertEquals(Manufacturer.ROLAND, drum.getManufacturer());
    }

    @Test
    public void hasBuyingCost() {
        assertEquals(450.00, drum.getBuyingCost(), 0);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(800.00, drum.getSellingPrice(), 0);
    }
    @Test
    public void canPlaySound() {
        assertEquals("dan-dadan-dan", drum.playSound());
    }

    @Test
    public void canCalcMarkup() {
        assertEquals(350.00, drum.calcMarkup(), 0);
    }

}
