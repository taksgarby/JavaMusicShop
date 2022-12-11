package items;

public class Drum extends Instrument  {

    public Drum(String name, InstrumentType instrumentType, Manufacturer manufacturer, double buyingCost,
                 double sellingPrice){
        super(name, instrumentType, manufacturer, buyingCost, sellingPrice);
    }

    public String playSound() {
        return "dan-dadan-dan";
    }

}
