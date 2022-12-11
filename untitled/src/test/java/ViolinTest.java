import items.InstrumentType;
import items.Manufacturer;
import items.Violin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolinTest {

    Violin violin;

    @Before
    public void before(){
        violin = new Violin("violin", InstrumentType.STRING, Manufacturer.BACH, 14.50,25.00);
    }

    @Test
    public void hasName(){
        assertEquals("violin", violin.getName());
    }

    @Test
    public void hasType(){
        assertEquals(InstrumentType.STRING, violin.getInstrumentType());
    }

    @Test
    public void hasManufacturer() {
        assertEquals(Manufacturer.BACH, violin.getManufacturer());
    }

    @Test
    public void hasBuyingCost() {
        assertEquals(14.50, violin.getBuyingCost(), 0);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(25.00, violin.getSellingPrice(), 0);
    }

    @Test
    public void canPlaySound() {
        assertEquals("vrrr", violin.playSound());
    }

    @Test
    public void canCalcMarkup() {
        assertEquals(10.50, violin.calcMarkup(), 0);
    }

}
