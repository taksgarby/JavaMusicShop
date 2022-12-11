import items.MusicSheet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MusicSheetTest {

    MusicSheet musicSheet;

    @Before
    public void before(){
        musicSheet = new MusicSheet("Star Wars Theme", 2.50, 4.50);
    }

    @Test
    public void hasName() {
        assertEquals("Star Wars Theme", musicSheet.getName());
    }

    @Test
    public void hasBuyingCost() {
        assertEquals(2.50, musicSheet.getBuyingCost(),0);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(4.50, musicSheet.getSellingPrice(), 0);
    }

    @Test
    public void canCalcMarkup() {
        assertEquals(2.00, musicSheet.calcMarkup(), 0);
    }
}
