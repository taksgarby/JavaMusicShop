package items;

public class Piano extends Instrument  {

    public Piano(String name, InstrumentType instrumentType, Manufacturer manufacturer, double buyingCost,
                  double sellingPrice){
        super(name, instrumentType, manufacturer, buyingCost, sellingPrice);
    }

    public String playSound() {
        return "do-re-mi";
    }

}
